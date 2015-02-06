public class Histogram{
  private int[] h = new int[13];
  private int totalRolls = 0;
  
  public void tally(int roll){
    h[roll] += 1;
    totalRolls += 1;
  }
  public int getCount(int roll){
    return h[roll];
  }
  public double getRatio(int roll){
    double ratio = h[roll] / (double)totalRolls;
    return ratio;
  }
  public void print(){
    for(int i = 2; i <= 12; i++){
      System.out.println(i + ": " + getCount(i));
    }
  }
}
      