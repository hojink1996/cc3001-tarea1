public class Barracks extends AbstractAttackable implements IBuilding {

    // Barracks constructor
    public Barracks(int hp) {
        this.hp = hp;
        isAlive = hp > 0;
    }

    // Barracks default constructor
    public Barracks() {
        this(1200);
    }

    @Override
    public void attackedByInfantry() {

    }
}
