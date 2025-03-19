import java.util.Scanner;
public class ArraySearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //searching an item in an array;
        //check if student is present or not 
        String[] students ={
            "Umer","Saad","Ebad","Hasan",
            "Ahmed", "Fatima", "Omar", "Aisha", "Ali",
            "Zainab", "Hassan", "Maryam", "Khalid", "Sara"};
        System.out.print("Enter name of the Student: ");
        String student = input.nextLine();
        student = student.substring(0, 1).toUpperCase() + student.substring(1).toLowerCase();
        boolean absent = true;
        for(int i=0;i<students.length;i++){
           if(students[i].equalsIgnoreCase(student)){
              System.out.println(student+" is present");
              absent = false;
              break;
            }
        }
        if(absent){
            System.out.println(student+" is absent");
        }
        input.close();
    }
}
