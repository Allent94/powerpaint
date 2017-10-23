package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import model.CircleTool;
import model.EllipseTool;
import model.LineTool;
import model.RectangleTool;
import model.ShapeBank;
import model.SquareTool;



/**
 * 
 * @author allen tran
 * @author charles Byran
 *@version 5-15-2017
 */

public class DrawingPanel extends JPanel {
    
    /**
     * 
     */
    private static final long serialVersionUID = -8783176325386666861L;
    
    /**
     * Make variable for RECTANGLE number.
     */
    
    private static final int RECTANGLENUMBER = 3;
    
    /**
     * Make variable for SQUARE number.
     */
    
    private static final int SQUARENUMBER = 4;
    
    /**
     * Make variable for ELLIPSE number.
     */
    
    private static final int ELLIPSENUMBER = 5;
    
    /**
     * Make variable for CIRCLE number.
     */
    
    private static final int CIRCLENUMBER = 6;
    
    /**
     * Make variable for ERASER number.
     */
    
    private static final int ERASERNUMBER = 7;
   

    /**
     * Make variable for UW Color..
     */
    
    private static final int UWCOLOR_RED_CODE = 51;
    
    /**
     * Make variable for UW Color.
     */
    
    private static final int UWCOLOR_GREEN_CODE = 0;
    
    
    /**
     * Make variable for UW Color.
     */
    
    private static final int UWCOLOR_BLUE_CODE = 111;
    
    /**
     * Make variable for UW Color 2.
     */
    
    private static final int UWCOLOR_RED_CODE2 = 232;
    
    /**
     * Make variable for UW Color 2.
     */
    
    private static final int UWCOLOR_GREEN_CODE2 = 211;
    
    
    /**
     * Make variable for UW Color 2.
     */
    
    private static final int UWCOLOR_BLUE_CODE2 = 162;

    /**
     * Make variable for CurrentTool.
     */
    
    private int myCurrentTool;
    
    /**
     * Make variable for ClearShape.
     */
    
    private boolean myClearShape;
    
    
    /**
     * Make variable for X1.
     */
       
   
    private double myX1;
    
    /**
     * Make variable for X2.
     */
    
    private double myX2;
    
    /**
     * Make varaible for Y1.
     */
    
    private double myY1;
    
    /**
     * Make varable for Y2.
     */
    
    private double myY2;
    
    /**
     * Make varaible for Color.
     */
    
    private Color myColor = new Color(UWCOLOR_RED_CODE, UWCOLOR_GREEN_CODE
                                       , UWCOLOR_BLUE_CODE);
    
    /**
     * Make variable for Color2.
     */
    
    private Color myColor2 = new Color(UWCOLOR_RED_CODE2, UWCOLOR_GREEN_CODE2
                                      , UWCOLOR_BLUE_CODE2);
    
    
    
    /**
     * Make variable for Sb.
     */
    
    private ShapeBank mySb = new ShapeBank(this);
    
    /**
     * Make variable for eraser.
     */
    
    private Path2D myEraser;
    
    /**
     * Make variable for Pencil.
     */

    private Path2D myPencil;
    
    /**
     * Make variable for Rectangle.
     */
    
    private RectangleTool myRectangle;
    
    /**
     * Make variable for Line.
     */
    
    private LineTool myLine;
    
    /**
     * Make varaible for Square.
     */
    
    private SquareTool mySquare;
    
    /**
     * Make variable for Circle.
     */
    
    private CircleTool myCircle;
    
    /**
     * Make variable for Ellipse.
     */
    
    private EllipseTool myEllipse;
    
    
    /**
     * Make variable for CurrentColor.
     */
    
    private Color myCurrentColor;
    
    /**
     * Make variable for CurrentStroke.
     */
    
    private int myCurrentStroke;
    
    /**
     * Make variable for X.
     */
    
    private double myX;
    
    /**
     * Make variable Y.
     */
    
    private double myY;
    
    /**
     * Make variable for myFill.
     */
    
    private boolean myFill;
    
    /**
     * Make variable for Booleean Number.
     */
    
    /**
     * Make variable for isDraw.
     */
    
    private boolean myDraw;

    
    
    /**
     * make method for drawingPanel.
     */
    
    
    public DrawingPanel() {
        
        myCurrentTool = 2;

        drawing();
        
    }
    
    /**
     * Make mathod for Drawing.
     */
    
    private void drawing() {

        setBackground(Color.WHITE);

        final MouseInputAdapter mia = new MyMouseInputAdapter();
        
        addMouseListener(mia);
        addMouseMotionListener(mia);
        
        

        
    }
    
    /**
     * Make method for paintComponent.
     */
    
    @Override
    public void paintComponent(final Graphics theGraphics) {
        
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        
        if (myClearShape) {
            
            mySb.clearShape();

            myClearShape = false;
        }
        
        final double minX = Math.min(myX1, myX2);   
        final double minY = Math.min(myY1, myY2);   
        final double maxX = Math.max(myX1, myX2);
        final double maxY = Math.max(myY1, myY2);      
        final double height = Math.abs(myY2 - myY1);
        
        final double width = Math.abs(myX2 - myX1);
        
        final double minHW = Math.min(height, width);
        
        if (myX2 < myX1 && myY2 < myX1) {
            
            myX = myX1 - minHW;
            
            myY = myY1 - minHW;
            

            
        } else if (myX2 > myX1 && myY2 < myX1) {
            
            myX = myX1;
            
            myY = myY1 - minHW;

        } else if (myX2 < myX1 && myY2 > myX1) {
            
            myX = myX1 - minHW;
            
            myY = myY1;

            
        } else if (myX2 > myX1 && myY2 > myX1) {
            
            myX = myX1;
            
            myY = myY1;
           
            
        }
        
        mySquare = new SquareTool(myX , myY , minHW , minHW);
        
        myLine = new LineTool(myX1 , myY1 , myX2 , myY2);
        
        myEllipse = new EllipseTool(minX , minY , maxX - minX , maxY - minY);
        
        myRectangle = new RectangleTool(minX , minY , maxX - minX , maxY - minY);
        
        myCircle = new CircleTool(myX , myY , minHW , minHW);   

        for (int i = 0; i < mySb.getShape().size(); i++) {
            
            g2d.setStroke(new BasicStroke(mySb.getStroke().get(i)));
            
            g2d.setColor(mySb.getColor().get(i));
            
            if (mySb.getBoolean().get(i)) {
                
                g2d.fill(mySb.getShape().get(i));
                
            } else {
                
                g2d.draw(mySb.getShape().get(i));
        
                
            }

        }
        
        
        
        
        if (myCurrentTool == 1) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);
            
            if (myDraw) {
                
                g2d.draw(myPencil);
                
            }
        }
           
            
        if (myCurrentTool == 2) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);
            
            if (myDraw) {
                
                g2d.draw(myLine.getShape());
                
            }

            

            
            
        }
        
        if (myCurrentTool == RECTANGLENUMBER) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);
            
            if (myDraw) {
                
                if (myFill) {
                    
                    g2d.fill(myRectangle.getShape());
                    
                } else {
                    
                    g2d.draw(myRectangle.getShape());
                }
                
            }


            
        }
        
        if (myCurrentTool == SQUARENUMBER) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);
            
            if (myDraw) {
                
                if (myFill) {
                    
                    g2d.fill(mySquare.getShape());
                    
                } else {
                    
                    g2d.draw(mySquare.getShape());
                }
                
            }
            
        }
        
        if (myCurrentTool == ELLIPSENUMBER) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);

            if (myDraw) {
                
                if (myFill) {
                    
                    g2d.fill(myEllipse.getShape());
                    
                } else {
                    
                    g2d.draw(myEllipse.getShape());
                }
                
            }
            
        }
        
        if (myCurrentTool == CIRCLENUMBER) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setPaint(myCurrentColor);

            if (myDraw) {
                
                if (myFill) {
                    
                    g2d.fill(myCircle.getShape());
                    
                } else {
                    
                    g2d.draw(myCircle.getShape());
                }
                
            }
            
            
            
        }
        
        if (myCurrentTool == ERASERNUMBER) {
            
            g2d.setStroke(new BasicStroke(myCurrentStroke));
            
            g2d.setColor(Color.WHITE);
            
            if (myFill) {
                
                g2d.draw(myEraser);
            }

        }

    }
    
  
    /**
     * Make method for currentTool.
     * @param theN theN
     */
 
 
    public void currentTool(final int theN) {
         
        myCurrentTool = theN;
         

    }
    
    /**
     * Make method for clearShape.
     * @param theN theN
     */
     
    public void clearShape(final boolean theN) {
         
        myClearShape = theN;
         
    }
    
    /**
     * Make method for getColor.
     * @param theC theC
     * @param theN theN
     */
     
    public void getColor(final Color theC , final Color theN) {
         
        myColor = theC;
         
        myColor2 = theN;
        
        
         
         
         
         
    }
    
    /**
     * Make method for getStoke.
     * @param theN theN
     */
     
    public void getStroke(final int theN) {
         
        myCurrentStroke = theN;
         
         
    }
    
    /**
     * Make method for getFill.
     * @param theN theN
     */

    public void getFill(final boolean theN) {
        
        myFill = theN;
        
        
        
    }
    
    /**
     * 
     * @author allen
     *
     */

    
    class MyMouseInputAdapter extends MouseInputAdapter {
        
        //these methods are found in MouseListener
        @Override
        public void mousePressed(final MouseEvent theEvent) {
           
            myX1 = theEvent.getX();
            myY1 = theEvent.getY();
            
            myX2 = theEvent.getX();
            myY2 = theEvent.getY();
            
            
            myPencil = new Path2D.Double();
            
            myEraser = new Path2D.Double();   

            myPencil.moveTo(myX1, myY1);
            
            myEraser.moveTo(myX1, myY1);

 
            
            if (theEvent.getButton() == MouseEvent.BUTTON1) {

              
                myCurrentColor = myColor;
 
                
            } else if (theEvent.getButton() == MouseEvent.BUTTON3) {
 
                myCurrentColor = myColor2;
                
                
            }
            
            myDraw = true;
   
            repaint();
 
            
        }
        
        @Override
        public void mouseReleased(final MouseEvent theEvent) {
      
            if (myCurrentTool == 1) {
                
                mySb.store(myPencil);
                
                mySb.storeColor(myCurrentColor);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(false);
            }               
            if (myCurrentTool == 2) {
                
                mySb.store(myLine.getShape());
                
                mySb.storeColor(myCurrentColor);

                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(false);
                
            }
            if (myCurrentTool == RECTANGLENUMBER) {
                
                mySb.store(myRectangle.getShape());
                
                mySb.storeColor(myCurrentColor);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(myFill);
                
            }
            
            if (myCurrentTool == SQUARENUMBER) {
                
                mySb.store(mySquare.getShape());
                
                mySb.storeColor(myCurrentColor);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(myFill);
                
                
                
            }
            
            if (myCurrentTool == ELLIPSENUMBER) {
                
                mySb.store(myEllipse.getShape());
                
                mySb.storeColor(myCurrentColor);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(myFill);
                
            }
            
            if (myCurrentTool == CIRCLENUMBER) {
                
                mySb.store(myCircle.getShape());
                
                mySb.storeColor(myCurrentColor);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(myFill);
                
            }
            
            if (myCurrentTool == ERASERNUMBER) {
                
                mySb.store(myEraser);
                
                mySb.storeColor(Color.WHITE);
                
                mySb.storeStroke(myCurrentStroke);
                
                mySb.storeBoolean(false);
                
                
            }
            
            myDraw = false;
           
            
        
            
            
            
            
                
       
            

           
        }
        
        @Override
        public void mouseDragged(final MouseEvent theEvent) {

            myX2 = theEvent.getX();
            myY2 = theEvent.getY();
            
            myPencil.lineTo(myX2, myY2);
            
            myEraser.lineTo(myX2, myY2);

            repaint();
            
            
        }
         
                    
           

    }
    
     

     


}

