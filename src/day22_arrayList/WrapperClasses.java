package day22_arrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        //parse: returns primitive type, converts int, String.. to primitive values
        //valueOf: returns wrapper class objects, converts int, String... to wrapper class values
        int i1=10;
        Integer i=i1;
        System.out.println(i);

        double d1=10;
        Double d=d1;
        System.out.println(d);

        Float f=3.44f;
        float f1=f;
        System.out.println(f1);

        //UNBOXING: Object to primitive
        //AUTOBOXING: Primitive to object

        String str="11";
        System.out.println(str+10);
        int nr=Integer.parseInt(str)+10;
        System.out.println(nr);

        String s="10";
        Integer is=Integer.valueOf(s);
        Integer in=Integer.parseInt(s);
        System.out.println(is+5);
        System.out.println(in+50);

        System.out.println("Check if it's digit");

        char ch='1';
        char ch1='a';
        boolean isDigit=Character.isLetterOrDigit(ch);
        System.out.println("Is letter or digit: "+isDigit);
        System.out.println("Digit: "+Character.isDigit(ch));
        System.out.println("Letter: "+Character.isLetter(ch));
        System.out.println("Is lower case: "+Character.isLowerCase(ch1));
        System.out.println("Is upper case: "+Character.isUpperCase(ch1));

        System.out.println(Character.getType(ch));

        String specialWord="!Mmmdm@s$kj%dks*";
        char[] specialArray=specialWord.toCharArray();

        for (char c : specialArray) {
            boolean isSpecial=!Character.isLetterOrDigit(c);
            if (isSpecial)
            {
                System.out.println(c+" is special character");
            }
            else {
                System.out.println(c+" is not a scpecial character");
            }
        }

        String string="1a2sd3f4"; //sum of 1+2+3+4=10
        char[] charString=string.toCharArray();
        int sum=0;
        for (char c : charString) {
            if(Character.isDigit(c))
            {
                 sum+= Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
