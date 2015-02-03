public class Main {
  public static void main(String [] args) {
    Histogram h = new Histogram();
    
    int i = 0;
    while (i < 100) {
      Die d1 = new Die();
      int bothRolls = d1.getUpValue();
    
      Die d2 = new Die();
      bothRolls += d2.getUpValue();
      h.tally(bothRolls);
      
      i += 1;
    }
      
    h.print();
    h.prettyPrint();
  }
}