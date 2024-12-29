package com.miot.common.voice;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceCommand implements Parcelable {
    public static final Parcelable.Creator<VoiceCommand> CREATOR = new Parcelable.Creator<VoiceCommand>() {
        public VoiceCommand createFromParcel(Parcel parcel) {
            return new VoiceCommand(parcel);
        }

        public VoiceCommand[] newArray(int i) {
            return new VoiceCommand[i];
        }
    };
    private String mText;
    private String mUrl;
    private String mVendor;
    private JSONObject mVoice;

    VoiceCommand() {
    }

    protected VoiceCommand(Parcel parcel) {
        this.mText = parcel.readString();
        this.mUrl = parcel.readString();
        this.mVendor = parcel.readString();
        try {
            this.mVoice = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static VoiceCommand createCommand(String str, String str2, String str3, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Objects.requireNonNull(jSONObject, "voice cann't be null");
            VoiceCommand voiceCommand = new VoiceCommand();
            voiceCommand.setText(str);
            voiceCommand.setUrl(str2);
            voiceCommand.setVendor(str3);
            voiceCommand.setVoice(jSONObject);
            return voiceCommand;
        }
        throw new NullPointerException("text or url cann't be null both");
    }

    public int describeContents() {
        return 0;
    }

    public String getText() {
        return this.mText;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getVendor() {
        return this.mVendor;
    }

    public JSONObject getVoice() {
        return this.mVoice;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setVendor(String str) {
        this.mVendor = str;
    }

    public void setVoice(JSONObject jSONObject) {
        this.mVoice = jSONObject;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("voice_txt", this.mText);
        jSONObject.put("voice_url", this.mUrl);
        jSONObject.put("voice_vendor", this.mVendor);
        jSONObject.put("voice_object", this.mVoice);
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mText);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mVendor);
        parcel.writeString(this.mVoice.toString());
    }
}
