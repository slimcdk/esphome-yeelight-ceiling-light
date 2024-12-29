package com.p146mi.iot.runtime.wan.http.calladapter;

import com.p146mi.iot.runtime.wan.http.ApiResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p262i.C11525d;
import p262i.C11562s;

/* renamed from: com.mi.iot.runtime.wan.http.calladapter.ApiCallAdapterFactory */
public class ApiCallAdapterFactory implements C11525d.C11526a {
    private static final String TAG = "ApiCallAdapterFactory";

    public C11525d<?> get(Type type, Annotation[] annotationArr, C11562s sVar) {
        if (Utils.getRawType(type) == ApiResponse.class) {
            return new ApiCallAdapter(Utils.getSingleParameterUpperBound((ParameterizedType) type));
        }
        "returnType: " + type;
        return null;
    }
}
