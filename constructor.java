public class constructor {
    public static void main(String[] args) {
        /*A constructor is a special method to initialize objects by passing
        values as arguments*/ //creating a class name Employee for demonstration.
        Employee E1 = new Employee("Ali","#0001",21,1.5,100000);
        Employee E2 = new Employee("Alishba","#0002",22,1,90000);
        System.out.println(E1.name);
        System.out.println(E1.id);
        System.out.println(E1.age);
        System.out.println(E1.service);
        System.out.println(E1.salary);
        System.out.println(E2.name);
        System.out.println(E2.id);
        System.out.println(E2.age);
        System.out.println(E2.service);
        System.out.println(E2.salary);
        System.out.println("");
        E1.Working();
        System.out.println(E1.atOffice);
        System.out.println(E2.name+" at home.");
        System.out.println(E2.atOffice);
    }
}
