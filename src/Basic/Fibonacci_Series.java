package Basic;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of elements to be displayed in fibonacci series \r");
        int userInput=scn.nextInt();

        int first=0;
        int second=1;
        System.out.print(first +" "+second+" ");
        for(int i=2;i<=userInput;i++){
            int result=first+second;
            System.out.print(result+" ");
            first=second;
            second=result; // not Swapping first and two ...swap first and swap result
        }
    }
}
