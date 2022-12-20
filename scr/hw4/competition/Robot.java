package hw4.competition;

public class Robot extends Team {

    public Robot(String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }

    @Override
    public void Run(Participant p) {
        if (p.Get() <= getMaxRange())
            System.out.println("Робот " + getName() + " пробежал " + p.Get() + " метров");
        else System.out.println("Робот " + getName() + " не смог пробежать " + p.Get() + " метров");
    }

    @Override
    public void Jump(Participant p) {
        if (p.Get() <= getMaxJump())
            System.out.println("Робот " + getName() + " смог перепрыгнуть препятствие высотой " + p.Get() + " метра");
        else
            System.out.println("Робот " + getName() + " не смог перепрыгнуть препятствие высотой  " + p.Get() + " метра");
    }
}
