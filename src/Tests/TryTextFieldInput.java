package Tests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryTextFieldInput extends JFrame {

    private JTextField fieldName;
    private JLabel labelMessage;
    private JButton buttonSubmit;


    public TryTextFieldInput() {
        creatView();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(500, 300);

        setLocationRelativeTo(null);

        setResizable(false);
    }

    public void creatView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("Please enter your name");
        panel.add(label);

        fieldName = new JTextField(12);
        fieldName.setPreferredSize(new Dimension(120, 30));
        panel.add(fieldName);

        buttonSubmit = new JButton("Submit");
        panel.add(buttonSubmit);
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldName.getText();
                if(name.isEmpty()){
                    labelMessage.setText("Name can't be empty");
                }else{
                    labelMessage.setText("Hello "+name+" ,how are you?");
                }
            }
        });

        labelMessage = new JLabel("Please enter your name");
        panel.add(labelMessage);
    }

    public static void main(String[] args) {
        TryTextFieldInput a = new TryTextFieldInput();
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                new TryTextFieldInput().setVisible(true);
            }
        });
        one.start();
    }
}
