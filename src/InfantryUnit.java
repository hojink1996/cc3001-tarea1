public class InfantryUnit extends AbstractUnit {

    // InfantryUnit construtor
    public InfantryUnit(float hp, float attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // Default InfantryUnity constructor
    public InfantryUnit() {
        this(40, 3);
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
