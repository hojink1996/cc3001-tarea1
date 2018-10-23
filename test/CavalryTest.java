import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CavalryTest {

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

    // Test cavalry attacking
    @Test
    public void cavalryAttackTest() {
        // Attack infantry
        cavalry.attack(infantry);
        assertEquals(32, infantry.getHP(), 0.01);

        // Attack archer
        cavalry.attack(archer);
        assertEquals(23, archer.getHP(), 0.01);

        // Attack cavalry
        cavalry.attack(cavalry);
        assertEquals(142, cavalry.getHP(), 0.01);

        // Attack siege
        cavalry.attack(siege);
        assertEquals(65.4, siege.getHP(), 0.01);

        // Attack monk
        cavalry.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        // Attack villager
        cavalry.attack(villager);
        assertEquals(13, villager.getHP(), 0.01);

        // Attack castle
        cavalry.attack(castle);
        assertEquals(4797.6, castle.getHP(), 0.01);

        // Attack barracks
        cavalry.attack(barracks);
        assertEquals(1194.4, barracks.getHP(), 0.01);
    }
}
