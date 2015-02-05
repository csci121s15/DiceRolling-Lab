public class Histogram
{
    private int[] hist = new int[13];
    private double total = 0;
    
    public void tally (int roll)
    {
      hist[roll] += 1;
      total += 1;
    }
    public int getCount(int roll)
    {
      return hist[roll];
    }
    public double getRatio(int roll)
    {
      return (hist[roll]/total);
    }
    
    public void print()
    {
      for(int i=0; i<13; i++)
      {
        System.out.println( i + " was rolled " + hist[i] + " times.");
      }
    }
    
    public void prettyPrint()
    {
      int tallies = 0;
      for(int i=0; i<13; i++)
      {
        tallies = hist[i];
        System.out.println();
        System.out.print( i + ": ");
        while (tallies > 0)
        {
          System.out.print( "*");
          tallies--;
        }
      }
    }
}