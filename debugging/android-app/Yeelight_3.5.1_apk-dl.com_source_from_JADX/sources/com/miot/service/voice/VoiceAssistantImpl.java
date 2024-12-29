package com.miot.service.voice;

import android.content.Context;
import com.miot.api.IVoiceAssistant;
import com.miot.api.IVoiceInvokeHandler;
import com.miot.api.IVoiceSessionHandler;
import com.miot.common.people.People;
import com.miot.common.voice.VoiceCommand;
import com.miot.common.voice.VoiceSession;
import java.util.concurrent.ThreadPoolExecutor;

public class VoiceAssistantImpl extends IVoiceAssistant.Stub {
    private Context mContext;
    private ThreadPoolExecutor mExecutor;

    public VoiceAssistantImpl(Context context, ThreadPoolExecutor threadPoolExecutor) {
        this.mContext = context;
        this.mExecutor = threadPoolExecutor;
    }

    public void startSession(People people, IVoiceSessionHandler iVoiceSessionHandler) {
        this.mExecutor.execute(new StartSessionTask(people, 2, "", iVoiceSessionHandler));
    }

    public void startSessionNew(People people, int i, String str, IVoiceSessionHandler iVoiceSessionHandler) {
        this.mExecutor.execute(new StartSessionTask(people, i, str, iVoiceSessionHandler));
    }

    public void voiceInvoke(People people, VoiceSession voiceSession, VoiceCommand voiceCommand, IVoiceInvokeHandler iVoiceInvokeHandler) {
        this.mExecutor.execute(new VoiceInvokeTask(people, voiceSession, voiceCommand, iVoiceInvokeHandler));
    }
}
