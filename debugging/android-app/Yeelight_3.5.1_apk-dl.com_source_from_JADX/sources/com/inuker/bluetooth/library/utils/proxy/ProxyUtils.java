package com.inuker.bluetooth.library.utils.proxy;

import java.lang.reflect.Proxy;

public class ProxyUtils {
    public static <T> T getProxy(Object obj, Class<?> cls, ProxyInterceptor proxyInterceptor) {
        return getProxy(obj, cls, proxyInterceptor, false, false);
    }

    public static <T> T getProxy(Object obj, Class<?> cls, ProxyInterceptor proxyInterceptor, boolean z, boolean z2) {
        return getProxy(obj, (Class<?>[]) new Class[]{cls}, proxyInterceptor, z, z2);
    }

    public static <T> T getProxy(Object obj, Class<?>[] clsArr, ProxyInterceptor proxyInterceptor, boolean z, boolean z2) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, new ProxyInvocationHandler(obj, proxyInterceptor, z, z2));
    }

    public static <T> T getUIProxy(Object obj) {
        return getUIProxy(obj, (Class<?>[]) obj.getClass().getInterfaces(), (ProxyInterceptor) null);
    }

    public static <T> T getUIProxy(Object obj, Class<?> cls) {
        return getUIProxy(obj, (Class<?>[]) new Class[]{cls}, (ProxyInterceptor) null);
    }

    public static <T> T getUIProxy(Object obj, Class<?> cls, ProxyInterceptor proxyInterceptor) {
        return getUIProxy(obj, (Class<?>[]) new Class[]{cls}, proxyInterceptor);
    }

    public static <T> T getUIProxy(Object obj, Class<?>[] clsArr, ProxyInterceptor proxyInterceptor) {
        return getProxy(obj, clsArr, proxyInterceptor, false, true);
    }

    public static <T> T getWeakUIProxy(Object obj, Class<?> cls) {
        return getProxy(obj, cls, (ProxyInterceptor) null, true, true);
    }
}
