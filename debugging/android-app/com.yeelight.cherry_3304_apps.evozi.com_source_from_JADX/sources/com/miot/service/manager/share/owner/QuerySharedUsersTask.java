package com.miot.service.manager.share.owner;

import android.os.RemoteException;
import com.miot.api.ISharedUsersHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.share.SharedUser;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.manager.share.ShareCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QuerySharedUsersTask extends MiotTask<List<SharedUser>> {
    private Device mDevice;
    private ISharedUsersHandler mHandler;

    public QuerySharedUsersTask(People people, Device device, ISharedUsersHandler iSharedUsersHandler) {
        super(people);
        this.mDevice = device;
        this.mHandler = iSharedUsersHandler;
    }

    public void deliveryResult(MiotError miotError, List<SharedUser> list) {
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
            jSONObject.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
            jSONObject.put("did", this.mDevice.getDeviceId());
            return MiotCloudApi.querySharedUsers(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new InvalidRequestException((Throwable) e);
        }
    }

    public List<SharedUser> parseResult(JsonResponse jsonResponse) {
        JSONArray optJSONArray = jsonResponse.getResult().optJSONArray("list");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                SharedUser decodeShareUser = ShareCodec.decodeShareUser(optJSONArray.optJSONObject(i));
                if (decodeShareUser != null) {
                    arrayList.add(decodeShareUser);
                }
            }
            return arrayList;
        }
        throw new InvalidResponseException("list is null");
    }
}
