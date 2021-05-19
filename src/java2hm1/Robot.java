package java2hm1;

public class Robot implements Participant {

    public static final int SKILL_JUMP = 0;
    public static final int SKILL_RUN = 10;
    public String name;

    public Robot(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int run(){
        return SKILL_RUN;
    }

    @Override
    public int jump(){
        return SKILL_JUMP;
    }

    public static void main(String[] args) {

        Robot robot = new Robot("R2D2");
        robot.run();
        robot.jump();
    }
}
