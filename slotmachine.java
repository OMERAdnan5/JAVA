import java.util.*;
public class slotmachine{
    static Scanner I = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("\n\"WELCOME TO SLOT MACHINE\"");
        double balance = 1000;
        double times = 0;
        String[] symbols = {"💎","🤑","😍","🍓","🌺"};
        while(balance>0){
            System.out.println("\nYour Balance: "+balance+" $.");
            System.out.print("\n Enter your Bet: ");
            double bet = I.nextDouble();
            I.nextLine();
            if(bet<=0){
                System.out.println("\nInvalid Amount");
            }
            else if (bet>balance){
                System.out.println("\nInsufficient Balance");
            }
            else{
                balance-=bet;
                System.out.println("Remaining Balance: "+balance);
                System.out.println("....Spinning...");
                String[] slot = spin(symbols);
                show(slot);
                if(slot[1].equals(slot[2]) && slot[0].equals(slot[1])){
                    System.out.println("You Won \n"+slot[0]+" 3 in a row");
                    switch(slot[1]){
                        case "🤑" -> times = 5;
                        case "🍓" -> times = 3;
                        case "🌺" -> times = 4;
                        case "😍" -> times = 4.5;
                        case "💎" -> times = 6;
                    }
                    balance+=(bet*times);
                    System.out.println("You Won: "+(bet*times)+" $.");
                }
                else if(slot[1].equals(slot[2]) || slot[0].equals(slot[1])) {
                    System.out.println("You Won");
                    System.out.println(slot[1]+" 2 in a row!");
                    switch(slot[1]){
                        case "🤑" -> times = 3.5;
                        case "🍓" -> times = 2;
                        case "🌺" -> times = 3;
                        case "😍" -> times = 3.2;
                        case "💎" -> times = 4;
                    }
                    balance+=(bet*times);
                    System.out.println("You Won: "+(bet*times)+" $.");
                }
                else if(slot[0].equals(slot[2])) {
                    System.out.println("You Won");
                    switch(slot[0]){
                        case "🤑" -> times = 2;
                        case "🍓" -> times = 1.4;
                        case "🌺" -> times = 1.6;
                        case "😍" -> times = 1.8;
                        case "💎" -> times = 2.5;
                    }
                    balance+=(bet*times);
                    System.out.println("You Won: "+(bet*times)+" $.");
                }
                else{
                    System.out.println("You Lost");
                }
                System.out.println("Do you wish to continue(Y/N)");
                String choice = I.nextLine();
                if(choice.equalsIgnoreCase("N")){
                    System.out.println("\"Thanks for Playing\"");
                    System.out.println("Final Balance: "+balance);
                    break;
                }

            }
        }
    }
    static String[] spin(String[] array){
        String[] s = new String[3];
        for(int i=0;i<3;i++){
            s[i] = array[rand.nextInt(array.length)];
        }
        return s;
    }
    static void show(String[] S){
        System.out.println("\n "+S[0]+" | "+S[1]+" | "+S[2]);
    }

}
