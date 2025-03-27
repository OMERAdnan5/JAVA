public class inheritance {
    public static void main(String[] args) {
        //inheritance: A class can inherit methods and attributes from another class in a parent child relation.
        //super: calls superclass(parent)  to initialize attributes
        Parent parent = new Parent("Emily",23);
        Child1 child1 = new Child1("Sofia", 19);
        Child2 child2 = new Child2("Violet",18);
        System.out.println(parent.age);
        parent.eating();
        parent.working();
        child1.drawing();
        System.out.println(child1.name);
        child1.working();
        System.out.println(child1.awake);
        child1.sleeping();
        System.out.println(child1.awake);
        System.out.println(child2.singing);
        child2.sing();
        System.out.println(child2.singing);
        child2.eating();
    }

}
