package com.miot.service.common.task;

import android.content.Context;
import android.content.Intent;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpResponse;

public class HttpProcessor implements IProcessor<HttpResponse> {
    private void processError(HttpResponse httpResponse) {
        Context context = ServiceManager.getInstance().getContext();
        if (httpResponse.getCode() == 401) {
            Intent intent = new Intent("com.xiaomi.miot.account.invalid");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        }
    }

    public MiotError process(HttpResponse httpResponse) {
        MiotError miotError = MiotError.f4701OK;
        if (httpResponse.getCode() == 0) {
            return miotError;
        }
        MiotError miotError2 = new MiotError(httpResponse.getCode(), httpResponse.getMessage());
        processError(httpResponse);
        return miotError2;
    }
}
