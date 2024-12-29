package com.miot.service.manager;

import android.os.RemoteException;
import com.miot.api.ICommonHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class CallApiTask extends MiotTask<String> {
    private ICommonHandler mHandler;
    private String mParams;
    private String mPath;

    public CallApiTask(People people, String str, String str2, ICommonHandler iCommonHandler) {
        super(people);
        this.mPath = str;
        this.mParams = str2;
        this.mHandler = iCommonHandler;
    }

    public void deliveryResult(MiotError miotError, String str) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed(str);
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        try {
            return MiotCloudApi.callSmarthomeApi(this.mPeople, this.mPath, new JSONObject(this.mParams));
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public String parseResult(JsonResponse jsonResponse) {
        return jsonResponse.toString();
    }
}
