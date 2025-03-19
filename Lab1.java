import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inches to Meters");
        System.out.print("\nEnter a length in inches: ");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches+" inch = "+meters+" meter");
        System.out.println("\nDays to Months");
        System.out.print("\nEnter total number of days: ");
        int totaldays = scanner.nextInt();
        double  months = totaldays/30;
        double  days = totaldays%30;
        System.out.println(totaldays+" days = "+months+" months & "+days+" days");
        System.out.println("\nBMI(body mass index)");
        System.out.println("\nEnter weight in pounds(Lbs): ");
        double weight_lbs = scanner.nextDouble();
        double weight_kg = weight_lbs * 0.45359237;
        System.out.println("Enter height in inches(inch): ");
        double height_inch = scanner.nextDouble();
        double height_ft = height_inch * 0.0254;
        double  BMI = weight_kg / height_ft * height_ft;
        System.out.println(weight_lbs+" pounds & "+height_inch+" inches result in BMI: "+BMI+" kg/ft²");
        System.out.println("\nBIO DATA");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter your father name: ");
        String father = scanner.nextLine();
        System.out.print("Enter your department: ");
        String dep = scanner.nextLine();
        System.out.print("Enter your email id: ");
        String email = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Hello, "+name);
        System.out.println(" ");
        System.out.println("Your name is: "+name);
        System.out.println("Your father's name is: "+father);
        System.out.println("Your age is: "+age);
        System.out.println("Your department is: "+dep);
        System.out.println("Your gender is: "+gender);
        System.out.println("Your email is: "+email);

        
        scanner.close();
    }
}
