import java.io.*;
import javax.swing.*;

public class MyClass {
    public static void main(String[] args) {
  
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        // Creating instance of JButton
        JButton button = new JButton(" Click me baby");

        // x axis, y axis, width, height
        button.setBounds(623, 350, 220, 50);

        // adding button in JFrame
        frame.add(button);

        // 400 width and 500 height
        frame.setSize(400, 400);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}

    
  

