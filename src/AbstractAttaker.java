public abstract class AbstractAttaker extends AbstractAttackable {
    protected float attack;

    // Getter for attack
    public float getAttack()
    {
        return attack;
    }

    // Attack a unit
    public abstract void attack(AbstractAttackable attackable);
}
