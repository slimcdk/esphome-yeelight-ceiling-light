package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Argument;
import com.miot.common.device.urn.UrnType;
import com.miot.common.property.Property;
import java.util.ArrayList;
import java.util.List;

public class Action implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Action> CREATOR = new Parcelable.Creator<Action>() {
        public Action createFromParcel(Parcel parcel) {
            return new Action(parcel);
        }

        public Action[] newArray(int i) {
            return new Action[i];
        }
    };
    private static final String TAG = "Action";
    private List<Argument> mArguments = new ArrayList();
    private String mDescription;
    private String mFriendlyName;
    private String mInternalName;
    private String mServiceType;
    private UrnType mType;

    public Action() {
    }

    protected Action(Parcel parcel) {
        this.mFriendlyName = parcel.readString();
        this.mInternalName = parcel.readString();
        this.mServiceType = parcel.readString();
        this.mDescription = parcel.readString();
        this.mArguments = parcel.createTypedArrayList(Argument.CREATOR);
    }

    public void addArgument(Argument argument) {
        this.mArguments.add(argument);
    }

    public Object clone() {
        Action action;
        CloneNotSupportedException e;
        try {
            action = (Action) super.clone();
            try {
                ArrayList arrayList = new ArrayList();
                for (Argument clone : this.mArguments) {
                    arrayList.add((Argument) clone.clone());
                }
                action.mArguments = arrayList;
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return action;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            action = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return action;
        }
        return action;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getArgumentValue(java.lang.String r5) {
        /*
            r4 = this;
            java.util.List<com.miot.common.device.Argument> r0 = r4.mArguments
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r0.next()
            com.miot.common.device.Argument r1 = (com.miot.common.device.Argument) r1
            com.miot.common.property.Property r2 = r1.getRelatedProperty()
            boolean r3 = r2.isValueValid()
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r2.getFriendlyName()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0030
        L_0x0026:
            java.lang.String r2 = r2.getInternalName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0006
        L_0x0030:
            java.lang.Object r5 = r1.getValue()
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.Action.getArgumentValue(java.lang.String):java.lang.Object");
    }

    public List<Argument> getArguments() {
        return this.mArguments;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public List<Property> getInArguments() {
        ArrayList arrayList = new ArrayList();
        for (Argument next : this.mArguments) {
            if (next.getDirection() == Argument.Direction.in) {
                arrayList.add(next.getRelatedProperty());
            }
        }
        return arrayList;
    }

    public String getInternalName() {
        return this.mInternalName;
    }

    public String getName() {
        return this.mFriendlyName;
    }

    public List<Property> getOutArguments() {
        ArrayList arrayList = new ArrayList();
        for (Argument next : this.mArguments) {
            if (next.getDirection() == Argument.Direction.out) {
                arrayList.add(next.getRelatedProperty());
            }
        }
        return arrayList;
    }

    public String getServiceType() {
        return this.mServiceType;
    }

    public UrnType getType() {
        return this.mType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setArgumentValue(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.util.List<com.miot.common.device.Argument> r0 = r4.mArguments
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()
            com.miot.common.device.Argument r1 = (com.miot.common.device.Argument) r1
            com.miot.common.property.Property r2 = r1.getRelatedProperty()
            java.lang.String r3 = r2.getFriendlyName()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x002a
            java.lang.String r2 = r2.getInternalName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0006
        L_0x002a:
            boolean r5 = r1.setValue(r6)
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.Action.setArgumentValue(java.lang.String, java.lang.Object):boolean");
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setInternalName(String str) {
        this.mInternalName = str;
    }

    public void setServiceType(String str) {
        this.mServiceType = str;
    }

    public void setType(UrnType urnType) {
        this.mType = urnType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mFriendlyName);
        parcel.writeString(this.mInternalName);
        parcel.writeString(this.mServiceType);
        parcel.writeString(this.mDescription);
        parcel.writeTypedList(this.mArguments);
    }
}
