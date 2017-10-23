package model;


/**
 * 
 * @author allen Tran
 *@version 05-17-2017
 */

public abstract class AbstractTool {
    
    /**
     * Make variable for myStartX.
     */
    
    private double myStartX;
    
    /**
     * Make variable for myStartY.
     */
    
    private double myStartY;
    
    /**
     * Make variable for myEndX.
     */
    
    private double myEndX;
    
    /**
     * Make variable for myEndY.
     */
    
    private double myEndY; 
    
    /**
     * Make variable for Fill.
     */
    
    private boolean myFill;
    
    /**
     * Make variable for Thickness.
     */
    
    private int myThickness;
    
    
    /**
     * 
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */
    
    

    public AbstractTool(final double theStartX, final double theStartY
                        , final double theEndX, final double theEndY) {
        
        myStartX = theStartX;
        myStartY = theStartY;
        myEndX = theEndX;
        myEndY = theEndY; 
        

    }
    
    /**
     * Make method for getStartX.
     * @return myStartX
     */

    public double getStartX() {
        
        return myStartX;
        
        
    }
    
    /**
     * Make method for getStartY.
     * @return myStartY
     */
    
    public double getStartY() {
        
        return myStartY;
    }
    
    /**
     * Make method for getEndX.
     * @return myEndX
     */
    
    public double getEndX() {
        
        return myEndX;
    }
    
    /**
     * Make method for getEndY.
     * @return myEndY
     */
    
    public double getEndY() {
        
        return myEndY;
        
    }
    
    /**
     * Make method for getFill.
     * @return myFill
     */
    
    public boolean getFill() {

        
        return myFill;
    }
    
    /**
     * Make method for getThickness.
     * @return myThickness
     */
    
    public int getThickness() {
        
        return myThickness;
    }
    
    

}


