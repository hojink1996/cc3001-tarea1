public class Castle extends AbstractAttaker implements IBuilding {

    // Castle constructor
    public Castle(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = hp;
    }

    // Castle default constructor
    public Castle() {
        this(4800, 11);
    }

    @Override
    public void attack(AbstractAttackable attackable) {
        if(isAlive) {attackable.attackedByCastle(this);}
    }

    @Override
    public void attackedByInfantry(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.3 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByArcher(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.1 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByCavalry(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.3 * attacker.getAttack();
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
            hp += 0.3 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    @Override
    public void attackedByCastle(AbstractAttaker attacker) {
        if(isAlive) {
            hp -= 0.1 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
