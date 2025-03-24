
import java.util.Scanner;
//working on it
public class StringtoInt {
    //UNDER CONSTRUCTION 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("i.e; Four Hundred Thousand");
        System.err.print("Enter number:");
        String str = scn.nextLine();
        String trimed = str.trim();
        System.out.println(trimed);
        System.out.println(trimed.contains(" "));
        System.out.println(trimed.contains("hundred"));
        System.err.println(trimed.indexOf(" "));
        System.err.println(trimed.lastIndexOf(" "));
        String first = trimed.substring(0,trimed.indexOf(" ")).toLowerCase();
        String second = trimed.substring(trimed.indexOf(" ")+1).toLowerCase();
        System.out.println(first);
        System.out.println(second);
        int f = 0;
        long s = 0;
        long t = 0;
        int count = Count(trimed," ");
        switch(first){
            case "one" -> f = 1;
            case "two" -> f = 2;
            case "three" -> f = 3;
            case "four" -> f = 4;
            case "five" -> f = 5;
            case "six" -> f = 6;
            case "seven" -> f = 7;
            case "eight" -> f = 8;
            case "nine" -> f = 9;
            case "ten" -> f = 10;
            case "eleven" -> f = 11;
            case "twelve" -> f = 12;
            case "thirteen" -> f = 13;
            case "fourteen" -> f = 14;
            case "fifteen" -> f = 15;
            case "sixteen" -> f = 16;
            case "seventeen" -> f = 17;
            case "eighteen" -> f = 18;
            case "nineteen" -> f = 19;
            case "twenty" -> f = 20;
            case "thirty" -> f = 30;
            case "forty" -> f = 40;
            case "fifty" -> f = 50;
            case "sixty" -> f = 60;
            case "seventy" -> f = 70;
            case "eighty" -> f = 80;
            case "ninety" -> f = 90;
            case "zero" -> f = 0;
            default -> System.out.println("Invalid Input");
        }
        switch(second){
            case "one" -> s = 1;
            case "two" -> s = 2;
            case "three" -> s = 3;
            case "four" -> s = 4;
            case "five" -> s = 5;
            case "six" -> s = 6;
            case "seven" -> s = 7;
            case "eight" -> s = 8;
            case "nine" -> s = 9;
            case "hundred" -> s = 100;
            case "thousand" -> s = 1000;
            case "million" -> s = 1000000;
            case "billion" -> s = 1000000000;
            case "trillion" -> s = 1000000000000L;
            default -> System.out.println("Invalid Input");
        }
        long Ans = f*s;
        System.out.println(f);
        System.out.println(s);
        if(s<10){
            System.out.println(f + s);
        }
        else{
            System.out.println(f * s);
            System.out.printf("\n%,d",Ans);
        }
        // System.out.println(Count(trimed," "));
        
    }
    static int Count(String str,String a){
      int count = 0;  
      for(int i = 0;i< str.length();i++){
        if(String.valueOf(str.charAt(i)).equals(a)){   //String.valueof() converts char to string
            count++;
         }
      }
      return count; //for the future modifications
    }

    
}
