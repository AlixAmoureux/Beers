package beers.object;

public enum SubType {
    TRAPPIST("trappist"),
    IPA("ipa"),
    PALE_ALE("paleale"),
    PALE_LAGER("palelager"),
    ABBAYE("abbaye"),
    OTHER("other");

    private String subTypeName;

    SubType(String value)
    {
        this.subTypeName = value;
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }
}
