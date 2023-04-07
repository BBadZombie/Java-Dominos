
/**
 * Domino class that will contain variables that describe a -
 * -'domino' and the following methods:
 * - setDominoSides(int, int)
 * - printDominoSides()
 * 
 *
 * @author (Anthony Lopez)
 * @version0 (12.3.2022)
 * @version1 (12.8.2022)
 * notes - 
 * - removed if check part of setDominosSides methods as it is unecessary - 
 * - dominoSetLoop method already does that. 
 * 
 * @version2 (4.7.23)
 * notes - 
 *  - Removed some unecessary comments and rewrote description comment
 */
public class domino
{
    public int mainSide;
    public int secondSide;

    public domino(int calledMain, int calledSecond)
    {
        mainSide = calledMain;
        secondSide = calledSecond;
    }

    /**
     * Mutator method to be used by dominoSetLoop() to assign created dominos their main and second side numbers(V1).
     * First trying variable + calledVariable. 
     * If above doesnt work just try assigning calledVariable only
     * Using calledVariable only now
     * (12.6.2022) - Tried a couple of methods to assign values to created objects in setDominoLoop class but didn't work
     * (12.7.2022) - Found method to assign values using this method in dominoSetLoop class
     */

    public void setDominoSides(int calledMain, int calledSide){
        mainSide = calledMain;
        secondSide = calledSide;
    }
    
    public void printDominoSides(){
        System.out.println(mainSide + "; " + secondSide);
    }
}
