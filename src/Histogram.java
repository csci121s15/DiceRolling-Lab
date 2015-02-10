public class Histogram {
  public int[] data;
  public int count;
  
  public Histogram() {
    data = new int[13];
    count = 0;
  }
  
  public void tally(int roll){
    data[roll]+=1;
    count+=1;
  }
  
  public int getCount(int roll){
    return data[roll];
  }
    
  public double getRatio(int roll) {
    return (data[roll]/(double)count);
  }
    
  public void print() {
      System.out.println("2: " + "count: " + data[2] + "," + getRatio(2));
      System.out.println("3: " + "count: " + data[3] + "," + getRatio(3));
      System.out.println("4: " + "count: " + data[4] + "," + getRatio(4));
      System.out.println("5: " + "count: " + data[5] + "," + getRatio(5));
      System.out.println("6: " + "count: " + data[6] + "," + getRatio(6));
      System.out.println("7: " + "count: " + data[7] + "," + getRatio(7));
      System.out.println("8: " + "count: " + data[8] + "," + getRatio(8));
      System.out.println("9: " + "count: " + data[9] + "," + getRatio(9));
      System.out.println("10: " + "count: " + data[10] + "," + getRatio(10));
      System.out.println("11: " + "count: " + data[11] + "," + getRatio(11));
      System.out.println("12: " + "count: " + data[12] + "," + getRatio(12));
    
   }
}
    
  
  