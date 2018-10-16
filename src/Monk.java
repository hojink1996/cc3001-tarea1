public class Monk extends AbstractUnit {

    // Monk constructor
    public Monk(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = 2 * hp;
    }

    // Monk default constructor
    public Monk() {
        this(25, 5);
    }


    @Override
    public void attack(AbstractAttackable attackable) {
        if(isAlive) {attackable.attackedByMonk(this);}
    }

    @Override
    public void attackedByInfantry(AbstractAttacker attacker) {
        if(isAlive) {
            hp = 0;
            isAlive = false;
        }
    }

    @Override
    public void attackedByArcher(AbstractAttacker attacker) {
        if(isAlive) {
            hp = 0;
            isAlive = false;
        }
    }

    @Override
    public void attackedByCavalry(AbstractAttacker attacker) {
        if(isAlive) {
            hp = 0;
            isAlive = false;
        }
    }

    @Override
    public void attackedBySiege(AbstractAttacker attacker) {
        if(isAlive) {
            hp = 0;
            isAlive = false;
        }
    }

    @Override
    public void attackedByMonk(AbstractAttacker attacker) {
        if(isAlive) {
            hp += 0.5 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    @Override
    public void attackedByVillager(AbstractAttacker attacker) {
    }

    @Override
    public void attackedByCastle(AbstractAttacker attacker) {
        if(isAlive) {
            hp = 0;
            isAlive = false;
        }
    }
}
