
package GUI;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SouthPanel extends JPanel {

    public SouthPanel() {
        super(new GridLayout(1, 4));
        setComponents();
    }
    
    private void setComponents() {
        JButton resetButton = new JButton("Reset");
        
        JLabel label = new JLabel("Moves:");
        
        JTextField counter = new JTextField("0");
        
        JButton randomizeButton = new JButton("Randomize");
        
        
        add(resetButton);
        add(label);
        add(counter);
        add(randomizeButton);
    }
    
    
}
