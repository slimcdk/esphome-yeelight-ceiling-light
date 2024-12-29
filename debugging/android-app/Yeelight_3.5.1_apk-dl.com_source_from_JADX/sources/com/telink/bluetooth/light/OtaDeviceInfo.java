package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public class OtaDeviceInfo extends DeviceInfo {
    public static final Parcelable.Creator<OtaDeviceInfo> CREATOR = new C4385a();

    /* renamed from: j */
    public int f7340j;

    /* renamed from: com.telink.bluetooth.light.OtaDeviceInfo$a */
    static class C4385a implements Parcelable.Creator<OtaDeviceInfo> {
        C4385a() {
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
        this.f7340j = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f7340j);
    }
}
