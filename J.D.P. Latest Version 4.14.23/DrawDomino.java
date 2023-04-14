import java.util.ArrayList;
import java.awt.*;
import java.util.Scanner;
/**
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
public class DrawDomino
{
    private int mainSide;
    private int secondSide;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private String numberColor;
    private Scanner keyboard;
    private ArrayList<Domino> dominosList;
    private Domino dominoObject;

    /**
     * Constructor for objects of class drawDomino
     */
    public DrawDomino()
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
        dominoObject = new Domino(mainSide, secondSide);
    }

    /**
     * Method to ask if the user wants to play dominos
     * Changes made 4.7.23:
     * - replaced Yes || yes statement with .equalsIgnoreCase() method
     * 
     * Changes made 4.10.23:
     * - Added else statement if different input is received
     * - Instead of assigning field answer to "" now it's just instantiated
     */
    public void dominoAsk(){
        String answer;
        System.out.println("Wanna play dominos?");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            dominoCreate();
            drawAllDominos();
        }else{
            System.out.println(":(");
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
                dominosList.add(new Domino(i, j));
                //System.out.println(" Domino" + ":" + j);
            }
        }
    }

    /**
     * Method that draws out all the dominos on a canvas.
     * Separates dominos by adding 100 to x for every domino
     * Need to implement way to start placing dominos on different line
     * Commented out printlns for now
     * Changes made 4.10.23 - 
     *  - made it so dominos would start printing on separate line after 1000 units
     *  - removed comments after if statement
     */
    public void drawAllDominos() {
        Canvas dominoBoard = Canvas.getCanvas();
        int counter = 0;
        for (Domino dominoObject : dominosList) {
            dominoBoard.draw(counter, color, new Rectangle(xPosition, yPosition, height, width));
            // Update the xPosition for the next rectangle
            xPosition = xPosition + 100;
            counter++;
            if(xPosition == 1000){
                yPosition += 150;
                //had to reset xPosition after establishing yPosition
                xPosition = 100;
            }
        }
    }
    
    /**
     * Changed the comma within the quotations into a colon
     */
    public void getSides(){
        System.out.println(mainSide + ": " + secondSide);
    }
}
