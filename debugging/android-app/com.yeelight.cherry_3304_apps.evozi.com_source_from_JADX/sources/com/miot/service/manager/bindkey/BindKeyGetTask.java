package com.miot.service.manager.bindkey;

import android.os.RemoteException;
import com.miot.api.ICommonHandler;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONObject;

public class BindKeyGetTask extends MiotTask<String> {
    private ICommonHandler handler;

    public BindKeyGetTask(People people, ICommonHandler iCommonHandler) {
        super(people);
        this.handler = iCommonHandler;
    }

    public void deliveryResult(MiotError miotError, String str) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.handler.onSucceed(str);
            } else {
                this.handler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        return MiotCloudApi.getBindKey(this.mPeople, new JSONObject());
    }

    public String parseResult(JsonResponse jsonResponse) {
        return jsonResponse.toString();
    }
}
