package FightersProblem;

public class FighterObject {
    public static void main(String[] args) {
        Fighter tom=new Fighter("Tom",10,2);
        Fighter harry=new Fighter("Harry",5,4);

        System.out.println(tom);
        System.out.println(harry);

        Fighter.fighting(tom,harry);
        Fighter.declareWinner(tom,harry);

        System.out.println(tom);
        System.out.println(harry);


        System.out.println("\n\n");


        Fighter jerry=new Fighter("Jerry",30,3);
        Fighter harald=new Fighter("Harald",20,5);

        System.out.println(jerry);
        System.out.println(harald);

        Fighter.fighting(jerry,harald);
        Fighter.declareWinner(jerry,harald);

        System.out.println(jerry);
        System.out.println(harald);
    }
}
