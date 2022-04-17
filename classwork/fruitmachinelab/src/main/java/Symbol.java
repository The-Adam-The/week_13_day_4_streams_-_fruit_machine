public enum Symbol {
    CHERRY(1),
    BAR(3),
    BELL(7),
    SEVEN(10);

    private final int value;

    Symbol(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
