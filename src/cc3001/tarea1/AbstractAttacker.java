package cc3001.tarea1;

/**
 * AbstractAttacker is the abstract base class for all objects that can attack in the code.
 * It extends AbstractAttackable, and defines the variable attack.
 * It also implements the methods getAttack().
 *
 * @author Hojin Kang
 */
public abstract class AbstractAttacker extends AbstractAttackable implements IAttacker{
    protected float attack;
    /**
     * Getter method for the attack variable.
     *
     * @return      a float value corresponding to the attack of the object.
     */

    @Override
    public float getAttack()
    {
        return attack;
    }

}
