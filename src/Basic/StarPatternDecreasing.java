package Basic;

import java.util.Scanner;

public class StarPatternDecreasing {
    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the number of starts to print in Descending Order : ");
        int start= userInput.nextInt();
        for(int i=start;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
