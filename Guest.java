public class Guest {
    String guest;
    static int numofguests;

    public Guest(String guest) {
        this.guest = guest;
        numofguests++;
    }
    void arrived(){
        System.out.println(this.guest+" has arrived.");
    }
    static void totalguests(){
        System.out.println("Total "+numofguests+" guests.");
    }
    
}
