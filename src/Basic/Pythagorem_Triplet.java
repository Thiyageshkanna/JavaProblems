package Basic;

import java.util.Scanner;

public class Pythagorem_Triplet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int first=scn.nextInt();
        int second=scn.nextInt();
        int third= scn.nextInt();
        int temp=0;
        if(first>=second && first>=third){
            temp=third;
            third=first;
            first=temp;

        }
        else if(second>=first && second>=third){
            temp=third;
            third=second;
            second=temp;
        }
        System.out.println(first +" "+second+" "+third);
      if((first*first) + (second*second) ==third*third   ){
          System.out.println("True");
      }
    }
}
