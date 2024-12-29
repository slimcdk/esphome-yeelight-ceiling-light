package com.miot.service.common.task;

import android.content.Context;
import android.content.Intent;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.JsonResponse;

public class JsonProcessor implements IProcessor<JsonResponse> {
    private void processError(JsonResponse jsonResponse) {
        Context context = ServiceManager.getInstance().getContext();
        if (jsonResponse.getCode() == -13) {
            Intent intent = new Intent("com.xiaomi.miot.account.invalid");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        }
    }

    public MiotError process(JsonResponse jsonResponse) {
        MiotError miotError = MiotError.f6706OK;
        if (jsonResponse.getCode() == 0) {
            return miotError;
        }
        MiotError miotError2 = new MiotError(jsonResponse.getCode(), jsonResponse.getMessage());
        processError(jsonResponse);
        return miotError2;
    }
}
