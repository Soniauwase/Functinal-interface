public class Transaction {
    private String transactionID;
    private double amount;
    private String currency;
    private String originCountry;
    private String merchantCategory;
    private boolean isFlagged=false;

    public Transaction(double amount, String currency, String originCountry, String merchantCategory, boolean isFlagged) {
        this.amount = amount;
        this.currency = currency;
        this.originCountry = originCountry;
        this.merchantCategory = merchantCategory;
        this.isFlagged = isFlagged;
    }

    public Transaction( double amount, String currency, String originCountry, String merchantCategory) {
        this.amount = amount;
        this.currency = currency;
        this.originCountry = originCountry;
        this.merchantCategory = merchantCategory;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", merchantCategory='" + merchantCategory + '\'' +
                ", isFlagged=" + isFlagged +
                '}';
    }
}
