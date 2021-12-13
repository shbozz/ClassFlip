package com.WillCodes;

import javax.swing.*;

public class GUI {

    private JButton flipButton;
    public JPanel panel1;
    public JTextField studentName1TextField;
    public JTextField teacherSDeskTextField;
    public JTextField studentName9TextField;
    public JTextField studentName13TextField;
    public JTextField studentName5TextField;
    public JTextField studentName4TextField;
    public JTextField studentName8TextField;
    public JTextField studentName12TextField;
    public JTextField studentName16TextField;
    public JTextField studentName19TextField;
    public JTextField studentName3TextField;
    public JTextField studentName7TextField;
    public JTextField studentName11TextField;
    public JTextField studentName15TextField;
    public JTextField studentName18TextField;
    public JTextField studentName2TextField;
    public JTextField studentName6TextField;
    public JTextField studentName10TextField;
    public JTextField studentName14TextField;
    public JTextField studentName17TextField;

    public GUI() {
        flipButton.addActionListener(e -> {

            String studentName1 = studentName1TextField.getText();
            String studentName2 = studentName2TextField.getText();
            String studentName3 = studentName3TextField.getText();
            String studentName4 = studentName4TextField.getText();
            String studentName5 = studentName5TextField.getText();
            String studentName6 = studentName6TextField.getText();
            String studentName7 = studentName7TextField.getText();
            String studentName8 = studentName8TextField.getText();
            String studentName9 = studentName9TextField.getText();
            String studentName10 = studentName10TextField.getText();
            String studentName11 = studentName11TextField.getText();
            String studentName12 = studentName12TextField.getText();
            String studentName13 = studentName13TextField.getText();
            String studentName14 = studentName14TextField.getText();
            String studentName15 = studentName15TextField.getText();
            String studentName16 = studentName16TextField.getText();
            String studentName17 = studentName17TextField.getText();
            String studentName18 = studentName18TextField.getText();
            String studentName19 = studentName19TextField.getText();
            String studentName20 = teacherSDeskTextField.getText();

            studentName1TextField.setText(studentName4);
            studentName5TextField.setText(studentName8);
            studentName9TextField.setText(studentName12);
            studentName13TextField.setText(studentName16);
            teacherSDeskTextField.setText(studentName19);
            studentName2TextField.setText(studentName3);
            studentName6TextField.setText(studentName7);
            studentName10TextField.setText(studentName11);
            studentName14TextField.setText(studentName15);
            studentName17TextField.setText(studentName18);
            studentName3TextField.setText(studentName2);
            studentName7TextField.setText(studentName6);
            studentName11TextField.setText(studentName10);
            studentName15TextField.setText(studentName14);
            studentName18TextField.setText(studentName17);
            studentName4TextField.setText(studentName1);
            studentName8TextField.setText(studentName5);
            studentName12TextField.setText(studentName9);
            studentName16TextField.setText(studentName13);
            studentName19TextField.setText(studentName20);
        });
    }
}