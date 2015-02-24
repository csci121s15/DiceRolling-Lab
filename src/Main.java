public class Main 
{
  public static void main(String [] args)
  {
    Histogram h = new Histogram();
    int q = 0;
    int total = 0; 
  
    Die d1 = new Die();
    Die d2 = new Die();
   
    while (q != 100) {  
    
    d1.roll();
    d2.roll(); 
    
    total = d1.getUpValue() + d2.getUpValue();
    
    h.tally(total);
    h.print();
    q += 1;
    
    }
  }
}
    
     