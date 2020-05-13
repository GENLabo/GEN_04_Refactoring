package ch.heigvd.gen2019;

public enum Size {
    NO_SIZE("Invalid Size"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL");

    private final String text;

    Size(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
