public class Barracks extends AbstractAttackable implements IBuilding {

    // Barracks constructor
    public Barracks(float hp) {
        this.hp = hp;
        maxHp = hp;
        isAlive = hp > 0;
    }

    // Barracks default constructor
    public Barracks() {
        this(1200);
    }

    @Override
    public void attackedByInfantry(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByArcher(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByCavalry(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedBySiege(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 2.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByMonk(AbstractAttaker attacker) {
    }

    @Override
    public void attackedByVillager(AbstractAttaker attacker) {
        if(isAlive) {
            hp += 0.7*attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    @Override
    public void attackedByCastle(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
