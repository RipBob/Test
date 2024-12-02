public class App {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible, not prime
            }
        }

        return true; // Number is prime
    }
}
