import java.util.Scanner;

import javax.swing.JFrame;
public class FaceTester {
	public static void main(String[] args)
	{
		//Asks user for normal or opposite face
		/** System.out.print("Do you want a normal face (0) or an opposite face (1)? ");
		
		Scanner in = new Scanner(System.in);
		int face = in.nextInt();
		*/
		JFrame frame = new JFrame();

	      frame.setSize(300, 600);
	      frame.setTitle("FaceViewer");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      OppositeFace component = new OppositeFace();
	      frame.add(component);

	      frame.setVisible(true);
	      
		// Creates Normal Face
		/**
	    if (face == 0)
		{
			System.out.println("normal face");
		}
		
		// Creates Opposite Face
		else if (face == 1)
		{
			System.out.println("opposite face");
		}
		*/
	}
}
