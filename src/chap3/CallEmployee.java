package chap3;

public class CallEmployee {
        public static void main (String[]args){
            System.out.println("Id :"+Empyee.id);
            Empyee.work();
            
            Empyee em = new Empyee();
            System.out.println("Name :"+em.name);
            System.out.println("Age :"+em.age);
            em.getSalary();
        }
    }
    
