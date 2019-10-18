
import chap4.Circle;

public class CallCircle {
    public static void main(String[] args) {
         Circle cc = new Circle(5.5);
        System.out.println("R :"+Math.floor(cc.getRadius()));
        System.out.println("Area :"+Math.floor(cc.computeArea()));
        System.out.println("Circumferenceรอบวง :"+Math.floor(cc.computeCircumference()));
        System.out.println("Diameterผ่ารอบศูนย์กลาง :"+Math.floor(cc.computeDiameter()));
        
        System.out.println(Math.floor(125.562));
    }
}//end
