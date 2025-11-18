package sahinkalem.roomdao.FavoriteModels;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sahinkalem.roomdao.JsonModels.JsonDimensions;
import sahinkalem.roomdao.JsonModels.JsonImageLinks;
import sahinkalem.roomdao.JsonModels.JsonIndustryIdentifiers;
import sahinkalem.roomdao.JsonModels.JsonPanelizationSummary;
import sahinkalem.roomdao.JsonModels.JsonReadingMode;

@Entity(tableName = "tbl_volume_info")
public class ModelVolumeInfo {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private String id;

    @ColumnInfo(name = "selfLink")
    private String selfLink;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "authors")
    private String authors;

    @ColumnInfo(name = "publisher")
    private String publisher;

    @ColumnInfo(name = "publishedDate")
    private String publishedDate;

    @ColumnInfo(name = "image")
    private String image;


    // Getter Methods ..............................................................................

    public String getId() {
        return id;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getImage() {
        return image;
    }


    // Setter Methods ..............................................................................

    public void setId(String id) {
        this.id = id;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Constructor Methods .........................................................................
    public ModelVolumeInfo() {
    }
}