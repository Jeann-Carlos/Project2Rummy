package proj2.src;

import proj2.src.Handlers.Deck;
import proj2.src.Handlers.Set;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * This Mainfile.GUI assumes that you are using a 52 card deck and that you have 13 sets in the deck.
 * The Mainfile.GUI is simulating a playing table
 *
 * @author Patti Ordonez
 * <p>
 * Modified by Jeann C Hernandez Franco
 * last modification 5/10/21
 * To implment the builder pattern we will use the main component (this table) to instanciate,create and control other funcional
 * pieces of the program.
 * The program is divided into 4 pieces, the main program and controller (table), game_logic which controls the logic in the game, the logger, and the GUi which contains all the GUI components.
 */
public class Table extends JFrame implements ActionListener {
    //The 3 main pieces of the program
    GUI gui_handler = new GUI();
    Game_Logic game_LogicHandler = new Game_Logic();
    Log game_Log;


    //Atributes
    final static int numDealtCards = 9;


    //Constructor
    public Table(String args[]) {
        super("The Card Game of the Century");

        setLayout(new BorderLayout());
        setSize(1200, 700);


        gui_handler.cardDeck = new Deck();
        Game_Logic.numberAI = Integer.parseInt(args[0]);
        try {
            if(args.length==1)
                game_Log = new Log("Halo!");
            else{
                game_Log = new Log(args[1]);
            }
        } catch (Exception exception) {
        }


        for (int i = 0; i < Card.suit.length; i++) {
            for (int j = 0; j < Card.rank.length; j++) {
                Card card = new Card(Card.suit[i], Card.rank[j]);
                gui_handler.cardDeck.addCard(card);
            }
        }
        gui_handler.cardDeck.shuffle();
        gui_handler.stackDeck = new Deck();
        Card tmp;
        gui_handler.stackDeck.addCard(tmp = gui_handler.cardDeck.dealCard());

        JPanel top = new JPanel();

        for (int i = 0; i < Card.rank.length; i++)
            gui_handler.setPanels[i] = new SetPanel(Card.getRankIndex(Card.rank[i]));


        top.add(gui_handler.setPanels[0]);
        top.add(gui_handler.setPanels[1]);
        top.add(gui_handler.setPanels[2]);
        top.add(gui_handler.setPanels[3]);

        gui_handler.player1 = new JPanel();

        gui_handler.player1.add(top);


        add(gui_handler.player1, BorderLayout.NORTH);
        JPanel bottom = new JPanel();


        bottom.add(gui_handler.setPanels[4]);
        bottom.add(gui_handler.setPanels[5]);
        bottom.add(gui_handler.setPanels[6]);
        bottom.add(gui_handler.setPanels[7]);
        bottom.add(gui_handler.setPanels[8]);

        gui_handler.player2 = new JPanel();


        gui_handler.player2.add(bottom);
        add(gui_handler.player2, BorderLayout.SOUTH);


        JPanel middle = new JPanel(new GridLayout(1, 3));

        gui_handler.p1Stack = new JButton("Stack");
        gui_handler.p1Stack.addActionListener(this);
        gui_handler.p1Deck = new JButton("Deck ");
        gui_handler.p1Deck.addActionListener(this);
        gui_handler.AIbutton = new JButton("AIControl");
        gui_handler.AIbutton.addActionListener(this);
        gui_handler.AIbutton.setVisible(false);
        if (Integer.parseInt(args[0]) == 2) gui_handler.AIbutton.setVisible(true);
        gui_handler.p1Lay = new JButton("Lay  ");
        gui_handler.p1Lay.addActionListener(this);
        gui_handler.p1LayOnStack = new JButton("LayOnStack");
        gui_handler.p1LayOnStack.addActionListener(this);

        Card[] cardsplayer1 = new Card[numDealtCards];
        deal(cardsplayer1);
        gui_handler.p1Hand = new Hand();
        for (int i = 0; i < cardsplayer1.length; i++)
            gui_handler.p1Hand.hand.addElement(cardsplayer1[i]);
        gui_handler.p1Hand.sort();
        gui_handler.p1HandPile = new JList(gui_handler.p1Hand.hand);


        middle.add(new HandPanel("Player 1", gui_handler.p1HandPile, gui_handler.p1Stack, gui_handler.p1Deck, gui_handler.p1Lay, gui_handler.p1LayOnStack, gui_handler.AIbutton));

        gui_handler.deckPiles = new JPanel();
        gui_handler.deckPiles.setLayout(new BoxLayout(gui_handler.deckPiles, BoxLayout.Y_AXIS));
        gui_handler.deckPiles.add(Box.createGlue());
        JPanel left = new JPanel();
        left.setAlignmentY(Component.CENTER_ALIGNMENT);

        gui_handler.stack = new JLabel("Stack");
        gui_handler.stack.setAlignmentY(Component.CENTER_ALIGNMENT);

        left.add(gui_handler.stack);
        gui_handler.topOfStack = new JLabel();
        gui_handler.topOfStack.setIcon(new ImageIcon(Card.directory + "blank.gif"));
        gui_handler.topOfStack.setAlignmentY(Component.CENTER_ALIGNMENT);
        left.add(gui_handler.topOfStack);
        gui_handler.deckPiles.add(left);
        gui_handler.deckPiles.add(Box.createGlue());
        gui_handler.topOfStack.setIcon(tmp.getCardImage());


        JPanel right = new JPanel();
        right.setAlignmentY(Component.CENTER_ALIGNMENT);

        gui_handler.deck = new JLabel("Mainfile.Deck");

        gui_handler.deck.setAlignmentY(Component.CENTER_ALIGNMENT);
        right.add(gui_handler.deck);
        gui_handler.deckPile = new JLabel();
        gui_handler.deckPile.setIcon(new ImageIcon(Card.directory + "b.gif"));
        gui_handler.deckPile.setAlignmentY(Component.CENTER_ALIGNMENT);
        right.add(gui_handler.deckPile);
        gui_handler.deckPiles.add(right);
        gui_handler.deckPiles.add(Box.createGlue());
        middle.add(gui_handler.deckPiles);


        gui_handler.p2Stack = new JButton("Stack");
        gui_handler.p2Stack.addActionListener(this);
        gui_handler.p2Deck = new JButton("Deck ");
        gui_handler.p2Deck.addActionListener(this);
        gui_handler.p2Lay = new JButton("Lay  ");
        gui_handler.p2Lay.addActionListener(this);
        gui_handler.p2LayOnStack = new JButton("LayOnStack");
        gui_handler.p2LayOnStack.addActionListener(this);
        gui_handler.AIbutton2 = new JButton("AIControl");
        gui_handler.AIbutton2.addActionListener(this);
        gui_handler.AIbutton2.setVisible(false);
        if (Integer.parseInt(args[0]) == 2 || Integer.parseInt(args[0]) == 1) gui_handler.AIbutton2.setVisible(true);

        Card[] cardsplayer2 = new Card[numDealtCards];
        deal(cardsplayer2);
        gui_handler.p2Hand = new Hand();

        for (int i = 0; i < cardsplayer2.length; i++)
            gui_handler.p2Hand.hand.addElement(cardsplayer2[i]);
        gui_handler.p2Hand.sort();
        gui_handler.p2HandPile = new JList(gui_handler.p2Hand.hand);

        middle.add(new HandPanel("Player 2", gui_handler.p2HandPile, gui_handler.p2Stack, gui_handler.p2Deck, gui_handler.p2Lay, gui_handler.p2LayOnStack, gui_handler.AIbutton2));
        add(middle, BorderLayout.CENTER);

        JPanel leftBorder = new JPanel(new GridLayout(2, 1));


        gui_handler.setPanels[9].setLayout(new BoxLayout(gui_handler.setPanels[9], BoxLayout.Y_AXIS));
        gui_handler.setPanels[10].setLayout(new BoxLayout(gui_handler.setPanels[10], BoxLayout.Y_AXIS));
        leftBorder.add(gui_handler.setPanels[9]);
        leftBorder.add(gui_handler.setPanels[10]);
        add(leftBorder, BorderLayout.WEST);

        JPanel rightBorder = new JPanel(new GridLayout(2, 1));

        gui_handler.setPanels[11].setLayout(new BoxLayout(gui_handler.setPanels[11], BoxLayout.Y_AXIS));
        gui_handler.setPanels[12].setLayout(new BoxLayout(gui_handler.setPanels[12], BoxLayout.Y_AXIS));
        rightBorder.add(gui_handler.setPanels[11]);
        rightBorder.add(gui_handler.setPanels[12]);
        add(rightBorder, BorderLayout.EAST);

        //To enable shutdown of the program by clicking  x in the tab manager.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                dispose();
            }
        });
        game_Log.logger.info("player1 currently has:" + gui_handler.p1Hand.toString() + "\nplayer2 currently has:" + gui_handler.p2Hand.toString());



    }

///////Table's Extra funcitonality functions. ///////////////////////////////////////////////////

    /**
     * Controller for the game_logic and logger, tells what action to perform and what to log.
     *
     * @param E ActionEvent
     * @return void
     */
    public void actionPerformed(ActionEvent E) {
        Object src = E.getSource();

        if (src == gui_handler.AIbutton) {
            src = gui_handler.p1Deck;
            game_LogicHandler.fromDeck(src);
            game_LogicHandler.p1onStack();
            src = gui_handler.AIbutton;
        }
        if (src == gui_handler.AIbutton2) {
            src = gui_handler.p2Deck;
            game_LogicHandler.fromDeck(src);
            game_LogicHandler.p2onStack();
            src = gui_handler.AIbutton2;
        }
        if (gui_handler.p1Deck == src || gui_handler.p2Deck == src) {
            game_LogicHandler.fromDeck(src);

        }
        if (gui_handler.p1Stack == src || gui_handler.p2Stack == src) {
            game_LogicHandler.fromStack(src);
        }
        if (gui_handler.p1Lay == src) {
            game_LogicHandler.p1Lay();
        }
        if (gui_handler.p2Lay == src) {
            game_LogicHandler.p2Lay();
        }
        if (gui_handler.p1LayOnStack == src) {
            game_LogicHandler.p1onStack();
        }
        if (gui_handler.p2LayOnStack == src) {
            game_LogicHandler.p2onStack();
        }
        game_LogicHandler.sortPlayers();
        game_Log.logger.info("player1 currently has:" + gui_handler.p1Hand.toString() + "\nplayer2 currently has:" + gui_handler.p2Hand.toString());
        game_LogicHandler.endOfGame();
    }


    /**
     * Returns the current table instance
     *
     * @return Table
     */
    public Table getInstance() {
        return this;
    }


    void layCard(Card card) {
        char rank = card.getRank();
        char suit = card.getSuit();
        int suitIndex = Card.getSuitIndex(suit);
        int rankIndex = Card.getRankIndex(rank);
        //data_Handler.setPanels[rankIndex].array[suitIndex].setText(card.toString());
        System.out.println("laying " + card);
        gui_handler.setPanels[rankIndex].array[suitIndex].setIcon(card.getCardImage());
    }

    private void deal(Card[] cards) {
        for (int i = 0; i < cards.length; i++)
            cards[i] = (Card) gui_handler.cardDeck.dealCard();
    }

////////////////////////////////////////////////////////////////////////////////////////////


}


class HandPanel extends JPanel {

    public HandPanel(String name, JList hand, JButton stack, JButton deck, JButton lay, JButton layOnStack, JButton AI) {
        //model = hand.createSelectionModel();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//		add(Box.createGlue());
        JLabel label = new JLabel(name);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label);
        stack.setAlignmentX(Component.CENTER_ALIGNMENT);
//		add(Box.createGlue());
        add(stack);
        deck.setAlignmentX(Component.CENTER_ALIGNMENT);
//		add(Box.createGlue());
        add(deck);
        lay.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lay);
        layOnStack.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(layOnStack);
        AI.setAlignmentX(Component.RIGHT_ALIGNMENT);
        add(AI);
        add(Box.createGlue());
        add(hand);
        add(Box.createGlue());
    }

}

class SetPanel extends JPanel {
    private Set data;
    JButton[] array = new JButton[4];

    public SetPanel(int index) {
        super();
        data = new Set(Card.rank[index]);

        for (int i = 0; i < array.length; i++) {
            array[i] = new JButton("   ");
            add(array[i]);
        }
    }

}
