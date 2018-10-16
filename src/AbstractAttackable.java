public abstract class AbstractAttackable implements IEnte {
    protected float hp;
    protected boolean isAlive;
    protected float maxHp;

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

    public abstract void attackedByInfantry(AbstractAttacker attacker);
    public abstract void attackedByArcher(AbstractAttacker attacker);
    public abstract void attackedByCavalry(AbstractAttacker attacker);
    public abstract void attackedBySiege(AbstractAttacker attacker);
    public abstract void attackedByMonk(AbstractAttacker attacker);
    public abstract void attackedByVillager(AbstractAttacker attacker);
    public abstract void attackedByCastle(AbstractAttacker attacker);
}
