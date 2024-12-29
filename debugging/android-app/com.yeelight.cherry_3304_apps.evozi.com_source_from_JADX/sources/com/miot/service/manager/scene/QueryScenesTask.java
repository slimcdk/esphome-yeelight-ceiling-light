package com.miot.service.manager.scene;

import android.os.RemoteException;
import com.miot.api.IScenesHandler;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class QueryScenesTask extends MiotTask<List<SceneBean>> {
    private IScenesHandler mHandler;

    public QueryScenesTask(People people, IScenesHandler iScenesHandler) {
        super(people);
        this.mHandler = iScenesHandler;
    }

    public void deliveryResult(MiotError miotError, List<SceneBean> list) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed(list);
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
            jSONObject.put("st_id", 15);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return MiotCloudApi.querySceneList(this.mPeople, jSONObject);
    }

    public List<SceneBean> parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = result.keys();
            while (keys.hasNext()) {
                SceneBean create = SceneBean.create(result.optJSONObject(keys.next()));
                if (create != null) {
                    arrayList.add(create);
                }
            }
            return arrayList;
        }
        throw new InvalidResponseException("result is null");
    }
}
