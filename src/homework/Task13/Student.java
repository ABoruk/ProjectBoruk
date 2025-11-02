package homework.Task13;
//2. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.

//
//        1.1. Создать несколько студентов.
//1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
//        1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
//        1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
//1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
//1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
public class Student {
    private String name;
    private String surname;
    private String date;
    private String city;
    private int mark;

    public Student(String name, String date, String surname, String city, int mark) {
        this.name = name;
        this.date = date;
        this.surname = surname;
        this.city = city;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date='" + date + '\'' +
                ", city='" + city + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
