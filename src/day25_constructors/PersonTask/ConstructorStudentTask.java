package day25_constructors.PersonTask;

public class ConstructorStudentTask {
    public String name, language;
    public int age;
    public char gender;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;
    public static String planet;

    static {
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
        planet = "Earth";
    }

    public ConstructorStudentTask(String name) {
        this.name = name;
    }
    public ConstructorStudentTask(String name, int age) {
        this(name);
        this.age = age;
    }
    public ConstructorStudentTask(String name, String language) {
        this(name);
        this.language = language;
    }
    public ConstructorStudentTask(String name, char gender) {
        this(name);
        this.gender = gender;
    }
    public ConstructorStudentTask(String name, char gender, int age) {
        this(name,gender);
        this.age = age;
    }
    public ConstructorStudentTask(String name, char gender, int age, String language) {
        this(name,gender,age);
        this.language = language;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }

    public  void eat(String food)
    {
        System.out.println(name+" is eating: "+food);
    }
    public  void drink(String drink)
    {
        System.out.println(name+" is drinking: "+drink);
    }

    public String toString() {
        return "ConstructorStudentTask{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }

    public static void main(String[] args) {
        ConstructorStudentTask c=new ConstructorStudentTask("AN");
        System.out.println(c);
        c.eat("Burger");
        c.drink("Apple juice");

        printPlanetName();
    }

}
