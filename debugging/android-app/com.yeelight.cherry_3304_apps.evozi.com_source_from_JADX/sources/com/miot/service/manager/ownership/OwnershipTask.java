package com.miot.service.manager.ownership;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.common.exception.general.InvalidRequestException;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.connection.wifi.DeviceFinder;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class OwnershipTask extends MiotTask<Void> {
    private static final long LOCAL_TIMEOUT = 10000;
    /* access modifiers changed from: private */
    public Device mDevice;
    private ICompletionHandler mHandler;
    private Type mType;

    /* renamed from: com.miot.service.manager.ownership.OwnershipTask$2 */
    static /* synthetic */ class C37982 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$service$manager$ownership$OwnershipTask$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.miot.service.manager.ownership.OwnershipTask$Type[] r0 = com.miot.service.manager.ownership.OwnershipTask.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$service$manager$ownership$OwnershipTask$Type = r0
                com.miot.service.manager.ownership.OwnershipTask$Type r1 = com.miot.service.manager.ownership.OwnershipTask.Type.take     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$service$manager$ownership$OwnershipTask$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.service.manager.ownership.OwnershipTask$Type r1 = com.miot.service.manager.ownership.OwnershipTask.Type.disclaim     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.ownership.OwnershipTask.C37982.<clinit>():void");
        }
    }

    public enum Type {
        take,
        disclaim
    }

    public OwnershipTask(People people, Type type, Device device, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mType = type;
        this.mDevice = device;
        this.mHandler = iCompletionHandler;
    }

    private HttpResponse doDisclaim() {
        if (this.mDevice.getOwnership() != Device.Ownership.NOONES) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
                jSONObject.put("did", this.mDevice.getDeviceId());
                jSONObject.put("clientId", Long.toString(ServiceManager.getInstance().getAppConfig().getAppId().longValue()));
                return MiotCloudApi.disclaimOwnership(this.mPeople, this.mDevice, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                throw new MiotException((Throwable) e);
            }
        } else {
            throw new InvalidRequestException("not own the device: " + this.mDevice.getDeviceId());
        }
    }

    private HttpResponse doTake() {
        if (this.mDevice.getOwnership() != Device.Ownership.MINE) {
            if (this.mDevice.getDeviceToken() == null) {
                getDeviceToken();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
                jSONObject.put("did", this.mDevice.getDeviceId());
                jSONObject.put("token", this.mDevice.getDeviceToken());
                jSONObject.put("model", this.mDevice.getDeviceModel());
                return MiotCloudApi.takeOwnership(this.mPeople, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                throw new MiotException((Throwable) e);
            }
        } else {
            throw new InvalidRequestException("already own the device: " + this.mDevice.getDeviceId());
        }
    }

    private void getDeviceToken() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            MiioLocalAPI.async_get_token(this.mDevice.getConnectionInfo().getHost(), new MiioLocalRpcResponse() {
                public void onResponse(String str) {
                    JSONObject parse = DeviceFinder.parse(str);
                    if (parse != null) {
                        OwnershipTask.this.mDevice.setDeviceToken(parse.optString("token"));
                    }
                    countDownLatch.countDown();
                }
            }, 3);
            countDownLatch.await(LOCAL_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed();
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        int i = C37982.$SwitchMap$com$miot$service$manager$ownership$OwnershipTask$Type[this.mType.ordinal()];
        if (i == 1) {
            return doTake();
        }
        if (i != 2) {
            return null;
        }
        return doDisclaim();
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
