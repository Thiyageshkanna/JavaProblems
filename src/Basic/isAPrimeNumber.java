package Basic;


import java.util.Scanner;

public class isAPrimeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int total = scn.nextInt();
        for(int i=0;i<total;i++){
            int userInput= scn.nextInt();
            int count =0;
            for(int j=2;j<=userInput/2;j++){
                if(userInput%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }

        }

    }
}