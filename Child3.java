public class Child3 extends Parent {
    double marks;
    Child3(String name , int age , double marks){
        super(name,age);
        this.marks = marks;
     }
    void result(){
        System.out.println(this.name+"'s marks are "+this.marks);
    } 
}
