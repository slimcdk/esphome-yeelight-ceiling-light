package com.miot.service.manager.share.user;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.common.share.SharedRequest;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class ReplySharedRequestTask extends MiotTask<Void> {
    private ICompletionHandler mHandler;
    private SharedRequest mRequest;

    public enum Share {
        accept,
        reject
    }

    public ReplySharedRequestTask(People people, SharedRequest sharedRequest, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mRequest = sharedRequest;
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
            jSONObject.put("inv_id", this.mRequest.getInvitedId());
            jSONObject.put("msg_id", this.mRequest.getMessageId());
            jSONObject.put("value", this.mRequest.getShareStatus().toString());
            return MiotCloudApi.replyShareRequest(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
