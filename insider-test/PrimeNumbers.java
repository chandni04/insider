/*
test-cases for above program.

 #1. nothing should be printed when value of n passed to the program is either 0 or 1.
 #2. for n = 100, make sure exactly 100 numbers are printed.
 #3. make sure first printed number is 2 and  not 1.
 #4. make sure last printed number is 541 as this is the 100th prime number.
 #5. make sure all the numbers are  prime number.
 #6. take few non-prime numbers between 2 and 541 and make sure this numbers are not present in the printed list.

 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 100;
        printNPrimeNumbers(n);
    }

    /**
     * prints first n prime numbers
     *
     * test-cases for the same are written at the start of the program.
     *
     * @param n
     */
    private static void printNPrimeNumbers(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(2);
        int num = 3;
        while (n > 1) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                n--;
            }
            num++;
        }
    }

}