package Arrays;

import java.util.Scanner;

public class Check_Array_is_sorted_or_not {
    public static void main(String[] args) {
        System.out.println("Welcome to \"3 Billion Devices Run Java\" Club ");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the total size of an array : Condition only upto Five:");
        int totalNumber=scn.nextInt();
        int[] arr=new int[totalNumber];
        for(int i=0;i< arr.length;i++){
            String[] arrayOfLetters={"First","Second","Third","Fourth","Fifth"};
            System.out.println("Enter the "+arrayOfLetters[i]+" element:");
            arr[i]=scn.nextInt();
        }
//        boolean checking
        boolean checks=isSorted(arr);
        if(checks){
            System.out.println("The entered array is an sorted array");
        }
        else{
            System.out.println("The entered array is not an sorted array");
        }
    }

    static boolean  isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){

               return false;
            }
        }
        return true;
    }
}
