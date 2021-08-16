package String;
// Input1:"Thiyagesh Kanna"
// Input2:"Kanna";

import java.util.Scanner;

// Output:10
public class Pattern_Searching_Problem {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Input String");
        String input1=scn.nextLine();
        System.out.println("Enter the pattern to Search");
        String input2=scn.nextLine();

        int position=input1.indexOf(input2);
        while (position>=0){
            System.out.print(position+" ");
            position=input1.indexOf(input2,position+1);
        }
    }
}
