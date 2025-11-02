package homework.Task14;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Иванов", "Иван", "Грипп", 56, Sex.MAN);
        Patient patient2 = new Patient(2, "Петров", "Петр", "ОРВИ", 34, Sex.MAN);
        Patient patient3 = new Patient(3, "Сидоров", "Сидор", "Инфаркт", 32, Sex.MAN);
        Patient patient4 = new Patient(4, "Сергеева", "Ольга", "Ангина", 35, Sex.WOMAN);
        Patient patient5 = new Patient(5, "Жукова", "Ирина", "Инфаркт", 68, Sex.WOMAN);

        Room room1 = new Room(25, RoomType.MAN);
        Room room2 = new Room(35, RoomType.WOMAN);
        Room room3 = new Room(45, RoomType.MAN);

        Department department1 = new Department("Кардиологическое");
        Department department2 = new Department("Терапевтическое");

        Set<Room> rooms = new HashSet<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
//        room1.getPatients().add(patient1);
//        room1.getPatients().add(patient2);
//        room1.getPatients().add(patient3);
//        room2.getPatients().add(patient4);
//        room3.getPatients().add(patient5);
        department1.getRooms().add(room1);
        department1.getRooms().add(room2);
        department2.getRooms().add(room3);


        room1.addPatient(patient3);
        room1.addPatient(patient4);
        room1.addPatient(patient5);
        room1.addPatient(patient2);
        room1.info();
        System.out.println("Количество мужчин: " + department1.CountbySex(Sex.MAN));
        System.out.println("Количество женщин: " + department1.CountbySex(Sex.WOMAN));
    }
}