public class forloop {
    public static void main(String[] args){
        //for loop
        //Even numbers 1 - 10
        for(int i = 1;i<=10;i++){
             if(i%2==0){
                System.out.println(i);
             }
        }
        //patterns
        //1
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
               System.out.print(" for");
            }
            System.out.println("");
        }
        System.out.println("");
        //2
        for(int i = 5;i>=1;i--){
            for(int j = 1;j<=i;j++){
               System.out.print(" for");
            }
            System.out.println("");
        }
        //3
        System.out.println("");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=6-i;j++){
                System.out.print(" l");
             }
            System.out.println("");
        }
        System.out.println("");
        //4
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=6-i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" l");
             }
            System.out.println("");
        }
        System.out.println("");
        //5
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=6-i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" l");
            }
            for(int j = 1;j<=6-i;j++){
                System.out.print(" o");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        //5
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=6-i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" l");
            }
            for(int j = 1;j<=5;j++){
                System.out.print(" o");
            }
            for(int j = 1;j<=6-i;j++){
                System.out.print(" l");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=6-i;j++){
               System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" l");
            }
            for(int j = 1;j<=i-1;j++){
                System.out.print(" o");
            }
            System.out.println("");
        }
        System.out.println("");

        
    }
}
