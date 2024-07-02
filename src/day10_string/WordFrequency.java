package day10_string;

public class WordFrequency {
    public static void main(String[] args) {
        String word="java";
        String sentence="java python java";
        String temp=sentence.toLowerCase().replace(word.toLowerCase(),word.substring(1));
        int frequency=sentence.length()-temp.length();
        System.out.println(frequency);
    }
}
