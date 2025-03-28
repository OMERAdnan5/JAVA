public class Fish extends Animal {
    Fish(String eats,String type){
        super(eats,type);
    }
    @Override
    void movement(){
        System.out.println(this.type+" swims.");
    }
    @Override
    public  String toString(){
        return "--Fishy--";
    }
}
