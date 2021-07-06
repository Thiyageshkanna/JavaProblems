package Basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        int flag=0;
        int userInput;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for Prime Number");
        userInput=sc.nextInt();
        number=userInput/2;
        if(userInput==0 || userInput==1){
            System.out.println(userInput+ " is not a Prime Number");
            flag=1;
        }
        for(int i=2;i<=number;i++){
            if(userInput%i==0){
                System.out.println(userInput+" is not a Prime Number");
                flag=1;
                break;
            }
        }
        if (flag==0)
            System.out.println(userInput+" is a Prime Number");
    }
}
