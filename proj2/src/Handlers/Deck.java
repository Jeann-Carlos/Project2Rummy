package proj2.src.Handlers;

import proj2.src.Card;
import proj2.src.interfaces.DeckInterface;

/**
 * Handles everysingle deckyliketype structure in the game(stacks,stock,etc)
 * implements DeckInterface
 *  Has no use for the constructor as this was already pre-setup by the stack atribtute.
 */
public class Deck  implements DeckInterface {

    int n = 0;
    Card[] deck = new Card[52];
    MyStack<Card> shuffledDeck = new MyStack(52);

    public void Deck(){
    }

    @Override
    public Card peek() {
        return shuffledDeck.peek();
    }

    @Override
    public void addCard(Card card) {
        try{
        shuffledDeck.push(card);}
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public int getSizeOfDeck() {
        return shuffledDeck.getCurrSize();
    }

    @Override
    public Card dealCard() {
        try {
            return shuffledDeck.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Card removeCard() {
        return dealCard();
    }

    @Override
    public void shuffle() {
        n=getSizeOfDeck();
        for(int i=0;i<n;i++)
            try{deck[i]=shuffledDeck.pop();}
        catch(Exception e){
                e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
            try{
            shuffledDeck.push(deck[i]);}
            catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    @Override
    public boolean isEmpty() {
        return shuffledDeck.isStackEmpty();
    }

    @Override
    public void restoreDeck() {
        shuffledDeck.clear(52);

    }




}


