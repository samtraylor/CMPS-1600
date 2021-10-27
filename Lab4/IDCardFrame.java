import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.awt.Font;
/**
 * Write a description of class IDCardFrame here.
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class IDCardFrame extends JFrame
{
    private String t;
    /**
     * Constructor for objects of class IDCardFrame. Takes title, uses it as the title for
     * the window that's going to display. Then, builds GUI window, places an image at the 
     * middle of the layout, places name label at top, "Java Programmer" label at bottom, 
     * creates personal information labels on the left and right, and finalizes size, closing 
     * procedure and visibility
     */
    public IDCardFrame(String title)
    {
        this.t = title;
       
        //initialize layout GridBagConstraints
        GridBagConstraints layoutConsts = null;
       
        //create frame with provided title as window title, set gridbaglayout, set constraints
        JFrame window = new JFrame(t);
        window.setLayout(new GridBagLayout());
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 0;
        layoutConsts.gridy = 0;
        layoutConsts.insets = new Insets(10,10,10,10);
        
        //establish filepath
        String path = "images/me.png";
        
        //Create ImageIcon based on path to picture
        ImageIcon icon = new ImageIcon(path);
        JLabel picture = new JLabel(icon);
        
        //create GUI GridBagConstraints, then add image at middle (3,2)
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 2;
        layoutConsts.gridy = 1;
        window.add(picture,layoutConsts);
        
        //create name label, change placement, add it
        JLabel nameLabel = new JLabel("Sam Traylor");
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 2;
        layoutConsts.gridy = 0;
        window.add(nameLabel,layoutConsts);
        
        //create programmer label, change contraints, create font object, set label font, add
        JLabel programmer = new JLabel("Java Programmer");
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 2;
        layoutConsts.gridy = 2;
        Font labelFont = new Font("Hevetica", Font.BOLD,12);
        programmer.setFont(labelFont);
        window.add(programmer,layoutConsts);
        
        //create eye color and address label, change constraints, add
        JLabel eyeAndAddress = new JLabel("Eyes:Blue - 848 Crust Ln");
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 0;
        layoutConsts.gridy = 1;
        window.add(eyeAndAddress,layoutConsts);
        
        //create weight and height label, change consts, add
        JLabel wgtHeight = new JLabel(".07 tons ht: .001 km");
        layoutConsts = new GridBagConstraints();
        layoutConsts.gridx = 4;
        layoutConsts.gridy = 1;
        window.add(wgtHeight,layoutConsts);
        
        //finishing touches: specifying window size, close procedure, visible
        window.setSize(1000, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    /**
    * Main method, makes an instance of IDCard
    */
    public static void main(String[] args) 
    {
        IDCardFrame IDCard = new IDCardFrame("Not a fake ID");
    }
}
