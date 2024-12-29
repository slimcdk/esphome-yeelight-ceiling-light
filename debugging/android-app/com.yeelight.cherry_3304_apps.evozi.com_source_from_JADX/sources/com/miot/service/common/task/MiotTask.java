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
        if (!process.equals(MiotError.f6706OK)) {
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
            if (!process2.equals(MiotError.f6706OK)) {
                deliveryResult(process2, (Object) null);
                return;
            }
            JsonResponse jsonResponse = new JsonResponse(executeRequest.getResult());
            MiotError process3 = this.mJsonProcessor.process(jsonResponse);
            if (!process3.equals(MiotError.f6706OK)) {
                deliveryResult(process3, (Object) null);
                return;
            }
            try {
                deliveryResult(MiotError.f6706OK, parseResult(jsonResponse));
            } catch (MiotException e) {
                e.printStackTrace();
                MiotError miotError = MiotError.RESPONSE_INVALID;
                miotError.setMessage(e.getMessage());
                deliveryResult(miotError, (Object) null);
            }
        } catch (MiotException e2) {
            e2.printStackTrace();
            MiotError miotError2 = MiotError.REQUEST_INVALID;
            miotError2.setMessage(e2.getMessage());
            deliveryResult(miotError2, (Object) null);
        }
    }
}
