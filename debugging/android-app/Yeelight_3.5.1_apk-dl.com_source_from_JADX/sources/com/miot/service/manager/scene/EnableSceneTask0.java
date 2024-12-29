package com.miot.service.manager.scene;

import com.miot.api.ICompletionHandler;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;

public class EnableSceneTask0 extends MiotTask<Void> {
    private boolean mEnable;
    private ICompletionHandler mHandler;
    private int mSceneId;

    public EnableSceneTask0(People people, int i, boolean z, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mSceneId = i;
        this.mEnable = z;
        this.mHandler = iCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
    }

    public HttpResponse executeRequest() {
        return null;
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
