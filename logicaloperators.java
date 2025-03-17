import java.util.Scanner;
public class logicaloperators {
    public static void main(String[] args){
        // && and operator true if both conditions are true
        // || or operator true if any conditions is true
        // ! not operator true if condition is false
        //creating a login system and sign-up program.
        Scanner scanner = new Scanner(System.in);
        boolean log_in = true;
        System.out.println("Sign-in");
        System.out.print("Enter a username:");
        String username = scanner.next();
        System.out.print("Enter a Password:");
        String password = scanner.next();
        boolean notverified = true;
        boolean sign_in = true;  
        while(sign_in){ 
           if(username.length() >12 || username.length()<6){
             System.out.println("Username must be 6-12 characters");
             System.out.print("Enter a username:");
             username = scanner.next();
           }
           else if(password.length() >15 || password.length()<10){
              System.out.println("Password must be 10-15 characters");
              System.out.print("Enter a password:");
              password = scanner.next();
           }
           else if(password.equals(username)){
            System.out.println("Password & Username can't be same");
            System.out.print("Enter a password:");
            password = scanner.next();
           }
           else{
              if(notverified){
               System.out.println("Verification");
               System.out.println("Enter | - 6-^> for verification:");
               scanner.nextLine();
               String verify = scanner.nextLine();
               if(verify.equals("| - 6-^>")){
                   notverified = false;
                   System.out.println("Verification Complete");
                   sign_in = false;
                }

              } 
             }
            }
            System.out.println("log-in");
            System.out.print("Enter your username:");
            String Username = scanner.next();
            System.out.print("Enter your Password:");
            String Password = scanner.next();
            while(!notverified){
                if(Username.equals(username)){
                  if(Password.equals(password)){
                    System.out.println("ACCESS GRANTED!!!");
                    notverified = true;
                  }
                  else{
                    System.out.println("Enter correct Password!!");
                    System.out.print("Enter your Password:");
                    Password = scanner.next();
                 }
                } 
                else{
                    System.out.println("Enter correct username!!");
                    System.out.print("Enter your username:");
                    Username = scanner.next();
                 }

              }
            
    } 
}
 

