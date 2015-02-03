public class Main{
  
  public static void main(String[] args){
    
    Die die1 = new Die();
    Die die2 = new Die();
    int x = 1;
    Histogram hist = new Histogram();
    
    while (x < 200001){
      die1.roll();
      die2.roll();
      hist.tally(die1.getUpValue() + die2.getUpValue());
      x += 1;
    }
    hist.print();
    
  }
}
    
    