package com.willCodes;

import javax.swing.*;

public class SuperView {

    private JButton flipButton;
    public JPanel panel1;
    private JFrame frame = new JFrame("File that you opened");
    private Boolean isSaved = false;

    private JTextArea studentName4TextArea;
    private JTextArea studentName3TextArea;
    private JTextArea studentName2TextArea;
    private JTextArea studentName1TextArea;
    private JTextArea studentName8TextArea;
    private JTextArea studentName7TextArea;
    private JTextArea studentName6TextArea;
    private JTextArea studentName5TextArea;
    private JTextArea studentName12TextArea;
    private JTextArea studentName11TextArea;
    private JTextArea studentName10TextArea;
    private JTextArea studentName9TextArea;
    private JTextArea studentName16TextArea;
    private JTextArea studentName15TextArea;
    private JTextArea studentName14TextArea;
    private JTextArea studentName13TextArea;
    private JTextArea teacherSDeskTextArea;
    private JTextArea studentName19TextArea;
    private JTextArea studentName18TextArea;
    private JTextArea studentName17TextArea;

    public SuperView() {
        flipButton.addActionListener(e -> {
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
    }
    public void importer(String[] studentNames){

        studentName1TextArea.setText(studentNames[0]);
        studentName5TextArea.setText(studentNames[1]);
        studentName9TextArea.setText(studentNames[2]);
        studentName13TextArea.setText(studentNames[3]);
        teacherSDeskTextArea.setText(studentNames[4]);
        studentName2TextArea.setText(studentNames[5]);
        studentName6TextArea.setText(studentNames[6]);
        studentName10TextArea.setText(studentNames[7]);
        studentName14TextArea.setText(studentNames[8]);
        studentName17TextArea.setText(studentNames[9]);
        studentName3TextArea.setText(studentNames[10]);
        studentName7TextArea.setText(studentNames[11]);
        studentName11TextArea.setText(studentNames[12]);
        studentName15TextArea.setText(studentNames[13]);
        studentName18TextArea.setText(studentNames[14]);
        studentName4TextArea.setText(studentNames[15]);
        studentName8TextArea.setText(studentNames[16]);
        studentName12TextArea.setText(studentNames[17]);
        studentName16TextArea.setText(studentNames[18]);
        studentName19TextArea.setText(studentNames[19]);

        Misc.makeFrame(frame,1200,500,panel1);
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/