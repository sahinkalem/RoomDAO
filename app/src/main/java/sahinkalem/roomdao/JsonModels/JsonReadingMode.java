package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonReadingMode {
    @SerializedName("text")
    @Expose
    private Boolean text;

    @SerializedName("image")
    @Expose
    private Boolean image;

    // Getter Methods

    public Boolean getText() {
        return text;
    }

    public Boolean getImage() {
        return image;
    }


    // Setter Methods
}
