package lightsout.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lightsout.domain.*;

public class GamePanel extends JPanel {

    private Board board;
    private int moveCount;
    private JLabel counter;
    private LightsOutButton[][] buttonGrid;

    public GamePanel(StandardBoard board) {
        super(new BorderLayout());
        this.board = board;
        this.moveCount = 0;
        add(gameBoard(), BorderLayout.CENTER);
        add(bottomPanel(), BorderLayout.SOUTH);
    }

    private JPanel gameBoard() {
        GridLayout grid = new GridLayout(board.size(), board.size());
        JPanel gameBoard = new JPanel(grid);
        buttonGrid = new LightsOutButton[board.size()][board.size()];
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                LightsOutButton b = new LightsOutButton();
                buttonGrid[i][j] = b;
                b.addActionListener(new lightButtonListener(i, j));
                gameBoard.add(b);
            }
        }
        return gameBoard;
    }

    private JPanel bottomPanel() {
        JPanel bottomPanel = new JPanel();

        JButton resetButton = new JButton("Reset");
        counter = new JLabel(" ----- Moves: " + Integer.toString(moveCount) + " ----- ");
        JButton randomizeButton = new JButton("Randomize");

        resetButton.addActionListener(new resetButtonListener());
        randomizeButton.addActionListener(new randomizeButtonListener());

        bottomPanel.add(resetButton);
        bottomPanel.add(counter);
        bottomPanel.add(randomizeButton);

        return bottomPanel;
    }

    private void updateGamePanel() {
        for (int i = 0; i < buttonGrid.length; i++) {
            for (int j = 0; j < buttonGrid[i].length; j++) {
                buttonGrid[i][j].setIsLit(board.isLit(i, j));
            }
        }
        counter.setText(" ----- Moves: " + Integer.toString(moveCount) + " ----- ");
    }

    private class resetButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            moveCount = 0;
            board.reset();
            updateGamePanel();
        }
    }

    private class randomizeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            moveCount = 0;
            board.randomize();
            updateGamePanel();
        }
    }

    private class lightButtonListener implements ActionListener {

        private int x;
        private int y;

        public lightButtonListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            moveCount++;
            board.makeMove(x, y);
            updateGamePanel();
            if (board.isSolved()) {
                JOptionPane.showMessageDialog(null, "You have beaten the game. You used "
                        + moveCount + " moves.", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                moveCount = 0;
                board.reset();
                updateGamePanel();
            }
        }
    }
}
