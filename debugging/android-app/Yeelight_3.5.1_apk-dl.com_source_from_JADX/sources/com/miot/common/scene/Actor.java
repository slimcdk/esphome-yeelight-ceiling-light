package com.miot.common.scene;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Action;

public class Actor implements Parcelable {
    public static final Parcelable.Creator<Actor> CREATOR = new Parcelable.Creator<Actor>() {
        public Actor createFromParcel(Parcel parcel) {
            return new Actor(parcel);
        }

        public Actor[] newArray(int i) {
            return new Actor[i];
        }
    };
    private static final String TAG = "Actor";
    private Action mAction;
    private String mDeviceId;
    private String mModel;
    private Object mRawData;

    public Actor() {
    }

    protected Actor(Parcel parcel) {
        this.mModel = parcel.readString();
        this.mDeviceId = parcel.readString();
        this.mAction = (Action) parcel.readParcelable(Action.class.getClassLoader());
        this.mRawData = parcel.readValue(Object.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public Action getAction() {
        return this.mAction;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getModel() {
        return this.mModel;
    }

    public Object getRawData() {
        return this.mRawData;
    }

    public void setAction(Action action) {
        this.mAction = action;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setModel(String str) {
        this.mModel = str;
    }

    public void setRawData(Object obj) {
        this.mRawData = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mModel);
        parcel.writeString(this.mDeviceId);
        parcel.writeParcelable(this.mAction, i);
        parcel.writeValue(this.mRawData);
    }
}
