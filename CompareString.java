

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
        System.out.println(a1.compareTo(a2)==0); //Can be used as conditional statements
        System.out.println(a1.compareTo(a3)==0);
        System.out.println(a1.compareTo(a4)>0); 
        System.out.println(a4.compareTo(a1)<0);
        String txt = "ProgrammingJava";
        System.out.println(txt.startsWith("Program"));//checks prefixes
        System.out.println(txt.endsWith("Java"));//checks suffixes
        //boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        /*ignoreCase → true if comparison should ignore case, false if case-sensitive.
        toffset → Starting index in the first string.
        other → The second string to compare with.
        ooffset → Starting index in the second string.
        len → Number of characters to compare.
        */
        String str1 = "ABC12345";
        String str2 = "abc12345";
        System.out.println(str1.regionMatches(3, str2,3,5));
        System.out.println(str1.regionMatches(true,0, str2,0,2));
        System.out.println(str1.regionMatches(false/*default */,0, str2,0,2));
        


    }
}
