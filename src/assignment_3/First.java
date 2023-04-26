package assignment_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class First {


    public static int Minimum  (int arr[]){
        Arrays.sort(arr);
        return arr[0];

    }


    public static int Max  (int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double Avarage (int arr[]){
        double avg = 0;
        for(int number : arr){
            avg+=number;

        }
        return avg/ arr.length;
    }

    public static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("The sorted array is = ");
        for (int number : arr ) {
            System.out.print("  "+ number);
        }
    }


    public static void main(String[] args) {
        System.out.println("The Max number is = " + Max(new int[]{1,5,3,8,2}));
        System.out.println("The Minimum number is = " + Minimum(new int[]{1,5,3,8,2}));

        System.out.println("The Avarage number is = " + Avarage(new int[]{1,5,3,8,2}));


        Sorting(new int[]{15,50,-3,0});


    }


}
