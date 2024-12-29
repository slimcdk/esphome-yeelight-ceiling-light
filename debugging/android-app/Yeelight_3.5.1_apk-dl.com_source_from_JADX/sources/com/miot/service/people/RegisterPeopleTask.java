package com.miot.service.people;

import android.content.Context;
import com.miot.common.exception.MiotException;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.common.utils.SystemInfo;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisterPeopleTask extends MiotTask<Void> {
    private Context mContext;
    private Type mType;

    /* renamed from: com.miot.service.people.RegisterPeopleTask$1 */
    static /* synthetic */ class C41531 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$service$people$RegisterPeopleTask$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.miot.service.people.RegisterPeopleTask$Type[] r0 = com.miot.service.people.RegisterPeopleTask.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$service$people$RegisterPeopleTask$Type = r0
                com.miot.service.people.RegisterPeopleTask$Type r1 = com.miot.service.people.RegisterPeopleTask.Type.register     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$service$people$RegisterPeopleTask$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.service.people.RegisterPeopleTask$Type r1 = com.miot.service.people.RegisterPeopleTask.Type.unRegister     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.people.RegisterPeopleTask.C41531.<clinit>():void");
        }
    }

    public enum Type {
        register,
        unRegister
    }

    public RegisterPeopleTask(Context context, People people, Type type) {
        super(people);
        this.mContext = context;
        this.mType = type;
    }

    private HttpResponse doRegister() {
        String pushId = ServiceManager.getInstance().getPushManager().getPushId();
        if (pushId != null) {
            String deviceId = SystemInfo.getInstance(this.mContext).getDeviceId();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deviceid", deviceId);
                jSONObject.put("pushid", pushId);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return MiotCloudApi.registerDeviceForMipush(this.mPeople, jSONObject);
        }
        throw new MiotException("MiPush not started");
    }

    private HttpResponse doUnregister() {
        if (ServiceManager.getInstance().getPushManager().getPushId() != null) {
            String deviceId = SystemInfo.getInstance(this.mContext).getDeviceId();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deviceid", deviceId);
                return MiotCloudApi.unregisterDeviceForMipush(this.mPeople, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                throw new InvalidRequestException((Throwable) e);
            }
        } else {
            throw new MiotException("MiPush not started");
        }
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
    }

    public HttpResponse executeRequest() {
        int i = C41531.$SwitchMap$com$miot$service$people$RegisterPeopleTask$Type[this.mType.ordinal()];
        if (i == 1) {
            return doRegister();
        }
        if (i != 2) {
            return null;
        }
        return doUnregister();
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
