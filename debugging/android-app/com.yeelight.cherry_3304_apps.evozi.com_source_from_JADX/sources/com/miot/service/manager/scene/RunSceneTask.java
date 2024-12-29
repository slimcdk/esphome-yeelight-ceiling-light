package com.miot.service.manager.scene;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class RunSceneTask extends MiotTask<Void> {
    private ICompletionHandler mHandler;
    private int mSceneId;

    public RunSceneTask(People people, int i, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mSceneId = i;
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("us_id", this.mSceneId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return MiotCloudApi.runScene(this.mPeople, jSONObject);
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
