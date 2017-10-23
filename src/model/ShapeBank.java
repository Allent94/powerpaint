package model;

import java.awt.Color;
import java.awt.Shape;
import java.util.ArrayList;
import view.DrawingPanel;


/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */


public class ShapeBank {
    
    /**
     * Make varable for myList.
     */
    
    private ArrayList<Shape> myList = new ArrayList<Shape>();
    
    /**
     * Make variable for myColorList.
     */
    
    private ArrayList<Color> myColorList = new ArrayList<Color>();
    
    /**
     * Make variable for myIntList.
     */
    
    private ArrayList<Integer> myIntList = new ArrayList<Integer>();
    
    /**
     * Make variable for myBooleanList.
     */
    
    private ArrayList<Boolean> myBooleanList = new ArrayList<Boolean>();
    
    /**
     * Make variable for DrawingPanel.
     */
    
    private DrawingPanel myDP;
    

    /**
     * Make method for ShapeBank.
     * @param theDrawingPanel theDrawingPanel
     */

    public ShapeBank(final DrawingPanel theDrawingPanel) {

        
        
        myDP = theDrawingPanel;
        
    }
    /**
     * make variable for Store.
     * @param theS theS
     */
    public void store(final Shape theS) {
        
        myList.add(theS);  

    }
    
    /**
     * Make variable for storeColor.
     * @param theC theC
     */
    
    public void storeColor(final Color theC) {
        
        myColorList.add(theC);
        
    }
    
    /**
     * Make variable for storeBoolean.
     * @param theB theB
     */
    
    public void storeBoolean(final Boolean theB) {
        
        myBooleanList.add(theB);
    }
    
    /**
     * Make method for storeStroke.
     * @param theP theP
     */
   
    
    public void storeStroke(final int theP) {
        
        myIntList.add(theP);
        
    }
    
    /**
     * Make method for getShape.
     * @return myList
     */
    public ArrayList<Shape> getShape() {
       
        return myList;
        
    }
    
    /**
     * Make method for getColor.
     * @return myColorList
     */
    
    public ArrayList<Color> getColor() {
        
        return myColorList;
    }
    
    /**
     * make method for getStroke.
     * @return myIntList
     */
    
    public ArrayList<Integer> getStroke() {
        
        
        return myIntList;
    }
    
    /**
     * Make method for getBoolean.
     * @return myBooleanList
     */
    
    public ArrayList<Boolean> getBoolean() {
        
        return myBooleanList;
    }
    
    /**
     * Make method for clearShape.
     */
    
    public void clearShape() {
        
        myList.clear();
        
        myColorList.clear();
        
        myIntList.clear();
        
        myBooleanList.clear();
       
        myDP.repaint();

       
    }

}
