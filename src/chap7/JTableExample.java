package chap7;

import javax.swing.*;

public class JTableExample {

    public static void main(String[] args) {
        JFrame frm;
        JTable tblData;
        JScrollPane scp;
        
        frm = new JFrame("JTable Example");
        frm.setSize(450, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Object rowData[][] = {
            {"5001", "Yada Jaidee", "yadaj@gmail.com"},
            {"5002", "Manee Siri", "manees@gmail.com"},
            {"5003", "Piti Metta", "pitim@gmail.com"},
            {"5004", "Peera Sukjai", "peeras@gmail.com"},};
        String colummNames[] = {"ID", "Name", "e-mail"};
        tblData = new JTable(rowData, colummNames);
        scp = new JScrollPane(tblData);
        
        frm.add(scp);
        frm.setVisible(true);
    }
}
