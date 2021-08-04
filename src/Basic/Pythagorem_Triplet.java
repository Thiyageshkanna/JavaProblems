package Basic;

import java.util.Scanner;

public class Pythagorem_Triplet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int first=scn.nextInt();
        int second=scn.nextInt();
        int third= scn.nextInt();
        int max=first;
        Boolean flag;
        if(second>=max){
            max=second;
        }
        else if(third>max){
            max=third;
        }
        if(max==first){
            flag=(second*second)+(third*third)==(first*first);
            System.out.println(flag);
        }
        else if(max==second){
            flag=(first*first)+(third*third)==(second*second);
            System.out.println(flag);
        }
        else  {
            flag=(first*first)+(second*second)==(third*third);
            System.out.println(flag);
        }



    }
}
