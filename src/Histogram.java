public class Histogram {

  private int[] hist = new int [13];
  private int totalrolls = 0;
  
  public void tally(int roll) {
    hist[roll] += 1;
    totalrolls += 1;
  }
  
  public int getCount(int roll) {
    return hist[roll];
    
  }
  
  public double getRatio(int roll) {
    return hist[roll] /(double)totalrolls;
  }
      
  public void print() {
    for (int i = 2; i <= 12; i++) {
      System.out.println(i + " : " + getCount(i) + " : " + getRatio(i));
    }
  }
}
    
          
      
        
      
      