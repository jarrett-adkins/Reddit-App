
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMedia implements Parcelable
{

    @SerializedName("oembed")
    @Expose
    private Oembed oembed;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Parcelable.Creator<SecureMedia> CREATOR = new Creator<SecureMedia>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SecureMedia createFromParcel(Parcel in) {
            return new SecureMedia(in);
        }

        public SecureMedia[] newArray(int size) {
            return (new SecureMedia[size]);
        }

    }
    ;

    protected SecureMedia(Parcel in) {
        this.oembed = ((Oembed) in.readValue((Oembed.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public SecureMedia() {
    }

    public Oembed getOembed() {
        return oembed;
    }

    public void setOembed(Oembed oembed) {
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
