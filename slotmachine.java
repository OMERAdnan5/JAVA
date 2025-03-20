import java.util.*;
public class slotmachine {
    static Scanner I = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
      System.out.println("\n\"WELCOME TO SLOT MACHINE\"");
      double balance = 500;
      String[] symbols = {"✨","🧨","🎉","🤑","😍","🍓","🌺"};
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
        System.out.println("....Spining...");
        String[] slot = spin(symbols);
        show(slot);
        if(slot[1].equals(slot[2]) && slot[0].equals(slot[1])){
            System.out.println("You Won \n3"+slot[0]+" in a row");
            balance+=(bet*4);
            System.out.println("Your Balance: "+balance+" $.");
        }
        if(slot[1].equals(slot[2]) || slot[0].equals(slot[1])){
            System.out.println("You Won");
            balance+=(bet*2);
            System.out.println("\nYour Balance: "+balance+" $.");
        }
        else{
            System.out.println("You Lost");
            System.out.println("\nYour Balance: "+balance+" $.");
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
