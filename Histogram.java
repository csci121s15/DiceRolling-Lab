public class Histogram { 
  private int[] hist = new int [13];
  private int total = 0; 
  
  public void tally(int roll){
    hist[roll] += 1;
    total += 1;
  }
  //increments the appropriate element of the array
  
  public int getCount(int roll){
    return hist[roll];
   }
  //number of occurances of the given roll 
  // need it to return the count so it can be used in other places
  
  
  public double getRatio(int roll){
    return hist[roll] / (double)total;
  }
  //ratio of rolls that resulted in the given total for that roll
  
  public void print(){
    for (int i = 2; i <= 12; i++){
    System.out.println(i + ":" + getCount(i) + ":" + getRatio(i));
      
 }
  }    
  //prints a line for each possible rol1; roll value and its frequency
  
  
  
  
}