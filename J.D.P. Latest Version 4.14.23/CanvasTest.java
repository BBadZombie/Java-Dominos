import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;

/**
 * Trying to create my own canvas class 
 * 
 * @author Anthony Lopez
 * @version0 4.10.23
 * 
 * The 'extends' keyword adds extra functionaltiy to the JPanel class
 */
public class CanvasTest extends JPanel {
    private int x = 50;
    private int y = 50;
    
    private Rectangle shape;
    
    /**
     * Method that creates a JFrame, adds the instance of 
     *  CanvasTest to it, sets the size and sets the visibility
     */
    public CanvasTest(String header) {
        JFrame frame = new JFrame(header);
        //the this keyword refers to the instance of CanvasTest
        frame.add(this);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    // public void paint(Graphics g) {
        // super.paint(g);
        // g.drawRect(x, y, 50, 100); // x, y, width, height
        // g.setColor(Color.BLACK);
        // g.fillRect(x, y, 50, 100); // fill the rectangle with color
    // }
    
    public void drawRectangle(Graphics g, int x, int y, int width, int height){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
    }
}

