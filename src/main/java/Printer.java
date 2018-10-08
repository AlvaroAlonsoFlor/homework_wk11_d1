public class Printer {
    private int sheets;
    private int tonerVolume;
    private int initialTonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
        this.initialTonerVolume = tonerVolume;
    }


    public int getSheets() {
        return this.sheets;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public String printPages(int number) {
        if (number <= sheets && number <= tonerVolume) {
            sheets -= number;
            tonerVolume -= number;
            return "Printed " + number + " pages.";
        }

        return "Not enough sheets or toner to print";
    }

    public void refill(int numberOfSheets) {
        this.sheets += numberOfSheets;
    }

    public void changeToner() {
        this.tonerVolume = this.initialTonerVolume;
    }
}
