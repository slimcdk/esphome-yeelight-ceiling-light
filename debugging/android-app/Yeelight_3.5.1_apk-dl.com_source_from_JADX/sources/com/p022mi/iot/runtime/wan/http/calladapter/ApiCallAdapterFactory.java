package com.p022mi.iot.runtime.wan.http.calladapter;

import com.p022mi.iot.runtime.wan.http.ApiResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p173i7.C9136d;
import p173i7.C9173s;

/* renamed from: com.mi.iot.runtime.wan.http.calladapter.ApiCallAdapterFactory */
public class ApiCallAdapterFactory implements C9136d.C9137a {
    private static final String TAG = "ApiCallAdapterFactory";

    public C9136d<?> get(Type type, Annotation[] annotationArr, C9173s sVar) {
        if (Utils.getRawType(type) == ApiResponse.class) {
            return new ApiCallAdapter(Utils.getSingleParameterUpperBound((ParameterizedType) type));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("returnType: ");
        sb.append(type);
        return null;
    }
}
