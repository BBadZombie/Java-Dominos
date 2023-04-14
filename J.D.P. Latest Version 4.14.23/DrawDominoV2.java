import java.util.ArrayList;
import java.awt.*;
import java.util.Scanner;

/**
 * @author Anthony Lopez
 * @version0 4.10.23 
 * 
 * Notes:
 *  - Made this class to try and use the CanvasTest class
 *  - Also took the chance to remove comments to see how it looked
 *  
 * @version1 4.14.23
 * Notes:
 *  - Removed dominoAsk method in favor of having a main method
 *  - Removed instantiation of Scanner in constructor and put it into main method
 *  - Added static keyword to mostly everything since that is required of a main method
 *  - Declared and instantiated Scanner in dominoAsk because no other methods used it
 *  - Converted 'side' fields to bytes from ints because no numbers higher than 6 will be stored
 *  - Removed drawAllDominos method because it was no longer needed for reference
 */
public class DrawDominoV2
{
    private static byte mainSide;
    private static byte secondSide;
    
    private static int height;
    private static int width;
    private static int xPosition;
    private static int yPosition;
    
    private static String color;
    private static String numberColor;
    
    private static ArrayList<Domino> dominosList;
    private static Domino dominoObject;
    private static CanvasTest canvas;

    // /**
     // * Constructor for objects of class drawDomino
     // */
    // public DrawDominoV2()
    // {
        // mainSide = 0;
        // secondSide = 0;
        
        // height = 50;
        // width = 100; 
        // xPosition = 100;
        // yPosition = 100;
        
        // color = "black";
        // numberColor = "white";
        
        // dominosList = new ArrayList<>();
        // dominoObject = new Domino(mainSide, secondSide);
    // }

    /**
     * Main method for class DrawDominoV2
     * Notes:
     *  - When a static method is called (like the main method) the instance fields
     *    aren't initialized. This needs to be done in the main method
     *    or other static methods
     */
    public static void main (String [] args){
        mainSide = 0;
        secondSide = 0;
        
        height = 50;
        width = 100; 
        xPosition = 100;
        yPosition = 100;
        
        color = "black";
        numberColor = "white";
        
        dominosList = new ArrayList<>();
        dominoObject = new Domino(mainSide, secondSide);
        canvas = new CanvasTest("Domino Board");
        
        dominoAsk();
    }
    
    /**
     * Method to ask if the user wants to play dominos
     * Changes made 4.14.23:
     *  - Switched to private modifier from public
     */
    private static void dominoAsk(){
        System.out.println("Wanna play dominos?");
        
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        
        if(answer.equalsIgnoreCase("Yes")){
            dominoCreate();
            drawAllDominosV2();
        }else{
            System.out.println(":(");
        }
    }

    /**
     * Nested for loop that creates 28 domino objects
     * i represents the number of the main side number
     * j represents the number of the second side number
     */
    private static void dominoCreate(){
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                dominosList.add(new Domino(i, j));
            }
        }
    }

    /**
     * Method that draws out all the dominos on a canvas.
     * Separates dominos by adding 100 to x for every domino
     */
    private static void drawAllDominosV2() {
        Graphics g = canvas.getGraphics();
        int counter = 0;
        for (Domino dominoObject : dominosList) {
            canvas.drawRectangle(g, xPosition, yPosition, height, width);
            xPosition = xPosition + 100;
            counter++;
            if(xPosition == 1000){
                yPosition += 150;
                xPosition = 100;
            }
        }
    }
    
    /**
     * Changed the comma within the quotations into a colon
     */
    private static void getSides(){
        System.out.println(mainSide + ": " + secondSide);
    }
}
