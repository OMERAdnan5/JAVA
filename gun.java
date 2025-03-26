public class gun {
    String color,model;
    gun(String color , String model){
      this.color = color;
      this.model = model;
    }
    void shoot(){
        System.out.println("You are shooting "+model);
    }
}
