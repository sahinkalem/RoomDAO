package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonSearchInfo {
    @SerializedName("textSnippet")
    @Expose
    private String textSnippet;

    // Getter Methods

    public String getTextSnippet() {
        return textSnippet;
    }


    // Setter Methods
}
