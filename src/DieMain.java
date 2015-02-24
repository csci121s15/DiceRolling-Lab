public class DieMain{
  public static void main(String[] args){
    Die d1 = new Die();
    Die d2 = new Die();
    Histogram h = new Histogram();

    int turns = 0;
    while (turns <=100){
      d1.roll();
      d2.roll();
      
      int roll = d1.getUpValue() + d2.getUpValue();   
      h.tally(roll);
      turns += 1;
    }
    
    h.print();
    
    h.prettyPrint();

   }
}