package euler_1_10;

/**
 * Created by Emmanuel on 1/23/2018.
 */
public class Problem5 {

    /**
     * ********************Smallest multiple**********************************
     * 2520 is the smallest number that can be divided by each of the numbers
     * from 1 to 10 without any remainder. What is the smallest positive
     * number that is evenly divisible by all of the numbers from 1 to 20?
     * **************************************************************************
     */
    public static int smallestMultiple(int range) {
        int num = range;
        boolean breakOutdone = false;
        while (true) {
            for (int i = 1; i <= range; i++) {
                if (num % i != 0)
                    break;
                if (i == range)
                    breakOutdone = true;
            }
            if (breakOutdone)
                break;
            num += 10;
        }
        return num;
    }

    public static void main(String[] args) {
        int smallestMultiple = smallestMultiple(20);
        System.out.println(smallestMultiple);
    }
}
