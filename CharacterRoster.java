package fantasybattle;
import java.util.ArrayList;
import java.util.List;
class CharacterRoster {
    private final List<GameCharacter> characters = new ArrayList<>();

    public CharacterRoster() {
        characters.add(new Warrior("Ravena"));
        characters.add(new Mage("Luna"));
        characters.add(new Archer("Melanore"));
        characters.add(new Assasin("Wraith"));
    }

    public GameCharacter getCharacter(int index) {
        if (index < 0 || index >= characters.size()) {
            return null;
        }
        return characters.get(index);
    }

    public int size() {
        return characters.size();
    }
}