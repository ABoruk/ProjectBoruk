package homework.Task14;

public class Patient {
    int id;
    String name;
    String surname;
    String diagnoz;
    int age;
    private Sex sex;

    public Patient(int id, String name, String surname, String diagnoz, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnoz = diagnoz;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnoz='" + diagnoz + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surname;
    }

    public void setSurmane(String surmane) {
        this.surname = surname;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        Patient patient = (Patient) o;
        return id == patient.id;
    }


}