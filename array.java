import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        //array is a variable which can contain multiple values
        String [] courses = {"C&AG","physics","OOPs","P.St","ITSE"};
        System.out.println(courses); //memory address
        System.out.println("\"Courses\"");
        System.out.println(courses[0]);//element at respective index
        System.out.println(courses[1]);
        System.out.println(courses[4]);
        String [] beverages = {"Coke","7up","Sprite",""};
        System.out.println("\"Beverages\"");
        beverages[3] = "Pepsi";
        beverages[2] = "Marenda";
        System.out.println(beverages[3]);
        System.out.println(beverages[2]);
        String[] alpha = {"w","t","a","s","p","b","e","q","f","h","g","l","x","r","o","m","u","v","n","d","z","c","i","j","k","y"};
        Arrays.sort(alpha); //arranges the Array based on their ASCII values
        //Enhanced for loop;
        for(String i:alpha){ //similar to for i in alpha (in python)
            System.out.print(i+" ");
        }
        System.out.println("");
        Arrays.fill(alpha,"!"); //replaces all items
        //Enhanced for loop;
        for(String i:alpha){ //similar to for i in alpha (in python)
            System.out.print(i+" ");
        }
    }
}
