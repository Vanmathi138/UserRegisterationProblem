//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class UserRegistration {
    //attributes
    private String firstName;

    // setter
    public void setFirstName (String firstName){
        this.firstName= firstName;
    }
    //getter
    public String getFirstName(){
        return firstName;
    }

    public static boolean isValidName(String firstName){
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        if(isValidName(firstName)){
            userRegistration.setFirstName(firstName);
            System.out.println("Valida first name: "+userRegistration.getFirstName());
        }else {
            System.out.println("First name should start with a capital letter and be at least 3 characters long.");

        }
    }
}