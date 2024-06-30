package visuals;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanelSwitcher {
    public static void switchPanel(JPanel container, JPanel panel) {
        panel.setSize(1066, 668);
        panel.setLocation(0, 0);
        container.removeAll();
        container.add(panel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }
}