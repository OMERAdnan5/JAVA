
import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        //Enhanced switches are an efficient replacement to else if statement (java 14 feature)
        //Gym timing program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Day: ");
        String day = scanner.next();
        day=day.toLowerCase();
        day = Character.toUpperCase(day.charAt(0)) + day.substring(1);
        switch(day) {
           case "Monday","Tuesday", "Wednesday", "Thursday" -> System.out.println(day+": 7:00 Am - 10:00 Pm");
           case "Friday" -> System.out.println(day+": 2:00 Am - 12:00 Pm");
           case "Saturday" -> System.out.println(day+": 7:00 Am - 12:00 Pm");
           case "Sunday" -> System.out.println(day+": Closed");
           default -> System.out.println(day+": Invalid Input!!!");
        }
        //Calculator using switches
        System.out.print("Enter a number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter a operator +,-,*,/,^,%: ");
        String op = scanner.next();
        switch(op){
            case "+" -> System.out.printf("The sum of %.2f and %.2f is %.3f",n1,n2,n1+n2);
            case "-" -> System.out.printf("The difference of %.2f and %.2f is %.3f",n1,n2,n1-n2);
            case "*" -> System.out.printf("The product of %.2f and %.2f is %.3f",n1,n2,n1*n2);
            case "^" -> System.out.printf("The power of %.2f raised to %.2f is %.3f",n1,n2,Math.pow(n1,n2));
            case "/" ->{
                if(n2!=0){System.out.printf("The division of %.2f by %.2f is %.3f",n1,n2,n1/n2); }
                else{System.out.println("Denominator can't be 0");}
            }
            default -> System.out.println("Invalid Operator");
       }
    scanner.close();
    }
}

