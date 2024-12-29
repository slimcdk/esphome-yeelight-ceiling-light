package com.inuker.bluetooth.library.model;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

public class BleGattCharacter implements Parcelable {
    public static final Parcelable.Creator<BleGattCharacter> CREATOR = new Parcelable.Creator<BleGattCharacter>() {
        public BleGattCharacter createFromParcel(Parcel parcel) {
            return new BleGattCharacter(parcel);
        }

        public BleGattCharacter[] newArray(int i) {
            return new BleGattCharacter[i];
        }
    };
    private int permissions;
    private int property;
    private UUID uuid;

    public BleGattCharacter(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.uuid = bluetoothGattCharacteristic.getUuid();
        this.property = bluetoothGattCharacteristic.getProperties();
        this.permissions = bluetoothGattCharacteristic.getPermissions();
    }

    protected BleGattCharacter(Parcel parcel) {
        this.uuid = (UUID) parcel.readSerializable();
        this.property = parcel.readInt();
        this.permissions = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public int getPermissions() {
        return this.permissions;
    }

    public int getProperty() {
        return this.property;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setPermissions(int i) {
        this.permissions = i;
    }

    public void setProperty(int i) {
        this.property = i;
    }

    public void setUuid(UUID uuid2) {
        this.uuid = uuid2;
    }

    public String toString() {
        return "BleGattCharacter{uuid=" + this.uuid + ", property=" + this.property + ", permissions=" + this.permissions + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.uuid);
        parcel.writeInt(this.property);
        parcel.writeInt(this.permissions);
    }
}
