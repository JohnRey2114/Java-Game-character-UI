package fantasybattle;

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Warrior";
    }

    @Override
    public String attack() {
        return getName() + " swings a mighty sword!";
    }

    @Override
    public String specialMove() {
        return getName() + " uses Shield Bash!";
    }

    @Override
    public String getAbility() {
        return "Powerful melee attacks and defense";
    }
}