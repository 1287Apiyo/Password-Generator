import javax.swing.*;
import java.awt.*;

//render the gui components(frontend)
//this class will inherit from the JFrame class
public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI(){
        //render frame and a title
        super("Password Generator");
        //set the size of the GUI
        setSize(540, 570);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //add gui components
       addGuiComponents();

    }
    private void addGuiComponents(){
        //create title text
        JLabel titleLabel=new JLabel("Password Generator");
        titleLabel.setFont(new Font("Dialog",Font.BOLD,32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0,10,540,39);
        add(titleLabel);
    }

}
