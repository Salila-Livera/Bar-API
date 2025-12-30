package lk.zerocode.bar_api.model;

public enum BottleSize {
    ML_330("330ml"),
    ML_750("750ml"),
    L_1("1L");
    private final String label;

    BottleSize(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
