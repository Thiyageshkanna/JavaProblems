package Basic;

import java.util.Scanner;

public class Rotate_a_number_with_userInput {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int number=scn.nextInt();
        int position=scn.nextInt();

//        Count total Numbers
        int count=0;
        int temp=number;
        while (temp>0){
            temp/=10;
            count++;
        }

        position=position%count;
        if(position<0){
            position=position+count;
        }

        int division=1;
        int multiply=1;
        for(int i=1;i<=count;i++){
            if(i<=position){
                division=division*10;
            }else {
                multiply=multiply*10;
            }
        }

        int remainingNumbers=number/division;
        int lastDigits= number % division;

        int result= lastDigits*multiply+remainingNumbers;
        System.out.println(result);





    }
}
