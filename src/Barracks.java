public class Barracks extends AbstractAttackable implements IBuilding {

    // Barracks constructor
    public Barracks(float hp) {
        this.hp = hp > 0 ? hp : 0;
        maxHp = hp;
        isAlive = hp > 0;
    }

    // Barracks default constructor
    public Barracks() {
        this(1200);
    }

    @Override
    public void attackedByInfantry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByArcher(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByCavalry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedBySiege(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 2.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByMonk(AbstractAttacker attacker) {
    }

    @Override
    public void attackedByVillager(AbstractAttacker attacker) {
        if(isAlive) {
            hp += 0.7*attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    @Override
    public void attackedByCastle(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
