

public class arraybubblesort {
    public static void main(String[] args){
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b) > 0);// true based on ASCII values
        System.out.println(a.compareTo(b) < 0);//false
        System.out.println(1>2);
        System.out.println(2>1);
        System.out.println("\nBubble Sort");
        String[] alphabets = {"b","f","c","a","e","d"};
        Array(alphabets);
        int[] nums = {3,1,6,4,5,8,7,2};
        Numray(nums);
        for(int i = 0;i<alphabets.length-1;i++){
            for(int j = 0;j<alphabets.length-i-1;j++){
                if(alphabets[j].compareTo(alphabets[j+1])>0){
                    String alpha = alphabets[j];
                    alphabets[j] = alphabets[j+1];
                    alphabets[j+1] = alpha;
                }
            }
        }        
        Array(alphabets);
        for(int i = 0;i<nums.length-1;i++){
            for(int j = 0 ;j <nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int num = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = num;
                }
            }
        }
        Numray(nums);
    }
    static  void Array(String[] array){ //we can't print array but this function allows us to
        System.out.print("{");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println(" ");
    }
    static  void Numray(int[] array){ //we can't print array but this function allows us to
        System.out.print("{");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println(" ");
    }
}
