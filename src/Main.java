public class Main
{
  public static void main(String[] args)
  {
    Histogram h = new Histogram();
      
    Die die1 = new Die();
    Die die2 = new Die();
    
    for(int i = 0; i < 13; i++)
    {
      die1.roll();
      die2.roll();
      h.tally(die1.getUpValue() + die2.getUpValue());
      
    }
    
    h.print();
  }
}