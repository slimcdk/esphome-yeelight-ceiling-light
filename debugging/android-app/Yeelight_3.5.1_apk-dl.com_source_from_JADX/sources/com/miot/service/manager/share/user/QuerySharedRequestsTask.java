package com.miot.service.manager.share.user;

import android.content.Context;
import android.os.RemoteException;
import com.miot.api.ISharedRequestsHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.share.SharedRequest;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.manager.share.ShareCodec;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QuerySharedRequestsTask extends MiotTask<List<SharedRequest>> {
    private Context mContext;
    private ISharedRequestsHandler mHandler;

    public QuerySharedRequestsTask(People people, Context context, ISharedRequestsHandler iSharedRequestsHandler) {
        super(people);
        this.mContext = context;
        this.mHandler = iSharedRequestsHandler;
    }

    public void deliveryResult(MiotError miotError, List<SharedRequest> list) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
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
            jSONObject.put(AuthorizeActivityBase.KEY_USERID, this.mPeople.getUserId());
            return MiotCloudApi.querySharedRequests(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public List<SharedRequest> parseResult(JsonResponse jsonResponse) {
        JSONArray resultArray = jsonResponse.getResultArray();
        if (resultArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < resultArray.length(); i++) {
                SharedRequest decodeSharedRequest = ShareCodec.decodeSharedRequest(this.mContext, resultArray.optJSONObject(i));
                if (decodeSharedRequest != null) {
                    arrayList.add(decodeSharedRequest);
                }
            }
            return arrayList;
        }
        throw new InvalidResponseException("list is null");
    }
}
