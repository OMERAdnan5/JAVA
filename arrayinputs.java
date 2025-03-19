
import java.util.Scanner;

public class arrayinputs {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String[] desserts = new String[4];//creating indexs without values
       desserts[0] = "Pudding";//Assigning values to those indexes
       desserts[1] = "Icecream";
       desserts[2] = "Cake";
       System.out.println(desserts[0]);
       System.out.println(desserts[1]);
       System.out.println(desserts[2]);
       System.out.println(desserts[3]);//null no value assigned
    //    System.out.println(desserts[4]); will cause error as we created 4 indexes 0-3
       System.out.print("Enter the length of array:");
       int len = scanner.nextInt();
       scanner.nextLine();
       String[] array = new String[len];
       for(int i=0;i<len;i++){
          System.out.print("Enter item for index "+i+": ");
          String item = scanner.nextLine();
          array[i] = item; 
       }
       for(String item:array){
         System.out.println(item);
       }
   } 
}
