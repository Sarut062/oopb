public class CallStudent {
public static void main(String[] args) {        
        Student rut = new Student();
        System.out.println(">>" + rut);
        rut.enrollment();
        rut.payment();
        rut.addCourse();
        rut.dropCourse();
        System.out.println("-------------------");
        GraduateStudent yaya = new GraduateStudent();
        yaya.enrollment();
        
        yaya.enrollment();
        yaya.addCourse();
        yaya.dropCourse();
        yaya.payment();
        yaya.oralExamination();
        yaya.thesisExamination();
}  
}//end class
