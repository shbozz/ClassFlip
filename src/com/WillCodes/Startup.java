package com.WillCodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Startup {
    JPanel panel;
    JButton mrsSollenbergerButton;
    JButton msAngleButton;
    JButton mrsMurpheyButton;
    private JButton openButton;
    static JFrame frame1 = new JFrame("ClassFlip™");
    static JFrame frame2 = new JFrame("ClassFlip™");
    static JFrame frame3 = new JFrame("ClassFlip™");

    public static void closeThem(){
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame3.setVisible(false);
    }

    public Startup() {
        msAngleButton.addActionListener(e -> {
            frame3.setSize(1200, 500);
            frame3.setContentPane(new GUIS().panel1);
            frame3.setVisible(true);
            frame3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            try {
                frame3.setIconImage(ImageIO.read(new File("src/Icon.png")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        mrsSollenbergerButton.addActionListener(e -> {
            frame1.setSize(1200, 500);
            frame1.setContentPane(new GUI().panel1);
            frame1.setVisible(true);
            frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            try {
                frame1.setIconImage(ImageIO.read(new File("src/Icon.png")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        mrsMurpheyButton.addActionListener(e -> {
            frame2.setSize(1200, 500);
            frame2.setContentPane(new GUIS().panel1);
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            try {
                frame2.setIconImage(ImageIO.read(new File("src/Icon.png")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        openButton.addActionListener(e -> {
            String dirPart = System.getProperty("user.home");
            String dir = dirPart + "\\WCGFiles\\ClassFlip";
            var superFile = new File(dir+"\\.txt");

            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setSelectedFile(superFile);

            //In response to a button click:
            int returnVal = fileChooser.showOpenDialog(fileChooser);

            File file = fileChooser.getSelectedFile();
            System.out.println(file);
            try {
                FileReader fileReader = new FileReader(file);

                try {
                    char [] a = new char[2048];
                    fileReader.read(a);

                    String string = "";
                    for(char c : a) {
                        string = string + c;
                        System.out.print(c);
                    }
                    var view = new viewer();
                    view.prepare("File that you opened",string);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                    System.out.println("Nooo!");
                } finally {
                    fileReader.close();
                }


            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Nooo!");
            }

        });
    }
}
