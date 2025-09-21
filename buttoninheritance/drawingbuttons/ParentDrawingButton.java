package buttoninheritance.drawingbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ParentDrawingButton extends JButton implements ActionListener {

    public ParentDrawingButton(String text) {
        super(text);
        addActionListener(this);
    }

    // Method to be overridden by subclasses that will specify what drawing function
    // will be added
    // to the plotter window (plotterFrame)
    protected void plotter(JFrame plotterFrame) {
        // No default implementation (an implementation is provided by the children)
        // Hint: the code will need to add the drawer instance to the plotterFrame.
    }

    // Launch the plotter window when the button is clicked.
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame plotterFrame = new JFrame("Plotter Window");
        plotterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        plotter(plotterFrame);
        plotterFrame.setSize(630, 250);
        plotterFrame.setLocationRelativeTo(null);
        plotterFrame.setVisible(true);
    }
}
