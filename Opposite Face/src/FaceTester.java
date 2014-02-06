import java.util.Scanner;

import javax.swing.JFrame;
public class FaceTester {
	public static void main(String[] args)
	{
		//Asks user for normal red or black sleeping face.
		System.out.print("Do you want a normal face (enter 0) or an opposite face (enter 1)? ");
		Scanner in = new Scanner(System.in);
		int userIn = in.nextInt();
		
		//Defines display frame.
		JFrame frame = new JFrame();

	      frame.setSize(300, 600);
	      frame.setTitle("FaceViewer");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      

	    while (userIn != 2)  
	    {
	    	
	  
			// Creates Normal Face
			
		    if (userIn == 0)
			{
		    	MyFace component = new MyFace(500, 50);
			      frame.add(component);
			      frame.setVisible(true);
			      System.out.print("Do you want to change the face or quit(enter 2)? ");
				  userIn = in.nextInt();
				  frame.remove(component);
			}
			
			// Creates Opposite Face
		    
			else if (userIn == 1)
			{
				OppositeFace component = new OppositeFace(500, 0);
			      frame.add(component);
			      frame.setVisible(true);
			      System.out.print("Do you want to change the face or quit(2)? ");
				  userIn = in.nextInt();
				  frame.remove(component);
			}
		   	
		   	
		   	
	    }
	}
}
