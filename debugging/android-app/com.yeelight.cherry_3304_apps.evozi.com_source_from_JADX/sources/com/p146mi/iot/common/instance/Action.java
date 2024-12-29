package com.p146mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.urn.UrnType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mi.iot.common.instance.Action */
public class Action implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new Parcelable.Creator<Action>() {
        public Action createFromParcel(Parcel parcel) {
            return new Action(parcel);
        }

        public Action[] newArray(int i) {
            return new Action[i];
        }
    };
    private static final String TAG = Action.class.getSimpleName();
    private UrnType mActionType;
    private String mAid;
    private Map<Integer, Property> mArguments = new LinkedHashMap();
    private String mDescription;
    private int mInstanceID;
    private Map<Integer, Property> mResults = new LinkedHashMap();

    public Action() {
    }

    protected Action(Parcel parcel) {
        Class<Integer> cls = Integer.class;
        this.mAid = parcel.readString();
        this.mInstanceID = parcel.readInt();
        this.mActionType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mDescription = parcel.readString();
        int readInt = parcel.readInt();
        this.mArguments = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.mArguments.put((Integer) parcel.readValue(cls.getClassLoader()), (Property) parcel.readParcelable(Property.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        this.mResults = new HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.mResults.put((Integer) parcel.readValue(cls.getClassLoader()), (Property) parcel.readParcelable(Property.class.getClassLoader()));
        }
    }

    public Action(Action action) {
        this.mAid = action.getAid();
        this.mInstanceID = action.getInstanceID();
        this.mActionType = action.getActionType();
        this.mDescription = action.getDescription();
        for (Property next : action.getArguments()) {
            this.mArguments.put(Integer.valueOf(next.getInstanceID()), next);
        }
        for (Property next2 : action.getResults()) {
            this.mResults.put(Integer.valueOf(next2.getInstanceID()), next2);
        }
    }

    public void addArgument(Property property) {
        this.mArguments.put(Integer.valueOf(property.getInstanceID()), property);
    }

    public void addResult(Property property) {
        this.mResults.put(Integer.valueOf(property.getInstanceID()), property);
    }

    public int describeContents() {
        return 0;
    }

    public UrnType getActionType() {
        return this.mActionType;
    }

    public String getAid() {
        return this.mAid;
    }

    public List<Property> getArguments() {
        return new ArrayList(this.mArguments.values());
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getInstanceID() {
        return this.mInstanceID;
    }

    public Property getResult(int i) {
        return this.mResults.get(Integer.valueOf(i));
    }

    public List<Property> getResults() {
        return new ArrayList(this.mResults.values());
    }

    public void setActionType(UrnType urnType) {
        this.mActionType = urnType;
    }

    public void setAid(String str) {
        this.mAid = str;
    }

    public boolean setArgumentValue(int i, Object obj) {
        Property property = this.mArguments.get(Integer.valueOf(i));
        if (property == null) {
            return false;
        }
        return property.setValue(obj);
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setInstanceID(int i) {
        this.mInstanceID = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAid);
        parcel.writeInt(this.mInstanceID);
        parcel.writeParcelable(this.mActionType, i);
        parcel.writeString(this.mDescription);
        parcel.writeInt(this.mArguments.size());
        for (Map.Entry next : this.mArguments.entrySet()) {
            parcel.writeValue(next.getKey());
            parcel.writeParcelable((Parcelable) next.getValue(), i);
        }
        parcel.writeInt(this.mResults.size());
        for (Map.Entry next2 : this.mResults.entrySet()) {
            parcel.writeValue(next2.getKey());
            parcel.writeParcelable((Parcelable) next2.getValue(), i);
        }
    }
}
