public class Main
{
  public static void main(String[]args)
  {
    int total = 0;
    int y = 0;
    Histogram h = new Histogram();
    Die d1 = new Die();
    Die d2 = new Die();
    
    while(y != 5000){
      
      d1.roll();
      d2.roll();
      
      //System.out.println(d1.getUpValue());
      //System.out.println(d2.getUpValue());
      
      total = d1.getUpValue() + d2.getUpValue();
      //System.out.println(total);
      h.tally(total);
      total = 0;
      y += 1;
    }
    h.print();
    h.prettyPrint();
  }
}

