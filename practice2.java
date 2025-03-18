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
           
        }
        scanner.close();
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
}
