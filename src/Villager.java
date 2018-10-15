public class Villager extends AbstractUnit{

    // Villager constructor
    public Villager(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
        isAlive = hp > 0;
    }

    // Villager default constructor
    public Villager() {
        this(25, 3);
    }

    @Override
    public void attack(AbstractAttackable attackable) {

    }

    @Override
    public void attackedByInfantry() {

    }
}
