package java2hm1;

public class Treadmill implements Obstacles {
    private final int distance;

    public Treadmill (int distance){
        this.distance = distance;
    }

    @Override
    public boolean comeThroughMe(Participant participant) {
        int skillRun = participant.run();
        boolean isSuccess = skillRun >= distance;
        if(isSuccess){
            System.out.println(participant.getName() + " успешно пробежал");
        } else {
            System.out.println(participant.getName() + " не пробежал");
        }
        return skillRun >= distance;
    }
}
