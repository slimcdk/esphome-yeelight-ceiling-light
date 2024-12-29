package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new C4383a();

    /* renamed from: a */
    public String f7326a;

    /* renamed from: b */
    public String f7327b;

    /* renamed from: c */
    public String f7328c;

    /* renamed from: d */
    public int f7329d;

    /* renamed from: e */
    public int f7330e;

    /* renamed from: f */
    public int f7331f;

    /* renamed from: g */
    public int f7332g;

    /* renamed from: h */
    public byte[] f7333h = new byte[16];

    /* renamed from: i */
    public String f7334i;

    /* renamed from: com.telink.bluetooth.light.DeviceInfo$a */
    static class C4383a implements Parcelable.Creator<DeviceInfo> {
        C4383a() {
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
        this.f7326a = parcel.readString();
        this.f7327b = parcel.readString();
        this.f7328c = parcel.readString();
        this.f7334i = parcel.readString();
        this.f7329d = parcel.readInt();
        this.f7330e = parcel.readInt();
        this.f7331f = parcel.readInt();
        this.f7332g = parcel.readInt();
        parcel.readByteArray(this.f7333h);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326a);
        parcel.writeString(this.f7327b);
        parcel.writeString(this.f7328c);
        parcel.writeString(this.f7334i);
        parcel.writeInt(this.f7329d);
        parcel.writeInt(this.f7330e);
        parcel.writeInt(this.f7331f);
        parcel.writeInt(this.f7332g);
        parcel.writeByteArray(this.f7333h);
    }
}
