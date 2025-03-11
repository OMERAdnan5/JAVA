public class whileloop {
    public static void main(String[] args)
    {
        //While loop
        //printing numbers 1 ~ 10
        int i = 1;
        System.out.println("Start");
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("End");
        System.out.println("");
        //printing numbers 10 ~ 1
        System.out.println("Start");
        int j = 10;
        while(j>0){
            System.out.println(j);
            j--;
        }
        System.out.println("End");
        // pattern

        System.out.println("right angle triangle");
        int a = 0;
        while(a<=5){
            // System.out.print("* ");
            int b = 0;
            while(b<=a){
                System.out.print("* ");
                b++;
            }
            System.out.println("");
            a++;
        }
// *
// * *
// * * * 
// * * * *
// * * * * *
// * * * * * * 
        System.out.println("square");
        int c = 0;
        while(c<=5){
            // System.out.print("* ");
            int d = 0;
            while(d<=5){
                System.out.print("$ ");
                d++;
            }
            System.out.println("");
            c++;
            // $ $ $ $ $ $
            // $ $ $ $ $ $
            // $ $ $ $ $ $
            // $ $ $ $ $ $    row & column are same but looks like a rectangle
            // $ $ $ $ $ $ 
            // $ $ $ $ $ $ 
        }
        System.out.println(" inverse right angle triangle");
        int l = 5;
        while(l>=0){
            int m = 0;
            while(m<=l){
                System.out.print("* ");
                m++;
            }
            System.out.println("");
            l--;
            // * * * * * *
            // * * * * *
            // * * * *
            // * * *
            // * *
            // *
        }
        System.out.println("Another 1");
        int x = 0;
        while(x<5){
            int y = 0;
            while(y<x){
                System.out.print("  ");
                y++;
            }
            int z = 0;
            while(z<5-x){
                System.out.print("@ ");
                z++;
            }
            System.out.println("");
            x++;
            // @ @ @ @ @
            //   @ @ @ @
            //     @ @ @
            //       @ @
            //         @

        }
        int p = 5;
        while(p>=0){
            int q = 0;
            while(q<=p-1){
                System.out.print("  ");                    
                q++;
            }                                        
            int r = 0;
            while(r<(5-p)){
                System.out.print("U ");
                r++;
            }

            System.out.println("");
            p--;
    //           U 
    //         U U
    //       U U U
    //     U U U U
    //   U U U U U
         
        }
        int P = 5;
         while(P>=0){
            int Q = 0;
            while(Q<=P-1){
              System.out.print("  ");                    
              Q++;
            }                                        
            int R = 0;
            while(R<(5-P)){
              System.out.print("^ ");
              R++;
            }
            int S = 0;
            while(S<(5-(P+1))){
                System.out.print("^ ");
                S++;
            }

            System.out.println("");
            P--;
          }
    //         ^
    //       ^ ^ ^ 
    //     ^ ^ ^ ^ ^
    //   ^ ^ ^ ^ ^ ^ ^
    // ^ ^ ^ ^ ^ ^ ^ ^ ^
        int V  = 0;
        while(V<=5){
           int W = 0;
           while(W<=V){
            System.out.print("  ");
            W++;
           }
           int T = 0;
           while(T<=5-V){
            System.out.print("# ");
            T++;
           }
           int U = 0;
           while(U<=5-(V+1)){
            System.out.print("# ");
            U++;
           }
           System.out.println("");
           V++;
           
        }
        System.out.println("");
    //   # # # # # # # # # # #
    //     # # # # # # # # #
    //       # # # # # # #
    //         # # # # #
    //           # # #
    //             #

        int X = 5;
        while(X>=0){
            int Y = 0;
            while(Y<=X){
                System.out.print("  ");
                Y++;
            }
            int Z = 0;
            while(Z<= 5-(X)){ 
                System.out.print("$ ");
                Z++;
            }
            int L = 0;
            while(L<= 5-(X+1)){ 
                System.out.print("$ ");
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
                System.out.print("$ ");
                H++;
            }
            int A=0;
            while(A<5-J){
                System.out.print("$ ");
                A++;
            }
            System.out.println("");
            J++;
            
        }
//           $ 
//         $ $ $
//       $ $ $ $ $
//     $ $ $ $ $ $ $
//   $ $ $ $ $ $ $ $ $
// $ $ $ $ $ $ $ $ $ $ $
// $ $ $ $ $ $ $ $ $ $ $
//   $ $ $ $ $ $ $ $ $ 
//     $ $ $ $ $ $ $
//       $ $ $ $ $
//         $ $ $
//           $
    }
}
