public class Histogram
{
  int [] numRolls = new int[13];
  double count = 0.0;
  
  public void tally(int roll)
  {
    numRolls[roll] += 1;
    count += 1.0;
  }
  
  public int getCount(int roll)
  {
    return numRolls[roll];
  }
  
  public double getRatio(int roll)
  {
    double ratio = numRolls[roll]/count;
    return ratio;
  }
  
  public void print()
  {
    for(int i = 0; i<13; i++)
    {
      System.out.println(i + ": " + numRolls[i] + " Frequency Ratio: " + getRatio(i));
    }
  }
  
  public void prettyPrint()
  {
    for(int i = 0; i<13; i++)
    {
      int sum = numRolls[i];
      System.out.print(i + ":");
      
      for(int a = 0; a<13; a++)
      {
        if(a<sum)
        {
          System.out.print("*");
        }
        
      }
      System.out.println();
    }
  }
    
}//end class Histogram