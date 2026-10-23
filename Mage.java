package fantasybattle;

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Mage";
    }

    @Override
    public String attack() {
        return getName() + " casts a Lightning!";
    }

    @Override
    public String specialMove() {
        return getName() + " uses Lightning Storm!";
    }

    @Override
    public String getAbility() {
        return "Elemental magic and powerful spells";
    }
}