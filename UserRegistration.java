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

    public void emailValidation() {
        System.out.println("Enter Email Id");
        String mail = sc.nextLine();
        boolean email = Pattern.compile("(^[A-Za-z0-9]{1,}[-+_.]{0,1})[A-Za-z0-9]{0,}[@]{1}[A-Za-z0-9]{1,}[.]{1}[A-Za-z]{2,3}[.]{0,1}[A-Za-z]{0,3}").matcher(mail).matches();
        System.out.println("The Email is "+email);
    }

    public void mobNoValidation() {
        System.out.println("Enter Mob No.");
        String mob_no = sc.nextLine();
        boolean mobNo = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$").matcher(mob_no).matches();
        System.out.println("The Mob No. is "+mobNo);
    }

    public void passwordValidation() {
        System.out.println("Enter Password");
        String password = sc.nextLine();
        boolean passWord = Pattern.compile("^[A-Za-z0-9]{8,}").matcher(password).matches();
        System.out.println("The password is "+passWord);
    }

    public static void main(String args[]){
        UserRegistration user = new UserRegistration();
        user.firstNameValidation();
        user.lastNameValidation();
        user.emailValidation();
        user.mobNoValidation();
        user.passwordValidation();
    }
}
