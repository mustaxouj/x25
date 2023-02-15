/*
package presentation.vue.palette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import presentation.vue.SideMenuPanel;

public class MainFrame extends JFrame {
    private Container mainContainer;
    private SideMenuPanel menuPanel;
    private static final Color bgColor = new Color(45, 71, 132);
    private static final Font buttonsFont = new Font("optima", Font.BOLD, 17);

    private void initPanels() {
        java.util.List<String> buttonsNames = new ArrayList<>(
                Arrays.asList("Chercher", "ajouter", "Modofier", "supprimer"));
        menuPanel = new SideMenuPanel(Color.WHITE, bgColor, buttonsFont);

    }

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private void initContainer() {

        initPanels();
        mainContainer = getContentPane();
        mainContainer.setBackground(new Color(45, 71, 132));
        mainContainer.setLayout(new BorderLayout());
        mainContainer.add(menuPanel, BorderLayout.WEST);

    }

    public MainFrame(String title) {
        initContainer();
        setTitle(title);
        setLocation(0, 0);
        setSize(screenSize);

    }

    public static void main(String[] args) {
        new MainFrame("test");

    }
}
*/
