package model;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;


/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */

public class SquareTool extends AbstractTool {
    
    /**
     * Make method for myS.
     */
    
    private Double myS;
    
    /**
     * Make method for squareTool.
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */

    public SquareTool(final double theStartX, final double theStartY
                      , final double theEndX, final double theEndY) {
        
        super(theStartX, theStartY, theEndX, theEndY);

        myS = new Rectangle2D.Double(theStartX, theStartY, theEndX, theEndY);
        
        
      
    }
    
    
    /**
     * Make method for getShape.
     * @return myS
     */
    
    
    public Shape getShape() {
        
        return myS;
       
        
        
    }

}
