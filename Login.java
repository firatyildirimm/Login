import java.util.Scanner;

public class LoginSSS {
    public static void main(String[] args) {
        String password,userName,newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        userName = input.nextLine();

        System.out.print("Enter password: ");
        password = input.nextLine();

        if(userName.equals("domo")&&password.equals("domo123")){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Wrong information");
            System.out.println("Do you want change your password! \n1-Yes \n2-No");

            int a = input.nextInt();

            if (a == 1) {
                Scanner inp= new Scanner(System.in);

                System.out.println("Enter your next password");
                newPassword = inp.nextLine();

                if (newPassword.equals("domo123")) {
                    System.out.println("Could not create password, please enter another password.");

                }
                else {
                    System.out.println("Your password has been changed");
                }
            }
            else{
                System.out.println("Program end...");
            }

            }


        }



    }
