public class Histogram {
  private int[] rollArray = new int[13];
  private int count = 0;
  
  public void tally(int roll) {
    // increment appropriate element of the array
    rollArray[roll] += 1;
    count += 1;
  }
  
  public int getCount(int roll) {
    // returns number of occurences of given roll
    return rollArray[roll];
  }
  
  public double getRatio(int roll) {
    // returns double representing ratio of number of rolls from given rolls and total number of rolls
    return (rollArray[roll] / (double)count);
  }
  
  public void print() {
    // prints a line for each possbile roll (roll value, number of occurences, frequency ratio of the roll)
    int i = 2;
    
    while (i <= 12) {
      System.out.println("roll value: " + i + " number of occurences: " + rollArray[i] + " frequency ratio of the roll: " + getRatio(i));
      i += 1;
    }
  }
  
  public void prettyPrint() {
    // prints histogram graphically using text so distribution is more clear
    // print 2: ***** after 100 rolls
    int i = 2;
    
    // 2 while loop challenge
    while (i <= 12) {
      // fixes spacing
      if (i <= 9) {
        System.out.print(i + ":  ");
      }
      
      else {
        System.out.print(i + ": ");
      }
      
      int holder = rollArray[i] + 1;
      
      while (holder > 0) {
        System.out.print("*");
        holder -= 1;
      }
      
      System.out.println("");
      i += 1;
    }
  }
  
}