import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MonkTest {

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

    // Test monk attacking
    @Test
    public void monkAttackTest() {
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
}
