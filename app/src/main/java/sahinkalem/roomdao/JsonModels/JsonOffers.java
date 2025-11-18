package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonOffers {
    @SerializedName("finskyOfferType")
    @Expose
    private Integer finskyOfferType;

    @SerializedName("listPrice")
    @Expose
    private JsonListPrice listPrice;

    @SerializedName("retailPrice")
    @Expose
    private JsonListPrice retailPrice;

    // Getter Methods

    public Integer getFinskyOfferType() {
        return finskyOfferType;
    }

    public JsonListPrice getListPrice() {
        return listPrice;
    }

    public JsonListPrice getRetailPrice() {
        return retailPrice;
    }


    // Setter Methods
}
