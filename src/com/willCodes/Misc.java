package com.willCodes;

import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

public class Misc {
    public static void makeFrame(@NotNull JFrame frame, int width, int height, JPanel panel){
        frame.setSize(width, height);
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        try {
            frame.setIconImage(ImageIO.read(Objects.requireNonNull(Welcome.class.getResource("Icon.png"))));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void makeFrame(@NotNull JFrame frame, int width, int height, JPanel panel, int operation){
        frame.setSize(width, height);
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(operation);
        try {
            frame.setIconImage(ImageIO.read(Objects.requireNonNull(Welcome.class.getResource("Icon.png"))));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
