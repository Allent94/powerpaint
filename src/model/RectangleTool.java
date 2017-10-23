package model;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;


/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */

public class RectangleTool extends AbstractTool {
    
    /**
     * Make variable for R.
     */
    
    private Double myR;
    
    /**
     * Make method for rectangleTool.
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */
    
    public RectangleTool(final double theStartX , final double theStartY 
                         , final double theEndX, final double theEndY) {
        
        
        super(theStartX, theStartY, theEndX, theEndY);
        
        myR = new Rectangle2D.Double(theStartX, theStartY, theEndX, theEndY);
        
      //  r.setFrameFromDiagonal(p1, p2);
        
        
        
    }
    
    /**
     * Make method for getShape.
     * @return myR
     */
    
    public Shape getShape() {
        
        
        

        return myR;
 
        
    }
  
    
    
}
