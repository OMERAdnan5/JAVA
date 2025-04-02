public class Getter_Setter {
    public static void main(String[] args) {
        car_obj car1 = new car_obj("Lambo","Cyan",245000);
        System.out.println("The "+car1.getColor()+" "+car1.getModel()+" costs"+car1.getPrice());
        car1.setColor("red");
        car1.setModel("Ferrari");
        System.out.println("The "+car1.getColor()+" "+car1.getModel()+" costs"+car1.getPrice());
    }
}
