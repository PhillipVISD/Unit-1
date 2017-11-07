public class Calculator {
    public static void main(String[] args) {
        multiply();
        System.out.println(isPrime(29)); // Prime
        System.out.println(isPrime(8)); // Not prime
        System.out.println(isPrime(81)); // Not prime
        System.out.println(isPrime(858599509)); // Prime
    }

    /*
    Pretends to multiply numbers, and does so sadly.
    */
    public static void multiply() {
        System.out.println("2 times 2 is 4");
    }

    /**
    * Returns true is a geven number is even, false if it is not.
    **/
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
