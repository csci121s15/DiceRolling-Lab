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
  
  public void prettyPrint() {
    //access each index from 2-13, which are possible dice rolls
    for (int i = 2; i < 13; i++) {
      //initialize a stars variable that holds a * according to the value of counts
      String stars = "";
      for (int j = counts[i]; j >= 0; j--) {
        stars = stars + "*";
      }
      System.out.println(i + ":" + stars); 
    }
  }
}