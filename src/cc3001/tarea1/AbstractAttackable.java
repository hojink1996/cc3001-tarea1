package cc3001.tarea1;

/**
 * AbstractAttackable is the abstract base class for all attackable objects in the code.
 * It implements the interface IEnte, and defines the variables hp, isAlive and maxHp.
 * It also implements the methods getHP(), isAlive() and the abstract methods attackedByInfantry,
 * attackedByArcher, attackedbyCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle.
 *
 * @author Hojin Kang
 */
public abstract class AbstractAttackable implements IEnte {
    protected float hp;
    protected boolean isAlive;
    protected float maxHp;

    /**
     * Getter method for the hp variable.
     *
     * @return      a float corresponding to the hp parameter.
     */
    @Override
    public float getHP() {
        return hp;
    }

    /**
     * Getter method for the isAlive variable.
     *
     * @return      true if isAlive is true.
     *              false if isAlive is false.
     */
    @Override
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Abstract Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByInfantry(AbstractAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByArcher(AbstractAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByCavalry(AbstractAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by siege.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedBySiege(AbstractAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByMonk(AbstractAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByVillager(AbstractAttacker attacker);

    /**
     * Abstrat Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByCastle(AbstractAttacker attacker);
}
