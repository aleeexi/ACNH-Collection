package model;

public class DIYRecipe {
    String name;
    RecipeType type;
    boolean obtained;
    String source;

    public DIYRecipe(String name, RecipeType type, boolean obtained, String source) {
        this.name = name;
        this.type = type;
        this.obtained = obtained;
        this.source = source;
    }

    public void obtain() {
        this.obtained = true;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        String typeName = type.name().toLowerCase();
        String firstLetter = typeName.substring(0,1).toUpperCase();
        return firstLetter + typeName.substring(1);
    }

    public boolean getObtained() {
        return this.obtained;
    }

    public String getSource() {
        return this.source;
    }

}
