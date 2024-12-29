package com.inuker.bluetooth.library.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.p194io.IOUtils;

public class BleGattService implements Parcelable, Comparable {
    public static final Parcelable.Creator<BleGattService> CREATOR = new Parcelable.Creator<BleGattService>() {
        public BleGattService createFromParcel(Parcel parcel) {
            return new BleGattService(parcel);
        }

        public BleGattService[] newArray(int i) {
            return new BleGattService[i];
        }
    };
    private List<ParcelUuid> characters;
    private UUID uuid;

    protected BleGattService(Parcel parcel) {
        this.uuid = (UUID) parcel.readSerializable();
        parcel.readTypedList(getCharacters(), ParcelUuid.CREATOR);
    }

    public BleGattService(UUID uuid2) {
        this.uuid = uuid2;
        this.characters = new ArrayList();
    }

    public void addCharacters(Set<UUID> set) {
        for (UUID parcelUuid : set) {
            getCharacters().add(new ParcelUuid(parcelUuid));
        }
    }

    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return this.uuid.compareTo(((BleGattService) obj).uuid);
    }

    public boolean contains(UUID uuid2) {
        for (ParcelUuid uuid3 : getCharacters()) {
            if (uuid3.getUuid().equals(uuid2)) {
                return true;
            }
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public List<ParcelUuid> getCharacters() {
        if (this.characters == null) {
            this.characters = new ArrayList();
        }
        return this.characters;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Service: %s\n", new Object[]{this.uuid}));
        List<ParcelUuid> characters2 = getCharacters();
        int size = characters2.size();
        for (int i = 0; i < size; i++) {
            sb.append(String.format(">>> Character: %s", new Object[]{characters2.get(i)}));
            if (i != size - 1) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.uuid);
        parcel.writeTypedList(getCharacters());
    }
}
