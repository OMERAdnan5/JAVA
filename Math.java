public class Math {
    public static void main(String[] args)
    {
      int a , b;
      double A,B;
      a = 12;b =2;A=12.0;B=3.5;
      System.out.println(a+" + "+b+" = "+(a+b));
      System.out.println(a+" - "+b+" = "+(a-b));
      System.out.println(a+" * "+b+" = "+(a*b));
      System.out.println(a+" / "+b+" = "+(a/b));//treated as int
      System.out.println(A+" / "+B+" = "+(A/B));
      System.out.println(a+" % "+b+" = "+(a%b));
      System.out.println(a+" += "+b+" = "+a+"="+a+"+"+b+"="+(a+=b));
      System.out.println(a+" -= "+b+" = "+a+"="+a+"-"+b+"="+(a-=b));
      System.out.println(a+" *= "+b+" = "+a+"="+a+"*"+b+"="+(a*=b));
      System.out.println(a+" /= "+b+" = "+a+"="+a+"/"+b+"="+(a/=b));
      System.out.println(a+" %= "+b+" = "+a+"="+a+"%"+b+"="+(a%=b));
      System.out.println(a+" ++ = "+a+"="+a+"+"+1+"="+(a++));
      System.out.println(a+" -- = "+a+"="+a+"-"+1+"="+(a--));
     //PEMDAS(paranthesis,Exponent,Multiplication,Addition,Subtraction)
      //0rder of precedence
      double problem = 22+3*4/9*(7-5)*2.1;
      System.out.println(problem);


    }
}