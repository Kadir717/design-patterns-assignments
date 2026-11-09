package prototype.gamecharacter;

public class GameRunner {

    public static void main(String[] args) {

        // 1. Create original character
        GameCharacter original = new GameCharacter(
                1,
                "Warrior",
                10,
                "Sword"
        );

        // 2. Create factory
        CharacterFactory factory = new CharacterFactory(original);

        // 3. Create two copies
        GameCharacter character1 = factory.cloneCharacter();
        GameCharacter character2 = factory.cloneCharacter();

        // 4. Modify first character
        character1.setName("Knight");
        character1.setLevel(20);
        character1.setWeapon("Golden Sword");

        // 5. Modify second character
        character2.setName("Archer");
        character2.setLevel(15);
        character2.setWeapon("Bow");

        // 6. Print results
        System.out.println("Original Character:");
        System.out.println(original);

        System.out.println("\nFirst Clone:");
        System.out.println(character1);

        System.out.println("\nSecond Clone:");
        System.out.println(character2);

        // 7. Check object references
        System.out.println("\nOriginal == Clone 1: "
                + (original == character1));

        System.out.println("Clone 1 == Clone 2: "
                + (character1 == character2));
    }
}