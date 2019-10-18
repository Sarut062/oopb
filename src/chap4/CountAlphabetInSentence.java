package chap4;

import java.util.Scanner;

public class CountAlphabetInSentence {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        
        do{ 
            System.out.print("Enter Sentence : ");
        String sentence = sc.nextLine().toLowerCase().replace(" "," ");
        System.out.println("Input :"+sentence.toLowerCase()); //แสดงผลแบบพิมเล็ก
        System.out.println("Input :"+sentence.toUpperCase()); //แสดงผลแบบพิมใหญ่
        System.out.println("ความยาว :"+sentence.length());    //นับจำนวน
        
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
        if(sentence.charAt(i) == 'a' || // เช็คว่าตัวอักษรเป็น A หรือ a
            sentence.charAt(i) == 'e' || // เช็คว่าตัวอักษรเป็น E หรือ e
            sentence.charAt(i) == 'i' || // เช็คว่าตัวอักษรเป็น I หรือ i
            sentence.charAt(i) == 'o' || // เช็คว่าตัวอักษรเป็น O หรือ o 
            sentence.charAt(i) == 'u' )  // เช็คว่าตัวอักษรเป็น U หรือ u
            {
             count++; // ทำการนับเมื่อเป็น A E I O U 
            }
        }	
            System.out.println("The sentence contains vowels : = " + count); // แสดงจำนวนสระที่นับและเก็บไว้ในตัวแปร count
            int a ;
            a = sentence.length()-count;
            System.out.println("The sentence contains vowels : = " + a); //แสดงจำนวนที่ไม่ไช่สระที่นับและเก็บไว้ในตัวแปร count
                
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
                System.out.println("Here countVowel = "+count);
                System.out.println("Here countNotVowel = "+count);
                System.out.println("Continus [y/s] : ");
                ans = sc.next();
            }while(ans.equalsIgnoreCase("y"));

            }
}


