package java2hm1;

public class Test {
    public static void main(String[] args) {
        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(1000);

        Human human = new Human("Dima");
        Cat cat = new Cat("Tom");
        Robot robot = new Robot("R2D2");

        Participant[] participants = {human, robot, cat};
        Obstacles[] obstacles = {wall, treadmill};

        for (int i = 0; i < obstacles.length; i++) {
            comeThroughObstacle(obstacles[i], participants);
        }
    }

    private static void comeThroughObstacle(Obstacles obstacles, Participant[] participants) {
        for (Participant participant1 : participants) {
            obstacles.comeThroughMe(participant1);
        }
    }
}
