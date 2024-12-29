package com.miot.service.manager.share.owner;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CancelShareTask extends MiotTask<Void> {
    private Device mDevice;
    private ICompletionHandler mHandler;
    private String mUserId;

    public CancelShareTask(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
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
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
            jSONObject2.put("did", this.mDevice.getDeviceId());
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(this.mUserId);
            jSONObject2.put(AuthorizeActivityBase.KEY_USERID, jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return MiotCloudApi.cancelShare(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
