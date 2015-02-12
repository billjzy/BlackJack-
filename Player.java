import java.util.*;
public class Player {
  private LinkedList<Card> hand = new LinkedList<>() ; 
  private String name ;
  public Player(String name) {
    this.name = name;
  }
  public String getName(){
      return this.name;
  }
  public void getCard(Card card){
    hand.add(card) ;
  }
  public void dropHand() {
    hand = new LinkedList<>();
  }
  public boolean bursted(){
     return (getSum()>21);
  }
  public boolean blackJack(){
    return (getSum()==21);
  }
  //the player call a hit
  public int getSum(){
    int sum = 0, aceNum = 0;
    for(Card c: hand) {
      if(c.cardVal() == 1) {
        aceNum++;
        sum += 11;
      }else {
        sum += c.cardVal()>10? 10:c.cardVal(); 
      }
      //if sum gt 21, change "Ace" value from 11 to 1
      while(sum>21&&aceNum>0){
         sum -= 10;
         aceNum--;
      }
    }
    return sum;
  }
  public void showHand() {
    for(Card h: hand){
      System.out.print("["+h.toString()+"] ");
    }
    System.out.print("\n");
  }

}
