package lightsout.GUI;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class GameBoard extends JPanel {

    public GameBoard() {
        super();
        GridLayout grid = new GridLayout(5, 5);
        setLayout(grid);
        setComponents();
    }

    private void setComponents() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                JToggleButton b = new JToggleButton("");
                b.setBackground(Color.YELLOW);
                add(b);
            }
        }
    }
    
    
    
    
}
