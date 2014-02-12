
package lightsout.GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameMenuBar extends JMenuBar {
    
    private Container container;
    
    public GameMenuBar(Container container) {
        this.container = container;
        setComponents();
    }
    
    private void setComponents() {
        JMenu menu1 = new JMenu("Game");
        
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(new newGameListener(container));
        menu1.add(newGame);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new exitListener());
        menu1.add(exit);
        
        add(menu1);
    }
    
    private static class newGameListener implements ActionListener {
        
        private Container container;

        public newGameListener(Container container) {
            this.container = container;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            NewGameMenu newGame = new NewGameMenu(container);
            newGame.setVisible(true);
        }
    }
    
    private static class exitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }
}
