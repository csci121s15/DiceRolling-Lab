public class SimulationRunner {
  public static void main(String[] args){
    Die d1 = new Die();
    Die d2 = new Die();
    
    Histogram hist = new Histogram();
    
    for (int count = 0; count < 1000; count++) {
      d1.roll();
      d2.roll();
      hist.tally(d1.getUpValue() + d2.getUpValue());
      
    }
    
    hist.print();
  }
}