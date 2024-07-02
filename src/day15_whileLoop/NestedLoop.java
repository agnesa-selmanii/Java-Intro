package day15_whileLoop;

public class NestedLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 15; i >= 1; i--) {

            for (int j = 59; j >= 0 ; j--) {

                for (int k = 999; k >= 0 ; k--) {
                    System.out.print( "\r"+(i-1) + " minutes " + j + " seconds " + k + " millisecond" );
                    Thread.sleep(1);
                }

            }

        }
    }
}
