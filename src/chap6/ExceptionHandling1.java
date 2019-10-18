package chap6;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        try {
            int zero = 10;
            int result = 1500 / zero;

        } catch (ArithmeticException e) { //ถ้าไม่ได้ ไม่เกิดException
            System.out.println("ERROR : หารด้วย 0 ไม่ได้คะ");
        } catch (Exception e) { //**//**//
            System.out.println("ERROR : Objiect มีค่าเป็น null");
        }
        finally{
            System.exit(0);
            System.out.println("BYE BYE    EEEEEEEEEEEE");
        }
//        try {
//            String str = null;
//            System.out.println("str = " + str.toLowerCase());
//
//        } catch (NullPointerException e) {
//            System.out.println("ERROR : Object มีค่าเป็น null");
//        }
//
//        try {
//            int x[] = new int[2];
//            x[0] = 0;
//            x[2] = 1;
//            x[3] = 2;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ERROR : อ้างอิงเกินขนาดชองอาเรย์");
//        }
//
//        try {
//            int num = Integer.parseInt("aa");
//            System.out.println("num = " + num);
//
//        } catch (Exception e) {
//            System.out.println("ERROR : ไม่สามารถแปลงข้อความเป็นตัวเลข");
//        }
    }
}
