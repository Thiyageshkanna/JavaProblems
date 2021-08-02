package Basic;

import java.util.Scanner;

public class Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        String converted=Integer.toString(userInput);
        for(int i=0;i<converted.length();i++){
            System.out.println(converted.charAt(i));
        }
    }
}

