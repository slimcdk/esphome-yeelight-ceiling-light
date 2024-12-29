package com.inuker.bluetooth.library.search;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class SearchResult implements Parcelable {
    public static final Parcelable.Creator<SearchResult> CREATOR = new Parcelable.Creator<SearchResult>() {
        public SearchResult createFromParcel(Parcel parcel) {
            return new SearchResult(parcel);
        }

        public SearchResult[] newArray(int i) {
            return new SearchResult[i];
        }
    };
    public BluetoothDevice device;
    public int rssi;
    public byte[] scanRecord;

    public SearchResult(BluetoothDevice bluetoothDevice) {
        this(bluetoothDevice, 0, (byte[]) null);
    }

    public SearchResult(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.device = bluetoothDevice;
        this.rssi = i;
        this.scanRecord = bArr;
    }

    public SearchResult(Parcel parcel) {
        this.device = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.rssi = parcel.readInt();
        this.scanRecord = parcel.createByteArray();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.device.equals(((SearchResult) obj).device);
    }

    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.device;
        return bluetoothDevice != null ? bluetoothDevice.getAddress() : "";
    }

    public String getName() {
        String name = this.device.getName();
        return TextUtils.isEmpty(name) ? "NULL" : name;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mac = " + this.device.getAddress());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.device, 0);
        parcel.writeInt(this.rssi);
        parcel.writeByteArray(this.scanRecord);
    }
}
