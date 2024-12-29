package com.miot.service.common.task;

import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;

public abstract class MiotTask<T> implements Runnable {
    private HeadProcessor mHeadProcessor;
    private HttpProcessor mHttpProcessor;
    private JsonProcessor mJsonProcessor;
    protected People mPeople;

    public MiotTask(People people) {
        this.mPeople = people;
        initProcessor();
    }

    private void initProcessor() {
        this.mHeadProcessor = new HeadProcessor();
        this.mHttpProcessor = new HttpProcessor();
        this.mJsonProcessor = new JsonProcessor();
    }

    public abstract void deliveryResult(MiotError miotError, T t);

    public abstract HttpResponse executeRequest();

    public abstract T parseResult(JsonResponse jsonResponse);

    public void run() {
        MiotError process = this.mHeadProcessor.process(this.mPeople);
        MiotError miotError = MiotError.f4701OK;
        if (!process.equals(miotError)) {
            deliveryResult(process, (Object) null);
            return;
        }
        try {
            HttpResponse executeRequest = executeRequest();
            if (executeRequest == null) {
                deliveryResult(MiotError.REQUEST_INVALID, (Object) null);
                return;
            }
            MiotError process2 = this.mHttpProcessor.process(executeRequest);
            if (!process2.equals(miotError)) {
                deliveryResult(process2, (Object) null);
                return;
            }
            JsonResponse jsonResponse = new JsonResponse(executeRequest.getResult());
            MiotError process3 = this.mJsonProcessor.process(jsonResponse);
            if (!process3.equals(miotError)) {
                deliveryResult(process3, (Object) null);
                return;
            }
            try {
                deliveryResult(miotError, parseResult(jsonResponse));
            } catch (MiotException e) {
                e.printStackTrace();
                MiotError miotError2 = MiotError.RESPONSE_INVALID;
                miotError2.setMessage(e.getMessage());
                deliveryResult(miotError2, (Object) null);
            }
        } catch (MiotException e2) {
            e2.printStackTrace();
            MiotError miotError3 = MiotError.REQUEST_INVALID;
            miotError3.setMessage(e2.getMessage());
            deliveryResult(miotError3, (Object) null);
        }
    }
}
