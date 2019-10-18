package chap6;

public class StaticAndDynamicBinding {

    public static void main(String[] args) {
        Personnel ps = new Personnel();
        System.out.println(ps.name + ",");
        ps.PrintName();

        Personnel man = new Manager();
        System.out.println(man.name + ",");
        man.PrintName();

        Personnel sta = new Staff();
        System.out.println(man.name + ",");
        sta.PrintName();
    }
}
