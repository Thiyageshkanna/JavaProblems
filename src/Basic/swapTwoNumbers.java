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
//        Here creating temporary variable You know the rest
        temp=b;
        b=a;
        a=temp;

        System.out.println("The Swapped Values are "+a+" "+b);

    }
}
