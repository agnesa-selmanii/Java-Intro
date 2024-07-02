package FightersProblem;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void fighting(Fighter f1, Fighter f2) {
        while (f1.health > 0 && f2.health > 0) {

            //80-->70             //10
            f2.health -= f1.damagePerAttack;
            System.out.println(f1.name+" attacks " +f2.name+"; "+ f2.name+" now has " + f2.health + " health");
            if (f2.health <=0 ||f1.health <=0) {
                break;
            }
            f1.health -= f2.damagePerAttack;
            System.out.println(f2.name+ " attacks "+f1.name+ "; " + f1.name +" now has " + f1.health + " health");
        }

    }
    public static void declareWinner(Fighter f1, Fighter f2) {
        if (f1.health <= 0) {
            System.out.println(f2.name+" Wins!");
        } else if (f2.health <= 0) {
            System.out.println(f1.name+" Wins!");
        }
    }

    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damagePerAttack=" + damagePerAttack +
                '}';
    }
}
