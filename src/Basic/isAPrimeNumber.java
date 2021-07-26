package Basic;


import java.util.Scanner;

public class isAPrimeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int totalCount= scn.nextInt();
        for(int i=0;i<totalCount;i++){
            int userInput= scn.nextInt();
          int count =0;
          for(int div=2;div*div<=userInput;div++){
              if(userInput%div==0){
                  count++;
                  break;
              }
          }
          if(count==0){
              System.out.println("prime number");
          }
          else{
              System.out.println("not prime");
          }
        }
    }
}