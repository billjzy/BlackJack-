public class Card {
  public static final String[] face = {"Ace", "2", "3", "4", "5", "6","7","8","9","10","Jack","Queen", "King"};
  public static final String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
  private String faceValue;
  private String suitValue;
  private int val;
  public Card(int f, int s){//f should range [0, 12], s [0,3];
    faceValue = face[f];
    suitValue = suit[s];
    val = f+1;
  }
  
  public int cardVal() {
    return val;
  }
  @Override
  public String toString() {
    return faceValue+"--"+suitValue;
  } 
}
