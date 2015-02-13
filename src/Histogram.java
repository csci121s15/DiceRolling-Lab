public class Histogram {
  private int[] histo = new int[13]; // state of the an array: reference to an array
  private double numRolls = 0; // 
    
    public void tally(int roll) { // local variable (int roll)
      histo[roll]+=1; // update histogram with the corresponding number that's rolled
      numRolls+=1; // update numRolls
    }
    public int getCount(int roll) {
      return histo[roll];
    }      
    public double getRatio(int roll) {
      return histo[roll] / (double)numRolls;
    }
    public void print() {
      for (int i = 2; i <= 12; i ++) {
        
    System.out.println(i + " : " + getCount(i) +" : "+ getRatio(i));
      }
    }
}