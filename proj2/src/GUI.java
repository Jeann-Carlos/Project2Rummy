package proj2.src;

import proj2.src.Handlers.Deck;

import javax.swing.*;

/**
 * Contains every single GUI component for the Table program
 */
public class GUI {
    JPanel player1;
    JPanel player2;
    JPanel deckPiles;
    JLabel deck;
    JLabel stack;
    JList p1HandPile;
    JList p2HandPile;
    Deck cardDeck;
    Deck stackDeck;

    SetPanel[] setPanels = new SetPanel[13];
    JLabel topOfStack;
    JLabel deckPile;
    JButton p1Stack;
    JButton p2Stack;

    JButton p1Deck;
    JButton p2Deck;
    JButton AIbutton;
    JButton AIbutton2;

    JButton p1Lay;
    JButton p2Lay;

    JButton p1LayOnStack;
    JButton p2LayOnStack;

    Hand p1Hand;
    Hand p2Hand;

}