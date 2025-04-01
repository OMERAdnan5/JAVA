import java.util.Scanner;
public class runtimepolymorphism {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pet pet;
        System.err.print("Enter a number (1,2 or 3): ");
        int choice = s.nextInt();
        if(choice == 1){
            pet = new dog();
            pet.speak();
        }
        else if(choice == 2){
            pet = new cat();
            pet.speak();
        }
        else if(choice == 3){
            pet = new rabbit();
            pet.speak();
        }

    }
}
