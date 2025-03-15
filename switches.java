
import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        //switches are an efficient replacement to else if statement
        //Gym timing program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Day: ");
        String day = scanner.next();
        day=day.toLowerCase();
        day = Character.toUpperCase(day.charAt(0)) + day.substring(1);
        switch(day) {
           case "Monday" -> System.out.println(day+": 7:00 Am - 10:00 Pm");
           case "Tuesday" -> System.out.println(day+": 7:00 Am - 10:00 Pm");
           case "Wednesday" -> System.out.println(day+": 7:00 Am - 10:00 Pm");
           case "Thursday" -> System.out.println(day+": 7:00 Am - 10:00 Pm");
           case "Friday" -> System.out.println(day+": 2:00 Am - 12:00 Pm");
           case "Saturday" -> System.out.println(day+": 7:00 Am - 12:00 Pm");
           case "Sunday" -> System.out.println(day+": Closed");
           default -> System.out.println(day+": Invalid Input!!!");
        }
        scanner.close();
    }
}
