public class Child2 extends Parent{
    boolean singing;
    Child2(String name , int age){
       super(name,age);
    }
    void sing(){
        System.out.println(this.name+" is singing.");
        singing = true;
    }
}
