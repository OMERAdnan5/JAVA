public class Interface {
    //Allows a sub - class to have multiple parent classes
    public static void main(String[] args) {
        flyingfish fishy = new flyingfish();
        fishy.intro();
        fishy.Fly();
        fishy.Swim();
        penguin penguin = new penguin();
        penguin.intro();
        penguin.Walk();
        penguin.Swim();


    }
}
