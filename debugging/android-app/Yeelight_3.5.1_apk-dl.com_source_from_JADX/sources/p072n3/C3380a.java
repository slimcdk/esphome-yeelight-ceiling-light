package p072n3;

import com.yeelight.cherry.YeelightApplication;
import java.lang.Thread;

/* renamed from: n3.a */
public final /* synthetic */ class C3380a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ YeelightApplication f5493a;

    public /* synthetic */ C3380a(YeelightApplication yeelightApplication) {
        this.f5493a = yeelightApplication;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f5493a.m7519o(thread, th);
    }
}
