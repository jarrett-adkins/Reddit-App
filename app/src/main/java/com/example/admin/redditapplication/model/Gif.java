
package com.example.admin.redditapplication.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gif implements Parcelable
{

    @SerializedName("source")
    @Expose
    private Source_ source;
    @SerializedName("resolutions")
    @Expose
    private List<Resolution_> resolutions = null;
    public final static Parcelable.Creator<Gif> CREATOR = new Creator<Gif>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Gif createFromParcel(Parcel in) {
            return new Gif(in);
        }

        public Gif[] newArray(int size) {
            return (new Gif[size]);
        }

    }
    ;

    protected Gif(Parcel in) {
        this.source = ((Source_) in.readValue((Source_.class.getClassLoader())));
        in.readList(this.resolutions, (com.example.admin.redditapplication.model.Resolution_.class.getClassLoader()));
    }

    public Gif() {
    }

    public Source_ getSource() {
        return source;
    }

    public void setSource(Source_ source) {
        this.source = source;
    }

    public List<Resolution_> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution_> resolutions) {
        this.resolutions = resolutions;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(source);
        dest.writeList(resolutions);
    }

    public int describeContents() {
        return  0;
    }

}
