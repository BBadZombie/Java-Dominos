import java.util.ArrayList;
import java.lang.Integer;
import java.lang.*;
/**
 * The main purpose of dominoSetLoop() is to have a loop which - 
 * creates 28 dominos each with an assigned main & second side
 * 
 * notes - 
 * potential ways to store information created by the loop:
 *   - arrayList (not sure if you can assign values that the object has?)
 *   - array (doesnt store object, but can store multidimensional arrrays which could be a solution, need more research)
 *
 * @author (Anthony Lopez)
 * @version0 (12.3.2022): created domino for loop, played arround with ways to create objects and assign values (haven't found one)
 * @version1 (12.6.2022): added notes/comments for clarity and documentation purposes
 * @version2 (12.7.2022): added printDominoSides method
 * - need to change class names to capital first!z
 */
public class dominoSetLoop
{
    // Creates new fields
    private int mainSide;
    private int secondSide;
    private domino dominoObject;
    private ArrayList<domino> dominosList;

    /**
     * Constructor for objects of class dominoSetLoop
     */
    public dominoSetLoop()
    {
        // initialise instance variables
        mainSide = 0;
        secondSide = 0;
        dominoObject = new domino(mainSide, secondSide);
        dominosList = new ArrayList<>();
    }

    // public domino getDominoObject(int elementNum){
    // int index = elementNum - 1;
    // return dominosList.get(index);
    // }

    /**
     * Nested for loop that creates 28 domino objects
     * Not sure if you can assign values to the objects in an arrayList? - 
     * (you can)
     * i represents the number of the main side number
     * j represents the number of the second side number
     */
    public void dominoSetLoop(){
        for (int i = 0; i <= 6; i++){
            //in case objects cant be used and have to resort to multidimensional array
            mainSide++;
            //Just to check domino groups, not actually necessary
            System.out.println("Group " + i);
            for (int j = i; j <= 6; j++){
                //same as mainSide above
                secondSide++;
                dominosList.add(new domino(i, j));
                //Just to check, not actually necessary
                System.out.println(" Domino" + ":" + j);
            }
        }
        //dominosList check that prints information of an object for every object in dominosList
        //prints out memory location of object instead of index number?
        //looking for method to print index number as opposed to memory location - using arrays could be a solution
        //Change to a for each loop instead of a for loop
    }

    /**
     * prints the domino sides of all dominos in the list using the printDominoSides method from the domino class
     */
    public void printDominoSidesList(){
        for(domino dominoObject : dominosList){
            dominoObject.printDominoSides();
        }
    }
}