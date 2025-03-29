public class Abstract {
  public static void main(String[] args) {
    // shape s = new shape; can't create object of shape class cz it's abstract
    triangle T = new triangle(6,7);
    circle C = new circle(4);
    rectangle R = new rectangle(8,3);
    System.out.println(T.area());
    T.s();
    System.out.println(C.area());
    C.s();
    System.out.println(R.area());
    R.s();
  }  
}
