package proj2.src.interfaces;

import proj2.src.Card;

public interface DeckInterface {

 /**
   * Creates an empty deck of cards.
   */
   public void Deck();
  /**
   *  returns next Mainfile.Card in a deck that is facing down without removing it
   */
	public Card peek();
 /**
   * this method is used to add Cards to a Mainfile.Deck.  The Mainfile.Deck is completely empty when it is initialized.
   */

   public void addCard( Card card ) ;

 /**
   * returns number of cards on the deck
   * @return int
   */
   public int getSizeOfDeck() ;

   /**
   * removes first card on a deck so equivalent to flipping the card off of a eck that is faced down
   * @return <code>null</code> if there are no cards left on the Stack. Otherwise returns Mainfile.Card
   */
   public Card dealCard() ;

 /**
   * removes Mainfile.Card last card placed on a deck so equivalent toremoving card from deck that is faced up
   * @return <code>null</code> if there are no cards left on the deck. Otherwise removes Mainfile.Card
   */
   public Card removeCard() ;

  /**
   * Shuffles the cards present in the deck.
   */
   public void shuffle() ;

  /**
   * Looks for an empty deck.
   * @return <code>true</code> if there are no cards left to be dealt from the deck.
   */
   public boolean isEmpty();

  /**
   * Restores the deck to being empty and ready to add Cards to
   */
  public void restoreDeck() ;


}
