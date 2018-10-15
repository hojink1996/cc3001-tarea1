public class CavalryUnit extends AbstractUnit {

    // CavalryUnit constructor
    public CavalryUnit(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    public CavalryUnit() {
        this(150, 8);
    }

    @Override
    public void attack(AbstractAttackable attackable) {

    }

    @Override
    public void attackedByInfantry() {

    }
}
