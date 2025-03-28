public class Static {
    public static void main(String[] args){//static helps to create methods and values belonging to the class itself rather then the objects.
        Guest g1 = new Guest("Paul");
        Guest g2 = new Guest("Petter");
        Guest g3 = new Guest("Patric");
        Guest g4 = new Guest("Park");
        Guest g5 = new Guest("Peel");
        g1.arrived();
        g2.arrived();
        g3.arrived();
        Guest.totalguests();


    }
}
