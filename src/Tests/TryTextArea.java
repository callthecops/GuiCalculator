package Tests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryTextArea extends JFrame {
    private JTextArea textArea;
    private JButton buttonClear;
    private JTextField fieldMessage;
    private JButton buttonSubmit;

    public TryTextArea() {
        createView();
        setTitle("Text Area Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
    }


    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("Enter some text");
        panel.add(label);
        fieldMessage = new JTextField(12);
        panel.add(fieldMessage);

        buttonSubmit = new JButton("Submit");
        panel.add(buttonSubmit);
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = fieldMessage.getText();
                if (!message.isEmpty()) {
                    textArea.append(message + "\n");
                }
            }
        });

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea.setPreferredSize(new Dimension(350, 90));
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        buttonClear = new JButton("Clear Text Area");
        panel.add(buttonClear);
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(" ");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TryTextArea().setVisible(true);
        });
    }
}