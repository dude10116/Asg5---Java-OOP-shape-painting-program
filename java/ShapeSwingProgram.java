import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionEvent;

public class ShapeSwingProgram extends JFrame implements ActionListener {

private PaintPanel paintPanel = new PaintPanel();

private JTextField widthField;
private JTextField heightField;
private JRadioButtonMenuItem rectangleItem;
private JRadioButtonMenuItem squareItem;
private JRadioButtonMenuItem ovalItem;
private JRadioButtonMenuItem circleItem;
private JRadioButtonMenuItem triangleItem;
private JRadioButtonMenuItem redItem;
private JRadioButtonMenuItem yellowItem;
private JRadioButtonMenuItem greenItem;
private JRadioButtonMenuItem blackItem;
private JRadioButtonMenuItem whiteItem;
private ButtonGroup shapeGroup;
private ButtonGroup colorGroup;

/**
 * @param title
 */
public ShapeSwingProgram(String title) {
    super(title);
    this.setSize(800, 600);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    
    JPanel buttonPanel = new JPanel(new FlowLayout());
    this.add(buttonPanel, BorderLayout.PAGE_START);
    
    widthField = new JTextField("50", 5);
    buttonPanel.add(new JLabel("Width: "));
    buttonPanel.add(widthField);
    
    heightField = new JTextField("50", 5);
    buttonPanel.add(new JLabel("Height: "));
    buttonPanel.add(heightField);

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    // JRadioButtonMenuItem rbMenuItem;

    //Create the menu bar.
    menuBar = new JMenuBar();

    //Build the first menu.
    menu = new JMenu("File");
    menu.setMnemonic(MenuKeyEvent.VK_F);
    menuBar.add(menu);

    //a group of file-related menu items 
    menuItem = new JMenuItem("Open", MenuKeyEvent.VK_O);
    menuItem.addActionListener(this);
    menu.add(menuItem);
    menuItem = new JMenuItem("Save", MenuKeyEvent.VK_S);
    menuItem.addActionListener(this);
    menu.add(menuItem);
    menuItem = new JMenuItem("Save As...", MenuKeyEvent.VK_A);
    menuItem.addActionListener(this);
    menu.add(menuItem);
    menuItem = new JMenuItem("Exit", MenuKeyEvent.VK_X);
    menuItem.addActionListener(this);
    menu.add(menuItem);

    //Build our shape menu
    menu = new JMenu("Shape");
    shapeGroup = new ButtonGroup();
    rectangleItem = new JRadioButtonMenuItem("Rectangle");
    rectangleItem.addActionListener(this);
    shapeGroup.add(rectangleItem);
    menu.add(rectangleItem);
    squareItem = new JRadioButtonMenuItem("Square");
    squareItem.addActionListener(this);
    shapeGroup.add(squareItem);
    menu.add(squareItem);
    ovalItem = new JRadioButtonMenuItem("Oval");
    ovalItem.addActionListener(this);
    shapeGroup.add(ovalItem);
    menu.add(ovalItem);
    circleItem = new JRadioButtonMenuItem("Circle");
    circleItem.addActionListener(this);
    shapeGroup.add(circleItem);
    menu.add(circleItem);
    triangleItem = new JRadioButtonMenuItem("Triangle");
    triangleItem.addActionListener(this);
    shapeGroup.add(triangleItem);
    menu.add(triangleItem);
    menuBar.add(menu);

    // Create the color submenu
    menu = new JMenu("Color");
    colorGroup = new ButtonGroup();
    redItem = new JRadioButtonMenuItem("Red");
    redItem.addActionListener(this);
    colorGroup.add(redItem);
    menu.add(redItem);
    yellowItem = new JRadioButtonMenuItem("Yellow");
    yellowItem.addActionListener(this);
    colorGroup.add(yellowItem);
    menu.add(yellowItem);
    greenItem = new JRadioButtonMenuItem("Green");
    greenItem.addActionListener(this);
    colorGroup.add(greenItem);
    menu.add(greenItem);
    blackItem = new JRadioButtonMenuItem("Black");
    blackItem.addActionListener(this);
    colorGroup.add(blackItem);
    menu.add(blackItem);
    whiteItem = new JRadioButtonMenuItem("White");
    whiteItem.addActionListener(this);
    colorGroup.add(whiteItem);
    menu.add(whiteItem);

            // create a group so you can only select one color at a time
            ButtonGroup group = new ButtonGroup();
            menuItem = new JMenuItem("Red", MenuKeyEvent.VK_R);
            menuItem.addActionListener(this);
            group.add(menuItem);
            menuItem = new JMenuItem("Yellow", MenuKeyEvent.VK_Y);
            menuItem.addActionListener(this);
            group.add(menuItem);
            menuItem = new JMenuItem("Green", MenuKeyEvent.VK_G);
            menuItem.addActionListener(this);
            group.add(menuItem);
            menuItem = new JMenuItem("Black", MenuKeyEvent.VK_B);
            menuItem.addActionListener(this);
            group.add(menuItem);
            menuItem = new JMenuItem("White", MenuKeyEvent.VK_W);
            menuItem.addActionListener(this);
            group.add(menuItem);

             // Turn submenu into an actual submenu by adding it to another menu (specifically, our second menu)
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        paintPanel.setPreferredSize(new Dimension(500,500));
        paintPanel.setBackground(Color.WHITE);
        this.getContentPane().add(paintPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ShapeSwingProgram paintprogram = new ShapeSwingProgram("Shape Dropper Paint Program");
        paintprogram.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
//        paintPanel.invalidate();
//        paintPanel.repaint();
        System.out.println(e.getActionCommand());
    }
}