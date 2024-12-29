package com.inuker.bluetooth.library.utils.proxy;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler, ProxyInterceptor, Handler.Callback {
    private Handler handler;
    private ProxyInterceptor interceptor;
    private boolean postUI;
    private Object subject;
    private boolean weakRef;

    public ProxyInvocationHandler(Object obj) {
        this(obj, (ProxyInterceptor) null);
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor) {
        this(obj, proxyInterceptor, false);
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor, boolean z) {
        this(obj, proxyInterceptor, z, false);
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor, boolean z, boolean z2) {
        this.weakRef = z;
        this.interceptor = proxyInterceptor;
        this.postUI = z2;
        this.subject = getObject(obj);
        this.handler = new Handler(Looper.getMainLooper(), this);
    }

    private Object getObject() {
        return this.weakRef ? ((WeakReference) this.subject).get() : this.subject;
    }

    private Object getObject(Object obj) {
        return this.weakRef ? new WeakReference(obj) : obj;
    }

    private Object postSafeInvoke(ProxyBulk proxyBulk) {
        this.handler.obtainMessage(0, proxyBulk).sendToTarget();
        return null;
    }

    private Object safeInvoke(ProxyBulk proxyBulk) {
        try {
            return proxyBulk.safeInvoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean handleMessage(Message message) {
        ProxyBulk.safeInvoke(message.obj);
        return true;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object object = getObject();
        if (onIntercept(object, method, objArr)) {
            return null;
        }
        ProxyBulk proxyBulk = new ProxyBulk(object, method, objArr);
        return this.postUI ? postSafeInvoke(proxyBulk) : safeInvoke(proxyBulk);
    }

    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        ProxyInterceptor proxyInterceptor = this.interceptor;
        if (proxyInterceptor == null) {
            return false;
        }
        try {
            return proxyInterceptor.onIntercept(obj, method, objArr);
        } catch (Exception e) {
            BluetoothLog.m7330e((Throwable) e);
            return false;
        }
    }
}
