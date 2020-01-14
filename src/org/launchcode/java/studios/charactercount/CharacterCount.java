package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

    private static String quote;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quote:");
        quote = in.nextLine();
        in.close();
//        quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = quote.toCharArray();
        String allowable = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        allowable.toCharArray();
        int count = 0;
        Map<Character, Integer> characterCount = new HashMap<>();

        // initialize array and initialize count
        for (int i=0; i < charactersInString.length; i++) {
            if (!Character.isAlphabetic(charactersInString[i])) {
                continue;
            }
            if(!characterCount.containsKey(charactersInString[i])){
                characterCount.put(charactersInString[i], count);
            }
        }

        countCharacters(characterCount, charactersInString);

    }

    public static void countCharacters(Map<Character, Integer> characterCount, char[] charactersInString) {

        for (Character c : charactersInString) {
            if (characterCount.containsKey(c)) {
                characterCount.put(c,characterCount.get(c)+1);
            }
        }
        System.out.println(characterCount);
    }

}
