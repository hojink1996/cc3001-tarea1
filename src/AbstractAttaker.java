public abstract class AbstractAttaker extends AbstractAttackable {
    protected int attack;

    // Getter for attack
    public int getAttack()
    {
        return attack;
    }

    // Attack a unit
    public abstract void attack(AbstractAttackable attackable);
}
