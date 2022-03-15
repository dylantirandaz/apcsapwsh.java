java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class HalloweenDrawing extends JComponent
{
	private Graphics2D g2;
	private int width;
	private int height;
	
	/** Draw a house, a pumpkin, and a greeting
	 *  @param g the Graphics object for drawing
	 */
	@Override
	public void paintComponent(Graphics g)
	{
		// Convert g back to its Graphics2D self
		g2 = (Graphics2D)g;
		
		// Get size of component window
		width = getWidth();
		height = getHeight();
		
		// Draw house 
		drawHouse();
		
		// Draw pumpkin
		drawPumpkin();
		
		// Draw greeting
		g2.setColor(Color.black);
		g2.drawString("Happy Halloween, Wolfpack", 30, 30);
	}
	
	/** 
	 * this draws the house and i made it orange for halloween theme
	 */
	public void drawHouse()
	{
		Color orange = new Color (255, 145, 0);
		g2.setColor(orange);
		int boxX = 90;
		int boxY = 110;
		int boxWidth = 200;
		int boxHeight = 155;
		Rectangle box = new Rectangle(boxY, boxX, boxWidth, boxHeight);
		box = new Rectangle (90, 110, 200, 155);
		g2.fill(box);
		
		Color black = new Color (0, 0, 0);
		g2.setColor(black);
		Line2D.Double bruh = new Line2D.Double(190, 60, 290, 110);
		g2.draw(bruh);
		Line2D.Double what = new Line2D.Double(90, 110, 190, 60);
		g2.draw(what); 
		drawHouseFeatures(90, 110, 200, 155);
	}
	
	/** 
	 * This draws windows and door 
	 */
	public void drawHouseFeatures(int houseX, int houseY, int houseWidth, int houseHeight)
	{
		Color black = new Color (0, 0, 0);
		g2.setColor(black); 
		Rectangle window1 = new Rectangle(houseX, houseY, houseWidth, houseHeight);
		window1 = new Rectangle(120, 150, 35, 60);
		g2.draw(window1);
		g2.setColor(black);
		Rectangle window2 = new Rectangle(houseX, houseY, houseWidth, houseHeight);
		window2 = new Rectangle(225, 150, 35, 60);
		g2.draw(window2);
		Color brown = new Color (101, 67, 33);
		g2.setColor(brown);
		Rectangle door = new Rectangle(houseX, houseY, houseWidth, houseHeight);
		door = new Rectangle(170, 175, 40, 90);
		g2.fill(door);
	}
	
	/** 
	 */
	public void drawPumpkin()
	{
		Color orange = new Color(230, 140, 0);
		g2.setColor(orange);
		double circleX = width / 3 + 150;
		double circleY = height / 3 + 50;
		double diameter = 150;
		Ellipse2D.Double circle = new Ellipse2D.Double(circleX, circleY, diameter, diameter);
		g2.fill(circle);
		Color brown = new Color(99, 65, 30);
		g2.setColor(brown);
		int stemX = 200;
		int stemY = 100;
		int stemWidth = 20;
		int stemHeight = 35;
		Rectangle stem = new Rectangle(stemX, stemY, stemWidth, stemHeight);
		stem = new Rectangle(478, 150, 20, 35);
		g2.fill(stem);
		drawPumpkinFace(width / 3 + 150, height / 3 + 150, 150, 150);
	}
	
	/** 
	 */
	public void drawPumpkinFace(int pumpkinX, int pumpkinY, int pumpkinWidth, int pumpkinHeight)
	{
		Color black = new Color(0, 0, 0);
		g2.setColor(black);
		Ellipse2D.Double eye1 = new Ellipse2D.Double(pumpkinX, pumpkinY, pumpkinWidth, pumpkinHeight);
		eye1 = new Ellipse2D.Double(430, 205, 30, 30);
		g2.fill(eye1);
		
	}
}
