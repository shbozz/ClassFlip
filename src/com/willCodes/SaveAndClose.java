package com.willCodes;

import java.io.File;
import java.io.FileWriter;

public class SaveAndClose {
    String dirPart = System.getProperty("user.home");
    String dir = dirPart + "\\WCGFiles\\ClassFlip";

    public void save(Boolean isSaved, String name, String[] names){
    String data = names[1]+", "+names[5]+", "+names[9]+", "+names[13]+", "+names[20]+",\n"+names[2]+", "+names[6]+", "+names[10]+", "+names[14]+", "+names[17]+",\n"+names[3]+", "+names[7]+", "+names[11]+", "+names[15]+", "+names[18]+",\n"+names[4]+", "+names[8]+", "+names[12]+", "+names[16]+", "+names[19];

            new File(dir).mkdirs();
            System.out.println(dir + "\\" + name + ".txt");
            try {
        FileWriter output = new FileWriter(dir + "\\" + name + ".txt");
        output.write(data);
        output.close();
        }
            catch (Exception f) {
        f.getStackTrace();
        }
    }
}
