package fantasybattle;

class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Archer";
    }

    @Override
    public String attack() {
        return getName() + " fires a sharp arrow!";
    }

    @Override
    public String specialMove() {
        return getName() + " uses Rain of Arrows!";
    }

    @Override
    public String getAbility() {
        return "Long-range attacks and precision";
    }
}