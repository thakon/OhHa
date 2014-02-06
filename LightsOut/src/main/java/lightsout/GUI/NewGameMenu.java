
package lightsout.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class NewGameMenu extends JPopupMenu {
    private JRadioButtonMenuItem boardButton;
    private JRadioButtonMenuItem moebiusButton;
    private JRadioButtonMenuItem kleinButton;
    private JRadioButtonMenuItem torusButton;

    public NewGameMenu() {
        super();
        
        this.boardButton = new JRadioButtonMenuItem("Standard");
        this.kleinButton = new JRadioButtonMenuItem("Klein");
        this.moebiusButton = new JRadioButtonMenuItem("Möbius");
        this.torusButton = new JRadioButtonMenuItem("Torus");
        
        setComponents();
        setLocation(150, 150);
    }
    
    private void setComponents() {
        add(new JLabel("Choose boardtype:"));
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(boardButton);
        buttonGroup.add(moebiusButton);
        buttonGroup.add(kleinButton);
        buttonGroup.add(torusButton);
        boardButton.setSelected(true);
        add(this.boardButton);
        add(this.moebiusButton);
        add(this.kleinButton);
        add(this.torusButton);
        
        JButton playButton = new JButton("Play!");
        playButton.addActionListener(new playButtonListener());
        add(playButton);
    }
    
    private class playButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(boardButton.isSelected()) {
                System.out.println("Jee, standardilauta!");
            } else if(moebiusButton.isSelected()) {
                System.out.println("Jee, Möbiuksen nauha!");
            } else if(kleinButton.isSelected()) {
                System.out.println("Jee, Kleinin pullo!");
            } else {
                System.out.println("Jee, Torus!");
            }
            setVisible(false);
        }
        
    }
    
    
}
