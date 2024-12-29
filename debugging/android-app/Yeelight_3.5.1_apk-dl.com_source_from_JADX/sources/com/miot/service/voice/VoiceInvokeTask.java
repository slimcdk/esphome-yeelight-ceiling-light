package com.miot.service.voice;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.miot.api.IVoiceInvokeHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.common.voice.VoiceCommand;
import com.miot.common.voice.VoiceResult;
import com.miot.common.voice.VoiceSession;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceInvokeTask extends MiotTask<Void> {
    private static final AtomicInteger SERIAL_ID = new AtomicInteger(1000);
    private static final String TAG = "VoiceInvokeTask";
    private VoiceCommand mCommand;
    /* access modifiers changed from: private */
    public IVoiceInvokeHandler mHandler;
    private HandlerThread mHandlerThread;
    /* access modifiers changed from: private */
    public Handler mPollHandler;
    private int mSerialId;
    private VoiceSession mSession;

    public VoiceInvokeTask(People people, VoiceSession voiceSession, VoiceCommand voiceCommand, IVoiceInvokeHandler iVoiceInvokeHandler) {
        super(people);
        this.mSession = voiceSession;
        this.mCommand = voiceCommand;
        this.mHandler = iVoiceInvokeHandler;
        initHandler();
    }

    private JSONObject encodePollRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("serialid", this.mSerialId);
            jSONObject.put("sessionid", this.mSession.getSessionId());
            jSONObject.put("token", this.mSession.getToken());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initHandler() {
        HandlerThread handlerThread = new HandlerThread("poll result");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mPollHandler = new Handler(this.mHandlerThread.getLooper()) {
            public void handleMessage(Message message) {
                IVoiceInvokeHandler access$000;
                int code;
                String str;
                Logger.m7499d(VoiceInvokeTask.TAG, "handleMessage");
                int i = message.what;
                JSONObject jSONObject = (JSONObject) message.obj;
                if (i >= 3) {
                    try {
                        IVoiceInvokeHandler access$0002 = VoiceInvokeTask.this.mHandler;
                        MiotError miotError = MiotError.REQUEST_TIMEOUT;
                        access$0002.onFailed(miotError.getCode(), miotError.getMessage());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                } else {
                    HttpResponse pollResult = MiotCloudApi.pollResult(VoiceInvokeTask.this.mPeople, jSONObject);
                    if (pollResult == null) {
                        IVoiceInvokeHandler access$0003 = VoiceInvokeTask.this.mHandler;
                        MiotError miotError2 = MiotError.REQUEST_INVALID;
                        access$0003.onFailed(miotError2.getCode(), miotError2.getMessage());
                    } else if (pollResult.getCode() != 0) {
                        VoiceInvokeTask.this.mHandler.onFailed(pollResult.getCode(), pollResult.getMessage());
                    } else {
                        JsonResponse jsonResponse = new JsonResponse(pollResult.getResult());
                        if (jsonResponse.getCode() != 0) {
                            VoiceInvokeTask.this.mHandler.onFailed(jsonResponse.getCode(), jsonResponse.getMessage());
                            return;
                        }
                        JSONObject result = jsonResponse.getResult();
                        if (result == null) {
                            VoiceInvokeTask.this.mHandler.onFailed(MiotError.RESPONSE_INVALID.getCode(), "result is null");
                            return;
                        }
                        int optInt = result.optInt(NotificationCompat.CATEGORY_STATUS);
                        if (optInt == 0) {
                            access$000 = VoiceInvokeTask.this.mHandler;
                            code = MiotError.REQUEST_INVALID.getCode();
                            str = "current task don't exist";
                        } else if (optInt == 1) {
                            Message obtain = Message.obtain();
                            obtain.what = i + 1;
                            obtain.obj = jSONObject;
                            VoiceInvokeTask.this.mPollHandler.sendMessageDelayed(obtain, 2000);
                            return;
                        } else if (optInt != 2) {
                            access$000 = VoiceInvokeTask.this.mHandler;
                            code = MiotError.RESPONSE_INVALID.getCode();
                            str = "status must be one of 0, 1, 2";
                        } else {
                            JSONObject optJSONObject = result.optJSONObject("reply");
                            if (optJSONObject == null) {
                                VoiceInvokeTask.this.mHandler.onFailed(MiotError.RESPONSE_INVALID.getCode(), "reply is null");
                                return;
                            }
                            VoiceInvokeTask.this.mHandler.onSucceed(new VoiceResult(optJSONObject));
                            return;
                        }
                        access$000.onFailed(code, str);
                    }
                }
            }
        };
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                JSONObject encodePollRequest = encodePollRequest();
                if (encodePollRequest == null) {
                    this.mHandler.onFailed(MiotError.REQUEST_INVALID.getCode(), "encode poll request failed");
                    return;
                }
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = encodePollRequest;
                Logger.m7499d(TAG, "sendMessage before");
                this.mPollHandler.sendMessage(obtain);
                Logger.m7499d(TAG, "sendMessage after");
                return;
            }
            this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            int andIncrement = SERIAL_ID.getAndIncrement();
            this.mSerialId = andIncrement;
            jSONObject.put("serialid", andIncrement);
            jSONObject.put("sessionid", this.mSession.getSessionId());
            jSONObject.put("token", this.mSession.getToken());
            jSONObject.put("cmds", this.mCommand.toJson());
            return MiotCloudApi.voiceInvoke(this.mPeople, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
