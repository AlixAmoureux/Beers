package beers.object;


public enum Type
{
    LAGER("lager"),
    ALE("ale"),
    STOUT("stout");

    private String typeName;

    Type(String value)
    {
        this.typeName = value;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
};