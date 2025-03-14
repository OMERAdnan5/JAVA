public class diamond {
    public static void main(String[] args) {
        int X = 5;
        while(X>=0){
            int Y = 0;  //⩓⩔
            while(Y<=X+1){
                System.out.print("  ");
                Y++;
            }
            int Z = 0;
            while(Z<= 5-(X+1)){ 
                System.out.print("⩓ ");
                Z++;
            }
            int L = 0;
            while(L<= 5-(X+2)){ 
                System.out.print("⩓ ");
                L++;
            }   
            System.out.println("");
            X--; 
        }
        int J = 0;
        while(J<=5){
            int K =0;
            while(K<=J){
                System.out.print("  ");
                K++;
            }
            int H=0;
            while(H<=5-J){
                System.out.print("⩔ ");
                H++;
            }
            int A=0;
            while(A<5-J){
                System.out.print("⩔ ");
                A++;
            }
            System.out.println("");
            J++;
            
        }
    }
} 
    
