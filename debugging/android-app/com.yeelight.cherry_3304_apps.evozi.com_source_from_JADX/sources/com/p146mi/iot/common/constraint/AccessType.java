package com.p146mi.iot.common.constraint;

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
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -1039689911) {
                if (hashCode != 3496342) {
                    if (hashCode == 113399775 && optString.equals("write")) {
                        c = 1;
                    }
                } else if (optString.equals("read")) {
                    c = 0;
                }
            } else if (optString.equals("notify")) {
                c = 2;
            }
            if (c == 0) {
                accessType.setGettable(true);
            } else if (c == 1) {
                accessType.setSettable(true);
            } else if (c == 2) {
                accessType.setNotifiable(true);
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
