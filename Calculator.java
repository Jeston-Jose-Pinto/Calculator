import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double total1=0.0;
    private double total2=0.0;
    private char operator;
    private void getoperator(String btntext)
    {
        operator=btntext.charAt(0);
        total1=total1+Double.parseDouble(Display.getText());
        Display.setText("");
    }
    private JPanel Calculator;
    private JTextField Display;
    private JButton Plus;
    private JButton Minus;
    private JButton Multiply;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton Point;
    private JButton Divide;
    private JButton a6Button;
    private JButton a3Button;
    private JButton Equals;
    private JButton AC;
    private JButton C;
    private JButton SQRT;
    private JButton Percent;

    public Calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0Button1Text = Display.getText() + a0Button.getText();
                Display.setText(a0Button1Text);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText = Display.getText() + a1Button.getText();
                Display.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText = Display.getText() + a2Button.getText();
                Display.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText = Display.getText() + a3Button.getText();
                Display.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText = Display.getText() + a4Button.getText();
                Display.setText(a4ButtonText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText= Display.getText() + a5Button.getText();
                Display.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText = Display.getText() + a6Button.getText();
                Display.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText = Display.getText() + a7Button.getText();
                Display.setText(a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText = Display.getText() + a8Button.getText();
                Display.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText = Display.getText() + a9Button.getText();
                Display.setText(a9ButtonText);
            }
        });
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String button_text= Plus.getText();
               getoperator(button_text);
            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String button_text= Minus.getText();
                getoperator(button_text);
            }
        });
        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text= Multiply.getText();
                getoperator(button_text);
            }
        });
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text= Divide.getText();
                getoperator(button_text);
            }
        });
        Percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text= Percent.getText();
                getoperator(button_text);
            }
        });
        SQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text= SQRT.getText();
                getoperator(button_text);
            }
        });
        Point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    if(Display.getText().equals("")) {
                        Display.setText("0.");
                    }
                    else if (Display.getText () .contains (".") ) {
                        Point.setEnabled(false);
                    }
                    else {
                        String btnPointText = Display.getText() + Point.getText();
                        Display.setText(btnPointText);
                    }
                    Point. setEnabled (true) ;
                }
            }
        });
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (Display.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(Display.getText());
                    strB.deleteCharAt(Display.getText().length() - 1);
                    backspace = strB.toString();
                    Display.setText(backspace);
                }
            }
        });
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                Display.setText("");
            }
        });
        Equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator)
                {
                    case'+':
                        total2=total1+Double.parseDouble(Display.getText());
                        break;
                    case'-':
                        total2=total1-Double.parseDouble(Display.getText());
                        break;
                    case'*':
                        total2=total1*Double.parseDouble(Display.getText());
                        break;
                    case'/':
                        total2=total1/Double.parseDouble(Display.getText());
                        break;
                    case'%':
                        total2=total1/100;
                        break;
                    case'S':
                        total2=Math.sqrt(total1);
                }
                Display.setText(Double.toString(total2));
                total1=0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
