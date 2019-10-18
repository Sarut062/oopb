package chap7;

import java.awt.Color;
import javax.swing.*;

public class JPanelExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;

        frm = new JFrame("JPanel Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnl = new JPanel();
        pnl.setBackground(Color.YELLOW);

        frm.add(pnl);
        frm.setVisible(true);

    }

}
