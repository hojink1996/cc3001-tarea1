import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EraImperiosTest {

    // Declare the objects to use
    AbstractAttaker infantry;
    AbstractAttaker archer;
    AbstractAttaker cavalry;
    AbstractAttaker siege;
    AbstractAttaker monk;
    AbstractAttaker villager;
    AbstractAttaker castle;
    AbstractAttackable barracks;

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

    }
}
