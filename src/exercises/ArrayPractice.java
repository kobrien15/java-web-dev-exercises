package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 != 0) {
                System.out.println(intArray[i]);
            }
        }


        String[] quoteArray;
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        quoteArray = quote.split(" ");
        quoteArray = quote.split("\\.");
        System.out.println(Arrays.toString(quoteArray));
    }
}
