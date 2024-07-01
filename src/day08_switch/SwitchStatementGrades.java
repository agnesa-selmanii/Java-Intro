package day08_switch;

public class SwitchStatementGrades {
    public static void main(String[] args) {
        int score = 85; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }


        int number = 14;

        String month = "";

        System.out.println(result);
        System.out.println(score);
    }
}
