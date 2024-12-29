package com.p146mi.iot.runtime.wan.http.calladapter;

import com.p146mi.iot.runtime.wan.http.ApiResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import p262i.C11524c;
import p262i.C11525d;

/* renamed from: com.mi.iot.runtime.wan.http.calladapter.ApiCallAdapter */
public class ApiCallAdapter implements C11525d<ApiResponse<?>> {
    private final Type mResponseType;

    public ApiCallAdapter(Type type) {
        this.mResponseType = type;
    }

    public <R> ApiResponse<R> adapt(C11524c<R> cVar) {
        try {
            return new ApiResponse<>(cVar.mo36446J());
        } catch (IOException e) {
            e.printStackTrace();
            return new ApiResponse<>((Throwable) e);
        }
    }

    public Type responseType() {
        return this.mResponseType;
    }
}
