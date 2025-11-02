package homework.Task14;

import java.util.*;


public class Room {
    private int number;
    private RoomType type;
    private Set<Patient> patients;

    public Room(int number, RoomType type) {
        this.number = number;
        this.patients = new HashSet<>();
        this.type = type;
    }

    public int getNumber() {
        return number;
    }


    public RoomType getType() {
        return type;
    }


    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public int hashCode() {
        return (number + type.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        Room room = (Room) o;
        if (number == room.number && type.equals(room.type)) {
            return true;
        }

        return false;

    }

    public void addPatient(Patient patient) {
        if (patients.isEmpty()) {
            patients.add(patient);
            return;
        }
        String diagnosis = patients.iterator().next().getDiagnoz();

        if (diagnosis.equals(patient.getDiagnoz())) {
            patients.add(patient);

        } else {
            System.out.println("Пациент с диагнозом: " + patient.diagnoz + " не может быть добавлен");
        }
    }

    public void info() {
        for (Patient patient : getPatients()) {
            System.out.println(patient);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type=" + type +
                ", patients=" + patients +
                '}';
    }
}

