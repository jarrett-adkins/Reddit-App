
package com.example.admin.redditapplication.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Parcelable
{

    @SerializedName("modhash")
    @Expose
    private String modhash;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;
    @SerializedName("after")
    @Expose
    private String after;
    @SerializedName("before")
    @Expose
    private Object before;
    public final static Parcelable.Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;

    protected Data(Parcel in) {
        this.modhash = ((String) in.readValue((String.class.getClassLoader())));
        this.whitelistStatus = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.children, (com.example.admin.redditapplication.model.Child.class.getClassLoader()));
        this.after = ((String) in.readValue((String.class.getClassLoader())));
        this.before = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Data() {
    }

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Object getBefore() {
        return before;
    }

    public void setBefore(Object before) {
        this.before = before;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(modhash);
        dest.writeValue(whitelistStatus);
        dest.writeList(children);
        dest.writeValue(after);
        dest.writeValue(before);
    }

    public int describeContents() {
        return  0;
    }

}
