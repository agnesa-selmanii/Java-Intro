package day19_array;

public class Initials {
    public static void main(String[] args) {

        String[] classmates = {"Java School", "Computer Science", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(  classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }
    }

}
