import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class EraImperiosTest {

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

    // Test infantry attacking
    @Test public void infantryAttackTest() {
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

    // Test archer attacking
    @Test public void archerAttackTest() {
        // Attack infantry
        archer.attack(infantry);
        assertEquals(34, infantry.getHP(), 0.01);

        // Attack archer
        archer.attack(archer);
        assertEquals(29, archer.getHP(), 0.01);

        // Attack cavalry
        archer.attack(cavalry);
        assertEquals(145, cavalry.getHP(), 0.01);

        // Attack siege
        archer.attack(siege);
        assertEquals(71, siege.getHP(), 0.01);

        // Attack monk
        archer.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        // Attack villager
        archer.attack(villager);
        assertEquals(17.5, villager.getHP(), 0.01);

        // Attack castle
        archer.attack(castle);
        assertEquals(4799.5, castle.getHP(), 0.01);

        // Attack barracks
        archer.attack(barracks);
        assertEquals(1196.5, barracks.getHP(), 0.01);
    }

    // Test cavalry attacking
    @Test public void cavalryAttackTest() {
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

    // Test siege attacking
    @Test public void siegeAttackTest() {
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

    // Test monk attacking
    @Test public void monkAttackTest() {
        // Attack infantry
        monk.attack(infantry);
        assertEquals(42.5, infantry.getHP(), 0.01);

        // Attack archer
        monk.attack(archer);
        assertEquals(37.5, archer.getHP(), 0.01);

        // Attack cavalry
        monk.attack(cavalry);
        assertEquals(152.5, cavalry.getHP(), 0.01);

        // Attack siege
        monk.attack(siege);
        assertEquals(75, siege.getHP(), 0.01);

        // Attack monk
        monk.attack(monk);
        assertEquals(27.5, monk.getHP(), 0.01);

        // Attack villager
        monk.attack(villager);
        assertEquals(27.5, villager.getHP(), 0.01);

        // Attack castle
        monk.attack(castle);
        assertEquals(4800, castle.getHP(), 0.01);

        // Attack barracks
        monk.attack(barracks);
        assertEquals(1200, barracks.getHP(), 0.01);
    }

    // Test villager attacking
    @Test public void villagerAttackTest() {
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

    // Test castle attacking
    @Test public void castleAttackTest() {
        // Attack infantry
        castle.attack(infantry);
        assertEquals(26.8, infantry.getHP(), 0.01);

        // Attack archer
        castle.attack(archer);
        assertEquals(21.8, archer.getHP(), 0.01);

        // Attack cavalry
        castle.attack(cavalry);
        assertEquals(136.8, cavalry.getHP(), 0.01);

        // Attack siege
        castle.attack(siege);
        assertEquals(69.5, siege.getHP(), 0.01);

        // Attack monk
        castle.attack(monk);
        assertEquals(0, monk.getHP(), 0.01);

        // Attack villager
        castle.attack(villager);
        assertEquals(11.8, villager.getHP(), 0.01);

        // Attack castle
        castle.attack(castle);
        assertEquals(4798.9, castle.getHP(), 0.01);

        // Attack barracks
        castle.attack(barracks);
        assertEquals(1192.3, barracks.getHP(), 0.01);
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

    // Non Default Creation Test
    @Test public void nonDefaultCreationTest() {
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
