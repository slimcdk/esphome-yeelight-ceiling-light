package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.property.Property;

public class Argument implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Argument> CREATOR = new Parcelable.Creator<Argument>() {
        public Argument createFromParcel(Parcel parcel) {
            return new Argument(parcel);
        }

        public Argument[] newArray(int i) {
            return new Argument[i];
        }
    };
    private static final String TAG = "Argument";
    private Direction mDirection;
    private String mName;
    private Property mRelatedProperty;

    public enum Direction {
        undefined,
        in,
        out
    }

    public Argument() {
    }

    protected Argument(Parcel parcel) {
        this.mName = parcel.readString();
        int readInt = parcel.readInt();
        this.mDirection = readInt == -1 ? null : Direction.values()[readInt];
        this.mRelatedProperty = (Property) parcel.readParcelable(Property.class.getClassLoader());
    }

    public Object clone() {
        Argument argument;
        CloneNotSupportedException e;
        try {
            argument = (Argument) super.clone();
            try {
                argument.mRelatedProperty = (Property) this.mRelatedProperty.clone();
            } catch (CloneNotSupportedException e2) {
                e = e2;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            argument = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return argument;
        }
        return argument;
    }

    public int describeContents() {
        return 0;
    }

    public Direction getDirection() {
        return this.mDirection;
    }

    public String getName() {
        return this.mName;
    }

    public Property getRelatedProperty() {
        return this.mRelatedProperty;
    }

    public Object getValue() {
        return this.mRelatedProperty.getValue();
    }

    public void setDirection(Direction direction) {
        this.mDirection = direction;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setRelatedProperty(Property property) {
        this.mRelatedProperty = property;
    }

    public boolean setValue(Object obj) {
        return this.mRelatedProperty.setValue(obj);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        Direction direction = this.mDirection;
        parcel.writeInt(direction == null ? -1 : direction.ordinal());
        parcel.writeParcelable(this.mRelatedProperty, i);
    }
}
