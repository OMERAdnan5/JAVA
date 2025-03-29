public class rectangle  extends shape{
    double length;
    double breath;
    rectangle(double  length , double  breath){
        this.length = length;
        this.breath = breath;
    }
    double area(){
        return length * breath;
    }
}
