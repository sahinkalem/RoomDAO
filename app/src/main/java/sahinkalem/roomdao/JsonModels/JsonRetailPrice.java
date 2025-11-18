package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.SerializedName;

public class JsonRetailPrice {
    @SerializedName("amount")
    private double amount;
    @SerializedName("currencyCode")
    private String currencyCode;

    // Getter Methods

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }


    // Setter Methods
}
