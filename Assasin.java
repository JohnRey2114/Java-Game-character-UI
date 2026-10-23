package fantasybattle;

class Assasin extends GameCharacter {
    public Assasin(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Assasin";
    }

    @Override
    public String attack() {
        return getName() + " Throws a Shuriken!";
    }

    @Override
    public String specialMove() {
        return getName() + " use Barrages!";
    }

    @Override
    public String getAbility() {
        return "agile movement and hard to catch";
    }
}