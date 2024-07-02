package day12_customMethods;

public class ReturnVsExit {
    public static void main(String[] args) {
        System.out.println("Test Started");

        methodA();

        System.out.println("Test Completed");


    }

    public static void methodA(){
        System.out.println("Method A");
       //  return;
        System.exit(0);
    }
}
