package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class cocubes_traverse_of_array_and_multiply {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int totalNumber=scn.nextInt();
        int[] beforeSort=new int[totalNumber];

        for(int i=0;i<totalNumber;i++){
            beforeSort[i]= scn.nextInt();
        }

        int temp;
        //Sorting
        for(int i=0;i<beforeSort.length;i++){
            for(int j=i+1;j<beforeSort.length;j++){
                if(beforeSort[i]>beforeSort[j]){
                    temp=beforeSort[i];
                    beforeSort[i]=beforeSort[j];
                    beforeSort[j]=temp;
                }
            }
        }
        int sum=0;
        for(int i=0;i<beforeSort.length;i++){
            sum+=beforeSort[i]*i;
        }
        System.out.println(sum);
    }
}
