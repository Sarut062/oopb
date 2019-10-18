package chap7;

import javax.swing.*;

public class JFrameExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm = new JFrame("JFRAME Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
}
