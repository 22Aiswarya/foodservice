import java.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        JFrame frame1=new JFrame("Test APP");
        frame1.setContentPane(new testform().panel1);
        frame1.setPreferredSize(new Dimension(500, 500));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }
}
