package com.miot.service.manager.timer;

import com.miot.api.ITimerHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.common.timer.Timer;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class QueryTimersTask extends MiotTask<List<Timer>> {
    private String mDeviceId;
    private ITimerHandler mHandler;

    public QueryTimersTask(People people, String str, ITimerHandler iTimerHandler) {
        super(people);
        this.mDeviceId = str;
        this.mHandler = iTimerHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deliveryResult(com.miot.service.common.task.MiotError r2, java.util.List<com.miot.common.timer.Timer> r3) {
        /*
            r1 = this;
            com.miot.service.common.task.MiotError r0 = com.miot.service.common.task.MiotError.f6706OK     // Catch:{ RemoteException -> 0x0028 }
            boolean r0 = r2.equals(r0)     // Catch:{ RemoteException -> 0x0028 }
            if (r0 == 0) goto L_0x001a
            com.miot.api.ITimerHandler r2 = r1.mHandler     // Catch:{ BadParcelableException -> 0x000e }
            r2.onSucceed(r3)     // Catch:{ BadParcelableException -> 0x000e }
            goto L_0x002c
        L_0x000e:
            com.miot.service.log.MyLogger r2 = com.miot.service.log.MyLogger.getInstance()     // Catch:{ RemoteException -> 0x0028 }
            java.lang.String r3 = "QueryTimersTask"
            java.lang.String r0 = "deliveryResult meet BadParcelableException!"
            r2.log(r3, r0)     // Catch:{ RemoteException -> 0x0028 }
            goto L_0x002c
        L_0x001a:
            com.miot.api.ITimerHandler r3 = r1.mHandler     // Catch:{ RemoteException -> 0x0028 }
            int r0 = r2.getCode()     // Catch:{ RemoteException -> 0x0028 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ RemoteException -> 0x0028 }
            r3.onFailed(r0, r2)     // Catch:{ RemoteException -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r2 = move-exception
            r2.printStackTrace()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.timer.QueryTimersTask.deliveryResult(com.miot.service.common.task.MiotError, java.util.List):void");
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.mDeviceId);
            jSONObject.put("st_id", "8");
            return MiotCloudApi.queryTimerList(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public List<Timer> parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = result.keys();
            while (keys.hasNext()) {
                Timer decodeTimer = TimerCodec.decodeTimer(result.optJSONObject(keys.next()));
                if (decodeTimer != null) {
                    arrayList.add(decodeTimer);
                }
            }
            return arrayList;
        }
        throw new InvalidResponseException("result is null");
    }
}
