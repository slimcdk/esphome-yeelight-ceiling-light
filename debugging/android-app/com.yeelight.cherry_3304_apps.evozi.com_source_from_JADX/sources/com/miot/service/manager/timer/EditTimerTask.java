package com.miot.service.manager.timer;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.timer.Timer;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;
import p011c.p012a.p046d.C0664f;

public class EditTimerTask extends MiotTask<Void> {
    private ICompletionHandler mHandler;
    private Timer mTimer;

    public EditTimerTask(People people, Timer timer, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mTimer = timer;
        this.mHandler = iCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed();
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        try {
            return MiotCloudApi.editTimer(this.mPeople, new JSONObject(new C0664f().mo8712r(TimerCodec.encodeTimer(this.mTimer))));
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
