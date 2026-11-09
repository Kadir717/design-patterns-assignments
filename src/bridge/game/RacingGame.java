package bridge.game;

public class RacingGame extends Game {

    public RacingGame(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Developing Racing Game:");
        developer.writeCode();
    }
}