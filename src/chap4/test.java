package chap4;

import java.util.Scanner;

public class test{

    public static void main(String[] args) {
        String sentence;
        String len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Sentence : ");
        sentence = sc.nextLine().toLowerCase();
        System.out.println("The sentence contains lowercase : "+sentence.toLowerCase());
        len = sentence.trim();
        System.out.println("The sentence contains alphabets : "+len.length());

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a'
                    ||
                    sentence.charAt(i) == 'e'
                    || 
                    sentence.charAt(i) == 'i'
                    || 
                    sentence.charAt(i) == 'o'
                    || 
                    sentence.charAt(i) == 'u' 
                    ) {
                count++;
            }
                System.out.println("The sentence contains vowels : " + count);
        int a;
        a = sentence.length() - count;
        System.out.println("The sentence contains not vowels : "+a);
        }
        int countNum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '1'
                    ||
                    sentence.charAt(i) == '2'
                    || 
                    sentence.charAt(i) == '3'
                    || 
                    sentence.charAt(i) == '4'
                    || 
                    sentence.charAt(i) == '5' 
                    ||
                    sentence.charAt(i) == '6'
                    || 
                    sentence.charAt(i) == '7'
                    || 
                    sentence.charAt(i) == '8'
                    || 
                    sentence.charAt(i) == '9' 
                    || 
                    sentence.charAt(i) == '0' 
                    ) {
                countNum++;
            }
        }
        System.out.println("Number : "+countNum);
        int countSp = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '+'
                    ||
                    sentence.charAt(i) == '-'
                    || 
                    sentence.charAt(i) == '*'
                    || 
                    sentence.charAt(i) == '/'
                    ) {
                countSp++;
            }
        }
    }
}
        
 