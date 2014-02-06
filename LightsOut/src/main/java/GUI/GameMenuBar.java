
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameMenuBar extends JMenuBar {
    
    public GameMenuBar() {
        super();
        setComponents();
    }
    
    private void setComponents() {
        JMenu menu1 = new JMenu("Game");
        
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(new newGameListener());
        menu1.add(newGame);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new exitListener());
        menu1.add(exit);
        
        add(menu1);
    }
    
    private static class newGameListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            NewGameMenu popUp = new NewGameMenu();
            popUp.setVisible(true);
        }
    }
    
    private static class exitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }
}
