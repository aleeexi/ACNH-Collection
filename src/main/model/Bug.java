package model;

public class Bug extends Creature {
    int rarity;
    String location;

    public Bug(String name, String months, String times, int value,  boolean caught, boolean donated, int rarity, String location) {
        this.name = name;
        this.months = months;
        this.times = times;
        this.value = value;
        this.caught = caught;
        this.donated = donated;
        this.rarity = rarity;
        this.location = location;
    }

    public String getRarity() {
        switch (rarity) {
            case 1:
                return "Very Common";
            case 2:
                return "Common";
            case 3:
                return "Uncommon";
            case 4:
                return "Scarce";
            case 5:
                return "Rare";
        
            default:
                return "N/A";
        }
    }

    public String getLocation() {
        return this.location;
    }
    
}
