package com.p146mi.iot.common.urn;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.utils.Logger;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.mi.iot.common.urn.UrnType */
public class UrnType implements Parcelable {
    public static final Parcelable.Creator<UrnType> CREATOR = new Parcelable.Creator<UrnType>() {
        public UrnType createFromParcel(Parcel parcel) {
            return new UrnType(parcel);
        }

        public UrnType[] newArray(int i) {
            return new UrnType[i];
        }
    };
    private static final String DEFAULT_VENDOR = "Xiaomi";
    private static final String DEFAULT_VERSION = "1";
    private static final String TAG = UrnType.class.getSimpleName();
    private static final String URN = "urn";
    private String mDomain;
    private String mName;
    private String mOriginString;
    private Type mType;
    private String mUUID;
    private String mVendor;
    private String mVersion = "1";

    /* renamed from: com.mi.iot.common.urn.UrnType$Type */
    private enum Type {
        device,
        service,
        property,
        action,
        event;

        public static Type parse(String str) {
            try {
                return valueOf(str);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public UrnType() {
    }

    protected UrnType(Parcel parcel) {
        this.mDomain = parcel.readString();
        int readInt = parcel.readInt();
        this.mType = readInt == -1 ? null : Type.values()[readInt];
        this.mName = parcel.readString();
        this.mUUID = parcel.readString();
        this.mVendor = parcel.readString();
        this.mVersion = parcel.readString();
        this.mOriginString = parcel.readString();
    }

    public static UrnType parse(String str) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        if (split.length < 5) {
            return null;
        }
        if (!URN.equals(split[0])) {
            "type must start with urn, couldn't be " + split[0];
            return null;
        }
        Type parse = Type.parse(split[2]);
        if (parse == null) {
            return null;
        }
        UrnType urnType = new UrnType();
        urnType.mDomain = split[1];
        urnType.mType = parse;
        urnType.mName = split[3];
        urnType.mUUID = split[4];
        urnType.mVendor = split.length >= 6 ? split[5] : DEFAULT_VENDOR;
        urnType.mVersion = split.length >= 7 ? split[6] : "1";
        urnType.setOriginString(str);
        return urnType;
    }

    public int compareVersion(UrnType urnType) {
        if (urnType.mVersion.equals(this.mVersion)) {
            return 0;
        }
        try {
            return Integer.parseInt(this.mVersion) > Integer.parseInt(urnType.mVersion) ? 1 : -1;
        } catch (NumberFormatException e) {
            Logger.m10630e("UrnType", "method :needCompatVersion number format e:" + e.getMessage());
            return -1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UrnType)) {
            return false;
        }
        UrnType urnType = (UrnType) obj;
        return getDomain().equals(urnType.getDomain()) && getType() == urnType.getType() && getName().equals(urnType.getName()) && getUUID().equals(urnType.getUUID()) && getVendor().equals(urnType.getVendor());
    }

    public String getDomain() {
        return this.mDomain;
    }

    public String getName() {
        return this.mName;
    }

    public String getOriginString() {
        return this.mOriginString;
    }

    public Type getType() {
        return this.mType;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public String getVendor() {
        return this.mVendor;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return getDomain().hashCode() + (getType().toString().hashCode() * 31) + (getName().hashCode() * 31 * 31) + (getUUID().hashCode() * 31 * 31 * 31) + (getVendor().hashCode() * 31 * 31 * 31 * 31);
    }

    public void setOriginString(String str) {
        this.mOriginString = str;
    }

    public String toString() {
        return URN + Constants.COLON_SEPARATOR + this.mDomain + Constants.COLON_SEPARATOR + this.mType.toString() + Constants.COLON_SEPARATOR + this.mName + Constants.COLON_SEPARATOR + this.mUUID + Constants.COLON_SEPARATOR + this.mVendor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDomain);
        Type type = this.mType;
        parcel.writeInt(type == null ? -1 : type.ordinal());
        parcel.writeString(this.mName);
        parcel.writeString(this.mUUID);
        parcel.writeString(this.mVendor);
        parcel.writeString(this.mVersion);
        parcel.writeString(this.mOriginString);
    }
}
