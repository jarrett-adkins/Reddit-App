
package com.example.admin.redditapplication.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mp4 implements Parcelable
{

    @SerializedName("source")
    @Expose
    private Source__ source;
    @SerializedName("resolutions")
    @Expose
    private List<Resolution__> resolutions = null;
    public final static Parcelable.Creator<Mp4> CREATOR = new Creator<Mp4>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Mp4 createFromParcel(Parcel in) {
            return new Mp4(in);
        }

        public Mp4 [] newArray(int size) {
            return (new Mp4[size]);
        }

    }
    ;

    protected Mp4(Parcel in) {
        this.source = ((Source__) in.readValue((Source__.class.getClassLoader())));
        in.readList(this.resolutions, (com.example.admin.redditapplication.model.Resolution__.class.getClassLoader()));
    }

    public Mp4() {
    }

    public Source__ getSource() {
        return source;
    }

    public void setSource(Source__ source) {
        this.source = source;
    }

    public List<Resolution__> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution__> resolutions) {
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
