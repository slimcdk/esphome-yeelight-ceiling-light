package com.miot.service.manager.share.owner;

import android.os.RemoteException;
import com.miot.api.Constants;
import com.miot.api.ICompletionHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareDeviceTask extends MiotTask<Void> {
    private Device mDevice;
    private ICompletionHandler mHandler;
    private String mUserId;

    public ShareDeviceTask(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mDevice = device;
        this.mUserId = str;
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.EXTRA_PUSH_COMMAND, "share_request");
            jSONObject.put("did", this.mDevice.getDeviceId());
            jSONObject.put(AuthorizeActivityBase.KEY_USERID, this.mUserId);
            return MiotCloudApi.shareDevice(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
