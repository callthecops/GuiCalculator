package Tests;

import javax.swing.*;
import java.awt.*;

public class CoolStuff extends JFrame {

    public void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        JPanel north = new JPanel(new BorderLayout());
        panel.add(north, BorderLayout.NORTH);
        JPanel south = new JPanel();
        panel.add(south, BorderLayout.SOUTH);
        JPanel center = new JPanel();
        panel.add(center, BorderLayout.CENTER);
        JPanel east = new JPanel();
        panel.add(east, BorderLayout.EAST);
        JPanel west = new JPanel();
        panel.add(west, BorderLayout.WEST);
        panel.setVisible(true);
    }

    public static void main(String[] args) {
        new CoolStuff().createView();
    }
}
