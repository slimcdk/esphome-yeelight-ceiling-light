package com.inuker.bluetooth.library.model;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.p271io.IOUtils;

public class BleGattProfile implements Parcelable {
    public static final Parcelable.Creator<BleGattProfile> CREATOR = new Parcelable.Creator<BleGattProfile>() {
        public BleGattProfile createFromParcel(Parcel parcel) {
            return new BleGattProfile(parcel);
        }

        public BleGattProfile[] newArray(int i) {
            return new BleGattProfile[i];
        }
    };
    private List<BleGattService> services;

    public BleGattProfile(Parcel parcel) {
        parcel.readTypedList(getServices(), BleGattService.CREATOR);
    }

    public BleGattProfile(Map<UUID, Map<UUID, BluetoothGattCharacteristic>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            Map map2 = (Map) next.getValue();
            BleGattService bleGattService = new BleGattService((UUID) next.getKey());
            if (!arrayList.contains(bleGattService)) {
                arrayList.add(bleGattService);
                bleGattService.addCharacters(map2.keySet());
            }
        }
        addServices(arrayList);
    }

    public void addServices(List<BleGattService> list) {
        Collections.sort(list);
        getServices().addAll(list);
    }

    public int describeContents() {
        return 0;
    }

    public BleGattService getService(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        for (BleGattService next : getServices()) {
            if (next.getUUID().equals(uuid)) {
                return next;
            }
        }
        return null;
    }

    public List<BleGattService> getServices() {
        if (this.services == null) {
            this.services = new ArrayList();
        }
        return this.services;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BleGattService append : this.services) {
            sb.append(append);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(getServices());
    }
}
