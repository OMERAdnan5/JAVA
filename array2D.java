public class array2D {
    public static void main(String[] args) {
        //An array which consists of arrays as elements is known as an array.
        String [] roman_nums = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String [] roman_names = {
            "Julius", "Augustus", "Tiberius", "Nero", "Maximus", 
            "Cassius", "Brutus", "Lucius", "Flavius", "Marcus"
        };
        String[] roman_cities = {
            "Rome", "Pompeii", "Herculaneum", "Carthage", "Ostia",
            "Ravenna", "Aquileia", "Ephesus", "Antioch", "Alexandria"
        };
        String [] [] roman = {roman_nums,roman_cities,roman_names};
        for(String [] array : roman){
            for(String item : array){
                System.out.print(item+" , ");
            }
            System.out.println("");
        }
        System.out.println("ACCESSING 2D ARRAAY ITEMS");
        System.out.println(roman [0] [1]);
        System.out.println(roman [1] [1]);
        System.out.println(roman [2] [1]);
    }
}
