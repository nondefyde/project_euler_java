package euler_1_10;

/**
 * Created by Emmanuel on 1/23/2018.
 */
public class Problem3 {

    /**
     * *********Largest prime factor***********************************
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     * ****************************************************************
     */
    public static int largestPrimeFactor(long number) {
        int i;
        for (i = 2; i <= number; i++)
            if (number % i == 0) {
                number /= i;
                i--;
            }
        return i;
    }

    public static void main(String[] args) {
        int factor = largestPrimeFactor(600851475143L);
        System.out.println(factor);
    }
}
