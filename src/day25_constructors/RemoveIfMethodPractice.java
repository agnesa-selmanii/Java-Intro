package day25_constructors;

import day17_customClass.Dog.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        //arrayList that contains small dogs
        ArrayList<Dog> smallDogs = new ArrayList<>();
        smallDogs.addAll(Arrays.asList(dogs));
        System.out.println(smallDogs);

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        System.out.println(smallDogs);

        /*for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small"))
            {
                smallDogs.add(dog);
            }
        }
        System.out.println(smallDogs);*/

        //young dogs
        ArrayList<Dog> youngDogs = new ArrayList<>();
        youngDogs.addAll(Arrays.asList(dogs));
        youngDogs.removeIf(p->p.age>=4);
        System.out.println(youngDogs);
    }
}
