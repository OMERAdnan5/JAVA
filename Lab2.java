import java.util.Scanner;

public class Lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter Temperature: ");
       double temp = input.nextDouble();
       System.out.print("Enter Temperature conversion to (C,F): ");
       String type = input.next().toUpperCase();
       double result;
       if(type.equals("C")){
           result = (temp * 9.0/5) + 32;
           System.out.println(temp+" F  = "+result+" C");
       }
       else if(type.equals("F")){
           result = (temp - 32) * (5.0/9.0);
           System.out.println(temp+" C  = "+result+" F");
       }
       else{
           System.out.println("Invalid Conversion Type!!!!");
       }
       System.out.print("Enter a number: ");
       double num1 = input.nextDouble();
       System.out.print("Enter another number: ");
       double num2 = input.nextDouble();
       System.out.print("Enter an operation(+,-,x,/,%,^): ");
       String op = input.next(); //operation + ,- ,*, /
       //for string comparision use .equals() rather that == 
       if(op.equals("+")){
          System.out.println("The sum of "+num1+" & "+num2+" = "+(num1+num2));
       }
       else if(op.equals("-")){
        System.out.println("The difference of "+num1+" & "+num2+" = "+(num1-num2));
       }
       else if(op.equals("/")){
        System.out.println("The division of "+num1+" by "+num2+" = "+(num1/num2));
       }
       else if(op.equals("x")){
        System.out.println("The product of "+num1+" & "+num2+" = "+(num1*num2));
       }
       else if(op.equals("%")){
       System.out.println("The remainder of "+num1+" & "+num2+" = "+(num1%num2));
       }
       else if(op.equals("^")){
        System.out.println("The power of "+num1+" raised to "+num2+" = "+Math.pow(num1,num2));

       }
       else{
        System.out.println("Invalid Syntax");
       }

    }
}
