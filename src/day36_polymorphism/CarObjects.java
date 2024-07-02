package day36_polymorphism;

import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.ArrayList;

public class CarObjects {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Audi", "Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Audi", "Q4", 2015, 33000, "Blue"),
                new Audi("Audi", "A7", 2019, 35000, "Black"),
                new Audi("Audi", "Q8", 2018, 40000, "White"),
                new Audi("Audi", "Q5", 2009, 30000, "Purple"),
                new Audi("Audi", "A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue"),
        };

        /*
        Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016
         */
        ArrayList<Car> eligibleCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof Honda) {
                if (car.getYear() >= 2010 && car.getYear() <= 2011) {
                    eligibleCars.add(car);
                }
            } else if (car instanceof Audi) {
                if (car.getYear() >= 2015 && car.getYear() <= 2019) {
                    eligibleCars.add(car);
                }
            } else if (car instanceof Tesla) {
                if (car.getYear() >= 2015 && car.getYear() <= 2016) {
                    eligibleCars.add(car);
                }
            }
        }

        for (Car car : eligibleCars) {
            System.out.println(car.toString());
        }

        System.out.println("----------------------------------------");

        //  Write a program that can display the car that has the highest price

        double highestPrice = cars[0].getPrice();
        Car highestPriceCar = null;
        for (Car car : cars) {
            if (car.getPrice() > highestPrice) {
                highestPrice = car.getPrice();
                highestPriceCar = car;
            }
        }

        System.out.println(highestPriceCar);

        System.out.println("-----------------------------------------");

        //  Write a program that can display the car that has the lowest price

        double lowestPrice = cars[0].getPrice();
        Car lowestPriceCar = null;

        for (Car car : cars) {
            if (car.getPrice() < lowestPrice) {
                lowestPrice = car.getPrice();
                lowestPriceCar = car;
            }
        }

        System.out.println(lowestPriceCar);


        System.out.println("-----------------------------------------");

        // 1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car each : cars) {
            if (each instanceof Tesla) {
                teslaCars.add((Tesla) each);
            }
        }

        System.out.println(teslaCars);


    }

}

/*
1 Given the following array that contains the car objects:
        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Audi","Q6",2014, 32000, "Red"),
                new Honda("Accord",2011, 20000 , "White" ),
                new Audi("Audi","Q4", 2015, 33000, "Blue"),
                new Audi("Audi","A7",2019, 35000, "Black"),
                new Audi("Audi","Q8",2018, 40000, "White"),
                new Audi("Audi","Q5",2009, 30000, "Purple"),
                new Audi("Audi","A4", 2011, 30000, "Black"),
                new Honda("Civic",2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V",2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X",2014, 48000, "Blue"),
        };

		        (import them from day34 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */