package assignment_1;

public class loops {

    public static void main(String[] args) {


        int even_sum_for = 0;
        int even_sum_while = 0;
        int even_sum_do = 0;

        int odd_sum_for = 0;
        int odd_sum_while = 0;
        int odd_sum_do = 0;

        int mod_sum_for = 0;
        int mod_sum_while = 0;
        int mod_sum_do = 0;

        System.out.println("***********  even  ***********");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) even_sum_for += i;
        }
        System.out.println("sum of even numbers (using for loop) : " + even_sum_for);


        int i = 0;
        while (i <= 100) {

            if (i % 2 == 0) even_sum_while += i;

            i++;
        }
        System.out.println("sum of even numbers (using while loop) : " +even_sum_while);


        int j = 0;
        do {
            if (j % 2 == 0) even_sum_do += j;
            j++;
        } while (j <= 100);
        System.out.println("sum of even numbers (using do while loop) : " +even_sum_do);

        System.out.println();
        System.out.println("***********  odd  ***********");
        //////////////////////////////////////////////////////


        for (int a = 0; a <= 100; a++) {

            if (a % 2 != 0) odd_sum_for += a;
        }
        System.out.println("sum of odd numbers (using for loop) : " +odd_sum_for);


        int b = 0;
        while (b <= 100) {

            if (b % 2 != 0) odd_sum_while += b;

            b++;
        }
        System.out.println("sum of odd numbers (using while loop) : " +odd_sum_while);


        int c = 0;
        do {
            if (c % 2 != 0) odd_sum_do += c;
            c++;
        } while (c <= 100);

        System.out.println("sum of odd numbers (using do while loop) : " +odd_sum_do);


//////////////////////////////////////////////////////
        System.out.println();

        System.out.println("***********  mod 7  ***********");

        for(int d=0; d<=100 ; d++){

            if(d%7==0)   mod_sum_for += d;
        }
        System.out.println("sum of numbers that is dividable by 7 (using for loop) : " +mod_sum_for);



        int e = 0;
        while (e <= 100) {

            if (e % 7 == 0) mod_sum_while += e;

            e++;
        }
        System.out.println("sum of numbers that is dividable by 7 (using while loop) : " +mod_sum_while);



        int f = 0;
        do {
            if (f % 7 == 0) mod_sum_do += f;
            f++;
        } while (f <= 100);
        System.out.println("sum of numbers that is dividable by 7 (using do while loop) : " +mod_sum_do);

    }
}
