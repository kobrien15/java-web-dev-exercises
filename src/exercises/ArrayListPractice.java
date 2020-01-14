package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int sum;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(4);
        sum = sumOfEvenNumbers(integers);
        System.out.println(sum);


//        ArrayList<String> wordArrayList = new ArrayList<>();
//        wordArrayList.add("five");
//        wordArrayList.add("four");
//        wordArrayList.add("three");
//        wordArrayList.add("two");
//        wordArrayList.add("eight");
//        getFiveLetterWords(wordArrayList);
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        List<String> wordArrayList = new ArrayList<String>(Arrays.asList(quote.split("[' '|.|,]")));
        getFiveLetterWords((ArrayList<String>) wordArrayList);

    }

    public static int sumOfEvenNumbers(ArrayList<Integer> integerArrayList){
        int sum = 0;
        for (int i : integerArrayList) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        return sum;
    }

    public static void getFiveLetterWords(ArrayList<String> wordArrayList) {
        int wordLength;
        Scanner input = new Scanner(System.in);
        System.out.println("Words with how many letters would you like returned?");
        wordLength = input.nextInt();
        input.close();

        for (String word : wordArrayList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
