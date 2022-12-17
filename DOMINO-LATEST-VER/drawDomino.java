import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class Rectangle here.
 *
 * @author (Anthony Lopez)
 * @version0 (12.01.22)
 * @version1 (12.03.22)
 * notes - 
 * - need to find out how to put circles on rectangles to indicate numbers
 * - how to make multiple dominos (for loop that repeats for the amount of dominos created by dominoSetLoop)
 * 
 * Added mainSide and secondSide variables to be assigned by - 
 * dominoSetLoop() class and obtained from domino() class.
 */
public class drawDomino
{
    // instance variables - replace the example below with your own
    private int mainSide;
    private int secondSide;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private int size;
    private Scanner keyboard;

    /**
     * Constructor for objects of class drawDomino
     */
    public drawDomino()
    {
        // initialise instance variables
        mainSide = 0;
        secondSide = 0;
        height = 50;
        width = 100;
        size = 50; 
        xPosition = 100;
        yPosition = 100;
        color = "black";
        keyboard = new Scanner(System.in);
    }

    /**
     * Method to ask if the user wants to play dominos
     */
    public void dominoAsk(){
        String answer = "";
        System.out.println("Wanna play dominos?");
        answer = keyboard.nextLine();
        if(answer.equals("Yes") || answer.equals("yes")){
            //do the thing
        }
    }

    /*
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        Canvas dominoBoard = Canvas.getCanvas();
        dominoBoard.draw(this, color, new Rectangle(xPosition, yPosition, height, width));
    }

    public void getSides(){
        System.out.println(mainSide + ", " + secondSide);
    }
}
