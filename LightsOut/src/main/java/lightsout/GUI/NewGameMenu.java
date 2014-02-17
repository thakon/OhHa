
package lightsout.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import lightsout.domain.*;

public class NewGameMenu extends JDialog {
    private JRadioButtonMenuItem boardButton;
    private JRadioButtonMenuItem moebiusButton;
    private JRadioButtonMenuItem kleinButton;
    private JRadioButtonMenuItem torusButton;
    
    private JRadioButtonMenuItem fiveFiveBoard;
    private JRadioButtonMenuItem sevenSevenBoard;
    private JRadioButtonMenuItem nineNineBoard;
    
    private Container container;

    public NewGameMenu(Container container) {
        this.container = container;
        
        setTitle("New Game");
        setPreferredSize(new Dimension(300, 300));
        
        this.setLayout(new GridLayout(5, 2));
        
        this.boardButton = new JRadioButtonMenuItem("Standard Board");
        this.kleinButton = new JRadioButtonMenuItem("Klein's Bottle");
        this.moebiusButton = new JRadioButtonMenuItem("Möbius Strip");
        this.torusButton = new JRadioButtonMenuItem("Torus");
        
        this.fiveFiveBoard = new JRadioButtonMenuItem("5x5");
        this.sevenSevenBoard = new JRadioButtonMenuItem("7x7");
        this.nineNineBoard = new JRadioButtonMenuItem("9x9");
        
        setComponents();
        setLocation(150, 150);
        pack();
    }
    
    private void setComponents() {
        add(new JLabel("Boardtype: "));
        add(new JLabel("Boardsize: "));
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(boardButton);
        buttonGroup1.add(moebiusButton);
        buttonGroup1.add(kleinButton);
        buttonGroup1.add(torusButton);
        boardButton.setSelected(true);
        
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(fiveFiveBoard);
        buttonGroup2.add(sevenSevenBoard);
        buttonGroup2.add(nineNineBoard);
        fiveFiveBoard.setSelected(true);
        
        add(this.boardButton);
        add(this.fiveFiveBoard);
        add(this.moebiusButton);
        add(this.sevenSevenBoard);
        add(this.kleinButton);
        add(this.nineNineBoard);
        add(this.torusButton);
        
        JButton playButton = new JButton("Play!");
        playButton.addActionListener(new playButtonListener());
        add(playButton);
    }
    
    private class playButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            container.removeAll();
            
            int boardSize;
            if(fiveFiveBoard.isSelected()) {
                boardSize = 5;
            } else if (sevenSevenBoard.isSelected()) {
                boardSize = 7;
            } else {
                boardSize = 9;
            }
            
            Board board;
            if(boardButton.isSelected()) {
                board = new StandardBoard(boardSize);
            } else if(moebiusButton.isSelected()) {
                board = new Moebius(boardSize);
            } else if(kleinButton.isSelected()) {
                board = new Klein(boardSize);
            } else {
                board = new Torus(boardSize);
            }
            GamePanel gamePanel = new GamePanel(board);
            
            container.add(gamePanel);
            container.revalidate();
        }
        
    }
    
    
}
