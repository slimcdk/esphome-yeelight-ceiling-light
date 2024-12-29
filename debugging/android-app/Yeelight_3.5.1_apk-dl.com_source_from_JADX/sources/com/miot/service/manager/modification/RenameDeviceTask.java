package com.miot.service.manager.modification;

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
import org.json.JSONException;
import org.json.JSONObject;

public class RenameDeviceTask extends MiotTask<Void> {
    private Device mDevice;
    private ICompletionHandler mHandler;
    private String mName;

    public RenameDeviceTask(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mDevice = device;
        this.mName = str;
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
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("did", this.mDevice.getDeviceId());
            jSONObject2.put("token", this.mDevice.getDeviceToken());
            jSONObject2.put("model", this.mDevice.getDeviceModel());
            jSONObject2.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
            jSONObject2.put("name", this.mName);
            jSONObject.put("type", "modDevice");
            jSONObject.put("param", jSONObject2);
            return MiotCloudApi.updateDeviceInfo(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        this.mDevice.setName(this.mName);
        return null;
    }
}
