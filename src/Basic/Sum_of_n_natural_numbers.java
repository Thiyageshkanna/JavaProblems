package Basic;

import java.util.Scanner;

public class Sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput= scn.nextInt();
        int result=0;

        for(int i=1;i<=userInput;i++){
            result=result+i;
            //or
            //initial+=i;

        }
        System.out.println("Naive Method "+result);

        System.out.println("Efficiency Method "+ arithmeticMethod(userInput));
    }
    static int arithmeticMethod(int number){
        return number*(number+1)/2;
    }

}
