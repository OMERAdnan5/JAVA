import java.util.Scanner;
public class Quiz{
    public static void main(String[] args) {
        //Quiz Game!!!
        Scanner input = new Scanner(System.in);
        String[] questions = {
            "Which is the tallest mountain above sea level?: ",
            "Who was the second astronaut to step on the Moon's surface?: ",
            "Which creature has the highest brain-to-body ratio?: ",
            "The Sun shines bright due to which scientific reason?: ",
            "What is the chemical symbol for gold?: ",
            "Which planet is known as the Red Planet?: ",
            "Which metal has a liquid state at room temperatue?: "
        };
        
        String[][] options = {
            {"A) Mount Everest", "B) K2", "C) Kangchenjunga", "D) Lhotse"},
            {"A) Neil Armstrong", "B) Buzz Aldrin", "C) Michael Collins", "D) Yuri Gagarin"},
            {"A) Dolphin", "B) Human", "C) Ant", "D) Octopus"},
            {"A) Nuclear Fission", "B) Combustion", "C) Nuclear Fusion", "D) Chemical Reaction"},
            {"A) Ag", "B) Au", "C) Pb", "D) Hg"},
            {"A) Venus", "B) Jupiter", "C) Mars", "D) Saturn"},
            {"A) Magnesium","B) Gallium","C) Mercury","D) both B & C"}
        };
        String[] answers = {"A", "B", "D", "C", "B", "C", "D"}; 
        int score = 0,correct = 0,incorrect = 0;
        for(int i=0;i<questions.length;i++){
              System.err.println("");
              System.out.println(questions[i]);
              System.out.println("\nOPTIONS:");
              for(String option : options[i]){
                   System.out.println(option);
              }
              System.out.println("\nEnter your Option(A,B,C,D): ");
              String ans = input.nextLine();
              if(ans.equalsIgnoreCase(answers[i])){
                 System.out.println("\n\"CORRECT GUESS\"");
                 score+=5;
                 correct++;
              }
              else{
                System.out.println("\n\"INCORRECT GUESS\"");
                incorrect++;
              }
              
        }
        System.out.println("Your score: "+score);
        System.out.println("Your got "+correct+" correct & "+incorrect+" wrong");

        input.close();
    }
}        