import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class FinalProject extends JFrame implements ActionListener, MouseListener{
    JFrame gameWindow;
    JPanel titleName,  startButtonPanal;
    JLabel titleNameLabel;
    Font engraversOldEnglish;
    JButton startButton;


    public static void main(String[] args) {


        new FinalProject();
        Character player = new Character();
        Location location1 = new Location("Fight", "Heal", "Run", "Inventory", "You wake up...");
        System.out.println(location1);
        System.out.println(location1.getOption1());
        System.out.println(location1.printAll());
        Location currentLocation = location1;
        System.out.println(currentLocation);
        System.out.println(currentLocation.getOption1());
        System.out.println(currentLocation.printAll());


    }


    public FinalProject(){
        try {
            engraversOldEnglish = Font.createFont(Font.TRUETYPE_FONT, new File("OPTIEngraversOldEnglish.otf")).deriveFont(5f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        }
        catch (IOException | FontFormatException ignored){


        }
        JTextArea text = new JTextArea();
        //Window
        gameWindow = new JFrame("Dungeon");
        gameWindow.setSize(1000,1000);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.BLACK);

        titleName = new JPanel();

        titleName.setLayout(new GridBagLayout());
        titleName.add(text);
        titleName.setBackground(Color.BLACK);

        titleNameLabel = new JLabel("matrix");
        titleNameLabel.setBackground(Color.black);
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(engraversOldEnglish.deriveFont(200f));

        titleName.add(titleNameLabel);


        //Buttons
        startButtonPanal = new JPanel();
        startButtonPanal.setBounds(300,400,200,100);
        startButtonPanal.setBackground(Color.black);
        startButton = new JButton("Begin");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(engraversOldEnglish.deriveFont(10f));
        startButton.setFocusPainted(false);
        startButtonPanal.add(startButton);


        gameWindow.add(titleName);
        gameWindow.add(startButtonPanal);
        gameWindow.setVisible(true);
    }








    @Override
    public void actionPerformed(ActionEvent e) {


    }


    @Override
    public void mouseClicked(MouseEvent e) {


    }


    @Override
    public void mousePressed(MouseEvent e) {


    }


    @Override
    public void mouseReleased(MouseEvent e) {


    }


    @Override
    public void mouseEntered(MouseEvent e) {


    }


    @Override
    public void mouseExited(MouseEvent e) {


    }
}



