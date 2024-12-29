package com.miot.service.voice;

import android.os.RemoteException;
import com.miot.api.IVoiceSessionHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.voice.VoiceSession;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class StartSessionTask extends MiotTask<VoiceSession> {
    private String did;
    private IVoiceSessionHandler mHandler;
    private int source;

    public StartSessionTask(People people, int i, String str, IVoiceSessionHandler iVoiceSessionHandler) {
        super(people);
        this.mHandler = iVoiceSessionHandler;
        this.source = i;
        this.did = str;
    }

    public void deliveryResult(MiotError miotError, VoiceSession voiceSession) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                this.mHandler.onSucceed(voiceSession);
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", this.source);
            jSONObject.put("did", this.did);
            return MiotCloudApi.startSession(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public VoiceSession parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            VoiceSession createSession = VoiceSession.createSession(result);
            if (createSession != null) {
                return createSession;
            }
            throw new InvalidResponseException("createSession failed");
        }
        throw new InvalidResponseException("result is null");
    }
}
