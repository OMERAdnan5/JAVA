import java.util.Scanner;
public class practice1 {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       //creating mini projects :
       //calculator
       System.out.print("Enter a number: ");
       double num1 = input.nextDouble();
       System.out.print("Enter another number: ");
       double num2 = input.nextDouble();
       System.out.print("Enter an operation(+,-,x,/,%,^): ");
       String op = input.next(); //operation + ,- ,*, /
       //for string comparision use .equals() rather that == 
       if(op.equals("+")){
          System.out.printf("The sum of %.2f and %.2f is : %.2f\n",num1,num2,(num1+num2));
       }
       else if(op.equals("-")){
        System.out.printf("The difference of %.2f and %.2f is : %.2f\n",num1,num2,(num1-num2));
       }
       else if(op.equals("/")){
        System.out.printf("The division of %.2f by %.2f is : %.2f\n",num1,num2,(num1/num2));
       }
       else if(op.equals("x")){
        System.out.printf("The product of %.2f and %.2f is : %.2f\n",num1,num2,(num1*num2));
       }
       else if(op.equals("%")){
        System.out.printf("The remainder of %.2f and %.2f is : %.2f\n",num1,num2,(num1%num2));
       }
       else if(op.equals("^")){
        System.out.printf("The power of %.2f raised %.2f is : %.2f\n",num1,num2,(Math.pow(num1,num2)));
       }
       else{
        System.out.println("Invalid Syntax");
       }
       input.close();
    }
}
