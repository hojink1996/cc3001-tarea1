public class InfantryUnit extends AbstractUnit {

    // InfantryUnit construtor
    public InfantryUnit(int hp, int attack) {
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
    public void attackedByInfantry() {

    }
}
