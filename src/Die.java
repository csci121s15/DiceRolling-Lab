/**
 * The Die class represents a single 6-sided die.  The interface
 * allows the user to roll the die and then at any point afterward
 * get the current "up value" of that die.  When a die object is 
 * created, it is immediately rolled - i.e. the initial value
 * is random.
 */
public class Die
{
  private int upValue;
  
  /**
   * When created the die is rolled, giving it a random value
   */
  public Die()
  {
    roll();
  }
  
  /**
   * Roll the die
   */
  public void roll()
  {
    upValue = (int)(Math.random() * 6) + 1;
  }
  
  /**
   * Get the current value of the die - i.e. the result of 
   * the previous roll.
   * @return the integer value of the value facing up
   */
  public int getUpValue()
  {
    return upValue;
  }
}