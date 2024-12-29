package com.miot.service.manager.scene;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.ReturnCode;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import org.json.JSONObject;

@Deprecated
public class EnableSceneTask implements Runnable {
    private boolean mEnable;
    private ICompletionHandler mHandler;
    private People mPeople;
    private int mSceneId;

    public EnableSceneTask(People people, int i, boolean z, ICompletionHandler iCompletionHandler) {
        this.mPeople = people;
        this.mSceneId = i;
        this.mEnable = z;
        this.mHandler = iCompletionHandler;
    }

    public void run() {
        try {
            if (this.mPeople == null) {
                this.mHandler.onFailed(ReturnCode.E_ACCOUNT_NOT_LOGIN, "account not login");
                return;
            }
            HttpResponse queryScene = MiotCloudApi.queryScene(this.mPeople, this.mSceneId);
            if (queryScene.getCode() != 0) {
                this.mHandler.onFailed(queryScene.getCode(), queryScene.getMessage());
                return;
            }
            JsonResponse jsonResponse = new JsonResponse(queryScene.getResult());
            if (jsonResponse.getCode() != 0) {
                this.mHandler.onFailed(jsonResponse.getCode(), jsonResponse.getMessage());
                return;
            }
            JSONObject result = jsonResponse.getResult();
            if (result == null) {
                this.mHandler.onFailed(ReturnCode.E_INVALID_DATA, "invalid data: result is null");
                return;
            }
            SceneBean create = SceneBean.create(result);
            if (create == null) {
                ICompletionHandler iCompletionHandler = this.mHandler;
                iCompletionHandler.onFailed(ReturnCode.E_INVALID_DATA, "invalid data: " + result.toString());
                return;
            }
            create.setEnable(this.mEnable);
            HttpResponse editScene = MiotCloudApi.editScene(this.mPeople, create);
            if (editScene.getCode() != 0) {
                this.mHandler.onFailed(editScene.getCode(), editScene.getMessage());
                return;
            }
            JsonResponse jsonResponse2 = new JsonResponse(queryScene.getResult());
            if (jsonResponse2.getCode() != 0) {
                this.mHandler.onFailed(jsonResponse2.getCode(), jsonResponse2.getMessage());
            } else {
                this.mHandler.onSucceed();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
