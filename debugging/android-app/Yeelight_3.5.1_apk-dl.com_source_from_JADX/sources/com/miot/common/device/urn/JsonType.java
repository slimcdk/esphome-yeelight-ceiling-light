package com.miot.common.device.urn;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

public class JsonType implements UrnType, Serializable {
    public static final Parcelable.Creator<JsonType> CREATOR = new Parcelable.Creator<JsonType>() {
        public JsonType createFromParcel(Parcel parcel) {
            return new JsonType(parcel);
        }

        public JsonType[] newArray(int i) {
            return new JsonType[i];
        }
    };
    private static final String TAG = "JsonType";
    private static final String URN = "urn";
    private String mDomain;
    private String mName;
    private Type mType;
    private String mUUID;

    public JsonType() {
    }

    protected JsonType(Parcel parcel) {
        this.mDomain = parcel.readString();
        int readInt = parcel.readInt();
        this.mType = readInt == -1 ? null : Type.values()[readInt];
        this.mName = parcel.readString();
        this.mUUID = parcel.readString();
    }

    public JsonType(JsonType jsonType) {
        this.mDomain = jsonType.getDomain();
        this.mType = jsonType.getType();
        this.mName = jsonType.getName();
        this.mUUID = jsonType.getUUID();
    }

    public static JsonType parse(String[] strArr) {
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
        JsonType jsonType = new JsonType();
        jsonType.mDomain = strArr[1];
        jsonType.mType = parse;
        jsonType.mName = strArr[3];
        jsonType.mUUID = strArr[4];
        return jsonType;
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getClassType() {
        return "";
    }

    public String getDomain() {
        return this.mDomain;
    }

    public String getName() {
        return this.mName;
    }

    @Deprecated
    public String getSubType() {
        return this.mName;
    }

    public Type getType() {
        return this.mType;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    public String toString() {
        return URN + Constants.COLON_SEPARATOR + this.mDomain + Constants.COLON_SEPARATOR + this.mType.toString() + Constants.COLON_SEPARATOR + this.mName + Constants.COLON_SEPARATOR + this.mUUID;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDomain);
        Type type = this.mType;
        parcel.writeInt(type == null ? -1 : type.ordinal());
        parcel.writeString(this.mName);
        parcel.writeString(this.mUUID);
    }
}
