public class Histogram{
  private int[] gram = new int[13];
  private int count = 0;
  
  
  public void tally(int roll){
    gram[roll] += 1;
    count += 1;
  }
  
  public int getCount(int roll){
    return gram[roll];
  }
  
  public double getRatio(int roll){
    return gram[roll]/(double)count;
  }
  
  public void print(){
    int x = 2;
    while(x!=13){
      System.out.println(x + ":" + " Number of Occurances: " + gram[x] + " Ratio: " + (double)gram[x]/count);
      x += 1;
    }
  }
  
  public void prettyPrint(){
    int q = 2;
   
    while(q!=13){
      System.out.println();
      int sum = 0;
      System.out.print(q + ":  ");
      while(sum < getCount(q)){
        System.out.print('*');
        sum += 1;
      }
      q += 1;
     }
  }
            
            
    
}
  
  
    
        
    
    