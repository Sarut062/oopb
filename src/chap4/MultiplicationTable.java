package chap4;
public class MultiplicationTable {
    public static void main(String agrs[]){
        System.out.print("----------MultiplicationTable------------");
        System.out.print("\n-----------------------------------------\n\n");
        int c;
        for (int a= 2;a<=12;a++ ){
           for (int b=1 ;b<=12 ;b++ ){
               c= a*b;
               System.out.print(" "+c+" ");
            }
               System.out.print(" \n\n ");
        }
    }
}

