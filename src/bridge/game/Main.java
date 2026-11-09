package bridge.game;

public class Main {

    public static void main(String[] args) {

        Developer java = new JavaDeveloper();
        Developer cpp = new CppDeveloper();

        Game game1 = new RacingGame(java);
        Game game2 = new RacingGame(cpp);

        Game game3 = new FootballGame(java);
        Game game4 = new FootballGame(cpp);

        game1.develop();
        System.out.println();

        game2.develop();
        System.out.println();

        game3.develop();
        System.out.println();

        game4.develop();
    }
}