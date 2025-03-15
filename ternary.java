import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        //ternary operator : shorthand way for conditional statements;
        //(conditonal statement)? true-statement : false-statement;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String  text = (age>18)? "You are an Adult" :"You are a Minor"; 
        System.out.println(text); 
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextInt();
        String result = (percentage>30)? "Pass":"Fail";
        System.out.println(result);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String ans = (num%2==0)? "Even":"Odd";
        System.out.println(ans);
        System.out.println("Enter temperature");
        double temp = scanner.nextDouble();
        System.out.print("Enter coversion type (C/F): ");
        String type = scanner.next();
        double conversion = (type.equalsIgnoreCase("C"))? (temp - 32)*5.0/9 :(temp*9.0/5)+32;
        String txt = (type.equalsIgnoreCase("C"))? temp+" C = "+conversion+" F":temp+" F = "+conversion+" C";
        System.out.println(txt);
    }
}
