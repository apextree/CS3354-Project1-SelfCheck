package buttoninheritance;

import buttoninheritance.urlbuttons.OCPButton;
import buttoninheritance.urlbuttons.ParentURLButton;
import buttoninheritance.urlbuttons.SRPButton;
import java.awt.*;
import javax.swing.*;

// Main class to demonstrate the UI
public class ButtonDemo extends JFrame {
    public ButtonDemo() {
        setTitle("Shape Button Inheritance Demo");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        ParentURLButton txStateURLButton = new ParentURLButton("TxState", "https://www.txst.edu/");
        SRPButton srpButton = new SRPButton("SRP", "https://www.youtube.com/watch?v=MPp4A4F6rQI&t=359s");
        OCPButton ocpButton = new OCPButton("OCP", "https://www.youtube.com/watch?v=j9G-1TF9KkQ");
        ParentDrawingButton drawingButton = new CosineDrawingButton("Cosine Plotter");

        // Add buttons to the frame
        add(txStateURLButton);
        add(srpButton);
        add(ocpButton);
        add(drawingButton);

    }

    public static void main(String[] args) {
        // Create and show the UI
        SwingUtilities.invokeLater(() -> {
            ButtonDemo demo = new ButtonDemo();
            demo.setVisible(true);
        });
    }
}
