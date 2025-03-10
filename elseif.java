import java.util.Scanner;
public class elseif{
    public static void main(String[] name)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello_World!");
        System.out.print("Enter a age: ");
        int num = Integer.parseInt(input.next());
        System.out.print("Are you a student: ");
        boolean student = Boolean.parseBoolean(input.next()); 
        input.nextLine();
        System.out.print("Enter your name: ");
        String Name = input.nextLine();
        if(student){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        if(Name.isEmpty()){
            System.out.println("You have'nt entered your name:");
        } 
        else{
            System.out.println("Hi, "+Name);
        }      
        if(num >= 12 && num <= 19){
            System.out.println("You are a teenager");    
        }
        else if(num>=20 && num<=60){
            System.out.println("You are an Adult");
        }
        else if(num>60){
            System.out.println("You are an Elder!!!");
        }
        else if(num<=0){
            System.out.println("You havent born yet");
        }
        else{
            System.out.println("You are a kid");
        }
        input.close();
    }
}