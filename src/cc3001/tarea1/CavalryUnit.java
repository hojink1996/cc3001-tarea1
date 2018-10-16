package cc3001.tarea1;

/**
 * CavalryUnit is the class that represents all cavalry units in the game.
 * CavalryUnit extends AbstractUnit, and implements the attack, attackedByInfantry, attackedByArcher,
 * attackedByCavalry, attackedBySiege, attackedByMonk, attackedByVillager and attackedByCastle methods.
 *
 * @author Hojin Kang
 */
public class CavalryUnit extends AbstractUnit {

    /**
     * CavalryUnit class constructor that receives two float parameters.
     *
     * @param hp        float value representing the hp of the ArcherUnit object to be created.
     * @param attack    float value representing th attack of the ArcherUnit object to be created.
     */
    public CavalryUnit(float hp, float attack) {
        this.hp = hp > 0 ? hp : 0;
        this.attack = attack > 0 ? attack : 0;
        isAlive = hp > 0;
        maxHp = 2 * hp;
    }

    /**
     * CavalryUnit class constructor by default, receives no parameters. Sets hp to 150, and attack to 8.
     */
    public CavalryUnit() {
        this(150, 8);
    }

    /**
     * Method that indicates that the cavalry is attacking an attackable object.
     *
     * @param attackable        AbstractAttackable object corresponding to the object being attacked.
     */
    @Override
    public void attack(AbstractAttackable attackable) {
        if(isAlive) {attackable.attackedByCavalry(this);}
    }

    /**
     * Method that describes that the object is being attacked by infantry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByInfantry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by an archer.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByArcher(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by cavalry.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCavalry(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by siege.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedBySiege(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.0 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a monk.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByMonk(AbstractAttacker attacker) {
        if(isAlive) {
            hp += 0.5 * attacker.getAttack();
            hp = hp > maxHp ? maxHp : hp;
        }
    }

    /**
     * Method that describes that the object is being attacked by a villager.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByVillager(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 0.5 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }

    /**
     * Method that describes that the object is being attacked by a castle.
     *
     * @param attacker      AbstractAttacker type object corresponding to the object that is attacking.
     */
    @Override
    public void attackedByCastle(AbstractAttacker attacker) {
        if(isAlive) {
            hp -= 1.2 * attacker.getAttack();
            hp = hp > 0 ? hp : 0;
            isAlive = hp > 0;
        }
    }
}
