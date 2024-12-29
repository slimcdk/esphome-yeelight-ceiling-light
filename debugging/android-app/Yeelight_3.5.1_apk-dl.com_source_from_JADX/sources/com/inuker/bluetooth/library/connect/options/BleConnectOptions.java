package com.inuker.bluetooth.library.connect.options;

import android.os.Parcel;
import android.os.Parcelable;

public class BleConnectOptions implements Parcelable {
    public static final Parcelable.Creator<BleConnectOptions> CREATOR = new Parcelable.Creator<BleConnectOptions>() {
        public BleConnectOptions createFromParcel(Parcel parcel) {
            return new BleConnectOptions(parcel);
        }

        public BleConnectOptions[] newArray(int i) {
            return new BleConnectOptions[i];
        }
    };
    private int connectRetry;
    private int connectTimeout;
    private String qrcodeOob = "";
    private int serviceDiscoverRetry;
    private int serviceDiscoverTimeout;

    public static class Builder {
        private static final int DEFAULT_CONNECT_RETRY = 0;
        private static final int DEFAULT_CONNECT_TIMEOUT = 30000;
        private static final int DEFAULT_SERVICE_DISCOVER_RETRY = 0;
        private static final int DEFAULT_SERVICE_DISCOVER_TIMEOUT = 30000;
        /* access modifiers changed from: private */
        public int connectRetry = 0;
        /* access modifiers changed from: private */
        public int connectTimeout = 30000;
        /* access modifiers changed from: private */
        public int serviceDiscoverRetry = 0;
        /* access modifiers changed from: private */
        public int serviceDiscoverTimeout = 30000;

        public BleConnectOptions build() {
            return new BleConnectOptions(this);
        }

        public Builder setConnectRetry(int i) {
            this.connectRetry = i;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        public Builder setServiceDiscoverRetry(int i) {
            this.serviceDiscoverRetry = i;
            return this;
        }

        public Builder setServiceDiscoverTimeout(int i) {
            this.serviceDiscoverTimeout = i;
            return this;
        }
    }

    protected BleConnectOptions(Parcel parcel) {
        this.connectRetry = parcel.readInt();
        this.serviceDiscoverRetry = parcel.readInt();
        this.connectTimeout = parcel.readInt();
        this.serviceDiscoverTimeout = parcel.readInt();
        this.qrcodeOob = parcel.readString();
    }

    public BleConnectOptions(Builder builder) {
        this.connectRetry = builder.connectRetry;
        this.serviceDiscoverRetry = builder.serviceDiscoverRetry;
        this.connectTimeout = builder.connectTimeout;
        this.serviceDiscoverTimeout = builder.serviceDiscoverTimeout;
    }

    public int describeContents() {
        return 0;
    }

    public int getConnectRetry() {
        return this.connectRetry;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getQrcodeOob() {
        return this.qrcodeOob;
    }

    public int getServiceDiscoverRetry() {
        return this.serviceDiscoverRetry;
    }

    public int getServiceDiscoverTimeout() {
        return this.serviceDiscoverTimeout;
    }

    public void setConnectRetry(int i) {
        this.connectRetry = i;
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public void setQrcodeOob(String str) {
        if (str == null) {
            str = "";
        }
        this.qrcodeOob = str;
    }

    public void setServiceDiscoverRetry(int i) {
        this.serviceDiscoverRetry = i;
    }

    public void setServiceDiscoverTimeout(int i) {
        this.serviceDiscoverTimeout = i;
    }

    public String toString() {
        return "BleConnectOptions{connectRetry=" + this.connectRetry + ", serviceDiscoverRetry=" + this.serviceDiscoverRetry + ", connectTimeout=" + this.connectTimeout + ", serviceDiscoverTimeout=" + this.serviceDiscoverTimeout + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectRetry);
        parcel.writeInt(this.serviceDiscoverRetry);
        parcel.writeInt(this.connectTimeout);
        parcel.writeInt(this.serviceDiscoverTimeout);
        parcel.writeString(this.qrcodeOob);
    }
}
