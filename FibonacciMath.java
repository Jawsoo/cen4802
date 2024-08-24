public class FibonacciMath {

    /**
     * Calculates the nth Fibonacci number.
     *
     * This method uses a recursive approach to calculate the Fibonacci number at a certain position.
     * The Fibonacci sequence is a series of numbers where each number is the sum of the two before it,
     * starting from 0 and 1.
     *
     * @param n - the position of the term in the fibonacci sequence to be calculated
     * @return the nth Fibonacci number
     */
    public static int findFibonacci(int n) {
        // If n is 0, the answer is 0
        if (n == 0) {
            return 0;
        }
        // If n is 1, the answer is 1
        if (n == 1) {
            return 1;
        }
        // This method finds the previous two numbers
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    /**
     * The main method that runs the program and additionally
     * calculates and prints the 10th Fibonacci number using the findFibonacci method.
     */
    public static void main(String[] args) {
        // Finds the 10th Fibonacci number
        int n = 10;
        int result = findFibonacci(n);

        // Prints the result
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
