import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class FinalProject extends JFrame implements ActionListener, MouseListener{
        UI ui = new UI();
        ui.creatUI();
        new FinalProject();
        Character player = new Character("Grant Gilmore");
        Location location1 = new Location("Fight", "Heal", "Run", "Inventory", "You wake up...");
        Location currentLocation = location1;
        System.out.println(currentLocation);
        System.out.println(currentLocation.getOption1());
        System.out.println(currentLocation.printAll());

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



