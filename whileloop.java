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
    }


}
