package com.WillCodes;

import javax.swing.*;

public class Startup {
    JPanel panel;
    JButton mrsSollenbergerButton;
    JButton msAngleButton;
    JButton mrsMurpheyButton;

    public Startup() {
        msAngleButton.addActionListener(e -> {
            var frame3 = new JFrame("ClassFlip™");
            frame3.setSize(1200, 500);
            frame3.setContentPane(new GUIS().panel1);
            frame3.setVisible(true);
        });
        mrsSollenbergerButton.addActionListener(e -> {
            var frame1 = new JFrame("ClassFlip™");
            frame1.setSize(1200, 500);
            frame1.setContentPane(new GUI().panel1);
            frame1.setVisible(true);
        });
        mrsMurpheyButton.addActionListener(e -> {
            var frame2 = new JFrame("ClassFlip™");
            frame2.setSize(1200, 500);
            frame2.setContentPane(new GUIS().panel1);
            frame2.setVisible(true);
        });
    }
}
