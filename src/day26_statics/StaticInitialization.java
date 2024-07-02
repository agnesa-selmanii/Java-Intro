package day26_statics;

public class StaticInitialization {
    public static int a,b;
    public static String c;

    static {
        a=1;
        b=2;
        c="Hello Java";
    }

    public static void main(String[] args) {
        System.out.println(StaticInitialization.a);
        System.out.println(StaticInitialization.b);
        System.out.println(StaticInitialization.c);

        //if you initialize the variables only in main, and you call this clas in other programs
        //it won't take the below values. It will be 0,0,null. But in static block it takes the values
        a=3;
        b=3;
        c="Override";

        System.out.println(StaticInitialization.a);
        System.out.println(StaticInitialization.b);
        System.out.println(StaticInitialization.c);


    }
}
