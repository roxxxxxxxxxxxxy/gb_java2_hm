package java2hm1;

public class Wall implements Obstacles {
    private final int height;

    public Wall (int height){
        this.height = height;
    }

    @Override
    public boolean comeThroughMe(Participant participant) {
        int skillJump = participant.jump();
        boolean isSuccess = skillJump >= height;
        if(isSuccess){
            System.out.println(participant.getName() + " успешно перепрыгнул");
        } else {
            System.out.println(participant.getName() + " не перепрыгнул");
        }
        return skillJump >= height;
    }
}
