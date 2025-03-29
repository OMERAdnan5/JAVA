public class triangle extends shape{
    double height;
    double breath;
    triangle(double  height , double  breath){
        this.height = height;
        this.breath = breath;
    }
    double area(){
        return 0.5 * height * breath;
    }
}