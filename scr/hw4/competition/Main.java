package hw4.competition;

public class Main {
    public static void main(String[] args) {
        int Stage = 0;

        Team[] team = new Team[3];
        team[0] = new Cat("Kitty", 500, 2);
        team[1] = new Human("Ira", 3000, 1);
        team[2] = new Robot("R2D2", 10000, 10);

        Participant[] part = new Participant[2]; // массив перешкод
        part[0] = new Wall(2);
        part[1] = new Treadmill(1500);


        playMarathon(team, part);
    }

    public static void playMarathon(Team[] team, Participant[] part) {
        int start = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                part[i].Move(team[j]);
            }
        }
    }
}
