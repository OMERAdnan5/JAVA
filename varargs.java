public class varargs {
    public static void main(String[] args) {
        //varargs:is method of passing variable number of methods to a string.
        show(1,2,3,4,5,6,7,8,9,0);
        System.out.println("");
        System.out.println(sum(1,2,3,4,5,6,7,8,9,0));
        System.out.println(sum());
        System.out.println(avg(1,2,3,4,5,6,7,8,9,0));
        System.out.println(avg());
    }
    static void show(int... num){
        for(int n : num){
            System.out.print(n+" ");
        }
    }
    static double  sum(double ... num){  // return type int
        int sum = 0;
        for(double n : num){
            sum+=n;
        }
        return sum;
    }
    static double  avg(double ... num){  // return type int
        int sum = 0;
        for(double n : num){
            sum+=n;
        }
        if (num.length == 0) { //otherwise avg() would return NaN
            return 0;
        } else {
            return sum / num.length;
        }
    }
}
