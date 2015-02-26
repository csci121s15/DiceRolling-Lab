public class Histogram {
  
  private int [] hista = new int [13];
  private int total=0;
  
  public void tally(int roll){
    hista[roll]+=1;
    total+=1;
  }
  
  public int getCount(int roll){
    
    return hista[roll];
    
  }
  
  public double getRatio(int roll){
   return hista[roll]/(double)total;
  }
  
  
  public void print(){
    for (int i=2;i<=12;i++){
      System.out.println(i + ":" + getCount(i)+ ":" + getRatio(i));
    }
  }
}

