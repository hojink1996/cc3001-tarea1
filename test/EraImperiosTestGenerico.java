import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

// Tests genericos de Era Imperios
public class EraImperiosTestGenerico {

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
    @Before public void setUp() {
        infantry = new InfantryUnit();
        archer = new ArcherUnit();
        cavalry = new CavalryUnit();
        siege = new SiegeUnit();
        monk = new Monk();
        villager = new Villager();
        castle = new Castle();
        barracks = new Barracks();
    }

    // Test the Default Creation HP
    @Test public void defaultHPTest() {
        assertEquals(40, infantry.getHP(), 0.01);
        assertEquals(35, archer.getHP(), 0.01);
        assertEquals(150, cavalry.getHP(), 0.01);
        assertEquals(75, siege.getHP(), 0.01);
        assertEquals(25, monk.getHP(), 0.01);
        assertEquals(25, villager.getHP(), 0.01);
        assertEquals(1200, barracks.getHP(), 0.01);
        assertEquals(4800, castle.getHP(), 0.01);
    }

    // Test the Default Creation Attack
    @Test public void defaultAttackTest() {
        assertEquals(3, infantry.getAttack(), 0.01);
        assertEquals(5, archer.getAttack(), 0.01);
        assertEquals(8, cavalry.getAttack(), 0.01);
        assertEquals(50, siege.getAttack(), 0.01);
        assertEquals(5, monk.getAttack(), 0.01);
        assertEquals(3, villager.getAttack(), 0.01);
        assertEquals(11, castle.getAttack(), 0.01);
    }

    // Test the alive status
    @Test public void defaultAliveTest() {
        assertTrue(infantry.isAlive());
        assertTrue(archer.isAlive());
        assertTrue(cavalry.isAlive());
        assertTrue(siege.isAlive());
        assertTrue(monk.isAlive());
        assertTrue(villager.isAlive());
        assertTrue(barracks.isAlive());
        assertTrue(castle.isAlive());
    }

    // Test the attacking process
    @Test public void simpleAttackTest() {
        infantry.attack(archer);
        assertEquals(31.4, archer.getHP(), 0.01);

        archer.attack(cavalry);
        assertEquals(145, cavalry.getHP(), 0.01);

        monk.attack(siege);
        assertEquals(75, siege.getHP(), 0.01);

        infantry.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        archer.attack(villager);
        assertEquals(17.5, villager.getHP(), 0.01);

        castle.attack(barracks);
        assertEquals(1192.3, barracks.getHP(), 0.01);

        villager.attack(infantry);
        assertEquals(37.6, infantry.getHP(), 0.01);

        // Monk shouldn't heal when dead
        monk.attack(infantry);
        assertEquals(37.6, infantry.getHP(), 0.01);
    }

    // Max HP test
    @Test public void maxHPTest() {
        IAttacker superMonk = new Monk(25, 5000);
        IAttacker superVillager = new Villager(25, 100000);

        // Max HP for archer
        superMonk.attack(archer);
        assertEquals(70, archer.getHP(), 0.01);

        // Max HP for infantry
        superMonk.attack(infantry);
        assertEquals(80, infantry.getHP(), 0.01);

        // Max HP for cavalry
        superMonk.attack(cavalry);
        assertEquals(300, cavalry.getHP(), 0.01);

        // Max HP for monk
        superMonk.attack(monk);
        assertEquals(50, monk.getHP(), 0.01);

        // Max HP for villager
        superMonk.attack(villager);
        assertEquals(50, villager.getHP(), 0.01);

        // Max HP for castle
        superVillager.attack(castle);
        assertEquals(4800, castle.getHP(), 0.01);

        // Max HP for barracks
        superVillager.attack(barracks);
        assertEquals(1200, barracks.getHP(), 0.01);

        // Change the starting HP
        IAttackable newHPVillager = new Villager(2000, 10);
        superMonk.attack(newHPVillager);
        assertEquals(4000, newHPVillager.getHP(), 0.01);
    }

    // Death test
    @Test public void deathTest() {
        // Create a instant kill class
        IAttacker killer = new SiegeUnit(100, 10000);

        // Kill all characters
        killer.attack(archer);
        killer.attack(infantry);
        killer.attack(cavalry);
        killer.attack(siege);
        killer.attack(monk);
        killer.attack(villager);
        killer.attack(castle);
        killer.attack(barracks);

        // Test for HP
        assertEquals(0, archer.getHP(), 0.01);
        assertEquals(0, infantry.getHP(), 0.01);
        assertEquals(0, cavalry.getHP(), 0.01);
        assertEquals(0, siege.getHP(), 0.01);
        assertEquals(0, monk.getHP(), 0.01);
        assertEquals(0, villager.getHP(), 0.01);
        assertEquals(0, castle.getHP(), 0.01);
        assertEquals(0, barracks.getHP(), 0.01);

        // Test for alive status
        assertFalse(archer.isAlive());
        assertFalse(infantry.isAlive());
        assertFalse(cavalry.isAlive());
        assertFalse(siege.isAlive());
        assertFalse(monk.isAlive());
        assertFalse(villager.isAlive());
        assertFalse(castle.isAlive());
        assertFalse(barracks.isAlive());

        // Test that you can't attack when dead
        archer.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        infantry.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        cavalry.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        siege.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        monk.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        villager.attack(killer);
        assertEquals(100, killer.getHP(), 0.01);

        castle.attack(killer);
        assertEquals(100, killer.getHP(),0.01);

        // Test that HP won't go lower than 0, even if you keep attacking
        // Attack them again
        killer.attack(archer);
        killer.attack(infantry);
        killer.attack(cavalry);
        killer.attack(siege);
        killer.attack(monk);
        killer.attack(villager);
        killer.attack(castle);
        killer.attack(barracks);

        // Test for HP
        assertEquals(0, archer.getHP(), 0.01);
        assertEquals(0, infantry.getHP(), 0.01);
        assertEquals(0, cavalry.getHP(), 0.01);
        assertEquals(0, siege.getHP(), 0.01);
        assertEquals(0, monk.getHP(), 0.01);
        assertEquals(0, villager.getHP(), 0.01);
        assertEquals(0, castle.getHP(), 0.01);
        assertEquals(0, barracks.getHP(), 0.01);
    }
}
