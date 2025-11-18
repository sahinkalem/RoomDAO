package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonSaleInfo {
    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("saleability")
    @Expose
    private String saleability;

    @SerializedName("isEbook")
    @Expose
    private Boolean isEbook;

    @SerializedName("listPrice")
    @Expose
    private JsonListPrice listPrice;

    @SerializedName("retailPrice")
    @Expose
    private JsonRetailPrice retailPrice;

    @SerializedName("buyLink")
    @Expose
    private String buyLink;

    @SerializedName("offers")
    @Expose
    private List<JsonOffers> offers;

    // Getter Methods

    public String getCountry() {
        return country;
    }

    public String getSaleability() {
        return saleability;
    }

    public Boolean getEbook() {
        return isEbook;
    }

    public JsonListPrice getListPrice() {
        return listPrice;
    }

    public JsonRetailPrice getRetailPrice() {
        return retailPrice;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public List<JsonOffers> getOffers() {
        return offers;
    }



    // Setter Methods
}
