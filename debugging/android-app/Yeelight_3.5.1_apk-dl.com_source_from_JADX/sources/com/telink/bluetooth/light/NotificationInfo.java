package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public final class NotificationInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationInfo> CREATOR = new C4384a();

    /* renamed from: a */
    public int f7336a;

    /* renamed from: b */
    public int f7337b;

    /* renamed from: c */
    public byte[] f7338c = new byte[10];

    /* renamed from: d */
    public DeviceInfo f7339d;

    /* renamed from: com.telink.bluetooth.light.NotificationInfo$a */
    static class C4384a implements Parcelable.Creator<NotificationInfo> {
        C4384a() {
        }

        /* renamed from: a */
        public NotificationInfo createFromParcel(Parcel parcel) {
            return new NotificationInfo(parcel);
        }

        /* renamed from: b */
        public NotificationInfo[] newArray(int i) {
            return new NotificationInfo[i];
        }
    }

    public NotificationInfo() {
    }

    public NotificationInfo(Parcel parcel) {
        this.f7336a = parcel.readInt();
        this.f7337b = parcel.readInt();
        parcel.readByteArray(this.f7338c);
        Object readValue = parcel.readValue(DeviceInfo.class.getClassLoader());
        if (readValue != null) {
            this.f7339d = (DeviceInfo) readValue;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7336a);
        parcel.writeInt(this.f7337b);
        parcel.writeByteArray(this.f7338c);
        DeviceInfo deviceInfo = this.f7339d;
        if (deviceInfo != null) {
            parcel.writeValue(deviceInfo);
        }
    }
}
