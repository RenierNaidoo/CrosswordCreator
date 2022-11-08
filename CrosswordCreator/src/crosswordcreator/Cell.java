/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crosswordcreator;

import java.util.List;

/**
 *
 * @author Maxine Van Der Merwe
 */
public class Cell {
    private String name;
    private boolean isDown;
    private int length;
    private String word;
    private String clue;
    private List<String> domain;
    private int row;
    private int col;
    
    public Cell(int r, int c, int l, boolean isD)
    {
        
    }
    
    /*Assigns a legal word to the cell*/
    public void AssignWord(String w)
    {
        
    }
    
    /*Determines if a given word is in the cell's domain*/
    public boolean InDomain(String w)
    {
        return true;
    }
    
    /*Function used to determine if the cell's domain is empty*/
    public boolean DomainEmpty()
    {
        return true;
    }
    
    /*Adds a given word to a */
    public void AddToDomain(String w)
    {
        
    }
    
    public int DomainCount()
    {
        return domain.size();
    }
}
