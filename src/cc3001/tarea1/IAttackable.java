package cc3001.tarea1;

/**
 * IAttackable is the interface that represents all Attackable Units in the game.
 * It declares the Abstract Methods attackedByInfantry, attackedByArcher, attackedByCavalry, attackedBySiege,
 * attackedByMonk, attackedByVillager and attackedByCastle
 *
 * @author Hojin Kang
 */
public interface IAttackable extends IEnte {
    /**
     * Abstract Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByInfantry(IAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByArcher(IAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByCavalry(IAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by siege.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedBySiege(IAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByMonk(IAttacker attacker);

    /**
     * Abstract Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByVillager(IAttacker attacker);

    /**
     * Abstrat Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    public abstract void attackedByCastle(IAttacker attacker);
}
