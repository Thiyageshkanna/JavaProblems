package Basic;

import java.util.Scanner;

public class inverse_of_a_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        int lastDigit=0;
        int reversed=0;
        int op=1;
        while(userInput>0){
            lastDigit=userInput%10;
            int id=op;
            int ip=lastDigit;
            reversed=reversed+id*(int)(Math.pow(10,ip-1));
            userInput/=10;
            op++;
        }
        System.out.println(reversed);
    }
}
