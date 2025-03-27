public class Parent {
    String name;
    int age;
    boolean awake = true ;
    Parent(String name , int age){
       this.name = name;
       this.age = age;
    }
    void sleeping(){
        System.out.println(this.name+" is sleeping.");
        awake = false;
    }
    void working(){
        System.out.println(this.name+" is working.");
        awake = true;
    } 
    void eating(){
        System.out.println(this.name+" is eating.");
        awake = true;
    }
}
