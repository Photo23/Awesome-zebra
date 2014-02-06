public class Angles
{
   /**
      Normalizes an angle.
      @param angle an integer angle (may be negative)
      @return the equivalent angle in the range 0 ... 359
   */
   public int normalize(int angle)
   {
	  int normalized = angle % 360;
	  if (normalized >= 0)
	  {
		  return normalized;
	  }
      
	  else 
	  {
		 return normalized + 360;
	  }
      
       
      
    		  
      
      
      
      
   }   
}
