package com.WillCodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Welcome {

    private JButton startButton;
    private JTextArea welcomeToClassFlipTextArea;
    private JPanel panel1;

    public Welcome() {
        startButton.addActionListener(e -> {
            var frame1 = new JFrame("Select seating chart to flip");
            frame1.setSize(500, 200);
            frame1.setContentPane(new Startup().panel);
            frame1.setTitle("Select seating chart to flip");
            frame1.setVisible(true);
            try {
                frame1.setIconImage(ImageIO.read(new File("src/Icon.png")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        var frame = new JFrame("Welcome to ClassFlip™");

        Boolean yes = check();
        System.out.println(yes);
        if (yes | !yes) {
            frame.setSize(500, 300);
            frame.setContentPane(new Welcome().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            try {
                frame.setIconImage(ImageIO.read(new File("src/Icon.png")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(frame, "Please Activate it using 'WiWill Product Activation'", "ClassFlip™ is not Activated!", JOptionPane.WARNING_MESSAGE);
        }
    }
    private static Boolean check(){
        var frame = new JButton();
        String dirPart = System.getProperty("user.home");
        String dir = dirPart + "\\WCGFiles\\Activation";

        Boolean isActivated = false;

        // Creates an array of character
        char[] array = new char[5];

        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader(dir + "\\ClassFlip.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Closes the reader
            input.close();
        }
        catch(Exception e) {
             e.printStackTrace();
        }

        String formattedString = Arrays.toString(array)
                .replace("  "," ")
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();           //remove trailing spaces from partially initialized array


        System.out.println(formattedString);

        if (formattedString.equals("T r u e")){
            isActivated = true;
        }
        return isActivated;
    }
}