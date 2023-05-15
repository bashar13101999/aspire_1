package assignment_5;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;


public class Application {

    public static int midnum (int[] arr){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);
        }
        int middleIndex = arr.length / 2;
        int middleNumber = 0;
        for (int i = 0; i <= middleIndex; i++) {
            middleNumber = pq.remove();
        }
        return middleNumber;



    }


    public static boolean Check(String str) {

        Deque<Character> Q = new ArrayDeque<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                Q.push(x);

            } else if (x == ')') {
                if (Q.isEmpty() || Q.pop() != '(') {
                    return false;
                }
            } else ;
        }

        return Q.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(Check("(((())))"));
        System.out.println(Check("))(()()(())"));
        System.out.println(Check(")))"));

        System.out.println("-------------------------------------------------");




        int[] array = {11,5,8,6,9,10,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : array) {
            pq.add(num);
        }
        int middleIndex = array.length / 2;
        int middleNumber = 0;

        for (int i = 0; i <= middleIndex; i++) {
            middleNumber = pq.remove();
        }

        System.out.println("Middle number: " + middleNumber);
    }


    }

