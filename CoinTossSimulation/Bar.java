// Name: Lu Xie
// USC NetID: 2327394360
// CS 455 PA1
// Spring 2017

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
	private int theBottom;
	private int theLeft;
	private int theWidth;
	private int theHeight;
	private Color theColor;
	private String theLabel;
	private double theScale;
	

   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
	   theBottom = bottom;
	   theLeft = left;
	   theWidth = width;
	   theHeight = barHeight;
	   theColor = color;
	   theLabel = label;
	   theScale = scale;
   }
   
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
	   g2.setColor(theColor);
	   Rectangle bar = new Rectangle(theLeft, theBottom - theHeight, theWidth, theHeight);
	   //g2.draw(bar);
	   g2.fill(bar);
	   g2.setColor(Color.BLACK);
	   Font font = g2.getFont();
	   FontRenderContext context = g2.getFontRenderContext();
	   Rectangle2D labelBounds = font.getStringBounds(theLabel, context);
	   double widthOfLabel = labelBounds.getWidth();
	   int widthLabel = (int) widthOfLabel;
	   double heightOfLabel = labelBounds.getHeight()*1.5;
	   int heightLabel = (int) heightOfLabel;
	   g2.drawString(theLabel, theLeft + theWidth/2 - widthLabel/2 , theBottom + (int) heightLabel);
	   
   }
}