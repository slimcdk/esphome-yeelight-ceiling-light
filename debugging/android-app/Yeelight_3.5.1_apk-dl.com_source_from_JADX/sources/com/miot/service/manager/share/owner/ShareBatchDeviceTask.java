package com.miot.service.manager.share.owner;

import android.os.RemoteException;
import android.text.TextUtils;
import com.miot.api.ICompletionHandler;
import com.miot.common.device.Device;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareBatchDeviceTask extends MiotTask<Void> {
    private List<Device> mDevices = new ArrayList();
    private ICompletionHandler mHandler;
    private List<String> mUserIds = new ArrayList();

    public ShareBatchDeviceTask(People people, List<Device> list, List<String> list2, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mDevices.addAll(list);
        this.mUserIds.addAll(list2);
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
            for (Device next : this.mDevices) {
                if (next != null) {
                    jSONArray.put(next.getDeviceId());
                }
            }
            jSONObject.put("didList", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (String next2 : this.mUserIds) {
                if (!TextUtils.isEmpty(next2)) {
                    jSONArray2.put(next2);
                }
            }
            jSONObject.put("receiver", jSONArray2);
        } catch (JSONException unused) {
        }
        return MiotCloudApi.shareBatchDevice(this.mPeople, jSONObject);
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
