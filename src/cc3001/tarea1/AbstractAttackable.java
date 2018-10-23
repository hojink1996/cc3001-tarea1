package cc3001.tarea1;

/**
 * AbstractAttackable is the abstract base class for all attackable objects in the code.
 * It implements the interface IEnte, and defines the variables hp, isAlive and maxHp.
 * It also implements the methods getHP() and isAlive()
 *
 * @author Hojin Kang
 */
public abstract class AbstractAttackable implements IAttackable {
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
}
