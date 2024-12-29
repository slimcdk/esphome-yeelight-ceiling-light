package com.miot.common.voice;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceResult implements Parcelable {
    public static final Parcelable.Creator<VoiceResult> CREATOR = new Parcelable.Creator<VoiceResult>() {
        public VoiceResult createFromParcel(Parcel parcel) {
            return new VoiceResult(parcel);
        }

        public VoiceResult[] newArray(int i) {
            return new VoiceResult[i];
        }
    };
    private JSONObject mResult;

    public VoiceResult() {
    }

    protected VoiceResult(Parcel parcel) {
        try {
            this.mResult = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public VoiceResult(JSONObject jSONObject) {
        this.mResult = jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public JSONObject getResult() {
        return this.mResult;
    }

    public void setResult(JSONObject jSONObject) {
        this.mResult = jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResult.toString());
    }
}
