
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Oembed_ implements Parcelable
{

    @SerializedName("provider_url")
    @Expose
    private String providerUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("thumbnail_width")
    @Expose
    private Integer thumbnailWidth;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("thumbnail_height")
    @Expose
    private Integer thumbnailHeight;
    public final static Parcelable.Creator<Oembed_> CREATOR = new Creator<Oembed_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Oembed_ createFromParcel(Parcel in) {
            return new Oembed_(in);
        }

        public Oembed_[] newArray(int size) {
            return (new Oembed_[size]);
        }

    }
    ;

    protected Oembed_(Parcel in) {
        this.providerUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailWidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.html = ((String) in.readValue((String.class.getClassLoader())));
        this.version = ((String) in.readValue((String.class.getClassLoader())));
        this.providerName = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailHeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Oembed_() {
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(providerUrl);
        dest.writeValue(description);
        dest.writeValue(title);
        dest.writeValue(type);
        dest.writeValue(thumbnailWidth);
        dest.writeValue(height);
        dest.writeValue(width);
        dest.writeValue(html);
        dest.writeValue(version);
        dest.writeValue(providerName);
        dest.writeValue(thumbnailUrl);
        dest.writeValue(thumbnailHeight);
    }

    public int describeContents() {
        return  0;
    }

}
