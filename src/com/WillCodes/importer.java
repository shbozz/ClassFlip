package com.WillCodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class importer {
    JFrame frame = new JFrame("File that you opened");
    public void importIt(String[] studentNames){
        var superView = new SuperView();
        frame.setContentPane(superView.panel1);
        try {
            frame.setIconImage(ImageIO.read(Welcome.class.getResource("Icon.png")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        frame.setSize(1200,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
