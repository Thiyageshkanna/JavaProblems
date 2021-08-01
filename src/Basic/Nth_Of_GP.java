package Basic;

import java.util.Scanner;

public class Nth_Of_GP {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the values of a , d and n \r");
        int a=scn.nextInt();
        int r= scn.nextInt();
        int n= scn.nextInt();
        int result=a*(int)(Math.pow(r,n-1));
        System.out.println("The result of GP is "+result);

        for(int i=1;i<n;i++){
            int finalResult=a*r;
            System.out.print(finalResult+" ");
            a=finalResult;
        }
    }
}
