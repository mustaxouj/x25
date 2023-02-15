/*
package presentation.vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SideMenuPanel extends JPanel {

    private Color backGroundColor, buttonsTextColor;
    private Font panelFont;
    private Map<String, JButton> buttons;

    private void initButtons(java.util.List<String> buttonsNames) {
        buttons = new HashMap<>();
        buttonsNames.forEach(nameOfButton -> {
            JButton btn = new JButton(nameOfButton);
            btn.setFont(panelFont);
            btn.setForeground(buttonsTextColor);
            buttons.put(nameOfButton, btn);

        });
    }

    private void initPanel(java.util.List<String> buttonsNames) {
        initButtons(buttonsNames);
        setBackground(backGroundColor);
        setLayout(new GridLayout(buttonsNames.size(), 1, 5, 5));
        buttons.forEach((name, button) -> add(button));
    }

    public SideMenuPanel(Color bgClr, Color btnTextClr, Font font, java.util.List<String> buttonsNames) {
        this.backGroundColor = bgClr;
        this.buttonsTextColor = btnTextClr;
        this.panelFont = font;
        initButtons(buttonsNames);
        this.setBackground(bgClr);

    }

    public SideMenuPanel(Color bgClr, Color btnTextClr, Font font) {
        this.backGroundColor = bgClr;
        this.buttonsTextColor = btnTextClr;
        this.panelFont = font;
    }

    public static void main(String[] args) {
        Font buttonsFont = new Font("optima", Font.BOLD, 17);
        new SideMenuPanel(Color.black, Color.white, buttonsFont);
    }

}
*/
