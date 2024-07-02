package day25_constructors.StudentTask;

public class Student {
    String name, id;
    int age;
    char gender;

    public Student(String name, String id, int age, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
