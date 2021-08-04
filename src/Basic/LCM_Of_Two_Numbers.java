package Basic;

import java.util.Scanner;

public class LCM_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int first= scn.nextInt();
        int second= scn.nextInt();
        int lcm=1;

        int answer=Math.max(first,second);
        int multiply=first*second;
        for(int i=answer;i<=multiply;i++){
            if(i%first==0 && i%second==0){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
}
