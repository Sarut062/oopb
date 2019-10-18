package chap4;

import java.util.Scanner;

public class CircleCalculation {
    public static void main (String[]args){
        int menu = 0;
        
        System.out.println("---------------Menu----------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Calculate Diameter(เส้นผ่านศูนย์กลาง)");
        System.out.println("2 : Calculate(เส้นรอบวง)");
        System.out.println("3 : Calculate Area(พื้นที่)");
        System.out.println("4 : All");
        System.out.println("------------------------------------");
        do{
       
        Scanner sc = new Scanner(System.in);
        System.out.print("PleaseEnter Menu[0-4]: ");
        menu = sc.nextInt();
        switch(menu){
            case 1:
            System.out.print("Enter radius(รัศมี): ");
            double radius  = sc.nextDouble();
            Circle cc = new Circle(radius);
            System.out.println("Radius :"+Math.floor(cc.getRadius()));
            break;
            case 2:
            System.out.print("Diameter : ");
            double radius1  = sc.nextDouble();
            Circle cc1 = new Circle(radius1);
            System.out.println("Diameterผ่ารอบศูนย์กลาง :"+Math.floor(cc1.computeDiameter()));
           
            break;
             case 3:
            System.out.print("Circumference : ");
            double radius2  = sc.nextDouble();
            Circle cc2 = new Circle(radius2);
            System.out.println("Circumferenceรอบวง :"+Math.floor(cc2.computeCircumference()));

            break;
             case 4:
            System.out.print("Area : ");
            double radius3  = sc.nextDouble();
            Circle cc3 = new Circle(radius3);
            System.out.println("Area :"+Math.floor(cc3.computeArea()));
            break;
        }          
        System.out.println("menu= "+menu);
       
        }while (menu <4 && menu >0);
    }
}
                