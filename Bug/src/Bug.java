
public class Bug
{
   private int position = 0;
   private int direction = 1;
   
   /**
      Constructs a bug with a given position, facing right.
      Right == 1, left == 0
      @param initialPosition the initial position
   */
   public Bug(int initialPosition)
   {
      position = initialPosition;
   }
   
   /**
      Moves the bug by one unit in the current direction.
   */
   public void move()
   {
      if (direction == 1)
      {
    	  position = position + 1;
    	  
      }
      
      else if (direction == 0)
      {
    	  position = position - 1;
      }
   }
   
   /**
      Flips the direction of this bug. 
   */
   public void turn()
   {
      if (direction == 1)
      {
    	  direction = 0;
      }
      
      else if (direction == 0)
      {
    	  direction = 1;
      }
   }
   
   /**
      Gets the current position of this bug.
      @return the position
   */
   public int getPosition()
   {
      return position;
   }
}
