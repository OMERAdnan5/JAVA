public class polymorphism {
    public static void main(String[] args) {
        ship ship = new ship();
        plane plane = new plane();
        car car = new car();
        //The data type of it's array will be their parent
        Vehical[] vehicals = {car,plane,ship};
        for(Vehical vehical : vehicals){
            vehical.go();
        }
        //for interfaces use implements instead of extends and public in methods.
    }
}
