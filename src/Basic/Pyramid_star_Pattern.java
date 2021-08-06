package Basic;

import java.util.Scanner;

public class Pyramid_star_Pattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        for(int i=1;i<=userInput;i++){
           for (int j=1;j<=(userInput-i);j++){
               System.out.print(" ");
           }
           for (int k=1;k<=(2*i)-1;k++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
