package chap7;

import javax.swing.*;

public class JDialogExample {
    
    public static void main(String[] args) {
        JFrame frm;
        JDialog dlg;
        
        frm = new JFrame("Frame");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
        dlg = new JDialog(frm, "JDialog", true);
        dlg.setSize(100, 100);
        dlg.setVisible(true);
        
    }
    
}
