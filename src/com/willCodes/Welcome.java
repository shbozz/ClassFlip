package com.willCodes;

import javax.swing.*;

public class  Welcome {
    // this class is for staring the program

    private JButton startButton;
    private JTextArea welcomeToClassFlipVerTextArea;
    private JPanel panel1;

    public Welcome() {
        startButton.addActionListener(e -> {
            var frame1 = new JFrame("Select seating chart to flip");
            Misc.makeFrame(frame1, 500,200,new Startup().panel);
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        var frame = new JFrame("Welcome to ClassFlip™");
        Misc.makeFrame(frame,500,300,new Welcome().panel1);
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/