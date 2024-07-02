package day14_forLoop;

public class CountLettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "ABCD123#$@!";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
