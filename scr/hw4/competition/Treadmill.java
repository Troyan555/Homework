package hw4.competition;

public class Treadmill extends Participant { // беговая дорожка
    private int range;

    public Treadmill(int range) {

        this.range = range;
    }

    @Override
    public int Get() {

        return range;
    }

    @Override
    public void Set(int range) {
        this.range = range;
    }

    @Override
    public void Move(Team a) {
        a.Run(this);
    }
}
