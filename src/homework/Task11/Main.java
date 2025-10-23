package homework.Task11;

public class Main {
    public static void main(String[] args) {
        RobotCooker cooker = new RobotCooker("Робот-повар", "14", "Англия", "Плита", true);
        RobotSapper sapper = new RobotSapper("Робот-сапёр", "140", "Миноискатель", "Железо", false);
        RobotBuilder builder = new RobotBuilder("Робот-строитель", "1400", "Россия", "Кран", "Дерево", true);
        cooker.repair();
        sapper.repair();
        builder.repair();
//        cooker.turnOn();
//        cooker.uniquePossibility();
//
//        sapper.turnOn();
//        sapper.uniquePossibility();
//
//        builder.turnOn();
//        builder.uniquePossibility();
        Robot[] allRobots = {sapper, cooker, builder};
        RobotEngineer[] robotEngineers = {builder, sapper};
        RobotSapper[] robotSappers = {sapper};


        for (Robot all : allRobots) {
            all.uniquePossibility();
        }
        for (RobotEngineer engineer : robotEngineers) {
            engineer.createItem();

        }
        for (RobotSapper sappers : robotSappers) {
            sappers.uniquePossibility();
        }
    }
}
