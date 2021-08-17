package String;

import java.util.Scanner;

public class Reverse_Of_A_String {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String to Reverse:");
        String input=scn.nextLine();
        int position=input.length()-1;
        while(position>=0){
            System.out.print(input.charAt(position));
            position--;
        }
    }
}
