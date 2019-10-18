package chap6;

public class PolymorphismExample {

    public static void main(String[] args) {
        Personnel ps = new Manager();
        ps.getaddress();
        //ps.getDepartmaent();
        
        Manager man = (Manager)ps;
        man.getDepartment();
    }

}
