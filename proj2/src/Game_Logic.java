package proj2.src;

import javax.swing.*;
import java.util.*;

/**
 * Handles all the game rules and actions partaken during it.
 * Inherits the table instance in use.
 */
public class Game_Logic {
    private static Table Instance;
    private static boolean playerTurns = true;
    private int meldingSize = 0;
    private int canDraw = 1;
    static int numberAI = 0;

    public static void SetInstance(Table instance) {
        Instance = instance.getInstance();
    }


    /**
     * Picks a card from stockDeck and gives it to the src
     * <p>
     * Object @param src
     *
     * @return void
     */
    public void fromDeck(Object src) {
        Card card = Instance.gui_handler.cardDeck.dealCard();

        if (card != null) {
            if ((src == Instance.gui_handler.p1Deck) && playerTurns == true && canDraw == 1) {
                Instance.gui_handler.p1Hand.hand.addElement(card);
                canDraw = 0;
            } else if ((src == Instance.gui_handler.p2Deck) && playerTurns == false && canDraw == 0) {
                Instance.gui_handler.p2Hand.hand.addElement(card);
                canDraw = 1;
            }
            Instance.game_Log.LOGfromDeck(card);
        }
        if (Instance.gui_handler.cardDeck.getSizeOfDeck() == 0)
            Instance.gui_handler.deckPile.setIcon(new ImageIcon(Card.directory + "blank.gif"));
    }

    /**
     * Picks a card from stackDeck and gives it to the src
     * <p>
     * Object @param src
     *
     * @return void
     */
    public void fromStack(Object src) {
        if ((src == Instance.gui_handler.p1Stack) && playerTurns == true && canDraw == 1) {
            Card card = Instance.gui_handler.stackDeck.removeCard();
            if (card != null) {
                Instance.game_Log.LOGfromStack(card);
                Instance.gui_handler.p1Hand.hand.addElement(card);
                canDraw = 0;
            }
        } else if ((src == Instance.gui_handler.p2Stack) && playerTurns == false && canDraw == 0) {
            Card card = Instance.gui_handler.stackDeck.removeCard();
            if (card != null) {
                Instance.game_Log.LOGfromStack(card);
                Instance.gui_handler.p2Hand.hand.addElement(card);
                canDraw = 1;
            }


        }
        Card topCard = Instance.gui_handler.stackDeck.peek();
        if (topCard != null)
            Instance.gui_handler.topOfStack.setIcon(topCard.getCardImage());
        else
            Instance.gui_handler.topOfStack.setIcon(new ImageIcon(Card.directory + "blank.gif"));


    }

    /**
     * Controls the laying functions for the player1
     *
     * @return void
     */
    public void p1Lay() {
        Object[] cards = Instance.gui_handler.p1HandPile.getSelectedValues();
        List<Card> t = new ArrayList<Card>();
        boolean followRules = true;
        if (cards != null && (cards.length == 3 || cards.length == 4)) {
            for (int i = 0; i < cards.length; i++) {
                t.add(i, (Card) cards[i]);
            }
            Collections.sort(t);
            Card tmp = t.get(0);
            for (int i = 1; i < cards.length; i++) {
                if ((tmp.compareTo(t.get(i)) == 0 && tmp.getSuit() != t.get(i).getSuit()) || tmp.compareTo(t.get(i)) == -1)
                    ;
                else {
                    followRules = false;
                    break;
                }
                tmp = t.get(i);
            }
            if (followRules)
                for (Card c : t) {
                    Instance.layCard(c);
                    Instance.game_Log.LOGp1Lay(c);
                    Instance.gui_handler.p1Hand.hand.removeElement(c);
                }
        } else if (cards.length == 1) {

        }

    }

    /**
     * Controls the laying functions for the player2
     *
     * @return void
     */
    public void p2Lay() {
        Object[] cards = Instance.gui_handler.p2HandPile.getSelectedValues();
        List<Card> t = new ArrayList<Card>();
        boolean followRules = true;
        if (cards != null && (cards.length == 3 || cards.length == 4)) {

            for (int i = 0; i < cards.length; i++) {
                t.add(i, (Card) cards[i]);
            }

            Collections.sort(t);
            Card tmp = t.get(0);

            for (int i = 1; i < cards.length; i++) {
                if ((tmp.compareTo(t.get(i)) == 0 && tmp.getSuit() != t.get(i).getSuit()) || tmp.compareTo(t.get(i)) == -1)
                    ;
                else {
                    followRules = false;
                    break;
                }
                tmp = t.get(i);
            }
            if (followRules)
                for (Card c : t) {
                    Instance.layCard(c);
                    Instance.game_Log.LOGp2Lay(c);
                    Instance.gui_handler.p2Hand.hand.removeElement(c);
                }
        }
    }

    /**
     * Gets the selected card from player1 and drops it in the stackDeck
     *
     * @return void
     */
    public void p1onStack() {
        if (playerTurns == true && canDraw == 0) {
            if (numberAI == 2) {
                int[] i = {0};
                Instance.gui_handler.p1HandPile.setSelectedIndices(i);
            }
            int[] num = Instance.gui_handler.p1HandPile.getSelectedIndices();

            if (num.length == 1) {
                Object obj = Instance.gui_handler.p1HandPile.getSelectedValue();
                if (obj != null) {
                    Instance.gui_handler.p1Hand.hand.removeElement(obj);
                    Card card = (Card) obj;
                    Instance.gui_handler.stackDeck.addCard(card);
                    Instance.gui_handler.topOfStack.setIcon(card.getCardImage());
                    playerTurns = false;
                    Instance.game_Log.LOGp1onStack(card);
                }
            }
        }
    }

    /**
     * Gets the selected card from player2 and drops it in the stackDeck
     *
     * @return void
     */

    public void p2onStack() {
        if (playerTurns == false && canDraw == 1) {
            if (numberAI == 1 || numberAI == 2) {
                int[] i = {0};
                Instance.gui_handler.p2HandPile.setSelectedIndices(i);
            }
            int[] num = Instance.gui_handler.p2HandPile.getSelectedIndices();
            if (num.length == 1) {
                Object obj = Instance.gui_handler.p2HandPile.getSelectedValue();
                if (obj != null) {

                    Instance.gui_handler.p2Hand.hand.removeElement(obj);
                    Card card = (Card) obj;
                    Instance.gui_handler.stackDeck.addCard(card);
                    Instance.gui_handler.topOfStack.setIcon(card.getCardImage());
                    playerTurns = true;
                    Instance.game_Log.LOGp2onStack(card);
                }
            }
        }
    }

    /**
     * Sorts both player's hands
     *
     * @return void
     */
    public void sortPlayers() {
        Instance.gui_handler.p1Hand.sort();
        Instance.gui_handler.p2Hand.sort();

    }

    /**
     * To handle endgame ocassions, controls everry posible outcome of the gmae.
     *
     * @return void
     */
    public void endOfGame() {
        if (Instance.gui_handler.p1Hand.isEmpty()) {
            Instance.game_Log.logger.info("Player1 won the game");
        } else if (Instance.gui_handler.p2Hand.isEmpty()) {
            Instance.game_Log.logger.info("Player2 won the game");

        } else if (Instance.gui_handler.cardDeck.isEmpty())
            if (Instance.gui_handler.p1Hand.evaluateHand() - Instance.gui_handler.p2Hand.evaluateHand() < 0) {
                Instance.game_Log.logger.info("Player1 won the game");
            } else if (Instance.gui_handler.p1Hand.evaluateHand() - Instance.gui_handler.p2Hand.evaluateHand() > 0) {
                System.out.println("Points: Player1: " + Instance.gui_handler.p1Hand.evaluateHand() + "to Player2: " + Instance.gui_handler.p2Hand.evaluateHand());
                Instance.game_Log.logger.info("\nPlayer2 won the game");
            } else {
                Instance.game_Log.logger.info("Is a draw!");
            }
    }
}


