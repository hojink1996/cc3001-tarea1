package cc3001.tarea1;

/**
 * Villager is the class that represents all villager units in the game.
 * Villager extends AbstractUnit, and implements the attack, attackedByInfantry, attackedByArcher,
 * attackedByCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle methods.
 *
 * @author Hojin Kang
 */
public class Villager extends AbstractUnit {

    /**
     * Villager class constructor that receives two float parameters.
     *
     * @param hp        float value representing the hp of the Villager object to be created.
     * @param attack    float value representing th attack of the Villager object to be created.
     */
    public Villager(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = 2 * hp;
    }

    /**
     * Villager class constructor by default, receives no parameters. Sets hp to 25, and attack to 3.
     */
    public Villager() {
        this(25, 3);
    }

    /**
     * Method that indicates that the villager is attacking an attackable object.
     *
     * @param attackable        IAttackable object corresponding to the object being attacked.
     */
    @Override
    public void attack(IAttackable attackable) {
        if(isAlive) {attackable.attackedByVillager(this);}
    }

    /**
     * Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByInfantry(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByArcher(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCavalry(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by siege.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedBySiege(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByMonk(IAttacker attacker) {
        if(isAlive) {
            hp += 0.5 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    /**
     * Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByVillager(IAttacker attacker) {
        if(isAlive) {
            hp -= attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCastle(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
