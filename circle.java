public class circle extends shape {
    double radius;
    circle(double radius){
      this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;      
    }
}
