public class variablescope {
    static int x = 1;
    static int y = 1; // Class accessible by all methods and main
   public static void main(String[] args) {
    int x = 2;//local
    System.out.println(x);//local variable has a precedence over class 
    System.err.println(y);
    method();
   }
   static void method(){
     int x = 3;//local
     System.out.println(x);
     System.out.println(y);
   }
}
