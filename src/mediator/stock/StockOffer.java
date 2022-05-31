package mediator.stock;

public class StockOffer {
    private int stockShares = 0;
    private String stockSymbol = "";
    private int collegueCode = 0;

    public StockOffer(int stockShares, String stockSymbol, int collegueCode) {
        this.stockShares = stockShares;
        this.stockSymbol = stockSymbol;
        this.collegueCode = collegueCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getCollegueCode() {
        return collegueCode;
    }
}
