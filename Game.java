import java.util.Scanner;
public class Game{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String adj1,vrb1,noun1,adj2,vrb2,noun2,noun3,noun4;
        System.out.print("Enter a day:");
        noun1 = input.nextLine();
        System.out.print("Enter a place:");
        noun2 = input.nextLine();
        System.out.print("Enter an expression:");
        adj1 = input.nextLine();
        System.out.print("Enter an animal / person:");
        noun3 = input.nextLine();
        System.out.print("Enter an action:");
        vrb1 = input.nextLine();
        System.out.print("Enter an object/thing or person:");
        noun4 = input.nextLine();
        System.out.print("Enter an experience:");
        adj2 = input.nextLine();
        System.out.print("Enter an action:");
        vrb2 = input.nextLine();

        System.out.println("On "+noun1+" I went to "+noun2+".");
        System.out.println("There I saw a "+adj1+" "+noun3+" It was "+vrb1+" with a "+noun4+".");
        System.out.println("It was very "+adj2+" to watch that "+noun3+" "+vrb1+" & i started "+vrb2+".");

    }
}