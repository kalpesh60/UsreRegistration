import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public void firstNameValidation() {
        System.out.println("Enter First Name");
        String name = sc.nextLine();
        boolean firstName = Pattern.compile("^[A-Z]{1}[a-zA-Z]{3,}").matcher(name).matches();
        System.out.println("The name is "+firstName);
    }

    public void lastNameValidation() {
        System.out.println("Enter Last Name");
        String name = sc.nextLine();
        boolean lastName = Pattern.compile("^[A-Z]{1}[a-zA-Z]{3,}").matcher(name).matches();
        System.out.println("The name is "+lastName);
    }

    public static void main(String args[]){
        UserRegistration user = new UserRegistration();
        user.firstNameValidation();
        user.lastNameValidation();
    }
}
