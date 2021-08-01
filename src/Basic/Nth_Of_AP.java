package Basic;

import java.util.Scanner;

public class Nth_Of_AP {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Difference");
        int d=scn.nextInt();  //Difference
        System.out.println("Enter Starting Number");
        int a= scn.nextInt(); //Starting Number
        System.out.println("Enter Final Number");
        int n= scn.nextInt(); //Final Number

        int result=a+((n-1)*d); //Formula

        System.out.println("The nth element is "+result);

//        To print the list of number with given Input
        System.out.print(a+" ");
        for(int i=1;i<n;i++){
            a= a+d;
            System.out.print(a+" ");

        }
    }
}
