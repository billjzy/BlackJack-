import java.util.*;

public class Game {
  public Player player = new Player("zhangyi");  
  private Player dealer = new Player("Dealer");
  private Deck deck; 
  //private Player dealer; 
  //Game intialized, everyone gets two new card!
  public Game() {
    deck = new Deck();
    for(int i=0;i<2;i++){
    Card newCard = deck.deal();
    player.getCard(newCard);
    newCard = deck.deal();
    dealer.getCard(newCard);
    }
    System.out.print(player.getName()+":");
    player.showHand();
    System.out.print(dealer.getName()+":");
    dealer.showHand();
  }
  //iterate among players, choose "hit" or "stand"
  public void play(Player player) {
     System.out.println("now it's "+player.getName()+"'s turn");
     player.showHand();
     while(!player.bursted()){
         if (player.blackJack()) {
          System.out.println(player.getName() + "get blackJack!");
          return ; 
         }
         System.out.println("hit or stand(h:1/s:2)?: ");
         Scanner scan = new Scanner(System.in);
         int  order = scan.nextInt();
         if(order==1) {
           System.out.println(player.getName()+" choose to hit!");
           player.getCard(deck.deal());
           player.showHand();
           continue;
         }
         if(order == 2) {
           System.out.println(player.getName()+" choose to stand!");
           player.showHand();
           return ;
         }
     }
     if (player.bursted()) {
       System.out.println(player.getName()+" bursted!");
     }
  }
 public static void main(String[] args){
   Game blackjack = new Game();
   blackjack.play(blackjack.player);
 } 
}
