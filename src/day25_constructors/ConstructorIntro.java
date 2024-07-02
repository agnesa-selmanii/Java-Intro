package day25_constructors;

public class ConstructorIntro {
    public static void main(String[] args) {
        new ConstructorIntro();
        new ConstructorIntro(5);

    }

    public ConstructorIntro() {
        System.out.println("Hello");
    }
    public ConstructorIntro(int a) {
        System.out.println("Hello "+a);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

}
