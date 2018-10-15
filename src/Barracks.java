public class Barracks extends AbstractAttackable implements IBuilding {

    // Barracks constructor
    public Barracks(float hp) {
        this.hp = hp;
        isAlive = hp > 0;
    }

    // Barracks default constructor
    public Barracks() {
        this(1200);
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
