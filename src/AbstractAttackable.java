public abstract class AbstractAttackable implements IEnte {
    protected float hp;
    protected boolean isAlive;

    // Getter for HP
    @Override
    public float getHP() {
        return hp;
    }

    // Getter for isAlive
    @Override
    public boolean isAlive() {
        return isAlive;
    }

    public abstract void attackedByInfantry(AbstractAttaker attacker);
    public abstract void attackedByArcher(AbstractAttaker attacker);
    public abstract void attackedByCavalry(AbstractAttaker attacker);
    public abstract void attackedBySiege(AbstractAttaker attacker);
    public abstract void attackedByMonk(AbstractAttaker attacker);
    public abstract void attackedByVillager(AbstractAttaker attacker);
    public abstract void attackedByCastle(AbstractAttaker attacker);
}
