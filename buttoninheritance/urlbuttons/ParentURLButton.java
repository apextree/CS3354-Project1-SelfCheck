package buttoninheritance.urlbuttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;

// Parent class: URL Buttons
public class ParentURLButton implements ActionListener {
    protected String url;

    public ParentURLButton(String text, String url, Color colorSomething) {
        super(text);
        this.url = url;
        addActionListener(this);
        setPreferredSize(new Dimension(150, 100));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        openBrowser(url);
    }

    protected void reNameButton(String name) {
        this.setText(name);
    }

    private void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }

}
