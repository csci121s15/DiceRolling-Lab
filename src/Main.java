public class Main {
  public static void main(String[] args) {
    
    Die d1 = new Die();
    Die d2 = new Die();
    int total = 0;
    
    Histogram h = new Histogram();
      
    for (int count = 0; count < 100; count++) {
      d1.roll();
      d2.roll();
      
      total = d1.getUpValue() + d2.getUpValue();
      
      h.tally(total);
    }
    
    h.print();
  }  
}
