package com.miot.common.device.urn;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

public class XmlType implements UrnType, Serializable {
    public static final Parcelable.Creator<XmlType> CREATOR = new Parcelable.Creator<XmlType>() {
        public XmlType createFromParcel(Parcel parcel) {
            return new XmlType(parcel);
        }

        public XmlType[] newArray(int i) {
            return new XmlType[i];
        }
    };
    private static final String DOMAIN = "schemas-mi-com";
    private static final String TAG = "XmlType";
    private static final String URN = "urn";
    private String mClassType;
    private String mSubType;
    private Type mType;
    private String mVersion;

    public XmlType() {
    }

    protected XmlType(Parcel parcel) {
        int readInt = parcel.readInt();
        this.mType = readInt == -1 ? null : Type.values()[readInt];
        this.mClassType = parcel.readString();
        this.mSubType = parcel.readString();
        this.mVersion = parcel.readString();
    }

    public static XmlType parse(String[] strArr) {
        if (!URN.equals(strArr[0])) {
            StringBuilder sb = new StringBuilder();
            sb.append("type must start with urn, couldn't be ");
            sb.append(strArr[0]);
            return null;
        }
        Type parse = Type.parse(strArr[2]);
        if (parse == null) {
            return null;
        }
        XmlType xmlType = new XmlType();
        xmlType.mType = parse;
        xmlType.mClassType = strArr[3];
        xmlType.mSubType = strArr[4];
        xmlType.mVersion = strArr[5];
        return xmlType;
    }

    public int describeContents() {
        return 0;
    }

    public String getClassType() {
        return this.mClassType;
    }

    public String getDomain() {
        return "schemas-mi-com";
    }

    public String getName() {
        return this.mClassType + this.mSubType;
    }

    public String getSubType() {
        return this.mSubType;
    }

    public Type getType() {
        return this.mType;
    }

    public String getUUID() {
        return "0000";
    }

    public String toString() {
        return URN + Constants.COLON_SEPARATOR + "schemas-mi-com" + Constants.COLON_SEPARATOR + this.mType.toString() + Constants.COLON_SEPARATOR + this.mClassType + Constants.COLON_SEPARATOR + this.mSubType + Constants.COLON_SEPARATOR + this.mVersion;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Type type = this.mType;
        parcel.writeInt(type == null ? -1 : type.ordinal());
        parcel.writeString(this.mClassType);
        parcel.writeString(this.mSubType);
        parcel.writeString(this.mVersion);
    }
}
