
package com.example.admin.redditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class MyResponse implements Parcelable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private Data data;
    public final static Parcelable.Creator<MyResponse> CREATOR = new Creator<MyResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MyResponse createFromParcel(Parcel in) {
            return new MyResponse(in);
        }

        public MyResponse[] newArray(int size) {
            return (new MyResponse[size]);
        }

    }
    ;

    protected MyResponse(Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.data = ((Data) in.readValue((Data.class.getClassLoader())));
    }

    public MyResponse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(data);
    }

    public int describeContents() {
        return  0;
    }

}
