public class methodoveriding {
    public static void main(String[] args) {
      Animal bear = new Animal("Berries", "Bear");
      Fish goldy = new Fish("pallets","Goldfish"); 
      bear.eat();
      bear.movement();
      System.out.println(bear); //memory location
      goldy.eat();
      goldy.movement();//swims
      System.out.println(goldy); // --Fishy-- 

    }
}
