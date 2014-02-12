package lightsout.GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import lightsout.domain.*;

public class LightsOutGUI implements Runnable {

    private JFrame frame;
    private StandardBoard board;
    private GamePanel gamePanel;

    public LightsOutGUI() {
        this.board = new StandardBoard(5);
        this.gamePanel = new GamePanel(board);
    }

    @Override
    public void run() {
        frame = new JFrame("LightsOut");
        frame.setPreferredSize(new Dimension(600, 650));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(gamePanel);
        frame.setJMenuBar(new GameMenuBar(frame.getContentPane()));

        frame.pack();
        frame.setVisible(true);

        NewGameMenu newGame = new NewGameMenu(frame.getContentPane());
        newGame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}
