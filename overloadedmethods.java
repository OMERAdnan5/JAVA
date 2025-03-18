public class overloadedmethods {
    public static void main(String[] args) {
        //in java multiple functions can share the same name
        //if they have varying parameters
        list(1,20);
        list(1,20,2);
        list(1,30,3);
        reverse_list(0,10);
        reverse_list(0,20,2);
        reverse_list(0,20,5);
    }
    static  void list(int start,int end){
        for(int i = start;i<=end;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    static  void list(int start,int end,int increment){
        for(int i = start;i<=end;i+=increment){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    static  void reverse_list(int start,int end){
        for(int i = end;i>=start;i--){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    static  void reverse_list(int start,int end,int decrement){
        for(int i = end;i>=start;i-=decrement){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
 
}
