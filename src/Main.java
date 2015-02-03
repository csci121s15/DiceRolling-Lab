public class Main{
  public static void main(String[] args){
    int simulation = 5;
    
    while (simulation != 0){
      Histogram hist = new Histogram();
      Die d1 = new Die();
      Die d2 = new Die();
      int limit = 1000000;
      
      while(limit != 0){
        int roll_total = d1.getUpValue() + d2.getUpValue();
        hist.tally(roll_total);
        d1.roll();
        d2.roll();
        limit -= 1;
      }
      
      hist.print();
      System.out.println("");
      //hist.prettyPrint();
      simulation -= 1;
    }
  }
}