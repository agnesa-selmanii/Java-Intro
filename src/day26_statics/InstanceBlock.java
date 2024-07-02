package day26_statics;

public class InstanceBlock {
    String name;

    {
        System.out.println("Just curly braces!!!!");
        //name="James"-every object's name will be James
        name = "James";
    }

    public InstanceBlock() {
        System.out.println("This is a constructor!!!");
    }

    public static void main(String[] args) {
        InstanceBlock i = new InstanceBlock();
        new InstanceBlock();
        InstanceBlock i2 = new InstanceBlock();

        System.out.println(i2.name);
        System.out.println(i.name);
    }
}
