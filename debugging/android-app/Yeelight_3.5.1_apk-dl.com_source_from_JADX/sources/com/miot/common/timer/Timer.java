package com.miot.common.timer;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Action;
import org.json.JSONArray;
import org.json.JSONException;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() {
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    };
    private String mDeviceId;
    private Action mEndAction;
    private boolean mEndEnable;
    private CrontabTime mEndTime = new CrontabTime();
    private String mIdentify;
    private String mName;
    private boolean mPushEnable;
    private JSONArray mSpecEndTask;
    private JSONArray mSpecStartTask;
    private Action mStartAction;
    private boolean mStartEnable;
    private CrontabTime mStartTime = new CrontabTime();
    private boolean mTimerEnable;
    private long mTimerId;

    public Timer() {
    }

    protected Timer(Parcel parcel) {
        this.mTimerId = parcel.readLong();
        this.mDeviceId = parcel.readString();
        this.mIdentify = parcel.readString();
        this.mName = parcel.readString();
        boolean z = true;
        this.mTimerEnable = parcel.readByte() != 0;
        this.mPushEnable = parcel.readByte() != 0;
        this.mStartEnable = parcel.readByte() != 0;
        this.mEndEnable = parcel.readByte() == 0 ? false : z;
        this.mStartAction = (Action) parcel.readParcelable(Action.class.getClassLoader());
        this.mEndAction = (Action) parcel.readParcelable(Action.class.getClassLoader());
        try {
            this.mSpecStartTask = new JSONArray(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            this.mSpecEndTask = new JSONArray(parcel.readString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.mStartTime = (CrontabTime) parcel.readParcelable(CrontabTime.class.getClassLoader());
        this.mEndTime = (CrontabTime) parcel.readParcelable(CrontabTime.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public Action getEndAction() {
        return this.mEndAction;
    }

    public CrontabTime getEndTime() {
        return this.mEndTime;
    }

    public String getIdentify() {
        return this.mIdentify;
    }

    public String getName() {
        return this.mName;
    }

    public JSONArray getSpecEndTask() {
        return this.mSpecEndTask;
    }

    public JSONArray getSpecStartTask() {
        return this.mSpecStartTask;
    }

    public Action getStartAction() {
        return this.mStartAction;
    }

    public CrontabTime getStartTime() {
        return this.mStartTime;
    }

    public long getTimerId() {
        return this.mTimerId;
    }

    public boolean isPushEnabled() {
        return this.mPushEnable;
    }

    public boolean isTimerEnabled() {
        return this.mTimerEnable;
    }

    public boolean isTimerEndEnabled() {
        return this.mEndEnable;
    }

    public boolean isTimerStartEnabled() {
        return this.mStartEnable;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setEndAction(Action action) {
        this.mEndAction = action;
    }

    public void setEndTime(CrontabTime crontabTime) {
        this.mEndTime = crontabTime;
    }

    public void setIdentify(String str) {
        this.mIdentify = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setPushEnabled(boolean z) {
        this.mPushEnable = z;
    }

    public void setSpecEndTask(JSONArray jSONArray) {
        this.mSpecEndTask = jSONArray;
    }

    public void setSpecStartTask(JSONArray jSONArray) {
        this.mSpecStartTask = jSONArray;
    }

    public void setStartAction(Action action) {
        this.mStartAction = action;
    }

    public void setStartTime(CrontabTime crontabTime) {
        this.mStartTime = crontabTime;
    }

    public void setTimerEnabled(boolean z) {
        this.mTimerEnable = z;
    }

    public void setTimerEndEnabled(boolean z) {
        this.mEndEnable = z;
    }

    public void setTimerId(long j) {
        this.mTimerId = j;
    }

    public void setTimerStartEnabled(boolean z) {
        this.mStartEnable = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimerId);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mIdentify);
        parcel.writeString(this.mName);
        parcel.writeByte(this.mTimerEnable ? (byte) 1 : 0);
        parcel.writeByte(this.mPushEnable ? (byte) 1 : 0);
        parcel.writeByte(this.mStartEnable ? (byte) 1 : 0);
        parcel.writeByte(this.mEndEnable ? (byte) 1 : 0);
        parcel.writeParcelable(this.mStartAction, i);
        parcel.writeParcelable(this.mEndAction, i);
        JSONArray jSONArray = this.mSpecStartTask;
        String str = "";
        parcel.writeString(jSONArray == null ? str : jSONArray.toString());
        JSONArray jSONArray2 = this.mSpecEndTask;
        if (jSONArray2 != null) {
            str = jSONArray2.toString();
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.mStartTime, i);
        parcel.writeParcelable(this.mEndTime, i);
    }
}
