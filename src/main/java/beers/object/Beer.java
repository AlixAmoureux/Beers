package beers.object;

public class Beer
{
    private String name;
    private String origin;
    private float alcoholLevel;
    private Type type;
    private SubType subType;

    public Beer(String name, String origin, float alcoholLevel, Type type, SubType subType)
    {
        this.name = name;
        this.origin = origin;
        this.alcoholLevel = alcoholLevel;
        this.type = type;
        this.subType = subType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getAlcoholLevel() {
        return alcoholLevel;
    }

    public void setAlcoholLevel(float alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SubType getSubType() {
        return subType;
    }

    public void setSubType(SubType subType) {
        this.subType = subType;
    }
}