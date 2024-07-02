package day26_statics;

public class NestedCarClass {
    public String make, name;
    public static int wheels;

    static {
        wheels = 4;
    }

    public class CarEngine {

        public void method() {
            System.out.println(make);
            System.out.println(name);
            System.out.println(wheels);
        }
    }

    public static class InnerStaticClass {
        public static void method() {
            System.out.println(wheels);
        }
    }

    public static void main(String[] args) {
        NestedCarClass nc = new NestedCarClass();
        nc.new CarEngine().method();
        CarEngine obj = nc.new CarEngine();


        InnerStaticClass obj3=new InnerStaticClass();
        new InnerStaticClass();
        InnerStaticClass.method();

    }

}
