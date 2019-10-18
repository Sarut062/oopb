package chap3;

public class Empyee {
    static int id = 1001;
    String name = "Nalinee";
    int age = 35;
    
    static void work(){
        System.out.println("work()");
    }
    void getSalary(){
        System.out.println("gesSalary()");
    }
    public static void main (String[] args){
       System.out.println ("Id : "+id);
       work();
       Empyee em = new Empyee();
       System.out.println("Name :"+em.name);
       System.out.println("Name :"+em.age);
       em.getSalary();
       
        
    }
}
