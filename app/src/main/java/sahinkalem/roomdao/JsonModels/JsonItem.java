package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonItem {
    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("etag")
    @Expose
    private String etag;

    @SerializedName("selfLink")
    @Expose
    private String selfLink;

    @SerializedName("volumeInfo")
    @Expose
    private JsonVolumeInfo volumeInfo;

    @SerializedName("saleInfo")
    @Expose
    private JsonSaleInfo saleInfo;

    @SerializedName("jsonAccessInfo")
    @Expose
    private JsonAccessInfo jsonAccessInfo;

    @SerializedName("searchInfo")
    @Expose
    private JsonSearchInfo searchInfo;

    // Getter Methods

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public JsonVolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public JsonSaleInfo getSaleInfo() {
        return saleInfo;
    }

    public JsonAccessInfo getAccessInfo() {
        return jsonAccessInfo;
    }

    public JsonSearchInfo getSearchInfo() {
        return searchInfo;
    }


    // Setter Methods
}
