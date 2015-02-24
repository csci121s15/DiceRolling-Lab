public class Histogram {
  private int[] data = new int[13];
  private int count = 0;
  
  public void tally(int roll) {
    data[roll] += 1;
    count += 1;
  }
  
  public int getCount(int roll) {
    return data[roll];
  }
  
  public double getRatio(int roll) {
    return data[roll] / (double) count;
  }
  
  public void print() {
    int val = 2;
    while (val <= 12) {
      System.out.println(val +"/" + data[val] + "*" + getRatio(val));

      val += 1;
    }
  }
}