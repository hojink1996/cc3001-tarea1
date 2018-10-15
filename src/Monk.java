public class Monk extends AbstractUnit {

    // Monk constructor
    public Monk(float hp, float attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // Monk default constructor
    public Monk() {
        this(25, 5);
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
