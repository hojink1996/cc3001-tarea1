public class Monk extends AbstractUnit {

    // Monk constructor
    public Monk(int hp, int attack) {
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
    public void attackedByInfantry() {

    }
}
