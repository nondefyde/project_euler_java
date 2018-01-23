package euler_1_10;

/**
 * Created by Emmanuel on 1/23/2018.
 */
public class Problem4 {

    /**
     * *********Largest palindrome product***************************
     * A palindromic number reads the same both ways. The largest
     * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * ****************************************************************
     */
    public static int largestPalindromeProductForDigit(int digit) {

        StringBuilder digitString = new StringBuilder();
        int digit1, digit2;
        for (int i = 0; i < digit; i++)
            digitString.append("9");
        digit1 = digit2 = Integer.parseInt(digitString.toString());
        int max = 0;
        for (int a = digit1; a > 0; a--) {
            for (int b = digit2; b > 0; b--) {
                int product = (a * b);
                if (product < max)
                    break;
                if (isPal(product + "") && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    public static boolean isPal(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        int largest = largestPalindromeProductForDigit(3);
        System.out.println(largest);
    }
}
