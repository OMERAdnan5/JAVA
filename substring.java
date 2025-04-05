public class substring {
    public static void main(String[] args) {
        //Substring is string extracted from a String 
        String name = "Ulebert Twilight XVII";
        System.out.println("Full name: "+name.substring(0));
        System.out.println("First name: "+name.substring(0,7));
        System.out.println("Middle name: "+name.substring(8,17));
        System.out.println("Last name: "+name.substring(17));
        String email = "NamaloomAfraad155@gmail.com";
        String email2 ="DavidEdgeLordlvl99@hotmail.com";
        System.out.println("Name: "+email.substring(0,email.indexOf("@")));
        System.out.println("Domain: "+email.substring(email.indexOf("@")));
        System.out.println("Name: "+email2.substring(0,email2.indexOf("@")));
        System.out.println("Domain: "+email2.substring(email2.indexOf("@")));
    }  
}
