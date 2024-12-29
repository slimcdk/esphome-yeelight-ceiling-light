package com.telink.bluetooth.light;

import android.os.Parcel;
import android.os.Parcelable;

public final class NotificationInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationInfo> CREATOR = new C3965a();

    /* renamed from: a */
    public int f6734a;

    /* renamed from: b */
    public int f6735b;

    /* renamed from: c */
    public byte[] f6736c = new byte[10];

    /* renamed from: d */
    public DeviceInfo f6737d;

    /* renamed from: com.telink.bluetooth.light.NotificationInfo$a */
    static class C3965a implements Parcelable.Creator<NotificationInfo> {
        C3965a() {
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
        this.f6734a = parcel.readInt();
        this.f6735b = parcel.readInt();
        parcel.readByteArray(this.f6736c);
        Object readValue = parcel.readValue(DeviceInfo.class.getClassLoader());
        if (readValue != null) {
            this.f6737d = (DeviceInfo) readValue;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6734a);
        parcel.writeInt(this.f6735b);
        parcel.writeByteArray(this.f6736c);
        DeviceInfo deviceInfo = this.f6737d;
        if (deviceInfo != null) {
            parcel.writeValue(deviceInfo);
        }
    }
}
