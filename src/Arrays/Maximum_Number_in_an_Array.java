package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Number_in_an_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the total Number of Values");
        int totalArray=scn.nextInt();

        int[] arr=new int[totalArray];
        System.out.println("Enter the Array Elements");

        for (int i=0;i<totalArray;i++){
            arr[i]=scn.nextInt();
        }
//        Finding largest
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
//         for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }
        System.out.println(max);
    }
}
