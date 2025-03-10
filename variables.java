public class  variables{
    public static void main(String[] args){
    //variables are containers of values and are reusable code
    //Primitive:(int,boolean,char,double)value stored directly to memory(stack)
    //Reference:(String,Array and object)memory addresses(stack) that point to (heap)
        // integers
        int age = 19; // 19.5 will cause error with int
        int year = 2025;
        int quantity = 7;
        System.out.println("My age is "+age);
        System.out.println("There are "+quantity+" Days in a week.");
        System.out.println("The year is "+year);
        //doubles
        double Pi = 3.142;
        double price = 12.99;
        double GPA = 3;
        System.out.println("The value of Pi is "+Pi);
        System.out.println("Gym membership costs "+price+" $");
        System.out.println("I guess my Gpa will be "+GPA);
        //char
        char percent = '%'; // '' for char
        char hashtag = '#';
        char blood_type = 'B';
        System.out.println("72.09 "+percent);
        System.out.println(hashtag+"Coding Java in Ramadan");
        System.out.println("My blood type is "+blood_type+"+");
        //booleans
        boolean Online = true;
        boolean Woman = false;
        boolean student = true;
        System.out.println("I am online: "+Online);
        System.out.println("Am I a woman?: "+Woman);
        System.out.println("I am a university student :"+student);
        //String
        String name = "Umer";
        String Sem = "2nd";
        String city = "Karachi";
        String Uni = "SSUET";
        System.out.println("My name is "+name+".I live in "+city+"\n.I am a "+Sem+" Semester student in "+Uni+" university.");




    }
}