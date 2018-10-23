import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class CreationTest {

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

    // Non Default Creation Test
    @Test
    public void nonDefaultCreationTest() {
        // Create the test cases
        IAttacker archerTest = new ArcherUnit(100, 50);
        IAttacker infantryTest = new InfantryUnit(100, 50);
        IAttacker cavalryTest = new CavalryUnit(100, 50);
        IAttacker siegeTest = new SiegeUnit(100, 50);
        IAttacker monkTest = new Monk(100, 50);
        IAttacker villagerTest = new Villager(100, 50);
        IAttacker castleTest = new Castle(100, 50);
        IAttackable barracksTest = new Barracks(100);

        //Test for correct HP
        assertEquals(100, archerTest.getHP(), 0.01);
        assertEquals(100, infantryTest.getHP(), 0.01);
        assertEquals(100, cavalryTest.getHP(), 0.01);
        assertEquals(100, siegeTest.getHP(), 0.01);
        assertEquals(100, monkTest.getHP(), 0.01);
        assertEquals(100, villagerTest.getHP(), 0.01);
        assertEquals(100, castleTest.getHP(), 0.01);
        assertEquals(100, barracksTest.getHP(), 0.01);

        // Test for correct attack
        assertEquals(50, archerTest.getAttack(), 0.01);
        assertEquals(50, infantryTest.getAttack(), 0.01);
        assertEquals(50, cavalryTest.getAttack(), 0.01);
        assertEquals(50, siegeTest.getAttack(), 0.01);
        assertEquals(50, monkTest.getAttack(), 0.01);
        assertEquals(50, villagerTest.getAttack(), 0.01);
        assertEquals(50, castleTest.getAttack(), 0.01);
    }

    // Creation with parameters less than or equal to zero
    @Test public void lessThanZeroCreationTest() {
        // Create objects with parameters under zero
        IAttacker archerTest = new ArcherUnit(-100, -100);
        IAttacker infantryTest = new InfantryUnit(-100, -100);
        IAttacker cavalryTest = new CavalryUnit(-100, -100);
        IAttacker siegeTest = new SiegeUnit(-100, -100);
        IAttacker monkTest = new Monk(-100, -100);
        IAttacker villagerTest = new Villager(-100, -100);
        IAttacker castleTest = new Castle(-100, -100);
        IAttackable barracksTest = new Barracks(-100);

        // Test for HP values
        assertEquals(0, archerTest.getHP(), 0.01);
        assertEquals(0, infantryTest.getHP(), 0.01);
        assertEquals(0, cavalryTest.getHP(), 0.01);
        assertEquals(0, siegeTest.getHP(), 0.01);
        assertEquals(0, monkTest.getHP(), 0.01);
        assertEquals(0, villagerTest.getHP(), 0.01);
        assertEquals(0, castleTest.getHP(), 0.01);
        assertEquals(0, barracksTest.getHP(), 0.01);

        // Test for attack values
        assertEquals(0, archerTest.getAttack(), 0.01);
        assertEquals(0, infantryTest.getAttack(), 0.01);
        assertEquals(0, cavalryTest.getAttack(), 0.01);
        assertEquals(0, siegeTest.getAttack(), 0.01);
        assertEquals(0, monkTest.getAttack(), 0.01);
        assertEquals(0, villagerTest.getAttack(), 0.01);
        assertEquals(0, castleTest.getAttack(), 0.01);

        // Test for death status
        assertFalse(archerTest.isAlive());
        assertFalse(infantryTest.isAlive());
        assertFalse(cavalryTest.isAlive());
        assertFalse(siegeTest.isAlive());
        assertFalse(monkTest.isAlive());
        assertFalse(villagerTest.isAlive());
        assertFalse(castleTest.isAlive());
        assertFalse(barracksTest.isAlive());
    }
}
