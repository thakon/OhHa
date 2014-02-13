/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.GUI;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Tuomas
 */
public class LightsOutButton extends JButton {

    private boolean isLit;

    public LightsOutButton() {
        super();
        this.isLit = true;
        this.setBackground(Color.yellow);
    }

    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
        if (this.isLit) {
            this.setBackground(Color.yellow);
        } else {
            this.setBackground(Color.darkGray);
        }
    }
}
