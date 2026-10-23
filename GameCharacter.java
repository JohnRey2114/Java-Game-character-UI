package fantasybattle;
abstract class GameCharacter {
    private final String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();

    public abstract String attack();

    public abstract String specialMove();

    public abstract String getAbility();

    public String getDetails() {
        return "Name: " + name
                + "\nClass: " + getType()
                + "\nAbility: " + getAbility()
                + "\nAttack: " + attack()
                + "\nSpecial Move: " + specialMove();
    }

    @Override
    public String toString() {
        return name + " (" + getType() + ")";
    }
}