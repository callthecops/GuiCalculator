import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

    JPanel panel;
    JLabel label;
    JButton button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9, buttonAdd, buttonSubstrat,
            buttonMult, buttonDiv, buttonEq, buttonReset;

    int firstNumber, secondNumber;
    boolean selectFirst = true;
    String operator;
    String eq, reset;


    public void calculate(int firstNumber, int secondNumber, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
        }
        label.setText("" + result);
    }

    public Gui() {
        createView();
        setTitle("Super Mega Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 400);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g) {
        Font font = new Font("Verdana", Font.BOLD, 16);
        label.setFont(font);
    }

    public void paintTwo(Graphics g) {
        Font font = new Font("Verdana", Font.BOLD, 8);
        buttonReset.setFont(font);
    }


    public void setLabelName(String s) {
        label.setText(s);
    }

    public void createView() {
        panel = new JPanel();
        getContentPane().add(panel);

        label = new JLabel();
        label.setText("Calculator");
        label.setPreferredSize(new Dimension(280, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        panel.add(label);

        button0 = new JButton("0");
        panel.add(button0);
        button0.setPreferredSize(new Dimension(60, 60));
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("0");
                if (selectFirst) {
                    firstNumber = 0;
                    selectFirst = false;
                } else {
                    secondNumber = 0;
                    selectFirst = true;
                }

            }
        });

        button1 = new JButton("1");
        panel.add(button1);
        button1.setPreferredSize(new Dimension(60, 60));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("1");
                if (selectFirst) {
                    firstNumber = 1;
                    selectFirst = false;
                } else {
                    secondNumber = 1;
                    selectFirst = true;
                }
            }
        });

        button2 = new JButton("2");
        panel.add(button2);
        button2.setPreferredSize(new Dimension(60, 60));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("2");
                if (selectFirst) {
                    firstNumber = 2;
                    selectFirst = false;
                } else {
                    secondNumber = 2;
                    selectFirst = true;
                }
            }
        });

        button3 = new JButton("3");
        panel.add(button3);
        button3.setPreferredSize(new Dimension(60, 60));
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("3");
                if (selectFirst) {
                    firstNumber = 3;
                    selectFirst = false;
                } else {
                    secondNumber = 3;
                    selectFirst = true;
                }

            }
        });

        button4 = new JButton("4");
        panel.add(button4);
        button4.setPreferredSize(new Dimension(60, 60));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("4");
                if (selectFirst) {
                    firstNumber = 4;
                    selectFirst = false;
                } else {
                    secondNumber = 4;
                    selectFirst = true;
                }
            }
        });

        button5 = new JButton("5");
        panel.add(button5);
        button5.setPreferredSize(new Dimension(60, 60));
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("5");
                if (selectFirst) {
                    firstNumber = 5;
                    selectFirst = false;
                } else {
                    secondNumber = 5;
                    selectFirst = true;
                }

            }
        });

        button6 = new JButton("6");
        panel.add(button6);
        button6.setPreferredSize(new Dimension(60, 60));
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("6");
                if (selectFirst) {
                    firstNumber = 6;
                    selectFirst = false;
                } else {
                    secondNumber = 6;
                    selectFirst = true;
                }
            }
        });

        button7 = new JButton("7");
        panel.add(button7);
        button7.setPreferredSize(new Dimension(60, 60));
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("7");

                if (selectFirst) {
                    firstNumber = 7;
                    selectFirst = false;
                } else {
                    secondNumber = 7;
                    selectFirst = true;
                }
            }
        });

        button8 = new JButton("8");
        panel.add(button8);
        button8.setPreferredSize(new Dimension(60, 60));
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("8");
                if (selectFirst) {
                    firstNumber = 8;
                    selectFirst = false;
                } else {
                    secondNumber = 8;
                    selectFirst = true;
                }
            }
        });

        button9 = new JButton("9");
        panel.add(button9);
        button9.setPreferredSize(new Dimension(60, 60));
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelName("9");
                if (selectFirst) {
                    firstNumber = 9;
                    selectFirst = false;
                } else {
                    secondNumber = 9;
                    selectFirst = true;
                }
            }
        });

        buttonAdd = new JButton("+");
        panel.add(buttonAdd);
        buttonAdd.setPreferredSize(new Dimension(60, 60));
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "+";
            }
        });

        buttonSubstrat = new JButton("-");
        panel.add(buttonSubstrat);
        buttonSubstrat.setPreferredSize(new Dimension(60, 60));
        buttonSubstrat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "-";
            }
        });

        buttonDiv = new JButton("/");
        panel.add(buttonDiv);
        buttonDiv.setPreferredSize(new Dimension(60, 60));
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "/";
            }
        });

        buttonMult = new JButton("*");
        panel.add(buttonMult);
        buttonMult.setPreferredSize(new Dimension(60, 60));
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "*";
            }
        });

        buttonEq = new JButton("=");
        panel.add(buttonEq);
        buttonEq.setPreferredSize(new Dimension(60, 60));
        buttonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(firstNumber, secondNumber, operator);
                System.out.println(firstNumber);
                ;
                System.out.println(secondNumber);
                ;
            }
        });

        buttonReset = new JButton("Reset");
        panel.add(buttonReset);
        buttonReset.setPreferredSize(new Dimension(60, 60));
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset = "reset";
                label.setText("Calculator");
                firstNumber = 0;
                secondNumber = 0;
                operator = null;
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }
}
