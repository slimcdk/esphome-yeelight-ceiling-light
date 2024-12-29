package com.p022mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;
import com.p022mi.iot.common.urn.UrnType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.common.instance.Device */
public class Device implements Parcelable {
    public static final Parcelable.Creator<Device> CREATOR = new Parcelable.Creator<Device>() {
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        public Device[] newArray(int i) {
            return new Device[i];
        }
    };
    private String mDescription;
    private String mDeviceId;
    private UrnType mDeviceType;
    private List<DiscoveryType> mDiscoveryTypes = new ArrayList();
    private boolean mIsOnline;
    private boolean mIsShared;
    private String mMac;
    private String mName;
    private String mParentDeviceId;
    private String mRealID = "";
    private String mRoomId;
    private Map<Integer, Service> mServices = new HashMap();

    public Device() {
    }

    protected Device(Parcel parcel) {
        this.mDeviceId = parcel.readString();
        this.mRealID = parcel.readString();
        boolean z = true;
        this.mIsOnline = parcel.readByte() != 0;
        this.mIsShared = parcel.readByte() == 0 ? false : z;
        this.mParentDeviceId = parcel.readString();
        this.mName = parcel.readString();
        this.mDescription = parcel.readString();
        this.mRoomId = parcel.readString();
        this.mDeviceType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mDiscoveryTypes = parcel.createTypedArrayList(DiscoveryType.CREATOR);
        int readInt = parcel.readInt();
        this.mServices = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.mServices.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (Service) parcel.readParcelable(Service.class.getClassLoader()));
        }
    }

    public void addDiscoveryType(DiscoveryType discoveryType) {
        if (!this.mDiscoveryTypes.contains(discoveryType)) {
            this.mDiscoveryTypes.add(discoveryType);
        }
    }

    public void addService(Service service) {
        this.mServices.put(Integer.valueOf(service.getInstanceID()), service);
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
        String str = this.mDeviceId;
        String str2 = ((Device) obj).mDeviceId;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public UrnType getDeviceType() {
        return this.mDeviceType;
    }

    public List<DiscoveryType> getDiscoveryTypes() {
        return this.mDiscoveryTypes;
    }

    public String getMac() {
        return this.mMac;
    }

    public String getName() {
        return this.mName;
    }

    public String getParentDeviceId() {
        return this.mParentDeviceId;
    }

    public String getRealID() {
        return this.mRealID;
    }

    public String getRoomId() {
        return this.mRoomId;
    }

    public Service getService(int i) {
        return this.mServices.get(Integer.valueOf(i));
    }

    public List<Service> getServices() {
        return new ArrayList(this.mServices.values());
    }

    public int hashCode() {
        String str = this.mDeviceId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isOnline() {
        return this.mIsOnline;
    }

    public boolean isShared() {
        return this.mIsShared;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDeviceType(UrnType urnType) {
        this.mDeviceType = urnType;
    }

    public void setIsShared(boolean z) {
        this.mIsShared = z;
    }

    public void setMac(String str) {
        this.mMac = this.mMac;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setOnline(boolean z) {
        this.mIsOnline = z;
    }

    public void setParentDeviceId(String str) {
        this.mParentDeviceId = str;
    }

    public void setRealID(String str) {
        this.mRealID = str;
    }

    public void setRoomId(String str) {
        this.mRoomId = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mRealID);
        parcel.writeByte(this.mIsOnline ? (byte) 1 : 0);
        parcel.writeByte(this.mIsShared ? (byte) 1 : 0);
        parcel.writeString(this.mParentDeviceId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mRoomId);
        parcel.writeParcelable(this.mDeviceType, i);
        parcel.writeTypedList(this.mDiscoveryTypes);
        parcel.writeInt(this.mServices.size());
        for (Map.Entry next : this.mServices.entrySet()) {
            parcel.writeValue(next.getKey());
            parcel.writeParcelable((Parcelable) next.getValue(), i);
        }
    }
}
