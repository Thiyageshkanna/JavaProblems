package Basic;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for Prime Factors \r");
        int userInput=sc.nextInt();
        for(int i=2;i<userInput;i++){
            while (userInput%i==0){
                System.out.print(i +" ");
                userInput=userInput/i;
            }
        }
        if(userInput>2){
            System.out.print(userInput);
        }
    }
}
