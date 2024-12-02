import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String original = scanner.nextLine();
        scanner.close();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}
