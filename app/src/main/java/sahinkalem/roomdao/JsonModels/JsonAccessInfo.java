package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonAccessInfo {
    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("viewability")
    @Expose
    private String viewability;

    @SerializedName("embeddable")
    @Expose
    private boolean embeddable;

    @SerializedName("publicDomain")
    @Expose
    private boolean publicDomain;

    @SerializedName("textToSpeechPermission")
    @Expose
    private String textToSpeechPermission;

    @SerializedName("jsonEpub")
    @Expose
    private JsonEpub jsonEpub;

    @SerializedName("pdf")
    @Expose
    private JsonPdf pdf;

    @SerializedName("webReaderLink")
    @Expose
    private String webReaderLink;

    @SerializedName("accessViewStatus")
    @Expose
    private String accessViewStatus;

    @SerializedName("quoteSharingAllowed")
    @Expose
    private boolean quoteSharingAllowed;


    // Getter Methods

    public String getCountry() {
        return country;
    }

    public String getViewability() {
        return viewability;
    }

    public boolean isEmbeddable() {
        return embeddable;
    }

    public boolean isPublicDomain() {
        return publicDomain;
    }

    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    public JsonEpub getEpub() {
        return jsonEpub;
    }

    public JsonPdf getPdf() {
        return pdf;
    }

    public String getWebReaderLink() {
        return webReaderLink;
    }

    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    public boolean isQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }


    // Setter Methods
}
