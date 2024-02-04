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
        //create a result text area
        JTextArea passwordOutput = new JTextArea();

        //prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog",Font.BOLD,32));

        //add scrollability in case output becomes too big
        JScrollPane passwordOutputPane =new JScrollPane(passwordOutput);
        passwordOutputPane.setBounds(25,97,479,70);

        //create a black border around the text area
        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);
        //create password length label
        JLabel passwordLengthLabel=new JLabel("Password Length");
        passwordLengthLabel.setFont(new Font("Dialog",Font.PLAIN,32));
        passwordLengthLabel.setBounds(25,215,272,39);
        add(passwordLengthLabel);

        //create password length input
        JTextArea passwordLengthInputArea=new JTextArea();
        passwordLengthInputArea.setFont(new Font("Dialog",Font.PLAIN,32));
        passwordLengthInputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordLengthInputArea.setBounds(310,215,192,39);
        add(passwordLengthInputArea);
        //create toggle buttons
        //uppercase letter toggle
        JToggleButton uppercaseToggle= new JToggleButton("Uppercase");
        uppercaseToggle.setFont(new Font("Dialog",Font.PLAIN,26));
        uppercaseToggle.setBounds(25,302,225,56);
        add(uppercaseToggle);
        //lowercase letter toggle
        JToggleButton lowercaseToggle=new JToggleButton("Lowercase");
        lowercaseToggle.setFont(new Font("Dialog",Font.PLAIN,26));
        lowercaseToggle.setBounds(282,302,225,56);
        add(lowercaseToggle);
        //numbers toggle
        JToggleButton numbersToggle=new JToggleButton("Numbers");
        numbersToggle.setFont(new Font("Dialog",Font.PLAIN,26));
        numbersToggle.setBounds(25,373,225,56 );
        add(numbersToggle);
        //Symbols toggle
        JToggleButton symbolsToggle=new JToggleButton("Symbols");
       symbolsToggle.setFont(new Font("Dialog",Font.PLAIN,26));

       symbolsToggle.setBounds(282,373,225,56);
        add(symbolsToggle);
    }

}
