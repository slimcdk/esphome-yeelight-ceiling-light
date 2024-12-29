package com.p022mi.iot.runtime.wan.http;

import com.p022mi.iot.common.error.IotError;
import java.io.IOException;
import p173i7.C9172r;

/* renamed from: com.mi.iot.runtime.wan.http.ApiResponse */
public class ApiResponse<T> {
    public final int mCode;
    public final String mMessage;
    public final T mResult;

    public ApiResponse(C9172r<T> rVar) {
        String str;
        this.mCode = rVar.mo37248b();
        if (rVar.mo37250e()) {
            this.mResult = rVar.mo37247a();
            this.mMessage = null;
            return;
        }
        if (rVar.mo37249d() != null) {
            try {
                str = rVar.mo37249d().mo28089n();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mMessage = (str == null || str.trim().length() == 0) ? rVar.mo37251f() : str;
            this.mResult = null;
        }
        str = null;
        this.mMessage = (str == null || str.trim().length() == 0) ? rVar.mo37251f() : str;
        this.mResult = null;
    }

    public ApiResponse(Throwable th) {
        this.mCode = 500;
        this.mMessage = th.getMessage();
        this.mResult = null;
    }

    public int getCode() {
        return this.mCode;
    }

    public IotError getError() {
        return new IotError(this.mCode, this.mMessage);
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean isSuccessful() {
        int i = this.mCode;
        return i >= 200 && i < 300;
    }
}
