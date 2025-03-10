import java.util.Random;
public class random{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int num1 = random.nextInt(); //(-2,147,483,648 to 2,147,483,647). range
        System.out.println(num1);
        int num2 = random.nextInt(1,50); // (inclusive,exclusive) meaning  50 is excluded
        System.out.println(num2);
        double num3 = random.nextDouble(); //(0.0-1.0). range
        System.out.println(num3);
        boolean bool = random.nextBoolean(); //(true/false)). range
        System.out.println(bool);
        boolean coinflip = random.nextBoolean();
        if(coinflip){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}
