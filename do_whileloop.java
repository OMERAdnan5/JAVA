import java.util.Random;
import java.util.Scanner;

public class do_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // do while loop is a kind of loop which executes the block of code
        // at least once before checking the condition
        int Num = -1;
        do {
            if (Num < 0) {
                System.out.println("Select a positive number");
                System.out.println("Enter a positive number:");
                Num = scanner.nextInt();
            }
            if (Num >= 0) {
                System.out.println("You chose: " + Num);
            }
        } while (Num < 0);

        // creating a random password generator using do-while loop
        System.out.println("Password Generator");
        int len = 0;
        do {
            System.out.print("Enter length of password(6-19):");
            len = scanner.nextInt();
        } while (len < 6 || len > 19);

        System.out.print("Should it contain numbers?(Y/N):");
        String isnum = scanner.next().toUpperCase();
        System.out.print("Should it contain small letters?(Y/N):");
        String issmall = scanner.next().toUpperCase();
        System.out.print("Should it contain capital letters?(Y/N):");
        String iscapital = scanner.next().toUpperCase();
        System.out.print("Should it contain special characters?(Y/N):");
        String isspecial = scanner.next().toUpperCase();
        String num = "", small = "", capital = "", special = "", set = "";
        while (isnum.equals("N") && issmall.equals("N")&&iscapital.equals("N")&&isspecial.equals("N") ){
            System.out.println("Select atleast 1 type");
            System.out.print("Should it contain numbers?(Y/N):");
            isnum = scanner.next().toUpperCase();
            System.out.print("Should it contain small letters?(Y/N):");
            issmall = scanner.next().toUpperCase();
            System.out.print("Should it contain capital letters?(Y/N):");
            iscapital = scanner.next().toUpperCase();
            System.out.print("Should it contain special characters?(Y/N):");
            isspecial = scanner.next().toUpperCase();
        }
        if (isnum.equals("Y")) {
            num = "1234567890";
        }
        if (issmall.equals("Y")) {
            small = "abcdefghijklmnopqrstuvwxyz";
        }
        if (iscapital.equals("Y")) {
            capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (isspecial.equals("Y")) {
            special = "!@#$%^&*(_)+><;:/?|`~";
        }


        set += num + small + capital + special;
        String password = "";
        while (password.length() < len) {
            int index = rand.nextInt(set.length());
            password += set.charAt(index);
        }

        System.out.println("Generated password: " + password);

        scanner.close();
    }
}