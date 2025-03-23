public class OBJuse {
    public static void main(String[] args) {
        OBJ object = new OBJ();
        //object are block of code which can hold data (attributes) & actions (methods)they are a reference data type
        System.out.println("Object");
        System.out.println(object.id);
        System.out.println(object.made);
        System.out.println(object.time);
        System.out.println(object.isname);
        object.name("Umer");
        System.out.println(object.isname);
        OBJ example = new OBJ(); // the objects have same properties
        System.out.println("Example");
        System.out.println(example.id);
        System.out.println(object.made);
        System.out.println(example.time);
        System.out.println(example.isname);
        object.name("Adnan");
        System.out.println(example.isname);
    }
}
