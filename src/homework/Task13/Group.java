package homework.Task13;
//Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll());
// Сигнатура метода: public void transferToGroup(Group newGroup);

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void setStudents(List<Student> students) {
        this.students = students;

    }

    public void removeStudentsByMark(int mark1) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() < mark1) {
                students.remove(i);
            }
        }
    }


    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();


        }

    }

    public double getAvgMark() {
        double avg_mark = 0;
        double v = 0;
        for (Student student : students) {
            v = (avg_mark += student.getMark()) / students.size();
        }
        return v;
    }

}

