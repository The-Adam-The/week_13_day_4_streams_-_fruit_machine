public class FruitMachine {

    private Spinner[] spinners;
    private int maxSpins;
    private int currentSpin = 0;

    public FruitMachine(int spinnerCount, int maxSpins) {
        spinners = new Spinner[spinnerCount];
        for(int i = 0; i < spinners.length; i++) {
            spinners[i] = new Spinner();
        }
        this.maxSpins = maxSpins;
    }

    public void spin() {
        if (currentSpin >= maxSpins) return;

        for (Spinner spinner : spinners) {
            spinner.setRandomSymbol();
        }
        currentSpin++;
    }

    public int calculateWinnings() {
        if (!isAllMatching()) return 0;
        return spinners[0].getValue();
    }

    public void printResults() {
        for (Spinner spinner : spinners) {
            System.out.println(spinner.getSymbol());
        }
    }

    private boolean isAllMatching() {
        for (int i = 0; i < spinners.length; i++) {
            if (i ==0) {
                continue;
            }
            if (spinners[i].getSymbol() != spinners[i - 1].getSymbol()) {
                return false;
            }
        }
        return true;
    }
}
