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
        assertEquals(40, infantry.getHP());
        assertEquals(35, archer.getHP());
        assertEquals(150, cavalry.getHP());
        assertEquals(75, siege.getHP());
        assertEquals(25, monk.getHP());
        assertEquals(25, villager.getHP());
        assertEquals(1200, barracks.getHP());
        assertEquals(4800, castle.getHP());
    }

    // Test the Default Creation Attack
    @Test public void defaultAttackTest() {
        assertEquals(3, infantry.getAttack());
        assertEquals(5, archer.getAttack());
        assertEquals(8, cavalry.getAttack());
        assertEquals(50, siege.getAttack());
        assertEquals(5, monk.getAttack());
        assertEquals(3, villager.getAttack());
        assertEquals(11, castle.getAttack());
    }

    // Test the alive status
    @Test public void defaultAlive() {
        assertTrue(infantry.isAlive());
        assertTrue(archer.isAlive());
        assertTrue(cavalry.isAlive());
        assertTrue(siege.isAlive());
        assertTrue(monk.isAlive());
        assertTrue(villager.isAlive());
        assertTrue(barracks.isAlive());
        assertTrue(castle.isAlive());
    }
}
