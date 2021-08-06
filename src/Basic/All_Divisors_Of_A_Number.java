package Basic;

import java.util.Scanner;

public class All_Divisors_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to list all divisors of a Number \r");
        System.out.println();
        int userInput=scn.nextInt();
        for(int i=1;i<=userInput;i++){
            if(userInput%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
