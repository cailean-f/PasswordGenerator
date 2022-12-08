import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args){
        int length = 0;
        boolean needUpperCase = false;
        boolean needSpecialCharacter = false;

        Scanner input = new Scanner(System.in);
        System.out.println("How long does your password need to be: (Enter a Number)");

        if(input.hasNextInt()) {
            length = input.nextInt();
        } else {
            System.out.println("BAD ENTRY");
        }
        System.out.println("Does your password need to include upper case?(Y for yes. N for no)");
        if(input.hasNext()){
            if(input.next().charAt(0) == 'y'|| input.next().charAt(0) == 'Y'){
                System.out.println("Got it!");
                needUpperCase = true;
            } else if(input.next().charAt(0) == 'N' || input.next().charAt(0) == 'n'){
                System.out.println("Got it!");
            }
        }else {
            System.out.println("BAD ENTRY");
        }
        System.out.println("Does your password need to include special characters?(Y for yes. N for no)");
        if(input.hasNext()) {
            if (input.next().charAt(0) == 'y' || input.next().charAt(0) == 'Y' ) {
                System.out.println("Got it!");
                needSpecialCharacter = true;
            } else if (input.next().charAt(0) == 'n' || input.next().charAt(0) == 'N' ) {
                System.out.println("Got it!");
            }
        } else {
            System.out.println("BAD ENTRY");
        }


        Password createPassword = new Password(length, needUpperCase, needSpecialCharacter);
        String generatedPassword = createPassword.makePassword();
        System.out.println("Your generated password is: " + generatedPassword);




    }
}
