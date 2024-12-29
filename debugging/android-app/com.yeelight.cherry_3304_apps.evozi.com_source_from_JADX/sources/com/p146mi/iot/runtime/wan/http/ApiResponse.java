package com.p146mi.iot.runtime.wan.http;

import com.p146mi.iot.common.error.IotError;
import java.io.IOException;
import p262i.C11561r;

/* renamed from: com.mi.iot.runtime.wan.http.ApiResponse */
public class ApiResponse<T> {
    public final int mCode;
    public final String mMessage;
    public final T mResult;

    public ApiResponse(C11561r<T> rVar) {
        String str;
        this.mCode = rVar.mo36472b();
        if (rVar.mo36474e()) {
            this.mResult = rVar.mo36471a();
            this.mMessage = null;
            return;
        }
        if (rVar.mo36473d() != null) {
            try {
                str = rVar.mo36473d().mo9391t();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mMessage = (str == null || str.trim().length() == 0) ? rVar.mo36475f() : str;
            this.mResult = null;
        }
        str = null;
        this.mMessage = (str == null || str.trim().length() == 0) ? rVar.mo36475f() : str;
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
