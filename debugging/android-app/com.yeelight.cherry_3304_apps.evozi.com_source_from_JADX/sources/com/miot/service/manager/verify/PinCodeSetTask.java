package com.miot.service.manager.verify;

import android.os.RemoteException;
import com.miot.api.ICommonHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class PinCodeSetTask extends MiotTask<String> {
    private String did;
    private ICommonHandler handler;
    private String oldPinCode;
    private String pinCode;

    public PinCodeSetTask(People people, String str, String str2, Device device, ICommonHandler iCommonHandler) {
        super(people);
        this.did = device.getDeviceId();
        this.pinCode = str;
        this.oldPinCode = str2;
        this.handler = iCommonHandler;
    }

    public void deliveryResult(MiotError miotError, String str) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.handler.onSucceed(str);
            } else {
                this.handler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pincode", this.pinCode);
            jSONObject.put("oldpincode", this.oldPinCode);
            jSONObject.put("did", this.did);
            return MiotCloudApi.setPinCode(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public String parseResult(JsonResponse jsonResponse) {
        return jsonResponse.toString();
    }
}