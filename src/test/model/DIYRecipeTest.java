package model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DIYRecipeTest {
    DIYRecipe r1;
    DIYRecipe r2;
    DIYRecipe r3;
    DIYRecipe r4;
    DIYRecipe r5;
    DIYRecipe r6;
    DIYRecipe r7;
    DIYRecipe r8;
    DIYRecipe r9;
    DIYRecipe r10;

    @BeforeEach
    void runBefore() {
        r1 = new DIYRecipe("Ice Wand", RecipeType.TOOL, false, "Snowboy");
        r2 = new DIYRecipe("Apple Chair", RecipeType.HOUSEWARE, true, "Big Sister Villagers");
        r3 = new DIYRecipe("Glowing Moss Jar", RecipeType.MISCELLANEOUS, true, "Bottles");
        r4 = new DIYRecipe("Snowflake Wreath", RecipeType.WALL_MOUNTED, false, "Balloons");
        r5 = new DIYRecipe("Festival-Lantern Set", RecipeType.CEILING_DECOR, true, "Peppy Villagers");
        r6 = new DIYRecipe("Galaxy Flooring", RecipeType.WALLPAPERS_FLOORS_RUGS, false, "Celeste, Bottles");
        r7 = new DIYRecipe("Recycled Boots", RecipeType.EQUIPMENT, true, "Catch a Boot");
        r8 = new DIYRecipe("Whole-Wheat Flour", RecipeType.SAVORY, true, "Nook's Cranny Basic Cooking Recipes");
        r9 = new DIYRecipe("Roost Sable Cookie", RecipeType.SWEET, true, "Brewster");
        r10 = new DIYRecipe("Simple Wooden Fence", RecipeType.OTHER, true, "Nook Miles");
    }

    @Test
    void testGetName() {
        assertEquals("Ice Wand", r1.getName());
    }
    
    @Test
    void testGetType() {
        assertEquals("Other", r10.getType());
    }

    @Test
    void testGetObtained() {
        assertTrue(r1.getObtained());
        assertFalse(r2.getObtained());
    }

    @Test
    void testGetSource() {
        assertEquals("Balloons", r4.getSource());
    }

    @Test
    void testObtain() {
        r1.obtain();
        assertTrue(r1.getObtained());
        r2.obtain();
        assertTrue(r2.getObtained());
    }

}