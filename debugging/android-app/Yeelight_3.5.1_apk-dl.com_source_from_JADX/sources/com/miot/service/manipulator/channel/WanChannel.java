package com.miot.service.manipulator.channel;

import android.text.TextUtils;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import org.json.JSONObject;

public class WanChannel extends Channel {
    public HttpResponse doInvoke(People people, InvokeInfo invokeInfo, JSONObject jSONObject) {
        String deviceId = invokeInfo.getDeviceId();
        if (!TextUtils.isEmpty(invokeInfo.getParentDeviceId())) {
            deviceId = invokeInfo.getParentDeviceId();
        }
        return MiotCloudApi.invokeAction(people, deviceId, jSONObject);
    }
}
