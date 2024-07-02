package day25_constructors;

import day17_customClass.Dog.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list=new ArrayList<>(Arrays.asList(dogs));
        list.removeIf(p->p.size.equalsIgnoreCase("small"));
        dogs=list.toArray(new Dog[0]); //or new Dog[list.size()]
        System.out.println(Arrays.toString(dogs));
    }
}
