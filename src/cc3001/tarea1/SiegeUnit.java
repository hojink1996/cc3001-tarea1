package cc3001.tarea1;

public class SiegeUnit extends AbstractUnit {

    // SiegeUnit constructor
    public SiegeUnit(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = 2 * hp;
    }

    // SiegeUnit default constructor
    public SiegeUnit() {
        this(75, 50);
    }


    @Override
    public void attack(AbstractAttackable attackable) {
        if(isAlive) {attackable.attackedBySiege(this);}
    }

    @Override
    public void attackedByInfantry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByArcher(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.8 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedByCavalry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    @Override
    public void attackedBySiege(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
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
            hp += 0.5 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    @Override
    public void attackedByCastle(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}