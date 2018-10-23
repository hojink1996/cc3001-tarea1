import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArcherTest {


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

    // Test archer attacking
    @Test
    public void archerAttackTest() {
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


}
