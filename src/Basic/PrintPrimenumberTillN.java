package Basic;

import java.util.Scanner;

public class PrintPrimenumberTillN {
    public static void main(String[] args) {
                Scanner scn=new Scanner(System.in);
                int start=scn.nextInt();
                int end=scn.nextInt();

               for(int i=start;i<=end;i++){
                   boolean isPrime=true;
                   for(int j=2;j<=Math.sqrt(end);j++){
                       if(i%j==0){
                           isPrime=false;
                           break;
                       }
                   }
                   if(isPrime){
                       System.out.println(i);
                   }
               }

    }

}
