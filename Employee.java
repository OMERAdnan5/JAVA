public class Employee {
    String name;
    String id;
    int age;
    double service;
    double salary;
    boolean atOffice = false; 

    Employee(String name,String id, int age,double service,double salary) { //constructor
        this.name = name; //this refers to the object which currently being constructed assigning values to it
        this.id = id;  // this.class_attribute = parameter
        this.age = age;
        this.service = service;
        this.salary = salary;
    }
    void Working(){
        atOffice = true;
        System.out.println(this.name +" is working.");
    }
    

}
