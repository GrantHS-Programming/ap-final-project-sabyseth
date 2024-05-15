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
    Location currentLocation = location1;
        System.out.println(location1);
        System.out.println(location1.getOption1());
        System.out.println(location1.printAll());

    }

    public FinalProject(){
        try {
            engraversOldEnglish = Font.createFont(Font.TRUETYPE_FONT, new File("OPTIEngraversOldEnglish.otf")).deriveFont(20f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        }
        catch (IOException | FontFormatException e){

        }


        //Window
        int width = 1000;
        int height = 1000;
        gameWindow = new JFrame("Dungeon");
        gameWindow.setSize(width,height);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.BLACK);
        gameWindow.setLayout(null);

        //Title
        titleName = new JPanel();
        titleName.setSize(100, 100);
        titleName.setLocation(gameWindow.getWidth()/2, gameWindow.getHeight()/2);
        titleName.setBackground(Color.BLACK);

        titleNameLabel = new JLabel("Matrix");
        titleNameLabel.setBackground(Color.black);
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(engraversOldEnglish);
        titleName.add(titleNameLabel);

        gameWindow.add(titleName);
        gameWindow.setVisible(true);

        //Buttons
        JButton button1 = new JButton();
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
