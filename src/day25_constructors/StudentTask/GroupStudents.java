package day25_constructors.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupStudents {
    String groupName;
    int groupId;
    ArrayList<Student> students=new ArrayList<>();

    public GroupStudents(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void addStudent(Student[] student)
    {
        students.addAll(Arrays.asList(student));
    }

    public void addStudent(String name, String id, int age, char gender)
    {
        //Student student=new Student(name,id,age,gender);
        //students.add(student);
        students.add(new Student(name,id,age,gender));
    }

    public void removeStudent(String id)
    {
        students.removeIf(p->p.id.equals(id));
    }

    @Override
    public String toString() {
        return "GroupStudents{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students.size() +
                '}';
    }
}
