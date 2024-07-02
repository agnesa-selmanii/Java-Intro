package day26_statics;

public class CarConstructor {
    String make, model;
    int year;
    double price;
    public CarConstructor(String make){
            this.make=make;
        System.out.println("Make: "+make);
    }
    public CarConstructor(String model, String make){
        this(make);
        this.model=model;
        System.out.println("Model: "+model);
    }

    public CarConstructor(String model, String make, int year){
        this(make, model);
        this.year=year;
        System.out.println("Year: "+year);
    }
    public CarConstructor(String model, String make, int year, double price){
        this(make, model,year);
        this.price=price;
        System.out.println("Price: "+price);
    }

    public String toString() {
        return "CarConstructor{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        CarConstructor c=new CarConstructor("Mercedes","Benz",2023,15968.36);
        System.out.println(c);

        CarConstructor c1=new CarConstructor("Mercedes","Benz");
        System.out.println(c1);
    }
}
