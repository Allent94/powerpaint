package model;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */

public class CircleTool extends AbstractTool {
    
    /**
     * Make variable for C.
     */
    
    private Double myC;
    
    /**
     * 
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */

    public CircleTool(final double theStartX, final double theStartY
                      , final double theEndX, final double theEndY) {
        
        super(theStartX, theStartY, theEndX, theEndY);

        myC = new Ellipse2D.Double(theStartX, theStartY, theEndX, theEndY);
        
      
    }
    
    /**
     * Make method for getShape.
     * @return myC.
     */
    
    public Shape getShape() {
        
        return myC;
        
        
        
    }


}
