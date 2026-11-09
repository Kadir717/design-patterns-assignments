package prototype.gamecharacter;

public class GameCharacter implements Copyable {

    private int id;
    private String name;
    private int level;
    private String weapon;

    public GameCharacter(int id, String name, int level, String weapon) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.weapon = weapon;
    }

    // Copy Constructor
    public GameCharacter(GameCharacter other) {
        this.id = other.id;
        this.name = other.name;
        this.level = other.level;
        this.weapon = other.weapon;
    }

    @Override
    public GameCharacter clone() {
        return new GameCharacter(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}