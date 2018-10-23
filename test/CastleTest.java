import cc3001.tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CastleTest {

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

    // Test castle attacking
    @Test
    public void castleAttackTest() {
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

}
