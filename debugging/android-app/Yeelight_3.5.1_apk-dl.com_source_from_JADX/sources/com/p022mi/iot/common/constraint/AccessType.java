package com.p022mi.iot.common.constraint;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* renamed from: com.mi.iot.common.constraint.AccessType */
public class AccessType implements Parcelable {
    public static final Parcelable.Creator<AccessType> CREATOR = new Parcelable.Creator<AccessType>() {
        public AccessType createFromParcel(Parcel parcel) {
            return new AccessType(parcel);
        }

        public AccessType[] newArray(int i) {
            return new AccessType[i];
        }
    };
    public static final int GETTABLE = 2;
    public static final int NOTIFIABLE = 4;
    public static final int SETTABLE = 1;
    private int mValue;

    public AccessType() {
    }

    protected AccessType(Parcel parcel) {
        this.mValue = parcel.readInt();
    }

    public static AccessType valueOf(int i) {
        AccessType accessType = new AccessType();
        accessType.mValue = i;
        return accessType;
    }

    public static AccessType valueOf(JSONArray jSONArray) {
        AccessType accessType = new AccessType();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i, "");
            optString.hashCode();
            char c = 65535;
            switch (optString.hashCode()) {
                case -1039689911:
                    if (optString.equals("notify")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3496342:
                    if (optString.equals("read")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113399775:
                    if (optString.equals("write")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    accessType.setNotifiable(true);
                    break;
                case 1:
                    accessType.setGettable(true);
                    break;
                case 2:
                    accessType.setSettable(true);
                    break;
            }
        }
        return accessType;
    }

    public int describeContents() {
        return 0;
    }

    public boolean isGettable() {
        return (this.mValue & 2) == 2;
    }

    public boolean isNotifiable() {
        return (this.mValue & 4) == 4;
    }

    public boolean isSettable() {
        return (this.mValue & 1) == 1;
    }

    public int setGettable(boolean z) {
        this.mValue = z ? this.mValue | 2 : this.mValue & -3;
        return this.mValue;
    }

    public int setNotifiable(boolean z) {
        this.mValue = z ? this.mValue | 4 : this.mValue & -5;
        return this.mValue;
    }

    public int setSettable(boolean z) {
        this.mValue = z ? this.mValue | 1 : this.mValue & -2;
        return this.mValue;
    }

    public int value() {
        return this.mValue;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
