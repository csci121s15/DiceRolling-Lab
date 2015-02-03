public class Histogram{
  private int[] data;
  private int count;
  
  // Initialize a new array and 0 rolls
  public Histogram(){
   data = new int[13];
   count = 0;
  }
  
  public void tally(int roll) {
    data[roll] ++;
    count ++;
  }
  
  public int getCount(int roll) {
    return data[roll];
  }
  
  public double getRatio(int roll) {
    return (double)data[roll]/count;
  }
  
  public void print(){
    int x = 2;
    while(x < 13) { 
      String spacer;
      if (x < 10) {
        spacer = ":  ";
      } else {
        spacer = ": ";
      }
      System.out.println(x + spacer + getCount(x) + " rolls with a frequency of " + getRatio(x));
      x ++;
    }
  }
  
  public void prettyPrint(){
    int element = 2;
    while(element < 13) {
      String spacer;
      if (element < 10) {
        spacer = ":  ";
      } else {
        spacer = ": ";
      }
      System.out.print(element + spacer);
      
      int num = getCount(element);
      while(num >1){
        System.out.print("*");
        num -= 1;
      }
      System.out.println("*");
      element ++;
    }
  }
}
     
        
      