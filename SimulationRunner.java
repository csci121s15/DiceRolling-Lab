public class SimulationRunner { 
  public static void main(String[] args){
    
    Die d1 = new Die();
    Die d2 = new Die();
    
    Histogram hist = new Histogram();
    
    for (int count = 0; count < 5000; count++){
      d1.roll();
      d2.roll(); 
      int sum = d1.getUpValue() + d2. getUpValue(); 
      hist.tally(sum); 
      
      
     }
    hist.print();  
  }
} 

 









//d1.roll();
    //d2.roll();
    
    //int sum = d1.getUpValue() + d2.getUpValue();
    
   // hist.tally(sum);
    
    //hist.tally(2);
    //hist.tally(3);
    //hist.tally(4);
    //hist.tally(5);
    
    //hist.print();