import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VillagerTest {

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

    // Test villager attacking
    @Test
    public void villagerAttackTest() {
        // Attack infantry
        villager.attack(infantry);
        assertEquals(37.6, infantry.getHP(), 0.01);

        // Attack archer
        villager.attack(archer);
        assertEquals(32, archer.getHP(), 0.01);

        // Attack cavalry
        villager.attack(cavalry);
        assertEquals(148.5, cavalry.getHP(), 0.01);

        // Attack siege
        villager.attack(siege);
        assertEquals(76.5, siege.getHP(), 0.01);

        // Attack monk
        villager.attack(monk);
        assertEquals(25, monk.getHP(), 0.01);

        // Attack villager
        villager.attack(villager);
        assertEquals(22, villager.getHP(), 0.01);

        // Attack castle (can't heal over max health)
        villager.attack(castle);
        assertEquals(4800, castle.getHP(), 0.01);

        // Attack barracks (can't heal over max health)
        villager.attack(barracks);
        assertEquals(1200, barracks.getHP(), 0.01);
    }

    // Test villager healing
    @Test public void villagerHealingTest() {
        // Create a new siege unit to attack
        IAttacker newSiege = new SiegeUnit(10, 10);

        // Attack the old siege unit
        newSiege.attack(siege);
        assertEquals(60, siege.getHP(), 0.01);

        // Heal the old siege unit
        villager.attack(siege);
        assertEquals(61.5, siege.getHP(), 0.01);

        // Attack the castle and barracks
        newSiege.attack(castle);
        newSiege.attack(barracks);
        assertEquals(4780, castle.getHP(), 0.01);
        assertEquals(1180, barracks.getHP(), 0.01);

        // Heal the castle and barracks
        villager.attack(castle);
        villager.attack(barracks);
        assertEquals(4780.9, castle.getHP(), 0.01);
        assertEquals(1182.1, barracks.getHP(), 0.01);

    }
}
