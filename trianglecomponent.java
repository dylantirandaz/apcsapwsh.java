java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
	
	// constant class array to hold progression of colors 
	private static final Color LAVENDER = new Color(204, 153, 255);
	private static final Color PURPLE = new Color(153, 0, 255);
	private static final Color[] colors = {LAVENDER, Color.cyan, Color.darkGray, Color.blue, 
		PURPLE, Color.pink, Color.black, Color.lightGray};
	private static final int SIDES = 3;
	private static final int STARTCOLOR = 0;
	private static final int DISTANCEFROMBORDER = 5;
	private static final int HALVED = 2;
		
	// Graphics object used for drawing
	private Graphics2D gr;
	
	/** Draw the triangles
	 *  @param g the Graphics object for drawing in this component
	 */
	@Override
	public void paintComponent(Graphics g) 
	{
		gr = (Graphics2D) g;
		//initial call to drawTriangle method 
		drawTriangle(getWidth() / HALVED, DISTANCEFROMBORDER, DISTANCEFROMBORDER, 
			getHeight() - DISTANCEFROMBORDER, getHeight() - DISTANCEFROMBORDER, 
				getHeight() - DISTANCEFROMBORDER, STARTCOLOR);
				
		
	}
	
	private void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int colorIndex)
	{
		if(colorIndex ==  colors.length -1)
				colorIndex = STARTCOLOR;
				
		int[] xValues = {x1, x2, x3};
		int[] yValues = {y1, y2, y3};
		//the krabby patty formula for actually drawing a triangle 
		Polygon tri = new Polygon(xValues, yValues, SIDES);
		gr.setColor(colors[colorIndex]);
		gr.fill(tri);
		
		//draws the top/center triangle 
		if((y1+y2) / HALVED != y1)
			drawTriangle(x1, y1, (x1 + x2) / HALVED, (y1 + y2) / HALVED, 
				(x1 + x3) / HALVED, (y1 + y3) / HALVED, colorIndex + 1 );
		// draws the right triangle
		if((x2 + x3) / HALVED != x2)
			drawTriangle((x1 + x2) / HALVED, (y1 + y2) / HALVED, x2, y2, 
				(x2 + x3) / HALVED, (y2 + y3) / HALVED, colorIndex + 1);
		//draws the left triangle
		if((x2 + x3) / HALVED != x2)
			drawTriangle((x1 + x3) / HALVED, (y1 + y3) / HALVED, 
				(x2 + x3) / HALVED, (y2 + y3) / HALVED, x3, y3, colorIndex + 1);
	
	}
}	
