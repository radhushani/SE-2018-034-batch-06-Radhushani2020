package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JPanel panel;
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JButton button2;
    private JButton bAdd;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b1;
    private JButton b2;
    private JButton b0;
    private JButton bDot;
    private JButton b3;
    private JButton bEqual;
    private JButton bDiv;
    private JButton bMul;
    private JButton bSub;
    private JLabel label;
    double num,ans;
    int calculation;


    public Calculator(){

//        this.setContentPane(panel);
//        this.setTitle("Calculator");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.radioButton1.setEnabled(false);//on button disable

        this.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                label.setText("");
            }
        });
        this.bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation=1;
                textField1.setText("");
                label.setText(num + "+");
            }
        });
        this.b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        this.b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        this.b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });
        this.b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });
        this.b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        this.b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        this.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        this.b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        this.b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        this.bSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation=2;
                textField1.setText(" ");
                label.setText(num + "-");
            }
        });
        this.bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation=3;
                textField1.setText(" ");
                label.setText(num + "*");
            }
        });
        this.bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textField1.getText());
                calculation=2;
                textField1.setText(" ");
                label.setText(num + "/");
            }
        });
        this.bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+".");
            }
        });
        this.radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 on();
            }
        });
        this.radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 off();
            }
        });
        this.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int length=textField1.getText().length();
                 int number=textField1.getText().length()-1;
                 String store;

                 if(length>0){
                     StringBuilder back=new StringBuilder(textField1.getText());
                     back.deleteCharAt(number);
                     store =back.toString();
                     textField1.setText(store);

                 }
            }
        });
        this.bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  arithmeticOperation();
                  label.setText("");
            }
        });
    }

    public void off(){
        textField1.setEnabled(false);
        textField1.setText("");

        radioButton1.setEnabled(true);//on button enable
        radioButton2.setEnabled(false);//off button disable

        button1.setEnabled(false);
        button2.setEnabled(false);
        bAdd.setEnabled(false);
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bDot.setEnabled(false);
        bDiv.setEnabled(false);
        bMul.setEnabled(false);
        bSub.setEnabled(false);
        bEqual.setEnabled(false);
    }
    public void on(){
        textField1.setEnabled(true);

        radioButton1.setEnabled(false);//on button disable
        radioButton2.setEnabled(true);//off button enable

        button1.setEnabled(true);
        button2.setEnabled(true);
        bAdd.setEnabled(true);
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bDot.setEnabled(true);
        bDiv.setEnabled(true);
        bEqual.setEnabled(true);
        bSub.setEnabled(true);
        bMul.setEnabled(true);
    }

    //method for arithmetic calculation
    public void arithmeticOperation(){
        switch(calculation){
            case 1://addition
                ans = num + Double.parseDouble(textField1.getText());//covert string to double
                textField1.setText(Double.toString(ans));
                break;
            case 2://subtraction
                ans = num - Double.parseDouble(textField1.getText());//covert string to double
                textField1.setText(Double.toString(ans));
                break;
            case 3://multiplication
                ans = num * Double.parseDouble(textField1.getText());//covert string to double
                textField1.setText(Double.toString(ans));
                break;
            case 4://division
                ans = num / Double.parseDouble(textField1.getText());//covert string to double
                textField1.setText(Double.toString(ans));
                break;
        }
    }

    //main method
    public static void main(String[] args) {
        //JFrame configurations
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
