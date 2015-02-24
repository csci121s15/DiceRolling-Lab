public class Histogram {
 private int[] values = new int[13];
 private int count = 0;
  int q = 0;
  
  public void tally(int roll) {
   values[roll] +=1; 
     count +=1;
 }
  public int getCount(int roll) {
    return values[roll];
  }
  public double getRatio(int roll) {
    return values[roll] / (double) count;
  }
  public void print() {
    int val = 2; 
    while(val <=12) {
      System.out.println(val + "/" + getCount(val) + "*"+ getRatio(val));
       val+= 1; 
    }
  }
}
