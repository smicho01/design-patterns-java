package mediator.stock;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {

    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        colleagueCodes++;
        colleague.setCollegueCode(colleagueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold  = false;
        for(StockOffer offer: stockBuyOffers) {
            if((offer.getStockSymbol().equals(stock)) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getCollegueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                return;
            }
        }
        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory" );
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSellOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought  = false;
        for(StockOffer offer: stockSellOffers) {
            if((offer.getStockSymbol().equals(stock)) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + offer.getCollegueCode());
                stockSellOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                return;
            }
        }
        if (!stockBought) {
            System.out.println(shares + " share of " + stock + " added to inventory" );
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }
    }


    public void getStockOfferings() {
        System.out.println("\nStocks for Sale");
        for(StockOffer offer: stockSellOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\nStocks to Buy");
        for(StockOffer offer: stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }
    }

}
