package Basic;

import java.util.Scanner;

public class GCD_of_a_two_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int first= scn.nextInt();
        int second=scn.nextInt();
        int gcd=1;
        int minimum=Math.min(first,second);
        for(int i=1;i<=minimum;i++){
            if(first%i==0 && second%i==0){
                gcd=i;

            }
        }
        System.out.println("The GCD Of Two Numbers is "+gcd);
    }
}
