import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FinalProject extends JFrame implements ActionListener, MouseListener{
    JFrame gameWindow;
    JPanel titleName;
    JLabel titleNameLabel;
    Font engraversOldEnglish;

    public static void main(String[] args) {

    new FinalProject();
    Character player = new Character();
    Location location1 = new Location("Fight", "Heal", "Run", "Inventory", "You wake up...");
        System.out.println(location1);
        System.out.println(location1.getOption1());
        System.out.println(location1.printAll());

    }

    public FinalProject(){
        try {
            engraversOldEnglish = Font.createFont(Font.TRUETYPE_FONT, new File("OPTIEngraversOldEnglish.otf")).deriveFont(200f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        }
        catch (IOException | FontFormatException e){

        }


        //Window
        gameWindow = new JFrame("Dungeon");
        gameWindow.setSize(1000,1000);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.BLACK);

        //Title


        JTextArea text = new JTextArea();

        titleNameLabel = new JLabel("the matrix");
        titleNameLabel.setBackground(Color.black);
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(engraversOldEnglish);


        titleName = new JPanel();
        titleName.setLayout(new GridBagLayout());
        titleName.add(titleNameLabel);
        titleName.add(text);
        titleName.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));



        gameWindow.add(titleName);
        titleName.setBackground(Color.BLACK);

        gameWindow.setVisible(true);



        /*

        titleName.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        titleName.setBackground(Color.BLACK);

        titleNameLabel = new JLabel("the matrix");
        titleNameLabel.setBackground(Color.black);
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(engraversOldEnglish);
        titleName.add(titleNameLabel);

        gameWindow.add(titleName);
        gameWindow.setVisible(true);

         */
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
