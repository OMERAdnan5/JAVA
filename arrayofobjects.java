public class arrayofobjects {
    public static void main(String[] args) {
        gun gun1 = new gun("black","Ak-47");
        gun gun2 = new gun("grey","shot gun");
        gun gun3 = new gun("red","locus");
        gun[] guns = {gun1,gun2,gun3};
        for(int i = 0; i < guns.length;i++){
          guns[i].shoot();
        }
        gun[] gz = {new gun("colo1","gun1"),new gun("colo1","gun2"),new gun("colo1","gun3")};
        System.out.println(" ");
        for (gun g : gz) {
            g.shoot();
        }

    }
}
