package chap6;

public class Personnel {

    String name = "Personnel";

    void PrintName() {
        System.out.println(" I'm " + name + ".");
    }

    void getaddress() {
        System.out.println(" I live in bkk ");

    }
}//end class Personel

class Manager extends Personnel {

    String name = "Manager";

    void PrintName() {
        System.out.println(" I'm " + name + ".");
    }

    void getDepartment() {
        System.out.println(" I work in the accounting department ");
    }
}//end class Manager

class Staff extends Personnel {

    String name = "Staff";

    void PrintName() {
        System.out.println(" I'm " + name + ".");
    }
}//end class Staff
