package com.willCodes;

import javax.swing.*;
import java.awt.*;

public class ChartChooser {
    // this class will be used to choose the chart size and type
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JButton createButton;
    public Point getSise(){
        var point = new Point((Integer) spinner1.getValue(), (Integer) spinner2.getValue());
        return (point);
    }
}
