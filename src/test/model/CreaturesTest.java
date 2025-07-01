package model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreaturesTest {
    Bug b1;
    Bug b2;
    Bug b3;
    Bug b4;
    Bug b5;

    Fish f1;
    Fish f2;
    Fish f3;
    Fish f4;
    Fish f5;

    SeaCreature s0;
    SeaCreature s1;
    SeaCreature s2;
    SeaCreature s3;
    SeaCreature s4;
    SeaCreature s5;

    @BeforeEach
    void runBefore() {
        b1 = new Bug("Snail", "ALL", "ALL", 250, false, false, 1, "On rocks when raining");
        b2 = new Bug("Flea", "April May June July August September October November", "ALL", 70, true, false, 2, "On villagers");
        b3 = new Bug("Giant Stag", "July August", "11PM to 8AM", 10000, false, false, 3, "On trees");
        b4 = new Bug("Horned Atlas", "July August", "5PM to 8AM", 8000, false, false, 4, "On palm trees");
        b5 = new Bug("Horned Hercules", "July August", "5PM to 8AM", 12000, true, true, 5, "On palm trees");

        f1 = new Fish("Goldfish", "ALL", "ALL", 1300, false, false, "Tiny", 1, "Pond");
        f2 = new Fish("Salmon", "September", "ALL", 700, true, false, "Large", 2, "River Mouth");
        f3 = new Fish("Great White Shark", "June July August September", "4PM to 9AM", 15000, false, false, "Finned", 3, "Sea");
        f4 = new Fish("Coelacanth", "ALL", "ALL", 15000, false, false, "Huge", 4, "Sea when raining");
        f5 = new Fish("Stringfish", "January February March December", "4PM-9AM", 15000, true, true, "Very Large", 5, "Clifftop River");

        s0 = new SeaCreature("Acorn Barnacle", "ALL", "ALL", 600, false, false, 1, 0);
        s1 = new SeaCreature("Sea Slug", "ALL", "ALL", 600, true, false, 1, 1);
        s2 = new SeaCreature("Sweet Shrimp", "January February September October November December", "4PM to 9AM", 1400, false, false, 2, 2);
        s3 = new SeaCreature("Horseshoe Crab", "July August September", "9PM to 4AM", 2500, false, false, 3, 3);
        s4 = new SeaCreature("Lobster", "January April May June December", "ALL", 4500, true, false, 4, 4);
        s5 = new SeaCreature("Spider Crab", "March April", "ALL", 12000, true, true, 5, 5);
    }
}
