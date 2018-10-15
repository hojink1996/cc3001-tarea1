public class ArcherUnit extends AbstractUnit {

    // ArcherUnit constructor
    public ArcherUnit(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // ArcherUnit default constructor
    public ArcherUnit() {
        this(35, 5);
    }

    @Override
    public void attack(AbstractAttackable attackable) {

    }

    @Override
    public void attackedByInfantry() {

    }
}
