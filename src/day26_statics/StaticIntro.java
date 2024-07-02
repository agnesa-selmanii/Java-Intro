package day26_statics;

public class StaticIntro {
    //static: var, method, blocks, classes
    public static String iOS="Apple";
    public String brand;

    public void printInfo(){
        System.out.println("iOS: "+iOS + " Brand: "+brand);
    }
    public static void printInfoStatic(){
        System.out.println("iOS: "+iOS);
    }
}
