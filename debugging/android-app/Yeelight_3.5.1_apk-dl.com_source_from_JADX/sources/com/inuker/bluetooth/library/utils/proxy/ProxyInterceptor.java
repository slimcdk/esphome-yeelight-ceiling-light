package com.inuker.bluetooth.library.utils.proxy;

import java.lang.reflect.Method;

public interface ProxyInterceptor {
    boolean onIntercept(Object obj, Method method, Object[] objArr);
}
