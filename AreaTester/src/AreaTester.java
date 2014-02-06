import java.awt.Rectangle;
public class AreaTester {
	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle(6,5);
		double width = box.getWidth();
		double height = box.getHeight();
		double area = (width) * (height);
		
		System.out.println(area);
}
}
