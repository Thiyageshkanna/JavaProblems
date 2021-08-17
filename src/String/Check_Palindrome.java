package String;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string to check palindrome or not:");
        String input=scn.nextLine();
        int start=0;
        int end=input.length()-1;
        boolean isPalindrome=true;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("The Given String is Palindrome: "+input);
        }
        else {
            System.out.println("It is not a palindrome:"+input);
        }
    }
}
