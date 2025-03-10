import java.util.Scanner;
public class Input {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your name:");
       String name = input.nextLine();//accepts spaces and beyond that
       System.out.println("Your name is "+name);
       System.out.print("Enter your age:");
       int age = Integer.parseInt(input.next()); //take string input and converts it to int
       System.out.println("Your age is: "+age);
       System.out.print("Enter your height in ft:");
       double height = Double.parseDouble(input.next());//take string input and converts it to double
       System.out.println("Your height is "+height+" ft");
       System.out.println("Are you a student?(true/false):");
       boolean is_student = Boolean.parseBoolean(input.next());//take string input and converts it to boolean
       System.out.println(name+" is a student: "+is_student);
       //0r use input.nextInt(),.nextDouble(),.nextBoolean() they take respective values
       System.out.print("Enter a number:");
       int a = input.nextInt();
       System.out.print("Enter a number with decimal part:");
       double b = input.nextDouble();
       double c = a * b;
       System.out.println("The Product of "+a+" & "+b+" is "+c);
        //   Check common Error:
       System.out.println("Are you a boy?!:");
       boolean ans = input.nextBoolean(); //when entering true/false there is a \n created which is not accepted by boolean  but by string input
       input.nextLine();
       System.out.println("Enter a color:");
       String color = input.nextLine();
       System.out.println(ans+" Your are a boy "+". You like "+color+" color.");
     //Determine Area of Triangle;
       double breath;
       double Height;
       double Area;
       System.out.print("Enter Height of Triangle in cm:");
       Height = Double.parseDouble(input.next());
       System.out.print("Enter Breath of Triangle in cm:");
       breath = Double.parseDouble(input.next());
       Area = (1.0/2) * (Height * breath);
       System.out.println("The Area of Triangle with height "+Height+" cm & breath "+breath+" cm is "+Area+" cm².");
        String item;
        double price,total;
        int qty;
        System.out.print("Enter what you want to buy: ");
        item = input.nextLine();
        System.out.print("Enter price(each): ");
        price = Double.parseDouble(input.next());
        System.out.print("Enter quantity: ");
        qty =Integer.parseInt(input.next());
        total = qty * price;
        System.out.println("\nThe total price of "+qty+" "+item+" is = "+total+" $.");
        input.close();
    }
}
