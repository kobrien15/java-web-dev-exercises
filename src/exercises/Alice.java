package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        boolean result;
        String word;
        int index;
        double length;
        String newQuote;

        quote = quote.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        word = input.nextLine().toLowerCase();
        input.close();

        result = quote.contains(word);

        if(result){
            index = quote.indexOf(word);
            length = word.length();

            newQuote = quote.replace(word, "");
            System.out.println("Index: " + index);
            System.out.println("Length: " + length);
            System.out.println(newQuote);

        }

        System.out.println(result);

    }
}
