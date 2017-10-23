package model;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

/**
 * 
 * @author Allen Tran
 *@version 3-14-2017
 */

public class LineTool extends AbstractTool {
    
    /**
     * Make variable for myL.
     */
    
    private Double myL;
    
    /**
     * Make method for lineTool.
     * @param theStartX startX
     * @param theStartY startY
     * @param theEndX endX
     * @param theEndY endY
     */

    public LineTool(final double theStartX, final double theStartY
                    , final double theEndX, final double theEndY) {
        super(theStartX, theStartY, theEndX, theEndY);

        myL = new Line2D.Double(theStartX, theStartY, theEndX, theEndY);
    }
    
    /**
     * Make method for getShape.
     * @return myL
     */
    
    public Shape getShape() {
        
        return myL;
        
        
        
    }

}
