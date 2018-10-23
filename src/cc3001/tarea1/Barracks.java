package cc3001.tarea1;

/**
 * Barracks is the class that represents all barracks in the game.
 * Barracks extends IAttackable, and implements the attackedByInfantry, attackedByArcher,
 * attackedByCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle methods.
 *
 * @author Hojin Kang
 */
public class Barracks extends AbstractAttackable implements IBuilding {

    /**
     * Barracks class constructor that receives one float parameter.
     *
     * @param hp        float value representing the hp of the Barracks object to be created.
     */
    public Barracks(float hp) {
        this.hp = hp > 0 ? hp : 0;
        maxHp = hp;
        isAlive = hp > 0;
    }

    /**
     * Barracks class constructor by default, receives no parameters. Sets hp to 1200.
     */
    public Barracks() {
        this(1200);
    }

    /**
     * Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByInfantry(IAttacker attacker) {
        if(isAlive) {
            hp -= 0.7 * attacker.getAttack();
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
            hp -= 0.7 * attacker.getAttack();
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
            hp -= 0.7 * attacker.getAttack();
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
            hp -= 2.0 * attacker.getAttack();
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
    }

    /**
     * Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByVillager(IAttacker attacker) {
        if(isAlive) {
            hp += 0.7*attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
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
            hp -= 0.7 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
