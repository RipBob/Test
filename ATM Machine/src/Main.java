import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String password = "1234";
        String username = "admin";

        System.out.println("Press 1 to login to an existing account");
        System.out.println("Press 2 to create a new account");
        System.out.println("Press 3 to exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which option would you like to choose? ");
        int userinput = scanner.nextInt();

        if(userinput == 1){
            System.out.println("Enter your username: ");
            String enteredUsername = scanner.next();
            System.out.println("Enter your password: ");
            String enteredPassword = scanner.next();

            if(enteredUsername.equals(username) && enteredPassword.equals(password)){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Invalid username or password");
            }
        } else if(userinput == 2){
            System.out.println("Enter a username: ");
            String newUsername = scanner.next();
            System.out.println("Enter a password: ");
            String newPassword = scanner.next();
            System.out.println("Account created successfully!");
        } else if(userinput == 3){
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid input");
        }

    }
}