package euler_1_10;

/**
 * Created by Emmanuel on 1/23/2018.
 */
public class Problem1 {

    /**
     * If we list all the natural numbers below 10
     * that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23. Find the sum of
     * all the multiples of 3 or 5 below 1000.
     */

    public static int sumOfMultipleOf3And5(int range){
        int sum = 0;
        for (int i = 0; i < range; i++)
            if(i % 3 == 0 || i % 5 == 0)
                sum += i;
        return sum;
    }


    public static void main(String[] args) {
        int sum = sumOfMultipleOf3And5(1000);
        System.out.println(sum);
    }
}
