public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1 ;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        return (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    }
    
    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
