public class CompareString {
    public static void main(String[] args) {
        String a1 = "a";
        String a2 = "a";
        String a4 = "A";
        String a3 = new String("a"); // creats an object with different memory address
        System.err.println("==");
        System.out.println(a1==a2); // == compares objects in memory
        System.out.println(a1==a3); // a3 different object in memoy
        System.out.println(a1==a4); // A and a are treated as different objects due to ASCII values having different reference points in memory
        System.err.println(".equal()");
        System.out.println(a1.equals(a2)); // .equals compare stored content irrepective of memory address
        System.out.println(a1.equals(a3)); 
        System.out.println(a1.equals(a4)); 
        System.err.println(".equalIgnoreCase()");
        System.out.println(a1.equalsIgnoreCase(a2)); // .equals compare stored content irrepective of memory address and Case
        System.out.println(a1.equalsIgnoreCase(a3)); 
        System.out.println(a1.equalsIgnoreCase(a4)); 
        System.err.println(".compareTo()");
        System.out.println(a1.compareTo(a2)); // compareTo compares stored content lexicographically
        System.out.println(a1.compareTo(a3)); //+ means 1st value is greater,- means 1st value is lesser,0 means they are equal
        System.out.println(a1.compareTo(a4)); //basically it returns difference in ASCII values
        System.out.println(a4.compareTo(a1)); // "A" = 65 , "a" = 97. having a difference of 32 between capital & small letters

    }
}
