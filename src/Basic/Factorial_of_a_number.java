package Basic;

import java.util.Scanner;

public class Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        int i=1;
        while (userInput>0){
            i=i*userInput;
            userInput--;
        }
        System.out.println(i);

    }
}
