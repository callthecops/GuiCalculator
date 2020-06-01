package Tests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryClickMe extends JFrame {
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public TryClickMe() {
        createView();
        setTitle("Clicker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        panel.add(labelCount);
        labelCount.setPreferredSize(new Dimension(200, 30));
        panel.add(labelCount);

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        panel.add(buttonReset);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks=0;
                updateCounter();
            }
        });
    }

    private void updateCounter() {
        labelCount.setText("Clicked " + clicks + " times");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryClickMe().setVisible(true);
            }
        });
    }

    class ButtonCounterActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }
}
