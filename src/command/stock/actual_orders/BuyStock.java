package command.stock.actual_orders;

import command.stock.Order;
import command.stock.Stock;

public class BuyStock implements Order  {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
