public class prinf {
    public static void main(String[] args) {
        // printf : used for formating outputs
        //Specifier character 
        String s = "Strings.";
        char c = 'A';
        int a = 155;
        double b = 9.99;
        boolean t = true;
        System.out.printf("Specifier-characters.");
        System.out.printf("for strings: %s\n",s);
        System.out.printf("for character: %c\n",c);
        System.out.printf("for Integers: %d\n",a);
        System.out.printf("for strings: %f\n",b);
        System.out.printf("for strings: %b\n",t);
        System.out.printf("The Gravity of %s is %f m/s%c\n","Earth",9.8,'.');
        System.out.println("");
        System.out.println("Precision");
        System.out.printf("Value of Pi: %.15f\n",Math.PI);
        System.out.printf("The value of g: %.1fm/s\n",9.8);
        System.out.println("");
        System.out.println("Flag");
        System.out.printf("1 Million: %,d$\n",1000000);
        System.out.printf("1 Million: %,d$\n",100000);
        System.out.printf(" Negative (-) inclosed: %(f\n",-999.9);
        System.out.printf("space: % d\n",-876);
        System.out.printf("space: % d\n",876);
        System.out.printf("+: %+d\n",-986);
        System.out.printf("+: %+d\n",506);
        System.out.println("Width");
        System.out.printf("0 padding: %05d\n",1);
        System.out.printf("0 padding: %09d\n",78681);
        System.out.printf("0 padding: %05d\n",111111);
        System.out.printf("right justify padding: %4d\n",65);
        System.out.printf("right justify padding: %4f\n",65.09);
        System.out.printf("right justify padding: %13d\n",65);
        System.out.printf("left justify padding: %-4d%s\n", 65,"$$$");
    }
}
