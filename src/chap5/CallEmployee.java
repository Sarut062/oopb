package chap5;

public class CallEmployee {

    public static void main(String[] args) {
        Employee em = new Employee("135", "Sarut Maeroh");
        em.setSalary(25000);
        em.setAddress(new Address(" Moo.7 Songkhla"));
        em.setDepartment(new Department("1", "Software Develoment"));
        System.out.println("Name : " + em.getEmpName());
        System.out.println("Salary : " + em.getSalary());
        System.out.println("Address : " + em.getAddress().getRegisterAddress());
        System.out.println("Department : " + em.getDepartment().getDepName());

    }

}
