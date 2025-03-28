public class Animal {
    String eats;
    String type;
    Animal( String eats, String type){
        this.eats = eats;
        this.type = type;
    }
    void eat(){
      System.out.println(this.type+" eats "+this.eats);
    }
    void movement(){
        System.out.println(this.type+" runs");
    }
}
