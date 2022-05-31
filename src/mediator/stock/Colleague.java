package mediator.stock;

public abstract class Colleague {
    private Mediator mediator;
    private int collegueCode;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void saleOffer(String stock , int shares) {
        mediator.saleOffer(stock, shares, this.collegueCode);
    }

    public void buyOffer(String stock , int shares) {
        mediator.buyOffer(stock, shares, this.collegueCode);
    }

    public void setCollegueCode(int collegueCode) {
        this.collegueCode = collegueCode;
    }
}
