package com.miot.service.manager.bindkey;

import android.os.RemoteException;
import com.miot.api.ICommonHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class BindKeyCheckTask extends MiotTask<String> {
    private String bindKey = "";
    private ICommonHandler handler = null;

    public BindKeyCheckTask(People people, String str, ICommonHandler iCommonHandler) {
        super(people);
        this.bindKey = str;
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bindkey", this.bindKey);
            return MiotCloudApi.checkBindKey(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public String parseResult(JsonResponse jsonResponse) {
        return jsonResponse.toString();
    }
}
