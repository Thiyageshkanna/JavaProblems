package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class isAPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int[] userInput =new int[count];

        int totalUserInput=userInput.length;
        for(int i=0;i<totalUserInput;i++){
            userInput[i]=sc.nextInt();
        }
        int m=0,flag=0;
        for(int i=0;i<totalUserInput;i++){

            m=userInput[i]/2;
            if(m==0 || m==1){
                System.out.println("not prime");
            }
            else{
                for(int k=0;k<totalUserInput;k++){
                    for(int j=2;j<=m;j++){
                        if(userInput[k]%j==0){

                            System.out.println("not prime");
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==0){
                    System.out.println("prime");
            }

        }

        }
    }
}
