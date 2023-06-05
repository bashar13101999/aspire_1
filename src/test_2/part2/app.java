package test_2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class app {
    public static int[] rarr(int[] r1){

        int[] r2 = new int[r1.length];

        for(int i=0 ; i < r1.length ; i++){

            r2[i] = r1[r1.length-1-i] ;




        }

        return r2;

    }

    public static void main(String[] args) {


        int arr[] = rarr( new int[] {1,2,3});

        for(int i : arr){

            System.out.println(i);
        }

        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,5,10,2,8,11,12};


        Map<String, List<Integer>> numberGroups = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.groupingBy(n -> n < 5 ? "Less than 5" : (n >= 5 && n <= 10) ? "Between 5 and 10" : "Greater than 10"));

        System.out.println("Number groups: " + numberGroups);



    }

}
