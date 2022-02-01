package com.WillCodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class viewer {
    JFrame frame = new JFrame();
    public void prepare(String Title, String textToView){
        var vPnl = new ViewPanel();
        frame.setTitle(Title);
        frame.setSize(1200, 500);
        frame.setContentPane(vPnl.Panel);
        frame.setVisible(true);
        vPnl.textArea1.setText(textToView);
        try {
            frame.setIconImage(ImageIO.read(Welcome.class.getResource("Icon.png")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
