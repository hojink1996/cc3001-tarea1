package cc3001.tarea1;

/**
 * IAttacker is the interface that represents all units that can Attack in the game.
 * It declares the Abstract Methods attack and getAttack.
 *
 * @author Hojin Kang
 */
public interface IAttacker extends IAttackable {
    /**
     * Abstract Method that indicates that the object is attacking an attackable object.
     *
     * @param attackable        IAttackable object corresponding to the object being attacked.
     */
    public abstract void attack(IAttackable attackable);

    /**
     * Abstract Getter Method for the attack variable.
     *
     * @return      a float value corresponding to the attack of the object.
     */
    public abstract float getAttack();
}
