public class DieMain{
  public static void main(String[] args){
    Die d1 = new Die();
    Die d2 = new Die();
    Histogram h = new Histogram();

    int turns = 0;
    while (turns <=1000000){
      d1.roll();
      d2.roll();
      
      int roll = d1.getUpValue() + d2.getUpValue();   
      h.tally(roll);
      turns += 1;
    }
    
    h.print();
    

   }
}




//    int val = 2;
//    while (val <=12){
//      System.out.println(val + " " + h.getCount(val) + " " + h.getRatio(val));
//      val += 1;
    
//    d1.roll();
//    d2.roll();
//    
//    int a = d1.getUpValue();
//    int b = d2.getUpValue();
//    
//    int roll = d1.getUpValue() + d2.getUpValue();   
//    
//    h.tally(roll);
//    h.tally(5);
//    h.tally(7);
//    h.tally(7);
//    
//    int val = 2;
//    while(val <=12)
//    {
//      System.out.println(val + " " + h.getCount(val) + " " + h.getRatio(val));
//      val +=1;
//    }