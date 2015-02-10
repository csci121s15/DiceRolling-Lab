public class hDriver {
  public static void main(String[] args) {
    Histogram h = new Histogram();
    Die d1 = new Die();
    Die d2 = new Die();
    int num = 0;
    
    while (num <=50000000) {   
    d1.roll();
    d2.roll();
    h.tally(d1.getUpValue() + d2.getUpValue());
    num+=1;
    }
    
    h.print();
  }
}
    
    
                  