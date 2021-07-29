package Basic;

import java.util.Scanner;

public class swapTwoNumbers {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the First Value :");
        int a=scn.nextInt();
        System.out.println("Enter the Second Value :");
        int b=scn.nextInt();

        int temp;
//      Here creating temporary variable You know the rest
        temp=b;
        b=a;
        a=temp;

        System.out.println("The Swapped Values are "+a+" "+b);

        String firstName="Thiyagesh";
        String lastName="Kanna";
        System.out.println("Before Swapping "+firstName+" "+lastName);
        String tempString;
        tempString=lastName;
        lastName=firstName;
        firstName=tempString;
        System.out.println("After Swapping "+firstName+" "+lastName);



    }
}
