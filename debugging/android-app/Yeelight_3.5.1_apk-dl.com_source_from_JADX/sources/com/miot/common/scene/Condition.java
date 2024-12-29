package com.miot.common.scene;

import android.os.Parcel;
import android.os.Parcelable;

public class Condition implements Parcelable {
    public static final Parcelable.Creator<Condition> CREATOR = new Parcelable.Creator<Condition>() {
        public Condition createFromParcel(Parcel parcel) {
            return new Condition(parcel);
        }

        public Condition[] newArray(int i) {
            return new Condition[i];
        }
    };
    private static final String TAG = "Condition";
    private Object mAttr;

    public Condition() {
    }

    protected Condition(Parcel parcel) {
        this.mAttr = parcel.readValue(Object.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public Object getAttr() {
        return this.mAttr;
    }

    public void setAttr(Object obj) {
        this.mAttr = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.mAttr);
    }
}
