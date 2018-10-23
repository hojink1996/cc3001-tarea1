package cc3001.tarea1;

/**
 * SiegeUnit is the class that represents all siege units in the game.
 * SiegeUnit extends AbstractUnit, and implements the attack, attackedByInfantry, attackedByArcher,
 * attackedByCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle methods.
 *
 * @author Hojin Kang
 */
public class SiegeUnit extends AbstractUnit {

    /**
     * SiegeUnit class constructor that receives two float parameters.
     *
     * @param hp        float value representing the hp of the SiegeUnit object to be created.
     * @param attack    float value representing th attack of the SiegeUnit object to be created.
     */
    public SiegeUnit(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = 2 * hp;
    }

    /**
     * SiegeUnit class constructor by default, receives no parameters. Sets hp to 75, and attack to 50.
     */
    public SiegeUnit() {
        this(75, 50);
    }

    /**
     * Method that indicates that the archer is attacking an attackable object.
     *
     * @param attackable        IAttackable object corresponding to the object being attacked.
     */
    @Override
    public void attack(IAttackable attackable) {
        if(isAlive) {attackable.attackedBySiege(this);}
    }

    /**
     * Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByInfantry(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByArcher(IAttacker attacker) {
        if(isAlive) {
            hp -= 0.8 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCavalry(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by siege.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedBySiege(IAttacker attacker) {
        if(isAlive) {
            hp -= 1.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByMonk(IAttacker attacker) {
    }

    /**
     * Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByVillager(IAttacker attacker) {
        if(isAlive) {
            hp += 0.5 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    /**
     * Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      IAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCastle(IAttacker attacker) {
        if(isAlive) {
            hp -= 0.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
