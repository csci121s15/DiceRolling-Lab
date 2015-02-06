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
      System.out.println(i+": "+getCount(i)+", "+getRatio(i));
    }
  }
//  public void prettyPrint(){
//    for (int i = 2; i < 13; i++){
//    System.out.println(i+": "+getCount(i));
//    }
//   }
}