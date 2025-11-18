package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonIndustryIdentifiers {
    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("identifier")
    @Expose
    private String identifier;

    // Getter Methods

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }


    // Setter Methods
}
