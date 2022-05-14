package com.willCodes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

public class GUI {
    private JButton flipButton;
    public JPanel panel1;
    private Boolean isSaved = false;
    String dirPart = System.getProperty("user.home");
    String dirWin = dirPart + "\\WCGFiles\\ClassFlip\\";
    String dirUnB = dirPart + "/WCGFiles/ClassFlip/";
    String dir = OSDetector.isWin() ? dirWin : dirUnB;

    public JTextArea studentName19TextArea;
    private JTextArea studentName18TextArea;
    private JTextArea studentName17TextArea;
    private JTextArea teacherSDeskTextArea;
    private JTextArea studentName13TextArea;
    private JTextArea studentName14TextArea;
    private JTextArea studentName15TextArea;
    private JTextArea studentName16TextArea;
    private JTextArea studentName9TextArea;
    private JTextArea studentName10TextArea;
    private JTextArea studentName11TextArea;
    private JTextArea studentName12TextArea;

    private JButton closeButton;
    private JButton saveButton;
    private JTextField textField1;
    private JTextArea studentName5TextArea;
    private JTextArea studentName6TextArea;
    private JTextArea studentName7TextArea;
    private JTextArea studentName8TextArea;
    private JTextArea studentName1TextArea;
    private JTextArea studentName2TextArea;
    private JTextArea studentName3TextArea;
    private JTextArea studentName4TextArea;

    public GUI(){
        flipButton.addActionListener(e -> {
            String[][] datas = {{studentName1TextArea.getText(), studentName5TextArea.getText(), studentName9TextArea.getText(), studentName13TextArea.getText(), teacherSDeskTextArea.getText()}, {studentName2TextArea.getText(), studentName6TextArea.getText(), studentName10TextArea.getText(), studentName14TextArea.getText(), studentName17TextArea.getText()}, {studentName3TextArea.getText(), studentName7TextArea.getText(), studentName11TextArea.getText(), studentName15TextArea.getText(), studentName18TextArea.getText()}, {studentName4TextArea.getText(), studentName8TextArea.getText(), studentName12TextArea.getText(), studentName16TextArea.getText(), studentName19TextArea.getText()}};
            String studentName1 = studentName1TextArea.getText();
            String studentName2 = studentName2TextArea.getText();
            String studentName3 = studentName3TextArea.getText();
            String studentName4 = studentName4TextArea.getText();
            String studentName5 = studentName5TextArea.getText();
            String studentName6 = studentName6TextArea.getText();
            String studentName7 = studentName7TextArea.getText();
            String studentName8 = studentName8TextArea.getText();
            String studentName9 = studentName9TextArea.getText();
            String studentName10 = studentName10TextArea.getText();
            String studentName11 = studentName11TextArea.getText();
            String studentName12 = studentName12TextArea.getText();
            String studentName13 = studentName13TextArea.getText();
            String studentName14 = studentName14TextArea.getText();
            String studentName15 = studentName15TextArea.getText();
            String studentName16 = studentName16TextArea.getText();
            String studentName17 = studentName17TextArea.getText();
            String studentName18 = studentName18TextArea.getText();
            String studentName19 = studentName19TextArea.getText();
            String studentName20 = teacherSDeskTextArea.getText();

            studentName1TextArea.setText(studentName4);
            studentName5TextArea.setText(studentName8);
            studentName9TextArea.setText(studentName12);
            studentName13TextArea.setText(studentName16);
            teacherSDeskTextArea.setText(studentName19);
            studentName2TextArea.setText(studentName3);
            studentName6TextArea.setText(studentName7);
            studentName10TextArea.setText(studentName11);
            studentName14TextArea.setText(studentName15);
            studentName17TextArea.setText(studentName18);
            studentName3TextArea.setText(studentName2);
            studentName7TextArea.setText(studentName6);
            studentName11TextArea.setText(studentName10);
            studentName15TextArea.setText(studentName14);
            studentName18TextArea.setText(studentName17);
            studentName4TextArea.setText(studentName1);
            studentName8TextArea.setText(studentName5);
            studentName12TextArea.setText(studentName9);
            studentName16TextArea.setText(studentName13);
            studentName19TextArea.setText(studentName20);
        });
        saveButton.addActionListener(e -> {
            isSaved = true;
            String name = textField1.getText();
            String data = studentName1TextArea.getText()+", "+studentName5TextArea.getText()+", "+studentName9TextArea.getText()+", "+studentName13TextArea.getText()+", "+teacherSDeskTextArea.getText()+",\n"+studentName2TextArea.getText()+", "+studentName6TextArea.getText()+", "+studentName10TextArea.getText()+", "+studentName14TextArea.getText()+", "+studentName17TextArea.getText()+",\n"+studentName3TextArea.getText()+", "+studentName7TextArea.getText()+", "+studentName11TextArea.getText()+", "+studentName15TextArea.getText()+", "+studentName18TextArea.getText()+",\n"+studentName4TextArea.getText()+", "+studentName8TextArea.getText()+", "+studentName12TextArea.getText()+", "+studentName16TextArea.getText()+", "+studentName19TextArea.getText();

            new File(dir).mkdirs();

            try {
                FileWriter output = new FileWriter(dir + name + ".txt");
                output.write(data);
                output.close();
                System.out.println(dir + name + ".txt");
            }
            catch (Exception f) {
                f.getStackTrace();
            }
        });
        closeButton.addActionListener(e -> {
            if (isSaved==false){
                JOptionPane.showMessageDialog(closeButton, "You should save it!", "Chart not saved!", JOptionPane.WARNING_MESSAGE);
                isSaved = true;
            }
            else {
                Startup.closeThem();
            }
        });
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/