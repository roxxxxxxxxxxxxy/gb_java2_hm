package java2hm1;

public class Cat implements Participant {

    public static final int SKILL_JUMP = 2;
    public static final int SKILL_RUN = 500;
    public String name;

    public Cat(String name){
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

        Cat cat = new Cat("Tom");
        cat.run();
        cat.jump();
    }
}