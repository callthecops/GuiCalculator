package Tests;

import javax.swing.*;
import java.awt.*;

public class CalculatorGui {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        frame.getContentPane().add(panel);
        JButton button = new JButton("This is a Button");
        panel.add(button);
        button.setPreferredSize(new Dimension(140, 30));
        JTextField field = new JTextField("I am a field");
        field.setPreferredSize(new Dimension(140,30));
        panel.add(field);
        JLabel label = new JLabel("I am a label");
        label.setPreferredSize(new Dimension(140,30));
        panel.add(label);
        JButton button2 = new JButton("This button is so long it has to be added on the next line");
        panel.add(button2);

        //set frame size

        frame.setSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);
    }
}
