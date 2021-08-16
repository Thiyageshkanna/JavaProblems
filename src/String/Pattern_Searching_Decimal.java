package String;

import java.util.Scanner;

//Input:12.234;
//output:234; means After Decimal Points
public class Pattern_Searching_Decimal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        double input=scn.nextDouble();
        String convert=Double.toString(input);
        int position=convert.indexOf(".");
        if(position>=0){
            position+=1;
            System.out.print("Now the values after decimal are ");
            while(position<=convert.length()-1){
                System.out.print(convert.charAt(position)+" ");
                position++;
            }

        }
    }
}
