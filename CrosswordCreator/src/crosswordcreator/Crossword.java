/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crosswordcreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Maxine Van Der Merwe
 */
public class Crossword {
    private int[][] crossword;
    private List<Cell> cells;
    
    /*This function constructs the crossword grid and creates blank regions for words.
      The following rules are employed to create the crossword:
      - No word can be only one square long
      - No word can be longer than the grid
      - A 2*2 blank space cannot exist anywhere on the grid*/
    public void BuildCrossword(int size)
    {
        
    }
    
    /*This function assigns words to various cells in the grid. The following
      constraints are followed:
      - A word must be exactly as long as its cell
      - Intersecting cells must have the same letter
      - MRV heuristic is employed for assignment
      - Arc consistency is determined after every assignment*/
    public void AssignWords()
    {
        
    }
    
    /*Helper function to determine if a particular word is a legal assignment for
      a given cell. Returns true if so, else false.*/
    public boolean TestWord(String w, Cell c)
    {
        
        return true;
    }
    
    /*Function used to remove illegal assignments from any cell's domain. Should remove
      most recently added word and should also check constraints.*/
    public void ForwardCheck()
    {
        
    }
    
    /*Function used to insert a legal word into a cell*/
    public void EnterWord(String w, Cell c)
    {
        
    }
    
    /*Function used to determine if the crossword is completely filled.*/
    public boolean IsComplete()
    {
        return true;
    }
}
