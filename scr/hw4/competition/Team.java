package hw4.competition;

public abstract class Team {

    protected String name;
    protected int maxRange;
    protected int maxJump;

    public Team(String name, int maxRange, int maxJump) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxJump = maxJump;

    }

    public String getName() {
        return name;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public abstract void Run(Participant p);

    public abstract void Jump(Participant p);
}
