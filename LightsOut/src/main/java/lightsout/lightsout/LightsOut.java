package lightsout.lightsout;

import GUI.LightsOutGUI;
import javax.swing.SwingUtilities;

public class LightsOut {

    public static void main(String[] args) {
        LightsOutGUI GUI = new LightsOutGUI();
        SwingUtilities.invokeLater(GUI);
    }
}
