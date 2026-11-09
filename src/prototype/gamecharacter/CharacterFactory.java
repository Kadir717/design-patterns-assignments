package prototype.gamecharacter;

public class CharacterFactory {

    private GameCharacter prototype;

    public CharacterFactory(GameCharacter prototype) {
        this.prototype = prototype;
    }

    public void setCharacter(GameCharacter prototype) {
        this.prototype = prototype;
    }

    public GameCharacter cloneCharacter() {
        return prototype.clone();
    }
}