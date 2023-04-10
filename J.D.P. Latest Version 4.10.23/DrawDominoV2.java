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
 */
public class DrawDominoV2
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
    public DrawDominoV2()
    {
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
    private void dominoCreate(){
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
    private void drawAllDominos() {
        Canvas dominoBoard = Canvas.getCanvas();
        int counter = 0;
        for (Domino dominoObject : dominosList) {
            dominoBoard.draw(counter, color, new Rectangle(xPosition, yPosition, height, width));
            xPosition = xPosition + 100;
            counter++;
            if(xPosition == 1000){
                yPosition += 150;
                xPosition = 100;
            }
        }
    }
    
    /**
     * Method to try and work with CanvasTest class in a different class
     */
    public void canvasWork(){
        String header = "DominoBoard";
        CanvasTest ct = new CanvasTest(header);
    }
    
    /**
     * Changed the comma within the quotations into a colon
     */
    private void getSides(){
        System.out.println(mainSide + ": " + secondSide);
    }
}
