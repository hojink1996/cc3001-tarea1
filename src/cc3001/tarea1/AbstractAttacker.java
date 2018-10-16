package cc3001.tarea1;

/**
 * AbstractAttacker is the abstract base class for all objects that can attack in the code.
 * It extends AbstractAttackable, and defines the variable attack.
 * It also implements the methods getAttack() and the abstract method attack.
 *
 * @author Hojin Kang
 */
public abstract class AbstractAttacker extends AbstractAttackable {
    protected float attack;

    /**
     * Getter method for the attack variable.
     *
     * @return      a float value corresponding to the attack of the object.
     */
    public float getAttack()
    {
        return attack;
    }

    /**
     * Abstract Method that indicates that the object is attacking an attackable object.
     *
     * @param attackable        AbstractAttackable object corresponding to the object being attacked.
     */
    public abstract void attack(AbstractAttackable attackable);
}
