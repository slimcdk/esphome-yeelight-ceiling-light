package com.miot.service.common.workexecutor;

import android.content.Context;

public abstract class Worker {
    protected Context mContext = null;

    public Worker(Context context) {
        this.mContext = context;
    }

    public void destory() {
    }

    public abstract void execute(Job job);

    public Context getContext() {
        return this.mContext;
    }

    public void init() {
    }
}
