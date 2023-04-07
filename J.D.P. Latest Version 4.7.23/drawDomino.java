import java.util.ArrayList;
import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class Rectangle here.
 *
 * @author (Anthony Lopez)
 * @version0 (12.01.22)
 * @version1 (12.03.22)
 * Notes:
 *  - need to find out how to put circles on rectangles to indicate numbers, or just use regular drawn on numbers
 *  - how to make multiple dominos (for loop that repeats for the amount of dominos created by dominoSetLoop)
 * 
 * Added mainSide and secondSide variables to be assigned by - 
 * dominoSetLoop() class and obtained from domino() class.
 * @version2 (12.19.22)
 * Notes:
 *  - still need to find out how to represent numbers on each of the dominos
 * 
 * @version3 (4.7.23)
 * Notes:
 *  - Removed doTheThing() method, it was pretty useless
 *  - Removed size variable, didn't do anything for the program
 * 
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
    private String numberColor;
    private Scanner keyboard;
    private ArrayList<domino> dominosList;
    private domino dominoObject;

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
        xPosition = 100;
        yPosition = 100;
        color = "black";
        numberColor = "white";
        keyboard = new Scanner(System.in);
        dominosList = new ArrayList<>();
        dominoObject = new domino(mainSide, secondSide);
    }

    /**
     * Method to ask if the user wants to play dominos
     * Change made 4.7.23 - replaced Yes || yes statement with - 
     *  - .equalsIgnoreCase() method
     */
    public void dominoAsk(){
        String answer = "";
        System.out.println("Wanna play dominos?");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            dominoCreate();
            drawAllDominos();
        }
    }

    /**
     * Nested for loop that creates 28 domino objects
     * i represents the number of the main side number
     * j represents the number of the second side number
     */
    public void dominoCreate(){
        for (int i = 0; i <= 6; i++){
            //Just to check domino groups, not actually necessary
            //System.out.println("Group " + i);
            for (int j = i; j <= 6; j++){
                dominosList.add(new domino(i, j));
                //System.out.println(" Domino" + ":" + j);
            }
        }
    }

    /**
     * Method that draws out all the dominos on a canvas.
     * Separates dominos by adding 100 to x for every domino
     * Need to implement way to start placing dominos on different line
     * Commented out printlns for now
     */
    public void drawAllDominos() {
        Canvas dominoBoard = Canvas.getCanvas();
        int counter = 0;
        for (domino dominoObject : dominosList) {
            dominoBoard.draw(counter, color, new Rectangle(xPosition, yPosition, height, width));
            // Update the xPosition for the next rectangle
            xPosition = xPosition + 100;
            counter++;
            if(counter == 1000){
                yPosition = yPosition + 50;
                
            }
            //System.out.println("Drawing rectangle for domino object: " + dominoObject.mainSide + ", " + dominoObject.secondSide);
            //System.out.println("xPosition before update: " + xPosition);
        }
    }
    
    /**
     * Changed the comma within the quotations into a colon
     */
    public void getSides(){
        System.out.println(mainSide + ": " + secondSide);
    }
}
