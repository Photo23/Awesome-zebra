
public class sumCalculator {
	public int sum(int number) {
	     int total = 0;  
		int counter = 1;
	      while (counter < number + 1)
	      {
	    	  total = total + counter;	  
	    	  counter = counter + 1;
	      }
       return total;  
}
}