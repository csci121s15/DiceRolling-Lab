public class Histogram{
  private int[] hist;
  private int numRolls;
    
  public Histogram()
  {
    hist = new int[13];
    numRolls = 0;
  }
  
  public void tally(int roll){
    hist[roll] += 1;
    roll += 1;
    numRolls += 1;
  }
      
  public int getCount(int roll){
    return hist[roll];
  }
      
  public double getRatio(int roll){
    return (double)hist[roll]/numRolls;
    //hist[roll]/(double)numRolls;
  }

  public void print(){
 //   System.out.println(hist[roll]);
    int val = 2;
    while (val <=12){
      System.out.println(val + " " + getCount(val) + " " + getRatio(val));
      val += 1;
  }
      
//  public void prettyPrint(){
//    System.out.println(hist[roll]);
  }
      
     
}