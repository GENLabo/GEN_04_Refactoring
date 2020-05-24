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

    /**
     * Implicitly private constructor used to define the Size instances above
     * @param text Size's label
     */
    Size(String text) {
        this.text = text;
    }

    /**
     * The display test of the Size
     * @return text of the Size
     */
    @Override
    public String toString() {
        return text;
    }
}
