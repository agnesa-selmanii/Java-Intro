package day26_statics;

public class ConstructorCalls {

    //this()- only a ctor can call another ctor, ctor can't be called by its name only this()
    //this()-should be the first line
    //ctor can only call oly one ctor
    //ctor can't call itself
    //methods can't call ctor
    public ConstructorCalls(){
        System.out.println("Constructor without parameters");
    }
    public ConstructorCalls(char a){
        this();
        System.out.println("Constructor with parameters: "+a);
    }

    public ConstructorCalls(int a){
        this('F');
        System.out.println("Constructor with parameters int: "+a);
    }

    public static void main(String[] args) {
        ConstructorCalls c=new ConstructorCalls();
        System.out.println("-----------------------");
        ConstructorCalls c1=new ConstructorCalls('F');
        System.out.println("-----------------------");
        ConstructorCalls c2=new ConstructorCalls(3);
    }
}
