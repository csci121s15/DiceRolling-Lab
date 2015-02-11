public class Histogram {
  private int[] counts = new int[13];
  private int totalRolls = 0;
  
  public void tally(int roll) {
    counts[roll] += 1;
    totalRolls += 1;
  }
  
  public int getCount(int roll) {
    return counts[roll];
  }
  
  public double getRatio(int roll) {
    return counts[roll]/(double)totalRolls;
  }
  
  public void print() {
    for (int i = 2; i < 13; i++) {
      System.out.println(i);
      System.out.println(getCount(i));
      System.out.println(getRatio(i));
    } 
  }
  
}