package com.miot.common.device.invocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.ConnectionInfo;
import com.miot.common.device.ConnectionType;

public class InvokeInfo implements Parcelable {
    public static final Parcelable.Creator<InvokeInfo> CREATOR = new Parcelable.Creator<InvokeInfo>() {
        public InvokeInfo createFromParcel(Parcel parcel) {
            return new InvokeInfo(parcel);
        }

        public InvokeInfo[] newArray(int i) {
            return new InvokeInfo[i];
        }
    };
    private ConnectionInfo mConnectionInfo;
    private ConnectionType mConnectionType;
    private String mDeviceId;
    private String mModel;
    private String mParentDeviceId;
    private String mToken;

    public InvokeInfo() {
    }

    protected InvokeInfo(Parcel parcel) {
        this.mDeviceId = parcel.readString();
        this.mModel = parcel.readString();
        this.mParentDeviceId = parcel.readString();
        this.mToken = parcel.readString();
        int readInt = parcel.readInt();
        this.mConnectionType = readInt == -1 ? null : ConnectionType.values()[readInt];
        this.mConnectionInfo = (ConnectionInfo) parcel.readParcelable(ConnectionInfo.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public ConnectionInfo getConnectionInfo() {
        return this.mConnectionInfo;
    }

    public ConnectionType getConnectionType() {
        return this.mConnectionType;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getModel() {
        return this.mModel;
    }

    public String getParentDeviceId() {
        return this.mParentDeviceId;
    }

    public String getToken() {
        return this.mToken;
    }

    public void setConnectionInfo(ConnectionInfo connectionInfo) {
        this.mConnectionInfo = connectionInfo;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.mConnectionType = connectionType;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setModel(String str) {
        this.mModel = str;
    }

    public void setParentDeviceId(String str) {
        this.mParentDeviceId = str;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mModel);
        parcel.writeString(this.mParentDeviceId);
        parcel.writeString(this.mToken);
        ConnectionType connectionType = this.mConnectionType;
        parcel.writeInt(connectionType == null ? -1 : connectionType.ordinal());
        parcel.writeParcelable(this.mConnectionInfo, i);
    }
}
