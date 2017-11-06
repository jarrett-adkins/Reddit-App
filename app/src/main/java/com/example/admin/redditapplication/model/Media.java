
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media implements Parcelable
{

    @SerializedName("oembed")
    @Expose
    private Oembed_ oembed;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Parcelable.Creator<Media> CREATOR = new Creator<Media>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Media createFromParcel(Parcel in) {
            return new Media(in);
        }

        public Media[] newArray(int size) {
            return (new Media[size]);
        }

    }
    ;

    protected Media(Parcel in) {
        this.oembed = ((Oembed_) in.readValue((Oembed_.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Media() {
    }

    public Oembed_ getOembed() {
        return oembed;
    }

    public void setOembed(Oembed_ oembed) {
        this.oembed = oembed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(oembed);
        dest.writeValue(type);
    }

    public int describeContents() {
        return  0;
    }

}
