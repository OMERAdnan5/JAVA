import java.util.Scanner;
public class nestedif{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nestedif:conditional  statements inside a conditional statement
        //Playland pass program
        System.out.print("Enter your age:");
        int age = input.nextInt();
        System.out.print("Are you a student(true/false):");
        boolean isStudent = input.nextBoolean();
        System.out.print("Do you have a Golden Membership(true/false):");
        boolean ismember = input.nextBoolean();
        int ticket = 1200; //rupees
        if(age<=10){
            System.out.println("The ticket is free for under 10");
        }
        else if(age<30){
                if(isStudent){
                    System.out.println("You will receive a 15% discount for being a student");
                    if(ismember){
                        System.out.println("You will receive a 30% discount for being a member");
                        System.out.println("Your final discount is 45%:");
                        System.out.println("Ticket price: "+ticket*0.55+" Rupees");
                    }
                    else{
                        System.out.println("Ticket price: "+ticket*0.85+" Rupees");
                    }
                }
         }    
        else if(age>=30){
                System.out.println("You will receive a 20% discount for being a Senior");
                if(ismember){
                    System.out.println("You will receive a 40% discount for being a member");
                    System.out.println("Ticket price: "+ticket*0.4+" Rupees");
                }
                else{
                    System.out.println("Ticket price: "+ticket*0.8+" Rupees");
                }
            }
        else{
            System.out.println("Error!!!!!!!!!");
            }
                
    }
}