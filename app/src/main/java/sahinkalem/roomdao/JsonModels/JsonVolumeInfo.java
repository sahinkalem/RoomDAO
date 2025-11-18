package sahinkalem.roomdao.JsonModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JsonVolumeInfo implements Serializable {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("authors")
    @Expose
    private ArrayList<String> authors;

    @SerializedName("publisher")
    @Expose
    private String publisher;

    @SerializedName("publishedDate")
    @Expose
    private String publishedDate;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("jsonIndustryIdentifiers")
    @Expose
    List<JsonIndustryIdentifiers> jsonIndustryIdentifiers;

    @SerializedName("readingMode")
    @Expose
    JsonReadingMode readingMode;

    @SerializedName("pageCount")
    @Expose
    private int pageCount;

    @SerializedName("jsonDimensions")
    @Expose
    private JsonDimensions jsonDimensions;

    @SerializedName("printType")
    @Expose
    private String printType;

    @SerializedName("categories")
    @Expose
    private ArrayList<String> categories;

    @SerializedName("averageRating")
    @Expose
    private double averageRating;

    @SerializedName("ratingsCount")
    @Expose
    private int ratingsCount;

    @SerializedName("maturityRating")
    @Expose
    private String maturityRating;

    @SerializedName("allowAnonLogging")
    @Expose
    private boolean allowAnonLogging;

    @SerializedName("contentVersion")
    @Expose
    private String contentVersion;

    @SerializedName("panelizationSummary")
    @Expose
    JsonPanelizationSummary panelizationSummary;

    @SerializedName("jsonImageLinks")
    @Expose
    JsonImageLinks jsonImageLinks;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("previewLink")
    @Expose
    private String previewLink;

    @SerializedName("infoLink")
    @Expose
    private String infoLink;

    @SerializedName("canonicalVolumeLink")
    @Expose
    private String canonicalVolumeLink;

    // Getter Methods

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public List<JsonIndustryIdentifiers> getIndustryIdentifiers() {
        return jsonIndustryIdentifiers;
    }

    public JsonReadingMode getReadingMode() {
        return readingMode;
    }

    public int getPageCount() {
        return pageCount;
    }

    public JsonDimensions getDimensions() {
        return jsonDimensions;
    }

    public String getPrintType() {
        return printType;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public boolean isAllowAnonLogging() {
        return allowAnonLogging;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public JsonPanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    public JsonImageLinks getImageLinks() {
        return jsonImageLinks;
    }

    public String getLanguage() {
        return language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }


    // Setter Methods






    /* creating a constructor class for our BookInfo
        public JsonVolumeInfo(String title, String subtitle, ArrayList<String> authors, String publisher,
                         String publishedDate, String description, int pageCount, String thumbnail,
                         String previewLink, String infoLink, String buyLink) {
            this.title = title;
            this.subtitle = subtitle;
            this.authors = authors;
            this.publisher = publisher;
            this.publishedDate = publishedDate;
            this.description = description;
            this.pageCount = pageCount;
            this.thumbnail = thumbnail;
            this.previewLink = previewLink;
            this.infoLink = infoLink;
            this.buyLink = buyLink;
    }*/
}