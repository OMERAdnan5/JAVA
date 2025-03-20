import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        Random R = new Random();
        String[] options = {"Rock","Papper","Scissor"};
        String play = "yes";
        while(play.equalsIgnoreCase("yes")){
           System.out.println("Rock , Paper & Scissors Game!!!");
           System.out.print("\nEnter your choice: ");
           String user_choice = I.nextLine();
           user_choice = user_choice.substring(0,1).toUpperCase()+user_choice.substring(1).toLowerCase();
           String computer_choice = options[R.nextInt(3)];
           if((!user_choice.equals("Rock"))&&(!user_choice.equals("Paper"))&&(!user_choice.equals("Scissor"))){
              System.out.println("\nInvalid Input");
           }
           else if(user_choice.equals(computer_choice)){
            System.out.println("\nIt's a Draw");
           }
           else if((user_choice.equals("Rock") && computer_choice.equals("Scissor")) || (user_choice.equals("Paper") && computer_choice.equals("Rock")) || (user_choice.equals("Scissor")&& computer_choice.equals("Paper"))){
            System.out.println("\nYou Won");
            System.out.print("\nDo you want to play again?(Y/N): ");
            String again = I.nextLine();
            if(!again.equalsIgnoreCase("Y")){
               play = "No";
            }

           }
           else{
            System.out.println("\nYou Lose");
           }
        

        }
    }
}
