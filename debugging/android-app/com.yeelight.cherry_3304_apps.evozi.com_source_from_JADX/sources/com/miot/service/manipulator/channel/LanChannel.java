package com.miot.service.manipulator.channel;

import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.miotcloud.HttpResponse;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class LanChannel extends Channel {
    private static final long LOCAL_TIMEOUT = 30000;
    private static final String TAG = "LanChannel";
    /* access modifiers changed from: private */
    public String mResult;

    public HttpResponse doInvoke(People people, InvokeInfo invokeInfo, JSONObject jSONObject) {
        String deviceId = invokeInfo.getDeviceId();
        String token = invokeInfo.getToken();
        String host = invokeInfo.getConnectionInfo().getHost();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            MiioLocalAPI.async_rpc(host, jSONObject.toString(), Long.valueOf(deviceId).longValue(), token, new MiioLocalRpcResponse() {
                public void onResponse(String str) {
                    Logger.m10629d(LanChannel.TAG, "onResponse: " + str);
                    String unused = LanChannel.this.mResult = str;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(LOCAL_TIMEOUT, TimeUnit.MILLISECONDS);
            return new HttpResponse(0, (String) null, new JSONObject(this.mResult));
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }
}
