package model;

public class SeaCreature extends Creature {
    int size;
    int movement;

    public SeaCreature(String name, String months, String times, int value, boolean caught, boolean donated, int size, int movement) {
        this.name = name;
        this.months = months;
        this.times = times;
        this.value = value;
        this.caught = caught;
        this.donated = donated;
        this.size = size;
        this.movement = movement;
    }

    public String getSize() {
        switch (size) {
            case 1:
                return "Tiny";
            case 2:
                return "Small";
            case 3:
                return "Medium";
            case 4:
                return "Large";
            case 5:
                return "Very Large";
        
            default:
                return "N/A";
        }
    }

    public String getMovement() {
        switch (movement) {
            case 0:
                return "Stationary";
            case 1:
                return "Very Slow";
            case 2:
                return "Slow";
            case 3:
                return "Medium";
            case 4:
                return "Fast";
            case 5:
                return "Very Fast";
            
            default:
                return "N/A";
        }
    }
}
