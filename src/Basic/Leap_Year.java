package Basic;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to Check");
        int leapYear=scn.nextInt();

        if(leapYear%4==0 && (leapYear%100!=0 || leapYear%400==0) ){
            System.out.println(leapYear+" It is a leap year");
        }
        else {
            System.out.println(leapYear+" It is not a leap year");
        }
    }
}
