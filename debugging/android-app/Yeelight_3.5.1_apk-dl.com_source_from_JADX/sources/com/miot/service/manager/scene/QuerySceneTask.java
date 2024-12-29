package com.miot.service.manager.scene;

import android.os.RemoteException;
import com.miot.api.ISceneHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class QuerySceneTask extends MiotTask<SceneBean> {
    private ISceneHandler mHandler;
    private int mSceneId;

    public QuerySceneTask(People people, int i, ISceneHandler iSceneHandler) {
        super(people);
        this.mSceneId = i;
        this.mHandler = iSceneHandler;
    }

    public void deliveryResult(MiotError miotError, SceneBean sceneBean) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                this.mHandler.onSucceed(sceneBean);
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
            return MiotCloudApi.queryScene(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public SceneBean parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            SceneBean create = SceneBean.create(result);
            if (create != null) {
                return create;
            }
            throw new InvalidResponseException("invalid response, parse scene failed");
        }
        throw new InvalidResponseException("result is null");
    }
}
