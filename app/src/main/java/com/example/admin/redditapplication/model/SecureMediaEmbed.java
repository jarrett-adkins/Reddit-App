
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMediaEmbed implements Parcelable
{

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("scrolling")
    @Expose
    private Boolean scrolling;
    @SerializedName("media_domain_url")
    @Expose
    private String mediaDomainUrl;
    @SerializedName("height")
    @Expose
    private Integer height;
    public final static Parcelable.Creator<SecureMediaEmbed> CREATOR = new Creator<SecureMediaEmbed>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SecureMediaEmbed createFromParcel(Parcel in) {
            return new SecureMediaEmbed(in);
        }

        public SecureMediaEmbed[] newArray(int size) {
            return (new SecureMediaEmbed[size]);
        }

    }
    ;

    protected SecureMediaEmbed(Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.scrolling = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.mediaDomainUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public SecureMediaEmbed() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Boolean getScrolling() {
        return scrolling;
    }

    public void setScrolling(Boolean scrolling) {
        this.scrolling = scrolling;
    }

    public String getMediaDomainUrl() {
        return mediaDomainUrl;
    }

    public void setMediaDomainUrl(String mediaDomainUrl) {
        this.mediaDomainUrl = mediaDomainUrl;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(content);
        dest.writeValue(width);
        dest.writeValue(scrolling);
        dest.writeValue(mediaDomainUrl);
        dest.writeValue(height);
    }

    public int describeContents() {
        return  0;
    }

}
