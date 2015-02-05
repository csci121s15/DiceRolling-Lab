public class HistTest
{
  public static void main(String[] args)
  {
    Die d1 = new Die();
    Die d2 = new Die();
    
    Histogram hist = new Histogram();
    
    for(int i=0;i<100000000;i++)
    {
      d1.roll();
      d2.roll();
      
      int sum = d1.getUpValue() + d2.getUpValue();
      
      hist.tally(sum);
    }
    
    for(int i=0;i<13;i++)
    {
      System.out.println("Roll: " + i);
      System.out.println("Count = " + hist.getCount(i) + " Rolls");
      System.out.println("Ratio = " + hist.getRatio(i)*100 + " %");
      System.out.println();
    }
    
    hist.print();
    //hist.prettyPrint();
    
  }
}