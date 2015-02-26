public class Histogram {
  private int[] hist = new int[13];
  int rolls = 0;

  public void tally(int roll){
    hist[roll] += 1;
    rolls += 1;
  }
  public int getCount(int roll){
    return hist[roll];
  }
  public double getRatio(int roll){
    return hist[roll]/(double)rolls;
    }
  public void print(){
    for (int i = 2; i < 13; i++){
      System.out.println(i + ": " + getCount(i) + ", " + getRatio(i));
    }
  }
  public void prettyPrint(){
    int highRoll = 0;
    for (int i = 0; i < 13; i++) {
      if (highRoll < hist[i])
        highRoll = hist[i];
    }
    for (int i = 2; i < 13; i++){
      String stars = "";
      for (int s = (int) ((double)hist[i]/highRoll * 100); s != 0; s--) {
        stars += "*";
      }
      System.out.println(i + ": " + stars);
    }
  }
}