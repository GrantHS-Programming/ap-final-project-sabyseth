import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class UI {
    JFrame window;
    JPanel titleNamePanal,  startButtonPanal;
    JLabel titleNameLabel;
    JButton startButton;
    Font engraversOldEnglish;
    public void creatUI(){
        try {
            engraversOldEnglish = Font.createFont(Font.TRUETYPE_FONT, new File("OPTIEngraversOldEnglish.otf")).deriveFont(5f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        }
        catch (IOException | FontFormatException ignored){
        }

        JTextArea text = new JTextArea();
        //Window
        window = new JFrame("Dungeon");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        //Title
        titleNamePanal = new JPanel();
        titleNamePanal.setBounds(100,100,600,500);
        titleNamePanal.setBackground(Color.black);
        titleNameLabel = new JLabel("matrix");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(engraversOldEnglish.deriveFont(200f));
        titleNamePanal.add(titleNameLabel);
        startButtonPanal = new JPanel();
        startButtonPanal.setBounds(300,400,200,100);
        startButtonPanal.setBackground(Color.black);
        startButton = new JButton("Styrtan");
        startButton.setBorderPainted(true);
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.white);
        startButton.setFont(engraversOldEnglish.deriveFont(30f));
        startButton.setFocusPainted(false);
        startButtonPanal.add(startButton);
        window.add(titleNamePanal);
        window.add(startButtonPanal);

        window.setVisible(true);

    }
}
