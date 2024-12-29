package com.miot.common.voice;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceSession implements Parcelable {
    public static final Parcelable.Creator<VoiceSession> CREATOR = new Parcelable.Creator<VoiceSession>() {
        public VoiceSession createFromParcel(Parcel parcel) {
            return new VoiceSession(parcel);
        }

        public VoiceSession[] newArray(int i) {
            return new VoiceSession[i];
        }
    };
    private int mExpire;
    private String mSessionId;
    private String mToken;

    protected VoiceSession(Parcel parcel) {
        this.mSessionId = parcel.readString();
        this.mToken = parcel.readString();
        this.mExpire = parcel.readInt();
    }

    public VoiceSession(String str, String str2, int i) {
        this.mSessionId = str;
        this.mToken = str2;
        this.mExpire = i;
    }

    public static VoiceSession createSession(JSONObject jSONObject) {
        try {
            return new VoiceSession(jSONObject.getString("sessionid"), jSONObject.getString("token"), jSONObject.getInt("expire"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public String getToken() {
        return this.mToken;
    }

    public void setSessionId(String str) {
        this.mSessionId = str;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSessionId);
        parcel.writeString(this.mToken);
        parcel.writeInt(this.mExpire);
    }
}
