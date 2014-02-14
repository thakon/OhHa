package lightsout.GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GameMenuBar extends JMenuBar {

    private Container container;

    public GameMenuBar(Container container) {
        this.container = container;
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

        JMenu menu2 = new JMenu("Info");

        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new aboutListener());
        menu2.add(about);

        add(menu2);
    }

    private class newGameListener implements ActionListener {

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

    private static class aboutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Soita banjoa ja ole onnellinen!", "About", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
