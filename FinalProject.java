import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

public class FinalProject extends JFrame implements ActionListener, MouseListener{
    JFrame gameWindow;
    JPanel titleName;
    JLabel titleNameLabel;
    Font engraversOldEnglish;

    public static void main(String[] args) {

    new FinalProject();

    }

    public FinalProject(){
        engraversOldEnglish = Font.createFont(Font.TRUETYPE_FONT, new File("OPTIEngraversOldEnglish.otf")).deriveFont(30f);

        //Window
        gameWindow = new JFrame("Dungeon");
        gameWindow.setSize(1000,1000);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.BLACK);
        gameWindow.setVisible(true);
        //Title
        titleName = new JPanel();
        titleName.setBounds(100, 100, 600, 500);
        titleName.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("Matrix");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(engraversOldEnglish);
//hi


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
