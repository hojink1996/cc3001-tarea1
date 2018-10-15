public class Castle extends AbstractAttaker implements IBuilding {

    // Castle constructor
    public Castle(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // Castle default constructor
    public Castle() {
        this(4800, 11);
    }

    @Override
    public void attack(AbstractAttackable attackable) {

    }

    @Override
    public void attackedByInfantry() {

    }
}
