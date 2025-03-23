import java.util.*;
public class practice2 {
        public static void main(String[] args) {
        //Dice roller
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean run =true;
        while(run){
           System.out.print("Enter number of dice: ");
           int num = scanner.nextInt();
           int total = 0;
           switch(num){
            case 1 ->System.out.println("You choose 1 dice");
            case 2 ->System.out.println("You choose 2 dice");
            case 3 ->System.out.println("You choose 3 dice");
            case 4 ->System.out.println("You choose 4 dice");
            case 5 ->System.out.println("You choose 5 dice");
            case 6 ->System.out.println("You choose 6 dice");
            default -> System.out.println("Invalid Input");
           }
           for(int i = 1;i<=num;i++){
            int random = rand.nextInt(1,7);
            total+=random;
            System.out.println("You got: "+random);
            switch(random){
                case 1 ->dice1();
                case 2 ->dice2();
                case 3 ->dice3();
                case 4 ->dice4();
                case 5 ->dice5();
                case 6 ->dice6();
               }

           }
           System.out.println("Total: "+total);
           System.out.print("Do you want to roll again(Y/N):");
           String option = scanner.next().toUpperCase();
           run = option.equals("Y");
           
        //Hang man Game!
    String[] Eng_Q = {
      "The beautiful flowers are blooming in the garden.(adjective)",
      "The book is ___ the table.(preposition)",
      "Yesterday, we ___ to the park.(form of verb)",
      "She ___ her homework before dinner.(form of verb)",
      "The cat is sleeping on the couch.(noun)",
      "___ is my best friend.(pronoun)",
      "I wanted to go outside, ___ it was raining.(conjunction)",
      "The sun ___ in the east.(form of verb)",
      "The little boy played with his ___ in the park.(noun)",
      "She sings very ___.(adverb)",
      "He ___ a new bicycle last week.(form of verb)",
      "I need to buy ___ eggs from the store.(determiner)",
      "They will arrive ___ 5 PM.(preposition)",
      "She ___ a doctor when she was younger.(form of verb)",
      "The students are writing their exams ___.(adverb)"
  };
  
  String[][] Options = {
      {"A) flowers", "B) are", "C) blooming", "D) beautiful"},
      {"A) on", "B) in", "C) at", "D) over"},
      {"A) go", "B) gone", "C) went", "D) going"},
      {"A) do", "B) did", "C) doing", "D) does"},
      {"A) sleeping", "B) is", "C) cat", "D) on"},
      {"A) He", "B) Him", "C) His", "D) He's"},
      {"A) or", "B) but", "C) and", "D) so"},
      {"A) set", "B) rises", "C) rose", "D) raising"},
      {"A) friends", "B) toys", "C) books", "D) bicycles"},
      {"A) beautifully", "B) beautiful", "C) beauty", "D) beautifies"},
      {"A) buy", "B) buys", "C) bought", "D) buying"},
      {"A) much", "B) some", "C) any", "D) many"},
      {"A) on", "B) in", "C) at", "D) into"},
      {"A) was", "B) were", "C) been", "D) is"},
      {"A) quiet", "B) quick", "C) quietly", "D) quicker"}
  };
  
  String[] Correct_Ans = {"D", "A", "C", "B", "C", "A", "B", "B", "B", "A", "C", "B", "C", "A", "C"};
  
  int correct = 0;
  int strike = 0;
  for(int i = 0;i<Eng_Q.length;i++){
      if(strike == 4){
          System.err.println("\nYou Lost!!!!");
          System.out.println("Due to "+strike+" strikes.");
          break;
      }
      System.out.println("\nQ"+(i+1)+". "+Eng_Q[i]);
      System.err.println("\nOPTIONS");
      for(int j=0;j<4;j++){ //j<4 for 0 1 2 3 options A-D
         System.out.println(Options[i][j]);
      }
      System.out.print("\nEnter your answer (A,B,C,D): ");
      String user_Ans = scanner.next().toUpperCase();
      if(user_Ans.equals(Correct_Ans[i])){
         System.out.println("\"Correct\"");
         correct++;
      }
      else{
          System.out.println("Incorrect");
          strike++;
          hang_man(strike);
      }
  }
   System.out.println("Your score is "+correct+"/"+Eng_Q.length);
   scanner.close();
  }
}
    static void dice1(){
        System.out.println( """
                --------
               |        |
                   ⨀    
               |        |
                --------
                """);
    }
    static void dice2(){
        System.out.println("""
                --------
               |        |
                 ⨀   ⨀  
               |        |
                --------
                """);
    }
    static void dice3(){
        System.out.println("""
                --------
               | ⨀     |
               |   ⨀   |
               |     ⨀ |
                --------
                """);
    }
    static void dice4(){
        System.out.println("""
                --------
               |⨀    ⨀|
                        
               |⨀    ⨀|
                --------
                """);
    }
    static void dice5(){
        System.out.println("""
                --------
               |⨀    ⨀|
                   ⨀    
               |⨀    ⨀|
                --------
                """);
    }
    static void dice6(){
        System.out.println("""
                --------
               |⨀     ⨀|
               |⨀     ⨀|     
               |⨀     ⨀|
                --------
                """);
    }            
    static void hang_man(int num){
       switch(num){
        case 1 -> System.out.println("""

                 *
                 * 
                 * 
    
                """);
       case 2 -> System.out.println("""

                 *
                 * 
                 * 
                * * 
              *     *   
              *     * 
                * *  
                             """);
       case 3 -> System.out.println("""

                 *
                 * 
                 * 
                * * 
              *     *   
              *     * 
                * *          
             *   *   *
              *  *  *
               * * *
                 * 
                  """);       
       case 4 -> System.out.println("""

                 *
                 * 
                 * 
                * * 
              *     *   
              *     * 
                * *          
             *   *   *
              *  *  *
               * * *
                 * 
                 *    
                * *
               *   *
              *     *
                      """);      
       }
    }
}
