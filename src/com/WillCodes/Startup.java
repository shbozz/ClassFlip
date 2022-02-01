package com.WillCodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Startup {
    JPanel panel;
    JButton mrsSollenbergerButton;
    JButton mrsMurpheyButton;
    private JButton openButton;
    static JFrame frame1 = new JFrame("ClassFlip™");
    static JFrame frame2 = new JFrame("ClassFlip™");

    public static void closeThem(){
        frame1.setVisible(false);
        frame2.setVisible(false);
    }

    public Startup() {
        mrsSollenbergerButton.addActionListener(e -> {
            frame1.setSize(1200, 500);
            frame1.setContentPane(new GUI().panel1);
            frame1.setVisible(true);
            frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            try {
                frame1.setIconImage(ImageIO.read(Welcome.class.getResource("Icon.png")));
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
                frame2.setIconImage(ImageIO.read(Welcome.class.getResource("Icon.png")));
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
            String[] spliting = new String[54];
            short count = 1;
            try {
                Scanner filer = new Scanner(file);
                while(filer.hasNext()){
                    spliting[count] = filer.nextLine();
                    count++;
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
                System.out.println("Nooo!");
            }
            String splits = spliting.toString();
            String[] splited = splits.split(", ");
            var importing = new importer();
            importing.importIt(splited);
        });
    }
}
