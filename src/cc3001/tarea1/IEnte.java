package cc3001.tarea1;

/**
 * IEnte is the interface that represents all characters in the game.
 * IEnte declares two abstract methods, isAlive and getHP.
 */
public interface IEnte {
    /**
     * isAlive is the getter method for the isAlive variable.
     *
     * @return      true if isAlive is true
     *              false if isAlive is false
     */
    public boolean isAlive();

    /**
     * getHP is the getter method for the hp variable.
     *
     * @return      a float value corresponding to the value of hp.
     */
    public float getHP();
}
