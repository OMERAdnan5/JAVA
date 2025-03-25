public class Stringmethods {
    public static void main(String[] args) {
        String title ="Programming with Java";
        String space = "   S P A C E  ";
        System.out.println("title.Length: "+title.length());
        System.out.println("title.charAt(0): "+title.charAt(0));
        System.out.println("title.charAt(16): "+title.charAt(16));
        System.out.println("title.indexOf(J): "+title.indexOf("J"));
        System.out.println("title.lastIndexOf(space): "+title.lastIndexOf(""));
        System.out.println("title.replace(\" \",$): "+title.replace(" ","$"));
        System.out.println("title.toLowerCase(): "+title.toLowerCase());
        System.out.println("title.toUpperCase(): "+title.toUpperCase());
        System.out.println("space.trim(): "+space.trim());
        System.out.println("title.isEmpty(): "+title.isEmpty());
        System.out.println("title.contains(\"a\"): "+title.contains("a"));
        System.out.println("title.equals(\"Programming with Java\"): "+title.equals("Programming with Java"));
        System.out.println("title.equalsIgnoreCase(\"PROGRAMMING WITH JAVA\"): "+title.equalsIgnoreCase("PROGRAMMING WITH JAVA"));
    }
}
