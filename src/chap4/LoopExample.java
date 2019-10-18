package chap4;

import java.util.Scanner;

public class LoopExample {
    public static void main (String[]args){
        int menu = 0;
        do{
        System.out.println("---Menu---");
        System.out.println("1 :Input Data");
        System.out.println("2 :Show Data");
        System.out.println("3 :Exit");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter menu:");
        menu = sc.nextInt();
        System.out.println("menu= "+menu);
       
        }while(menu<5);
    }
}
       