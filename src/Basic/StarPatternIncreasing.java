package Basic;

import java.util.Scanner;

public class StarPatternIncreasing {
    public static void main(String[] args) {
        int first;
        int second;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Star to print : ");
        first=sc.nextInt();
        for (int i=1;i<=first;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
