package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonPanelizationSummary {
    @SerializedName("containsEpubBubbles")
    @Expose
    private Boolean containsEpubBubbles;

    @SerializedName("containsImageBubbles")
    @Expose
    private Boolean containsImageBubbles;

    // Getter Methods

    public Boolean getContainsEpubBubbles() {
        return containsEpubBubbles;
    }

    public Boolean getContainsImageBubbles() {
        return containsImageBubbles;
    }


    // Setter Methods
}
