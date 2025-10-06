package homework.Task7;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Иван", "Иванов", "Тракторный", 3, "Т-12", 40);
        student.info();
        student.changeGroup("B-210");
        student.currentGroup();
        student.changepointandGroup(36, "К-180");


//Task 6 Massive
        Student[] students = new Student[5];
        students[0] = new Student(2, "Иван", "Иванов", "Тракторный", 3, "Т-12", 112);
        students[1] = new Student(3, "Петров", "Петр", "Моторный", 4, "Н-205", 50);
        students[2] = new Student(4, "Сидор", "Сидоров", "Экономический", 5, "Т-13", 18);
        students[3] = new Student(5, "Ольга", "Милая", "Финансовый", 1, "Н-206", 13);
        students[4] = new Student(6, "Елена", "Прекрасная", "Механический", 2, "Т-14", 87);

        Student helper = new Student(0, "", "", "", 0, "", 0);

        Student[] goodStudents = helper.getStudents(students, 20);
        for (Student s : goodStudents) {
            s.info();
        }

    }}



