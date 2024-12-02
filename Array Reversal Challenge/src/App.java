public class App {
    public static void main(String[] args) throws Exception {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Original Array: "+ java.util.Arrays.toString(numArray));

        for(int i = 0; i < numArray.length / 2; i++){
            int temp = numArray[i];
            numArray[i] = numArray[numArray.length - i - 1];
            numArray[numArray.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: "+ java.util.Arrays.toString(numArray));
    }
}