package com.willCodes;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Open {
    public static void open(){
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
        String splits = spliting[1] + spliting[2] + spliting[3] + spliting[4];
        String[] splited = splits.split(",");
        var viewer = new SuperView();
        viewer.importer(splited);
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/