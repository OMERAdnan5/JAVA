import java.util.Scanner;
public class Mathss {
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Math.pow(2,3): "+Math.pow(2.0, 3.0));
       System.out.println("Math.sqrt(49): "+Math.sqrt(49));
       System.out.println("Math.E: "+Math.E);
       System.out.println("Math.PI: "+Math.PI);
       System.out.println("Math.abs(-23): "+Math.abs(-23));
       System.out.println("Math.round(2.3): "+Math.round(2.3));
       System.out.println("Math.ceil(2.1): "+Math.ceil(2.1));
       System.out.println("Math.floor(5.98): "+Math.floor(5.98));
       System.out.println("Math.min(4.8/6.7,5.3/7.9): "+Math.min(4.8/6.7,5.3/7.9));
       System.out.println("Math.max(9.4333/13.02,2): "+Math.max(9.4333/13.02,2));
       // Basic Math and Physics Equations
       //Kinetic Energy K.E = 1/2 x m x v²
       System.out.println("For Determining the kinetic Energy of an Object");
       System.out.print("Enter the mass of the object in kg:");
       double mass = scanner.nextDouble();
       System.out.print("Enter the velocity of the object in m/s:");
       double velocity = scanner.nextDouble();
       double KE = 1.0/2 * ((mass)*(Math.pow(velocity,2)));
       System.out.print("The Kinetic Energy of an object having mass "+mass+" kg\n& velocity "+velocity+" m/s is "+KE+" Kgm²/s² or joule(J).");
       System.out.println("");
       //Gravitational Force F = G*m1*m2/r²
       System.out.println("For Determining the Newton's Universal Gravitational Force");
       System.out.println("Enter the mass of object1: ");
       double m1 = Math.abs(scanner.nextDouble());  //abs so it only take positive values
       System.out.println("Enter the mass of object2: ");
       double m2 = Math.abs(scanner.nextDouble());  //abs so it only take positive values
       System.out.println("Enter the distance between their centers: ");
       double r = Math.abs(scanner.nextDouble());  //abs so it only take positive values
       double G = 6.674 * Math.pow(10,-11);
       double F = G*m1*m2/Math.pow(r,2);
       System.out.println("The Gravitational Force between these objects w.r.t Newton's Law : "+F+" N");
       //Slope of the line   m = y2 - y1 / x2 - x1
       System.out.println("Slope of the line");
       System.out.println("Enter the coordinate of X1: ");
       double x1 = scanner.nextDouble(); 
       System.out.println("Enter the coordinate of X2: ");
       double x2 = scanner.nextDouble(); 
       System.out.println("Enter the coordinate of Y1: ");
       double y1 = scanner.nextDouble(); 
       System.out.println("Enter the coordinate of Y2: ");
       double y2 = scanner.nextDouble(); 
       if( x1==x2){
         System.out.println("The line is vertical meaning slope is undefined");
       }
       else{
        double m = (y2 - y1)/(x2 - x1);
        if(m>0){
            System.out.println("The line is rising meaning slope is positive: m ="+m);
        }
        else if(m<0){
            System.out.println("The line is falling meaning slope is negative: m ="+m);
        }
        else if(m==0){
            System.out.println("The line is horizontal meaning slope is Zero: m ="+m);
        }
       }


    }
}
