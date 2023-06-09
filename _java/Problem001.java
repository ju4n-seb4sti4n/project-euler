package _java;
/*
 * Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */
public class Problem001 {
    public static void main(String[] args) {
    
        final int LIMIT = 1000;
    
        int sumOfMultiples = 0;
        for (int k=1; k<LIMIT; k++) {
            if (k%3 == 0 || k%5 ==0)
                sumOfMultiples += k;
        }
        System.out.println(
            String.format("the sum of all multiples of 3 or 5 below %d is %d", LIMIT, sumOfMultiples));
    }
}