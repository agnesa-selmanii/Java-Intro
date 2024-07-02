package day25_constructors.StudentTask;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("Ana","A1",20,'F');
        Student s2=new Student("Lana","A2",20,'F');
        Student s3=new Student("Bana","A3",20,'F');

        Student[] students={s1,s2,s3};

        GroupStudents g1=new GroupStudents("GroupA",1);
        g1.addStudent(students);

        System.out.println(g1);

        for (Student each : g1.students) {
            System.out.println("Group name: "+g1.groupName+" Group id: "+g1.groupId);
            System.out.println("Student name: "+each.name+" Student id: "+each.id);
        }

        System.out.println("----------------------------------------------------------");

        Student s4=new Student("Arni","A4",20,'M');
        Student s5=new Student("Barni","A5",20,'M');
        Student[] students2={s4,s5};

        GroupStudents g2 = new GroupStudents("Java Turtles",  2);
        g2.addStudent(students2);



        GroupStudents g3 = new GroupStudents("Slow",  3);
        Student s6=new Student("g3","A4",20,'M');
        Student s7=new Student("Group3","A5",20,'M');
        Student[] students3={s6,s7};
        g3.addStudent(students3);

        GroupStudents[] groups = {g1, g2, g3};

        for (GroupStudents group : groups) {
            System.out.println("Group name: "+group.groupName +" Group id: "+group.groupId);
            for (Student student : group.students) {
                System.out.println("Student name: "+student.name);
            }
        }
    }
}
