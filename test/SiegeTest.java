import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SiegeTest {

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

    // Test siege attacking
    @Test
    public void siegeAttackTest() {
        // Attack infantry
        siege.attack(infantry);
        assertEquals(0, infantry.getHP(), 0.01);

        // Attack archer
        siege.attack(archer);
        assertEquals(0, archer.getHP(), 0.01);

        // Attack cavalry
        siege.attack(cavalry);
        assertEquals(100, cavalry.getHP(), 0.01);

        // Attack siege
        // First create a new siege, so that the old one doesn't die
        IAttacker newSiege = new SiegeUnit(50, 10);
        newSiege.attack(siege);
        assertEquals(60, siege.getHP(), 0.01);

        // Attack monk
        siege.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        // Attack villager
        siege.attack(villager);
        assertEquals(0, villager.getHP(), 0.01);

        // Attack castle
        siege.attack(castle);
        assertEquals(4700, castle.getHP(), 0.01);

        // Attack barracks
        siege.attack(barracks);
        assertEquals(1100, barracks.getHP(), 0.01);
    }
}
