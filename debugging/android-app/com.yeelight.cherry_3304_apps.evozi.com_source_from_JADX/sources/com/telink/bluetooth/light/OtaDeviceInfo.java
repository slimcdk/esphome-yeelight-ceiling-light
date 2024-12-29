package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public class OtaDeviceInfo extends DeviceInfo {
    public static final Parcelable.Creator<OtaDeviceInfo> CREATOR = new C3966a();

    /* renamed from: j */
    public int f6738j;

    /* renamed from: com.telink.bluetooth.light.OtaDeviceInfo$a */
    static class C3966a implements Parcelable.Creator<OtaDeviceInfo> {
        C3966a() {
        }

        /* renamed from: a */
        public OtaDeviceInfo createFromParcel(Parcel parcel) {
            return new OtaDeviceInfo(parcel);
        }

        /* renamed from: b */
        public OtaDeviceInfo[] newArray(int i) {
            return new OtaDeviceInfo[i];
        }
    }

    public OtaDeviceInfo() {
    }

    public OtaDeviceInfo(Parcel parcel) {
        super(parcel);
        this.f6738j = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6738j);
    }
}
