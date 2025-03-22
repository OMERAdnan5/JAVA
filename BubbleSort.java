public class BubbleSort {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b) > 0);// true based on ASCII values
        System.out.println(a.compareTo(b) < 0);//false
        System.out.println(1>2);
        System.out.println(2>1);
        System.out.println("\nBubble Sort");
        String[] alphabets = {"b","f","c","a","e","d"};
        display(alphabets);
        for(int i = 0;i<alphabets.length-1;i++){
            for(int j = 0;j<alphabets.length-i-1;j++){
                if(alphabets[j].compareTo(alphabets[j+1])>0){
                    String alpha = alphabets[j];
                    alphabets[j] = alphabets[j+1];
                    alphabets[j+1] = alpha;
                }
            }
        }   
        display(alphabets);     
    }
    static void display(String[] array){
        for(String chr : array){
            System.out.print(chr+" ");
        }
        System.out.println("");
    }
}
