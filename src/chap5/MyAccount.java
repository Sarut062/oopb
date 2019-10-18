package chap5;

public class MyAccount {

    public static void main(String[] args) {
//        BankAccount ba   =  new BankAccount(172,"sarut",100000.0);
//        System.out.println("ba = "+ba);
//        ba.printDetails();
//        ba.deposit(500);
//        ba.deposit(300);
//        ba.withdraw(500);
//        ba.withdraw(300);
//        ba.printDetails();
//        

//        SavingAccount sa = SavingAccount.createSA(2001,"Sarut", 50);
//        System.out.println("sa = "+sa);
//        if (sa==null) {
//            System.out.println("ต้องเปิดบัญชีขั้นต่ำ 100 บาทครับ");
//        }else{
//            sa.printDetails();
//            
//            sa.deposit(100);
//            sa.printDetails();
//            
//            
//            sa.withdraw(170);
//            sa.printDetails();
//}
        FixedDepositAccount sa = FixedDepositAccount.createSM(100, " Sarut ", 1000);
        System.out.println("sa " + sa);
        if (sa == null) {
            System.out.println("ต้องฝากเงินขั้นต่ำ 1000 บาทครับ");
        } else {
            sa.printDetails();
            sa.deposit(4000);
            sa.printDetails();

        }
    }
}
