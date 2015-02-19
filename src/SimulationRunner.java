public class SimulationRunner { // sets everything up to set a test. Initialize all the methods!
  public static void main(String[] args) { // has to store all local variables before running: Die d1, Die d2, Histogram histo, int sum, int count
  Die d1 = new Die(); // created dice
  Die d2 = new Die(); // created dice
  
  Histogram histo = new Histogram(); // creates a reference to Histogram
  
  for (int count = 0; count < 100; count++) {
    d1.roll();
    d2.roll();
    
    histo.tally(d1.getUpValue() + d2.getUpValue());
  }
  
  histo.print();
 
  }
}