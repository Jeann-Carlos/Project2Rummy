package proj2.src.interfaces;

import proj2.src.Card;

public interface SetInterface extends HandInterface
{
	/*
	*    Must override the behavior of the Mainfile.HandInterface so that
	*   a Mainfile.Set only accepts a card if it is of the same rank.
	*/
    public void addCard( Card card ) ;
	/**
     *   returns the rankIndex of the set
	 @return int returns int corresponding to rank as defined in Mainfile.CardInterface
     */
	public int getRankIndex();
	
   /**
     *   returns the rank of the set
    *  @return char returns char of rank as defined in Mainfile.CardInterface
     */
	public char getRank();
  /**
     *  Determines whether Mainfile.Set is contains all four cards.
	 @return if true then no more Mainfile.Card may be added to the set
     */
	public boolean isFull();
	/**
	* Ranks the cards in a set according to their suit
	*/

	

}