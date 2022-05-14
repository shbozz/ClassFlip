package com.willCodes;

import javax.swing.*;

public class Startup {
    JPanel panel;
    JButton GUIButton;
    JButton GUISButton;
    private JButton openButton;
    private JButton createNewButton;
    static JFrame frame1 = new JFrame("ClassFlip™");
    static JFrame frame2 = new JFrame("ClassFlip™");

    public static void closeThem(){
        frame1.setVisible(false);
        frame2.setVisible(false);
    }

    public Startup() {
        GUIButton.addActionListener(e -> {
            Misc.makeFrame(frame1,1200,500,new GUI().panel1,JFrame.DO_NOTHING_ON_CLOSE);
        });
        GUISButton.addActionListener(e -> {
            Misc.makeFrame(frame2,12000,500,new GUIS().panel1,JFrame.DO_NOTHING_ON_CLOSE);
        });
        openButton.addActionListener(e -> {
            Open.open();
        });
        createNewButton.addActionListener(e -> JOptionPane.showMessageDialog(frame1,"Feature not avalible.","Error",JOptionPane.ERROR_MESSAGE));
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/