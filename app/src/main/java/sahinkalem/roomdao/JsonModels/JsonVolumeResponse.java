package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonVolumeResponse {
    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;

    @SerializedName("jsonItems")
    @Expose
    private List<JsonItem> jsonItems;


    // Getter Methods

    public String getKind() {
        return kind;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public List<JsonItem> getItems() {
        return jsonItems;
    }


    // Setter Methods


    public void setItems(List<JsonItem> jsonItems) {
        this.jsonItems = jsonItems;
    }
}
