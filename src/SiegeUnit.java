public class SiegeUnit extends AbstractUnit {

    // SiegeUnit constructor
    public SiegeUnit(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // SiegeUnit default constructor
    public SiegeUnit() {
        this(75, 50);
    }

    @Override
    public void attack(AbstractAttackable attackable) {

    }

    @Override
    public void attackedByInfantry() {

    }
}
