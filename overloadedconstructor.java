public class overloadedconstructor {
   public static void main(String[] args) {  //constructor and class at user.java common sense
    user U1 = new user("xyz");
    user U2 = new user("abc",21);
    user U3 = new user("lol",20,"Email@llm.io");
    user U0 = new user();
    System.out.println("User 0");
    System.out.println(U0.name);
    System.out.println(U0.email);
    System.out.println(U0.age);
    System.out.println("User 1");
    System.out.println(U1.name);
    System.out.println(U1.email);
    System.out.println(U1.age);
    System.out.println("User 2");
    System.out.println(U2.name);
    System.out.println(U2.email);
    System.out.println(U2.age);
    System.out.println("User 3");
    System.out.println(U3.name);
    System.out.println(U3.email);
    System.out.println(U3.age);
   } 
    
}
