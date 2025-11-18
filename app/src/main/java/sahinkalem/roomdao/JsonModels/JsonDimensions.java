package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonDimensions {

    @SerializedName("height")
    @Expose
    private String height;

    @SerializedName("width")
    @Expose
    private String width;

    @SerializedName("thickness")
    @Expose
    private String thickness;

    // Getters

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getThickness() {
        return thickness;
    }


    // Setters

}
