package model;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;


/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */

public class EllipseTool extends AbstractTool {
    
    /**
     * Make method for myE.
     */
    
    private Double myE;
    
    /**
     * Make method for ellipseTool.
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */

    public EllipseTool(final double theStartX, final double theStartY
                       , final double theEndX, final double theEndY) {
        
        super(theStartX, theStartY, theEndX, theEndY);

        myE = new Ellipse2D.Double(theStartX, theStartY, theEndX, theEndY);
        
      
    }
    
    /**
     * Make method for getShape.
     * @return myE
     */
    
    public Shape getShape() {
        
        return myE;
        
        
        
    }


}
