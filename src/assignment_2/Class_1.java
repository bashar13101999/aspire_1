package assignment_2;

public class Class_1 {


        public static int evenSum(int start,  int end){
            return start>end? 0: start%2 == 0? start+evenSum(start+2,end):evenSum(start+1,end);
        }

        public static int oddSum(int start,  int end){
            return start>end? 0: start%2 != 0? start+oddSum(start+2,end):oddSum(start+1,end);
        }

        public static int mod(int start,  int end){
            return start>end? 0: start%7 == 0? start+mod(start + 7,end) : mod(start+1,end);
        }


        public static void main(String[] args) {
            System.out.println("sum of even numbers: " + evenSum(1, 100));
            System.out.println("sum of odd numbers:  " + oddSum(1, 100));
            System.out.println("sum of mod numbers:  " + mod(1, 100));
        }

    }


