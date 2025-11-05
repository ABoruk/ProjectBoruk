package homework.Task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Room> rooms;

    public Department(String name) {
        this.name = name;
        this.rooms = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public int CountbySex(Sex sex) {
        int count = 0;
        for (Room room : rooms) {

            for (Patient patient : room.getPatients()) {
                if (patient.getSex() == sex) {
                    count++;
                }

            }


        }

        return count;
    }

}
