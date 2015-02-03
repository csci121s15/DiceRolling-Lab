public class Histogram{
  
  private int rollCount;
  private int[] hist;
  
  public Histogram(){
    hist = new int[13];
    rollCount = 0;
  }
    
  public void tally(int roll){
    hist[roll] += 1;
    rollCount += 1;
  }
  
  public int getCount(int roll){
    return hist[roll];
  }
  
  public double getRatio(int roll){
    double a = hist[roll]/ (double) rollCount;
    return a;
  }
  
  public void print(){
    int x = 2;
    while (x < 13){
      System.out.println(x + ":    " + hist[x] + "    " + hist[x]/ (double) rollCount);
      x += 1;
    }
    
  }
  
  public void prettyPrint(){
    int x = 2;
    int n;
    while (x < 13){
      System.out.print(x +":    ");
      
      n = 0;
      while (n < hist[x] - 1){
        System.out.print("*");
        n += 1;
      }
      
      if (hist[x] != 0){
      System.out.println("*");
      }
      
      if (hist[x] == 0){
        System.out.println(0);
      }
      
      x = x+1;
    }
  }
}