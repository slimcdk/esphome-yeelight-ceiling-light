package com.p146mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.urn.UrnType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.common.instance.Service */
public class Service implements Parcelable {
    public static final Parcelable.Creator<Service> CREATOR = new Parcelable.Creator<Service>() {
        public Service createFromParcel(Parcel parcel) {
            return new Service(parcel);
        }

        public Service[] newArray(int i) {
            return new Service[i];
        }
    };
    private static final String TAG = "Service";
    private Map<Integer, Action> mActions = new HashMap();
    private String mDescription;
    private String mDeviceId;
    private int mInstanceID;
    private Map<Integer, Property> mProperties = new HashMap();
    private UrnType mServiceType;

    public Service() {
    }

    protected Service(Parcel parcel) {
        Class<Integer> cls = Integer.class;
        this.mDeviceId = parcel.readString();
        this.mDescription = parcel.readString();
        this.mInstanceID = parcel.readInt();
        this.mServiceType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        int readInt = parcel.readInt();
        this.mProperties = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.mProperties.put((Integer) parcel.readValue(cls.getClassLoader()), (Property) parcel.readParcelable(Property.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        this.mActions = new HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.mActions.put((Integer) parcel.readValue(cls.getClassLoader()), (Action) parcel.readParcelable(Action.class.getClassLoader()));
        }
    }

    public void addAction(Action action) {
        this.mActions.put(Integer.valueOf(action.getInstanceID()), action);
    }

    public void addProperty(Property property) {
        this.mProperties.put(Integer.valueOf(property.getInstanceID()), property);
    }

    public int describeContents() {
        return 0;
    }

    public Action getAction(int i) {
        return this.mActions.get(Integer.valueOf(i));
    }

    public List<Action> getActions() {
        return new ArrayList(this.mActions.values());
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public int getInstanceID() {
        return this.mInstanceID;
    }

    public String getName() {
        return this.mServiceType.getName();
    }

    public List<Property> getProperties() {
        return new ArrayList(this.mProperties.values());
    }

    public Property getProperty(int i) {
        return this.mProperties.get(Integer.valueOf(i));
    }

    public UrnType getServiceType() {
        return this.mServiceType;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setInstanceID(int i) {
        this.mInstanceID = i;
    }

    public void setServiceType(UrnType urnType) {
        this.mServiceType = urnType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mDescription);
        parcel.writeInt(this.mInstanceID);
        parcel.writeParcelable(this.mServiceType, i);
        parcel.writeInt(this.mProperties.size());
        for (Map.Entry next : this.mProperties.entrySet()) {
            parcel.writeValue(next.getKey());
            parcel.writeParcelable((Parcelable) next.getValue(), i);
        }
        parcel.writeInt(this.mActions.size());
        for (Map.Entry next2 : this.mActions.entrySet()) {
            parcel.writeValue(next2.getKey());
            parcel.writeParcelable((Parcelable) next2.getValue(), i);
        }
    }
}
