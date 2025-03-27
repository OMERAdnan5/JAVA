public class Child1 extends Parent {
	Child1(String name, int age) {
		super(name, age);//inheriting attributes from parent
	}
    void drawing(){
        System.out.println(this.name+" is good at drawing");//can have individual methods and attributes.
    }
}
