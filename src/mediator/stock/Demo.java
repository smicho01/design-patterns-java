package mediator.stock;

import mediator.stock.actual_colegues.GormanSlacks;
import mediator.stock.actual_colegues.JTPoorman;

public class Demo {
    public static void main(String[] args) {
        StockMediator mediator = new StockMediator();

        GormanSlacks gorman = new GormanSlacks(mediator);
        JTPoorman jtPoorman = new JTPoorman(mediator);

        gorman.saleOffer("MSFT", 100);
        gorman.saleOffer("GOOG", 50);

        jtPoorman.buyOffer("MSFT", 100);
        jtPoorman.saleOffer("NRG", 10);

        gorman.buyOffer("NRG", 10);

        mediator.getStockOfferings();
    }
}
