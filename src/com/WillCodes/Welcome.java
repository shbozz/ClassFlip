package com.WillCodes;

import javax.swing.*;

public class Welcome{


    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        var frame = new JFrame("Welcome to ClassFlip™");
        var panel1 = new JPanel();
        var button1 = new JButton();
        var TextArea1 = new JTextArea();

        TextArea1.setEditable(false);
        TextArea1.setSize(500, 450);
        TextArea1.setText("Welcome to ClassFlip™");
        button1.setSize(500, 50);
        button1.setText("Start");
        panel1.add(TextArea1);
        panel1.add(button1);
        frame.setSize(500, 500);
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button1.addActionListener(e -> {
            frame.setSize(500, 200);
            frame.setContentPane(new Startup().panel);
            frame.setTitle("Whose seating chart will you be flipping");
        });


    }
}