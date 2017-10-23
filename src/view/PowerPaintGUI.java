package view;
import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



/**
 * 
 * @author allen tran
 * @author charles Byran
 *@version 5-15-2017
 */


public class PowerPaintGUI extends JFrame {
    
    /**
     * 
     */
    private static final long serialVersionUID = -5874467834413182414L;
    
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
     * Make variable for ticker max.
     */
    
    private static final int TICKERMAX = 20;
    
    /**
     * Make variable for set size.
     */
    
    private static final int FRAMESIZE = 500;

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
     * Make variable for String pencil.
     */
    
    private static final String PENCILSTRING = "Pencil";
    
    /**
     * Make variable for String Ellipse.
     */
    
    private static final String ELLIPSESTRING = "Ellipse";
    
    /**
     * Make variable for String Line.
     */
    
    private static final String LINESTRING = "LINE";
    
    /**
     * Make variable for String Eraser.
     */
    
    private static final String ERASERSTRING = "Eraser";
    
    /**
     * Make variable for String Circle.
     */
    
    private static final String CIRCLESTRING = "Circle";
    
    /**
     * Make variable for String Rectangle.
     */
    
    private static final String RECTANGLESTRING = "Rectangle";
    
    /**
     * Make variable for String Square.
     */
    
    private static final String SQUARESTRING = "Square";
    
    /**
     * Make variable currentTool.
     */
    
    private static int myCurrentTool;
    
    /**
     * Make variable for ClearShape.
     */
    
    private boolean myClearShape;
    
    /**
     * Make variable for bottom toolbar.
     */
    
    private JToolBar myBottomToolBar;
    
    /**
     * Make variable for menu.
     */
    
    private JMenuBar myMenu;
    
    /**
     * My variable for CircleBW.
     */
    
    private JToggleButton myCircleBW;
    
    /**
     * My variable for EllipseBW.
     */
    
    private JToggleButton myEllipseBW;
    
    /**
     * my variable for lineBW.
     */
    
    private JToggleButton myLineBW;
    
    /**
     * Make variable for PencilBW.
     */
    
    private JToggleButton myPencilBW;
    
    /**
     * Make variable for RectangleBW.
     */
    
    private JToggleButton myRectangleBW;
    
    /**
     * Make variable for SquareBW.
     */
    
    private JToggleButton mySquareBW;
    
    /**
     * Make variable for EraserBW.
     */
    
    private JToggleButton myEraserBW;
    
    /**
     * Make variable for FileMenu.
     */
    
    private JMenu myFileMenu;
    
    /**
     * Make variable for OptionJMenu.
     */
    
    private JMenu myOptionsJMenu;
    
    /**
     * Make variable for ToolMenuItem.
     */

    private JMenu myToolMenuItem;
    
    /**
     * Make variable for Test4.
     */
    
    private JMenu myTest4;
    
    /**
     * Make variable for ClearMenuItem.
     */
    
    private JMenuItem myClearMenuItem;
    
    /**
     * Make variable for QuitMenuItem.
     */
    
    private JMenuItem myQuitMenuItem;
    
    
    /**
     * Make variable for PrimaryColorJMenuItem.
     */
    
    private JMenuItem myPrimaryColorJMenuItem;
    
    /**
     * Make variable Test9.
     */
    
    private JCheckBox myTest9;
    
    /**
     * Make variable Test10.
     */
    
    private JMenuItem myTest10;
    
    /**
     * Make variable for AboutJMenuItem.
     */
    
    private JMenuItem myAboutJMenuItem;
    
    /**
     * Make variable for PencilJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myPencilJRadioButtonItem;
    
    /**
     * Make variable for LineJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myLineJRadioButtonItem;
    
    /**
     * Make variable for RectangleJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myRectangleJRadioButtonItem;
    
    /**
     * Make variable for SquareJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem mySquareJRadioButtonItem;
    
    /**
     * Make variable for EllipseJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myEllipseJRadioButtonItem;
    
    /**
     * Make variable for CircleJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myCircleJRadioButtonItem;
    
    /**
     * Make variable EraserJRadioButtonItem.
     */
    
    private JRadioButtonMenuItem myEraserJRadioButtonItem;
    
    /**
     * Make variable Slide.
     */

    private JSlider mySlide;
    
    /**
     * Make variable SubMenu.
     */
    
    private JMenuItem mySubmenu;
    
    /**
     * Make variable Dp.
     */
    
    private DrawingPanel myDp = new DrawingPanel();
    
    /**
     * Make Variable Bg.
     */
    
    private ButtonGroup myBg = new ButtonGroup();

    
    /**
     * Make variable for UwColor2.
     */

    private Color myColor2 = new Color(UWCOLOR_RED_CODE2
                                       , UWCOLOR_GREEN_CODE2 , UWCOLOR_BLUE_CODE2);
    
    /**
     * Make variable for Color.
     */
     
    private Color myColor = new Color(UWCOLOR_RED_CODE
                                     , UWCOLOR_GREEN_CODE , UWCOLOR_BLUE_CODE); 
    
    /**
     * Make variable for CurrentStroke.
     */
     
    private int myCurrentStroke;
    
    /**
     * Make variable for MissingIcon.
     */
    
    private MissingIcon myMI2 = new MissingIcon(myColor2);
    
    /**
     * Make variavle for MissingIcon2.
     */
    
    private MissingIcon myMI = new MissingIcon(myColor);
    
    /**
     * Make variable for myChickenImageIcon.
     */

    private ImageIcon myChickenImageIcon;



    /**
     * Make method for PowerPaintGUI.
     */
    
    public PowerPaintGUI() {

        myClearShape = false;
        
        myChickenImageIcon = new ImageIcon("images/Chickenwing.jpg");
        
        
    }
    
    /**
     * Method to start GUI.
     */

    public void start()  {
       
        setTitle("PowerPaint");
        
        setIconImage(myChickenImageIcon.getImage());
        
        toolBar();
        
        menu();
        
        add(myDp , BorderLayout.CENTER);
        
        setmon();
        
        setIcon();
        
        pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(FRAMESIZE , FRAMESIZE);
    
        this.setVisible(true);
        
        this.setResizable(true);
    }
    
    /**
     * Make method for toolBar.
     */
    
    public void toolBar() {
        
        myBottomToolBar = new JToolBar();
        
        myPencilBW = new JToggleButton(PENCILSTRING);
        
        myPencilBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

                myCurrentTool = 1;
                
                myDp.currentTool(myCurrentTool);
                
            }     
        }        
        );
        
        myEraserBW = new JToggleButton(ERASERSTRING);
        
        myEraserBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = ERASERNUMBER;
                
                myDp.currentTool(myCurrentTool);
                
            }           
        }        
        );
        
        myLineBW = new JToggleButton("Line");
        
        myLineBW.setSelected(true);
        
        myLineBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = 2;
                
                myDp.currentTool(myCurrentTool);
 
            }
            
        }
        
        );
        
        myRectangleBW = new JToggleButton(RECTANGLESTRING);
        
        myRectangleBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = RECTANGLENUMBER;
                
                myDp.currentTool(myCurrentTool);
                
            }
            
        }
        
        );
        
        mySquareBW = new JToggleButton(SQUARESTRING);
        
        mySquareBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

                myCurrentTool = SQUARENUMBER;
                
                myDp.currentTool(myCurrentTool);
                
            }
            
        }
        
        );
        
        myEllipseBW = new JToggleButton(ELLIPSESTRING);
        
        myEllipseBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

                myCurrentTool = ELLIPSENUMBER;
                
                myDp.currentTool(myCurrentTool);
                
            }
            
        }
        
        );
        
        myCircleBW = new JToggleButton(CIRCLESTRING);
        
        myCircleBW.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = CIRCLENUMBER;
                
                myDp.currentTool(myCurrentTool);
        
            }
            
        }
        
        ); 

        myBottomToolBar.add(myPencilBW);
        
        myBottomToolBar.add(myLineBW);
        
        myBottomToolBar.add(myRectangleBW);
        
        myBottomToolBar.add(mySquareBW);
        
        myBottomToolBar.add(myEllipseBW);
        
        myBottomToolBar.add(myCircleBW);
        
        myBottomToolBar.add(myEraserBW);
        
        myBg.add(myPencilBW);
        
        myBg.add(myLineBW);
        
        myBg.add(myRectangleBW);
        
        myBg.add(mySquareBW);
        
        myBg.add(myEllipseBW);
        
        myBg.add(myCircleBW);
        
        myBg.add(myEraserBW);

        add(myBottomToolBar, BorderLayout.SOUTH);
    }
    
    /**
     * Make method for toggle.
     */
    
    public void setIcon() {
        
        myPencilBW.setIcon(new ImageIcon("images/pencil_bw.gif"));
        
        myLineBW.setIcon(new ImageIcon("images/line_bw.gif"));
        
        myRectangleBW.setIcon(new ImageIcon("images/rectangle_bw.gif"));

        mySquareBW.setIcon(new ImageIcon("images/square_bw.gif"));

        myEllipseBW.setIcon(new ImageIcon("images/ellipse_bw.gif"));
        
        myCircleBW.setIcon(new ImageIcon("images/circle_bw.gif"));
      
        myEraserBW.setIcon(new ImageIcon("images/eraser_bw.gif"));
   
    }
                    
    
    /**
     * Make method for setMon.
     */
    public void setmon() {
        
        myPencilBW.setMnemonic(KeyEvent.VK_P);
        
        myEraserBW.setMnemonic(KeyEvent.VK_E);
        
        myCircleBW.setMnemonic(KeyEvent.VK_C);
        
        myEllipseBW.setMnemonic(KeyEvent.VK_E);
        
        mySquareBW.setMnemonic(KeyEvent.VK_S);
        
        myRectangleBW.setMnemonic(KeyEvent.VK_R);
        
        myLineBW.setMnemonic(KeyEvent.VK_L);
        
        myFileMenu.setMnemonic(KeyEvent.VK_F);
        
        myClearMenuItem.setMnemonic(KeyEvent.VK_C);
        
        myQuitMenuItem.setMnemonic(KeyEvent.VK_Q);
        
        mySubmenu.setMnemonic(KeyEvent.VK_T);
        
        myPrimaryColorJMenuItem.setMnemonic(KeyEvent.VK_P);
        
        myTest9.setMnemonic(KeyEvent.VK_F);
        
        myToolMenuItem.setMnemonic(KeyEvent.VK_T);
        
        myPencilJRadioButtonItem.setMnemonic(KeyEvent.VK_P);
        
        myLineJRadioButtonItem.setMnemonic(KeyEvent.VK_L);
        
        mySquareJRadioButtonItem.setMnemonic(KeyEvent.VK_S);
        
        myRectangleJRadioButtonItem.setMnemonic(KeyEvent.VK_R);
        
        myEllipseJRadioButtonItem.setMnemonic(KeyEvent.VK_E);

        return;       
    }
    
    /**
     * Make method for menu.
     */
    
    public void menu() {
        
        myMenu = new JMenuBar();
        
        myFileMenu = new JMenu("File");
   
        myClearMenuItem = new JMenuItem("Clear");

        myClearMenuItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myClearShape = true;

                myDp.clearShape(myClearShape);                
            }
            
        });
        
        myQuitMenuItem = new JMenuItem("Quit");

        myQuitMenuItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                System.exit(0);
                
            }
            
        }
        
        );
        
        myFileMenu.add(myClearMenuItem);
        
        myFileMenu.addSeparator();
        
        myFileMenu.add(myQuitMenuItem);
        
        myOptionsJMenu = new JMenu("Options"); //Make option menu
        
        myOptionsJMenu.setMnemonic(KeyEvent.VK_O);   
        
        mySlide = new JSlider(SwingConstants.HORIZONTAL, 0, TICKERMAX,
                               1);
        
        mySlide.setMajorTickSpacing(ELLIPSENUMBER);
        mySlide.setMinorTickSpacing(1);
        mySlide.setPaintLabels(true);
        mySlide.setPaintTicks(true);
  
        mySlide.addChangeListener(new ChangeListener() {
            
            
            public void stateChanged(final ChangeEvent theE) {

                myCurrentStroke = mySlide.getValue();
                
                myDp.getStroke(myCurrentStroke);
            }
        });

        mySubmenu = new JMenu("Thickness"); // make menu item

        mySubmenu.add(mySlide); // add slider into menu item
        
        myOptionsJMenu.add(mySubmenu); // add menu item into menu item
        
        myOptionsJMenu.addSeparator();
        
        myPrimaryColorJMenuItem = new JMenuItem("Primary Color...");

        myPrimaryColorJMenuItem.setIcon(myMI);

        myPrimaryColorJMenuItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                
                myColor = JColorChooser.showDialog(null, "Pick Primary color", myColor);
                
                myMI.setColor1(myColor);

                myDp.getColor(myColor , myColor2);
 
                repaint();
              
            }
            
        }
        
        );
        
        myTest10 = new JMenuItem("Secondary Color...");
        
        myTest10.setMnemonic(KeyEvent.VK_S);
        
        myTest10.setIcon(myMI2);
        
        myTest10.addActionListener(new ActionListener() {
            
            @Override
            
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myColor2 =  JColorChooser.showDialog(null, "Pick Secondary color", myColor2);

                myMI2.setColor1(myColor2);
                
                myDp.getColor(myColor , myColor2);
                
                repaint();
             
            }
            
        }
        
        );
        
        myTest10.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

            }
            
        }
        
        );
        
        
        myTest9 = new JCheckBox("FIll");
        
        myTest9.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                final boolean isSelected = myTest9.isSelected();
                
                if (isSelected) {           
                    myTest9.setSelected(true);
                    
                    myDp.getFill(myTest9.isSelected());
                    
                } else {
                    
                    myTest9.setSelected(false);
                    
                    myDp.getFill(myTest9.isSelected());
                }
            }          
        }
        
        );
        
        myOptionsJMenu.add(myPrimaryColorJMenuItem);
        
        myOptionsJMenu.add(myTest10);
        
        myOptionsJMenu.addSeparator();

        myOptionsJMenu.add(myTest9);
        
        myToolMenuItem = new JMenu("Tool");
        
        myPencilJRadioButtonItem = new JRadioButtonMenuItem(PENCILSTRING);

        myPencilJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = 1;
                
                myDp.currentTool(myCurrentTool);            
                
            }
            
        }
        
        );
        
        myLineJRadioButtonItem = new JRadioButtonMenuItem(LINESTRING);

        myLineJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

                myCurrentTool = 2;
                
                myDp.currentTool(myCurrentTool);
    
            }
            
        }
        
        );
        
        myRectangleJRadioButtonItem = new JRadioButtonMenuItem(RECTANGLESTRING);

        myRectangleJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
             
                myCurrentTool = RECTANGLENUMBER;
                
                myDp.currentTool(myCurrentTool);    
                
            }
            
        }
        
        );
        
        mySquareJRadioButtonItem = new JRadioButtonMenuItem(SQUARESTRING);

        mySquareJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                myCurrentTool = SQUARENUMBER;
                
                myDp.currentTool(myCurrentTool);
                
                
            }
            
            
        }
        
        );
        
        myEllipseJRadioButtonItem = new JRadioButtonMenuItem(ELLIPSESTRING);

        myEllipseJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {

                myCurrentTool = ELLIPSENUMBER;
                
                myDp.currentTool(myCurrentTool);
                
                
            }
            
        }
        
        );
        
        myCircleJRadioButtonItem = new JRadioButtonMenuItem(CIRCLESTRING);
        
        myCircleJRadioButtonItem.setMnemonic(KeyEvent.VK_C);
        
        myCircleJRadioButtonItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
               
                
                myCurrentTool = CIRCLENUMBER;
                
                myDp.currentTool(myCurrentTool);
       
            }
            
        }
        
        );
        
        myEraserJRadioButtonItem = new JRadioButtonMenuItem(ERASERSTRING);
        
        myEraserJRadioButtonItem.setMnemonic(KeyEvent.VK_E);
        
        myToolMenuItem.add(myPencilJRadioButtonItem);
        
        myToolMenuItem.add(myLineJRadioButtonItem);
        
        myToolMenuItem.add(myRectangleJRadioButtonItem);
        
        myToolMenuItem.add(mySquareJRadioButtonItem);
        
        myToolMenuItem.add(myEllipseJRadioButtonItem);
        
        myToolMenuItem.add(myCircleJRadioButtonItem);
        
        myToolMenuItem.add(myEraserJRadioButtonItem);

        myTest4 = new JMenu("Help");
        
        myTest4.setMnemonic(KeyEvent.VK_H);
        
        myAboutJMenuItem = new JMenuItem("About...");
        
        myAboutJMenuItem.setMnemonic(KeyEvent.VK_A);
    
        myAboutJMenuItem.addActionListener(new ActionListener() {
            
            @Override
          public void actionPerformed(final java.awt.event.ActionEvent theEvent) {
                
                JOptionPane.showMessageDialog(null, " Allen Tran"
                                + "\n Spring 2017 "
                                + "\n TCSS 305 PowerPaint", "About"
                                , JOptionPane.INFORMATION_MESSAGE, myChickenImageIcon);
      
            }
            
        });
        
        myTest4.add(myAboutJMenuItem);
        
        myMenu.add(myFileMenu);
        
        myMenu.add(myOptionsJMenu);
        
        myMenu.add(myToolMenuItem);
        
        myMenu.add(myTest4);
        
        setJMenuBar(myMenu);

    }
    
}
