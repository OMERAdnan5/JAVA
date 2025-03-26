public class Static {
    public static void main(String[] args){
        Guest g1 = new Guest("Paul");
        Guest g2 = new Guest("Petter");
        Guest g3 = new Guest("Patric");
        Guest g4 = new Guest("Park");
        Guest g5 = new Guest("Peel");
        g1.arrived();
        Guest.totalguests();

    }
}
