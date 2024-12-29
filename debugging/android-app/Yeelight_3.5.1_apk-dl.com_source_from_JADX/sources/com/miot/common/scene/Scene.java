package com.miot.common.scene;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class Scene implements Parcelable {
    public static final Parcelable.Creator<Scene> CREATOR = new Parcelable.Creator<Scene>() {
        public Scene createFromParcel(Parcel parcel) {
            return new Scene(parcel);
        }

        public Scene[] newArray(int i) {
            return new Scene[i];
        }
    };
    private static final String TAG = "Scene";
    private List<Actor> mActors = new ArrayList();
    private List<Condition> mConditions = new ArrayList();
    private boolean mEnable;
    private boolean mEnablePush;
    private int mExpress;
    private Object mExtra;
    private String mName;
    private int mSceneId;

    public Scene() {
    }

    protected Scene(Parcel parcel) {
        this.mSceneId = parcel.readInt();
        this.mName = parcel.readString();
        boolean z = true;
        this.mEnable = parcel.readByte() != 0;
        this.mEnablePush = parcel.readByte() == 0 ? false : z;
        this.mExpress = parcel.readInt();
        this.mExtra = parcel.readValue(Object.class.getClassLoader());
        this.mConditions = parcel.createTypedArrayList(Condition.CREATOR);
        this.mActors = parcel.createTypedArrayList(Actor.CREATOR);
    }

    public void addActor(Actor actor) {
        this.mActors.add(actor);
    }

    public void addCondition(Condition condition) {
        this.mConditions.add(condition);
    }

    public int describeContents() {
        return 0;
    }

    public List<Actor> getActors() {
        return this.mActors;
    }

    public List<Condition> getConditions() {
        return this.mConditions;
    }

    public int getExpress() {
        return this.mExpress;
    }

    public Object getExtra() {
        return this.mExtra;
    }

    public String getName() {
        return this.mName;
    }

    public int getSceneId() {
        return this.mSceneId;
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setActors(List<Actor> list) {
        this.mActors = list;
    }

    public void setConditions(List<Condition> list) {
        this.mConditions = list;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public void setExpress(int i) {
        this.mExpress = i;
    }

    public void setExtra(Object obj) {
        this.mExtra = obj;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSceneId(int i) {
        this.mSceneId = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mSceneId);
        parcel.writeString(this.mName);
        parcel.writeByte(this.mEnable ? (byte) 1 : 0);
        parcel.writeByte(this.mEnablePush ? (byte) 1 : 0);
        parcel.writeInt(this.mExpress);
        parcel.writeValue(this.mExtra);
        parcel.writeTypedList(this.mConditions);
        parcel.writeTypedList(this.mActors);
    }
}
