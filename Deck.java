import java.util.*;
import java.util.Collections;

public class Deck {
  private LinkedList<Card> deck = new LinkedList<>();
  private final int TOTAL_CARD = 52;
  public Deck(){
    newDeck();
  }
  public void newDeck() {
    deck = new LinkedList<>();
     for(int i =0;i<13;i++) {
       for (int j=0;j<4;j++) {
         deck.add(new Card(i, j));
       }
     }
     shuffle();
  }

  public void shuffle(){
      Collections.shuffle(deck);
  }
  
  // deal the card on top of the deck
  public Card deal(){
    if(deck.isEmpty()) {
      newDeck();
    }
    return deck.removeLast();
  }

}
