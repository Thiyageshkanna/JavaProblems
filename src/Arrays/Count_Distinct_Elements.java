package Arrays;

import java.util.Scanner;

public class Count_Distinct_Elements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the total size of an array");
        int totalSize=scn.nextInt();

        int[] arr=new int[totalSize];

        System.out.println("Enter the array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
//        Counting Distinct
        int count=0;
        boolean isDistinct=true;
        for(int i=0;i< arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    isDistinct=false;
                    break;
                }
            }

            if(isDistinct){
                count++;
            }

        }
        System.out.println(count);
    }
}
