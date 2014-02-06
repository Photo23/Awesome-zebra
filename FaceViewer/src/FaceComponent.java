import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   Draws a face.
 */
public class FaceComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      int size = 70;
      // head
      Ellipse2D.Double head = new Ellipse2D.Double(10, 10, 200, 200);
      g2.draw(head);
      
      //eyes
      Ellipse2D.Double eyeLeft = new Ellipse2D.Double(50, 70, 15, 15);
      g2.draw(eyeLeft);
      
      Ellipse2D.Double eyeRight = new Ellipse2D.Double(150, 70, 15, 15);
      g2.draw(eyeRight);
      
      //mouth
      Line2D.Double mouth = new Line2D.Double(70, 150, 150, 150);
      g2.draw(mouth);
   }
}