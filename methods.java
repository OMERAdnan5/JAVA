public class methods{
    public static void main(String[] args) {
        //A method is a block of reusable code which can be used to by calling it:
        hello();//calling a method
        hello();
        hi("Saad");//"Saad" argument
        hi("Ali");
        hi("Ebad");
        square(14);
        cube(3);
        sq_root(144);
        triangle(8,"*");
        triangle(5,"^");
        triangle(10,"#");

    }
    static void hello(){  //creating a method
        System.out.println("Hello!");
    }
    static void hi(String name){  //passing arguments to parameter
        System.out.println("Hi "+name);
    }
    static void square(double n){
        System.out.println(n*n);
    }
    static void cube(double n){
        System.out.println(n*n*n);
    }
    static void sq_root(double n){
        System.out.println(Math.pow(n,0.5));
    }
    static void triangle(int row,String pattern){
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=row-i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" "+pattern);
            }
            for(int j = 1;j<=i-1;j++){
                System.out.print(" "+pattern);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    

}