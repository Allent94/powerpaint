package view;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 * The "missing icon" is a white box with a black border and a red x.
 * It's used to display something when there are issues loading an
 * icon from an external location.
 *
 * @author Collin Fagan
 * @author Allen Tran
 * Added two setColor methodS and changes some variable for check error problems.
 * @version 5-14-2017
 */
public class MissingIcon implements Icon {
    
    /**
     * Make variable for 20.
     */
    
    private static final int TWENTY = 20;
    
    /**
     * Make variable for ten.
     */
    
    private static final int TEN = 10;
    
    /**
     * Make variable for basicStroke.
     */
    
    private static final int BASICSTROKE = 4;
    
    /**
     * make variable for myColor.
     */

    private Color myColor;
    
    /**
     * Make variable for myWidth.
     */
    private int myWidth = TWENTY;
    
    /**
     * Make variable for myHeight.
     */
    private int myHeight = TWENTY;
    
    /**
     * Make variable for stroke.
     */

    private BasicStroke myStroke = new BasicStroke(BASICSTROKE);
    
    /**
     * Make method for MissIcon.
     * @param theColor theColor
     */
  
    
    
    public MissingIcon(final Color theColor) {
        
        myColor = theColor;
        
    }
    

    
    /**
     * Make method for paintIcon.
     * @param theY theY
     * @param theC theC
     * @param theX theX
     * @param theG theG
     */

    public void paintIcon(final Component theC, final Graphics theG
                          , final int theX, final int theY) {
        final Graphics2D g2d = (Graphics2D) theG.create();

        g2d.setColor(myColor);
        g2d.fillRect(theX + 1 , theY + 1, myWidth - 2 , myHeight - 2);

        g2d.setStroke(myStroke);
        g2d.drawLine(theX + TEN , theY + TEN , theX + myWidth - TEN , theY + myHeight - TEN);
        g2d.drawLine(theX + TEN , theY + myHeight - TEN , theX + myWidth - TEN , theY + TEN);

        g2d.dispose();
    }
    
    /**
     * Make method for getIconWidth.
     * @return myWidth
     */

    public int getIconWidth() {
        return myWidth;
    }

    
    /**
     * Make method for getIconHeight.
     * @return myHeight
     */
    public int getIconHeight() {
        return myHeight;
    }
    
    /**
     * Make method for setColor1.
     * @param theN theN
     */
    
    public void setColor1(final Color theN) {
        
        myColor = theN;
        
    }
    
    /**
     * Make method for setColor2.
     * @param theN theN
     */
    
    public void setColor2(final Color theN) {
        
        
        myColor = theN;
        
        
    }
    
    
    
}
