
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaEmbed implements Parcelable
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
    @SerializedName("height")
    @Expose
    private Integer height;
    public final static Parcelable.Creator<MediaEmbed> CREATOR = new Creator<MediaEmbed>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MediaEmbed createFromParcel(Parcel in) {
            return new MediaEmbed(in);
        }

        public MediaEmbed[] newArray(int size) {
            return (new MediaEmbed[size]);
        }

    }
    ;

    protected MediaEmbed(Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.scrolling = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public MediaEmbed() {
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
        dest.writeValue(height);
    }

    public int describeContents() {
        return  0;
    }

}
