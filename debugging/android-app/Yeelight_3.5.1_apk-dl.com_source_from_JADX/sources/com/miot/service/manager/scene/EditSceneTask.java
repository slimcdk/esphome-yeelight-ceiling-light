package com.miot.service.manager.scene;

import android.os.RemoteException;
import com.google.gson.C2469e;
import com.miot.api.ICompletionHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class EditSceneTask extends MiotTask<Void> {
    private ICompletionHandler mHandler;
    private SceneBean mScene;

    public EditSceneTask(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mScene = sceneBean;
        this.mHandler = iCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
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
            return MiotCloudApi.editScene(this.mPeople, new JSONObject(new C2469e().mo19234r(this.mScene)));
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}