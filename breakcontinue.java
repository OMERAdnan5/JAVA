public class breakcontinue {
    public static void main(String[] args){
        //break:used to terminate a loop or stop it
        //continue:used to skip an iteration 
        for(int i = 0;i>=0;i++){ //is an infinite loop.
           if(i == 10){
            break; //stops it when i == 10
           }
           System.out.print(i+" ");
        }
        System.out.println(" ");
        for(int i = 0;i<=25;i++){
            if(i%2 == 0){
             continue; //skipping even numbers
            }
            System.out.print(i+" ");
         }
    }
}
