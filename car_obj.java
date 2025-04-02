public class car_obj {
   private  String model;
   private  String color; //private: prevents direct calling and changes
   private  int price;

    car_obj(String model,String color,int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    //setters allow reading 
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }
    //setter: allows changes
    void setModel( String model){
        this.model = model;
    }
    void setPrice( String price){
        this.model = price;
    }
    void setColor( String color){
        this.model = color;
    }
   
}
