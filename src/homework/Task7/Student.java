package homework.Task7;
//Task 1 Initialize
public class Student {
    public int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int avg_point;

//public Student(){
//    System.out.println("Конструктор вызвался");
//}

    public Student(int id, String name, String surname, String faculty, int course, String group, int avg_point) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avg_point = avg_point;
    }

    //Task2 method info
    public  void info() {
        System.out.println("Айди студента " +this.id);
        System.out.println("Имя- " +this.name);
        System.out.println("Фамилия- " +this.surname);
        System.out.println("Факультет- " +this.faculty);
        System.out.println("Курс- " + this.course);
        System.out.println("Группа- " +this.group);
        System.out.println("Средняя оценка- " +this.avg_point);
    }
//Task 3 Change Group
    public void changeGroup(String newGroup){
        group=newGroup;
    System.out.println("Новая группа: " + group);
}
//Task 4 Current Group
    public void currentGroup(){
        System.out.println("Текущая группа: " +group);
}
//Task 5 Change point and Group
    public void changepointandGroup(int newPoint,String newGroup) {
        avg_point = newPoint;
        group = newGroup;
        System.out.println("Новая оценка: " + avg_point);
        System.out.println("Новая группа: " + group);
    }


        public Student[] getStudents(Student[] students, int mark) {

            int count = 0;
            for (Student student : students) {
                if (student.avg_point > mark) {
                    count++;
                }
            }

            Student[] result = new Student[count];
            int a = 0;


            for (Student student : students) {
                if (student.avg_point > mark) {
                    result[a++] = student;
                }
            }

return result;
        }
}



