public class Simulation {
  public static void main(String[] args) {
    Histogram hist = new Histogram();
    Die die = new Die();
    Die die2 = new Die();
    
    for (int i = 0; i <= 1000000; i++) {
      die.roll();
      die2.roll();
      hist.tally(die.getUpValue()+die2.getUpValue());
    }    
    hist.print();
  }
}