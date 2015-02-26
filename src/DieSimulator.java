public class DieSimulator{
  public static void main(String[]args){
    Die d1 = new Die();
    Die d2 = new Die();
    
    Histogram hist = new Histogram();
    
    for (int count = 0; count < 500000; count++){
      d1.roll();
      d2.roll();
      hist.tally(d1.getUpValue()+d2.getUpValue());
    }
    hist.print();
    
    Histogram hist2 = new Histogram();
    
    for (int i = 0; i < 10; i++) {
      d1.roll();
      d2.roll();
      hist2.tally(d1.getUpValue()+d2.getUpValue());
    }
    hist2.print();
    hist2.prettyPrint();
  }
}