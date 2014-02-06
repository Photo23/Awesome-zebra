

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

	/** Creates a red face.
	 * 
	 * @author Jonathan Bush
	 *
	 */
public class MyFace extends JComponent {
	
	// Instance variables
	int height, mouthSize, x, y;
	
	
	
	
	// constructors
	/**
	 * Constructs default face
	 */
	public MyFace ()
	{
		height = 200;
		mouthSize = 25;
		x = 25;
		y = 10;
	
	}
	/** Constructs a face with given height for the head and size for the mouth.
	 * 
	 * @param heightIn Height of head.
	 * @param mouthSizeIn Size of the mouth.
	 * 
	 */
	public MyFace (int heightIn, int mouthSizeIn)
	{
		height = heightIn;
		mouthSize = mouthSizeIn;
		x = 25;
		y = 10;
	}
	
	  /**
	   Draws a face.
	   */
	   public void paintComponent(Graphics g)
	   {
		 
	      Graphics2D g2 = (Graphics2D) g;
		  g2.setColor(Color.red);
		  
	      // draws head
	      Ellipse2D.Double head = new Ellipse2D.Double(x, y, 225, height);
	      g2.draw(head);
	      
	      // draws left eye
	      Ellipse2D.Double eyeLeft = new Ellipse2D.Double(75, height / 4, 25, 25);
	      g2.fill(eyeLeft);
	      g2.draw(eyeLeft);
	      
	      // draws right eye
	      Ellipse2D.Double eyeRight = new Ellipse2D.Double(175, height / 4, 25, 25);
	      g2.fill(eyeRight);
	      g2.draw(eyeRight);
	      
	      // draws mouth
	      Ellipse2D.Double mouth = new Ellipse2D.Double(75, height / 1.5, 125, mouthSize);
	      g2.draw(mouth);
	   }
	   
	   public  toString()
	   {
		   
	   }
}
