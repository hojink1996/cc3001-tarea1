public abstract class AbstractAttackable implements IEnte {
    protected int hp;
    protected boolean isAlive;

    // Getter for HP
    @Override
    public int getHP() {
        return hp;
    }

    // Getter for isAlive
    @Override
    public boolean isAlive() {
        return isAlive;
    }

    public abstract void attackedByInfantry();
}
