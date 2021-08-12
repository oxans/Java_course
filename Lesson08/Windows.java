package Lesson08;

import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame {
    public Windows() {
        setTitle("MY window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250,250);
        setVisible(true);
        setBackground(Color.darkGray);
    }
    public static void main(String[] args){
        new Windows();
    }


}
