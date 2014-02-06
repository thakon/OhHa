
package lightsout.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LightsOutGUI implements Runnable {
    
    private JFrame frame;
    
    public LightsOutGUI() {
    }

    @Override
    public void run() {
        frame = new JFrame("LightsOut");
        frame.setPreferredSize(new Dimension(600, 650));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setJMenuBar(new GameMenuBar());

        setComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void setComponents(Container container) {
        container.add(new GameBoard(),BorderLayout.CENTER);
        container.add(new SouthPanel(),BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
