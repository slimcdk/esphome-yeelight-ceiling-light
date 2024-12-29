package com.miot.service.manager.timer;

import android.os.RemoteException;
import com.google.gson.C2469e;
import com.miot.api.IAddTimerCompletionHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.timer.Timer;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class AddTimerTask extends MiotTask<Long> {
    private IAddTimerCompletionHandler mHandler;
    private Timer mTimer;

    public AddTimerTask(People people, Timer timer, IAddTimerCompletionHandler iAddTimerCompletionHandler) {
        super(people);
        this.mTimer = timer;
        this.mHandler = iAddTimerCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Long l) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                this.mHandler.onSucceed(l.longValue());
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        this.mTimer.setTimerId(0);
        try {
            return MiotCloudApi.addTimer(this.mPeople, new JSONObject(new C2469e().mo19234r(TimerCodec.encodeTimer(this.mTimer))));
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public Long parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            return Long.valueOf(result.optLong("us_id"));
        }
        throw new InvalidResponseException("result is null");
    }
}
