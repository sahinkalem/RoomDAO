package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonPdf {
    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;

    @SerializedName("acsTokenLink")
    @Expose
    private String acsTokenLink;

    @SerializedName("downloadLink")
    @Expose
    private String downloadLink;



    // Getter Methods

    public Boolean getAvailable() {
        return isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }



    // Setter Methods
}
