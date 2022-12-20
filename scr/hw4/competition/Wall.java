package hw4.competition;

public class Wall extends Participant {// стена
    private int Height;

    public Wall(int height) {
        this.Height = height;
    }

    @Override
    public int Get() {
        return Height;
    }

    @Override
    public void Set(int height) {
        Height = height;
    }

    @Override
    public void Move(Team a) {
        a.Jump(this);
    }
}