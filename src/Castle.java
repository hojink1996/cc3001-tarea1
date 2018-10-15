public class Castle extends AbstractAttaker implements IBuilding {

    // Castle constructor
    public Castle(float hp, float attack) {
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
    public void attackedByInfantry(AbstractAttaker attacker) {

    }

    @Override
    public void attackedByArcher(AbstractAttaker attacker) {

    }

    @Override
    public void attackedByCavalry(AbstractAttaker attacker) {

    }

    @Override
    public void attackedBySiege(AbstractAttaker attacker) {

    }

    @Override
    public void attackedByMonk(AbstractAttaker attacker) {

    }

    @Override
    public void attackedByVillager(AbstractAttaker attaker) {

    }

    @Override
    public void attackedByCastle(AbstractAttaker attaker) {

    }
}
