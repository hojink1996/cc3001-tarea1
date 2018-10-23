import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class InfantryTest {

    // Declare the objects to use
    IAttacker infantry;
    IAttacker archer;
    IAttacker cavalry;
    IAttacker siege;
    IAttacker monk;
    IAttacker villager;
    IAttacker castle;
    IAttackable barracks;

    // Set up the Test Cases
    @Before
    public void setUp() {
        infantry = new InfantryUnit();
        archer = new ArcherUnit();
        cavalry = new CavalryUnit();
        siege = new SiegeUnit();
        monk = new Monk();
        villager = new Villager();
        castle = new Castle();
        barracks = new Barracks();
    }
    // Test infantry attacking
    @Test
    public void infantryAttackTest() {
        // Attack infantry
        infantry.attack(infantry);
        assertEquals(37, infantry.getHP(), 0.01);

        // Attack archer
        infantry.attack(archer);
        assertEquals(31.4, archer.getHP(), 0.01);

        // Attack cavalry
        infantry.attack(cavalry);
        assertEquals(146.4, cavalry.getHP(), 0.01);

        // Attack siege
        infantry.attack(siege);
        assertEquals(71.4, siege.getHP(), 0.01);

        // Attack monk
        infantry.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        // Attack villager
        infantry.attack(villager);
        assertEquals(20.5, villager.getHP(), 0.01);

        // Attack castle
        infantry.attack(castle);
        assertEquals(4799.1, castle.getHP(), 0.01);

        // Attack barracks
        infantry.attack(barracks);
        assertEquals(1197.9, barracks.getHP(), 0.01);
    }

}
