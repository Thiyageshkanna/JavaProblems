package Basic;

import java.util.Scanner;

public class myPrimeNumberMethod {
    public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter the number to check whether Prime number or Not");
            int userInput= scn.nextInt();
            boolean isPrime=true;
            if(userInput==0 || userInput==1){
                System.out.println("It is not a Prime Number");
            }
            for(int i=2;i<userInput/2;i++){
                if(userInput%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(userInput +" is a Prime Number");
            }
            else{
                System.out.println(userInput+ " is not a Prime Number");
            }
    }
}
