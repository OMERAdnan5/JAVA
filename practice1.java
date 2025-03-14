import java.util.*;
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
       //Compound Interest calculator
       System.out.println("Enter principal amount :");
       double p = input.nextDouble();
       System.out.println("Enter annual interest rate % :");
       double I = input.nextDouble();
       I /=100;
       System.out.println("Enter times compounded per year :");
       double tc = input.nextDouble();
       System.out.println("Enter duration :");
       double t = input.nextDouble();
       double a = p * Math.pow((1 + I/tc),tc*t);
       System.out.printf("The total amount with interest rate of %.2f %c.\ncompounded per year  %.2f time(s) and duration %.2f years is %.2f $\n",I*100,'%',tc,t,a);
       //Auto Grader and percentage calculator(using loops):
       while(true){ 
          System.out.print("Enter total number of courses: ");
          double courses = input.nextDouble();
          System.out.print("Enter marks per subject: ");
          double marks = input.nextDouble();
          double obtained = 0 , total = 0;
          for(int i = 1;i<=courses;i++){
            System.out.print("Enter marks of course "+i+":");
            double course = input.nextDouble();
            obtained+=course;
            total+=marks;
            }
          double percentage = obtained / total *100;
          System.out.printf("You have scored %.2f out of %.2f and obtained %.2f %s.\n",obtained,total,percentage,"%");
          if(percentage>=85){ System.out.println("Your Grade is A+");}
          else if(percentage>=75){ System.out.println("Your Grade is A");}
          else if(percentage>=65){ System.out.println("Your Grade is B");}
          else if(percentage>=55){ System.out.println("Your Grade is C");}
          else if(percentage>=40){ System.out.println("Your Grade is D");}
          else{ System.out.println("Your Grade is F, you failed!!!");}
          System.out.println("Do want to Continue (Y/N): ");
          String Continue = input.next();
          if(Continue.equals("N")){
              break;
          }
        }
    //    Number Guesssing Game:
       Random rand = new Random();
       int num = rand.nextInt(1,50);
       int attempts = 0;
       while(true){
         System.out.print("Guess a number between(1-50): ");
         int guess = input.nextInt();
         if(guess == num){
            attempts+=1;
            System.out.println("You guessed correctly the number was "+num+" You Won!!!!");
            System.out.println("It too you "+attempts+" try(s).");
            System.out.println("Do you want to play again?!!(Y/N): ");
            String choice = input.next();
            if(choice.equalsIgnoreCase("N")){
                System.err.println("Thanks for playing");
                break;
            }
            else{
                num = rand.nextInt(1,50);
                attempts = 0;
            }
         }
         else if (guess!=num){
             attempts+=1;
             System.out.println("Your guess is incorrect!.");
             if(guess>num){
                System.out.println("Hint: The number is less than "+guess);
             }
             else{
                System.out.println("Hint: The number is greater than "+guess);
             }
            }
         else{
            System.out.println("Invalid Guess!!!");
         }   
       }
       //Bank Account Simulator:(deposite,withdraw,balance check and exit)
       System.out.println("Select Option 1 to Deposite:");
       System.out.println("Select Option 2 to Withdraw:");      
       System.out.println("Select Option 3 to Check Balance:");
       System.out.println("Select Option 4 to EXIT!:");   
       System.out.println("default balance 10,000$");
       double balance = 10000; 
       while(true){ 
        System.out.println("Select an Option: ");   
        int option = input.nextInt();
        if(option==1){
           System.out.println("Enter an amount to deposite: ");
           double deposite = input.nextInt();
           balance+=deposite;
         }
        else if(option==2){
            System.out.println("Enter an amount to withdraw: ");
            double withdraw = input.nextInt();
            if(withdraw<=balance){
                balance-=withdraw;
            }
            else if (withdraw>balance) {
                System.out.println("The withdraw exceeds your balance of "+balance+" $.");
            }
            else{
                System.out.println("Invalid input");
            }  
          }
        else if(option==3){
            System.out.println("Your balance is: "+balance+" $.");
          }
        else if(option==4){
            System.out.println("You are exiting your final balance is: "+balance+" $.");
            break;
        }  
        else{
            System.out.println("Invalid input");
        }

       }
       input.close();
    }
}
