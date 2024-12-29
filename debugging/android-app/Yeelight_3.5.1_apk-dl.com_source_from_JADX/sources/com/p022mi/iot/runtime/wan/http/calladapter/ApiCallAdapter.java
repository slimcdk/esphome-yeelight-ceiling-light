package com.p022mi.iot.runtime.wan.http.calladapter;

import com.p022mi.iot.runtime.wan.http.ApiResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import p173i7.C9135c;
import p173i7.C9136d;

/* renamed from: com.mi.iot.runtime.wan.http.calladapter.ApiCallAdapter */
public class ApiCallAdapter implements C9136d<ApiResponse<?>> {
    private final Type mResponseType;

    public ApiCallAdapter(Type type) {
        this.mResponseType = type;
    }

    public <R> ApiResponse<R> adapt(C9135c<R> cVar) {
        try {
            return new ApiResponse<>(cVar.mo37223J());
        } catch (IOException e) {
            e.printStackTrace();
            return new ApiResponse<>((Throwable) e);
        }
    }

    public Type responseType() {
        return this.mResponseType;
    }
}
