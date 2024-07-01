package day06_ifStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 100,
                n2 = 200,
                n3 = 200;

        String result = "";

        if(n1 == n2 && n2 == n3){
            result = "All equal";
        }

        if(n1 == n2 && n1 != n3){
            result = "n1 & n2 are equal";
        }

        if(n2 == n3 && n2 != n1){
            result = "n2 & n3 are equal";
        }

        if(n1 == n3 && n1 != n2){
            result = "n1 & n3 are equal";
        }

        if(n1 != n2 && n2 != n3 && n1 != n3){
            result = "none of them are equal";
        }

        System.out.println(result);
    }
}
