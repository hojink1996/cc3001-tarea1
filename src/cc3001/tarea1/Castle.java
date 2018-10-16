package cc3001.tarea1;

/**
 * Castle is the class that represents all castles in the game.
 * Castle extends AbstractAttacker, and implements the attack, attackedByInfantry, attackedByArcher,
 * attackedByCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle methods.
 *
 * @author Hojin Kang
 */
public class Castle extends AbstractAttacker implements IBuilding {

    /**
     * Castleclass constructor that receives two float parameters.
     *
     * @param hp        float value representing the hp of the Castle object to be created.
     * @param attack    float value representing th attack of the Castle object to be created.
     */
    public Castle(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = hp;
    }

    /**
     * ArcherUnit class constructor by default, receives no parameters. Sets hp to 4800, and attack to 11.
     */
    public Castle() {
        this(4800, 11);
    }

    /**
     * Method that indicates that the castle is attacking an attackable object.
     *
     * @param attackable        AbstractAttackable object corresponding to the object being attacked.
     */
    @Override
    public void attack(AbstractAttackable attackable) {
        if(isAlive) {attackable.attackedByCastle(this);}
    }

    /**
     * Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByInfantry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.3 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByArcher(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.1 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCavalry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.3 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by siege.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedBySiege(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 2.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByMonk(AbstractAttacker attacker) {
    }

    /**
     * Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByVillager(AbstractAttacker attacker) {
        if(isAlive) {
            hp += 0.3 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    /**
     * Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCastle(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.1 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
