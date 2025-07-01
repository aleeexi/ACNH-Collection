package model;

public class Creature {
    String name;
    String months;
    String times;
    int value;
    boolean caught;
    boolean donated;

    public void catchCreature() {
        this.caught = true;
    }

    public void donate() {
        this.donated = true;
    }

    public String getName() {
        return this.name;
    }

    public String getMonths() {
        return this.months;
    }

    public String getTimes() {
        return this.times;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getCaught() {
        return this.caught;
    }

    public boolean getDonated() {
        return this.donated;
    }
}
