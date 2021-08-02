package Basic;
import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        int count=0;
        while(userInput>0){
            count++;
            userInput/=10;
        }
        System.out.println(count);
    }
}
