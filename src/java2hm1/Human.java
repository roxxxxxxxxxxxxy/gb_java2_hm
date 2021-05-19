package java2hm1;

public class Human implements Participant {

    private static final int SKILL_JUMP = 1;
    private static final int SKILL_RUN = 5000;
    private String name;

    public Human(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int run() {
        return SKILL_RUN;
    }

    @Override
    public int jump() {
        return SKILL_JUMP;
    }

    public static void main(String[] args) {

        Human human = new Human("Dima");
        human.run();
        human.jump();
    }
}