package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new C3964a();

    /* renamed from: a */
    public String f6725a;

    /* renamed from: b */
    public String f6726b;

    /* renamed from: c */
    public String f6727c;

    /* renamed from: d */
    public int f6728d;

    /* renamed from: e */
    public int f6729e;

    /* renamed from: f */
    public int f6730f;

    /* renamed from: g */
    public int f6731g;

    /* renamed from: h */
    public byte[] f6732h = new byte[16];

    /* renamed from: i */
    public String f6733i;

    /* renamed from: com.telink.bluetooth.light.DeviceInfo$a */
    static class C3964a implements Parcelable.Creator<DeviceInfo> {
        C3964a() {
        }

        /* renamed from: a */
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel);
        }

        /* renamed from: b */
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    public DeviceInfo() {
    }

    public DeviceInfo(Parcel parcel) {
        this.f6725a = parcel.readString();
        this.f6726b = parcel.readString();
        this.f6727c = parcel.readString();
        this.f6733i = parcel.readString();
        this.f6728d = parcel.readInt();
        this.f6729e = parcel.readInt();
        this.f6730f = parcel.readInt();
        this.f6731g = parcel.readInt();
        parcel.readByteArray(this.f6732h);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6725a);
        parcel.writeString(this.f6726b);
        parcel.writeString(this.f6727c);
        parcel.writeString(this.f6733i);
        parcel.writeInt(this.f6728d);
        parcel.writeInt(this.f6729e);
        parcel.writeInt(this.f6730f);
        parcel.writeInt(this.f6731g);
        parcel.writeByteArray(this.f6732h);
    }
}
