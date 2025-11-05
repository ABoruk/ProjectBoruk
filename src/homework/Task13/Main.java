package homework.Task13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иван", "Иванов", "131093", "Минск", 5);
        Student student2 = new Student("Федор", "Федоров", "121195", "Борисов", 4);
        Student student3 = new Student("Сергей", "Сергеев", "01041997", "Молодечно", 33);
        Group group1 = new Group("А-240");
        Group group2 = new Group("А-250");
        Group group3 = new Group("А-260");
        Faculty faculty3 = new Faculty("Экономический");
        Faculty faculty1 = new Faculty("Математический");
        Faculty faculty2 = new Faculty("Химический");

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        group1.getStudents().add(student1);
        group2.getStudents().add(student2);
        group3.getStudents().add(student3);
        faculty1.getGroups().add(group1);
        faculty2.getGroups().add(group3);
        faculty3.getGroups().add(group2);
        group1.removeStudentsByMark(6);
//System.out.println(group1);
        group1.transferToGroup(group2);
        System.out.println(group1);
        System.out.println(group2);
        double avg = group3.getAvgMark();
        System.out.println(avg);
    }
}
