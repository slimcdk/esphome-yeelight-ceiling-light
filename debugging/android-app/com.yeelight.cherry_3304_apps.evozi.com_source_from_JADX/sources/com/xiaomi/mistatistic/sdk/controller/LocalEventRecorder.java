package com.xiaomi.mistatistic.sdk.controller;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.CustomSettings;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.data.AbstractEvent;
import com.xiaomi.mistatistic.sdk.data.C4171g;
import com.xiaomi.mistatistic.sdk.data.C4172h;
import com.xiaomi.mistatistic.sdk.data.StatEventPojo;
import com.xiaomi.xmsf.push.service.C4955b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public abstract class LocalEventRecorder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile C4955b f7004a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile boolean f7005b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static List<AbstractEvent> f7006c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Object f7007d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static ServiceConnection f7008e = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C4130h.m11173a("LER", "IStatService connected");
                C4955b unused = LocalEventRecorder.f7004a = C4955b.C4956a.m15896a(iBinder);
                boolean unused2 = LocalEventRecorder.f7005b = true;
                if (LocalEventRecorder.f7004a != null) {
                    synchronized (LocalEventRecorder.f7007d) {
                        if (LocalEventRecorder.f7006c != null && !LocalEventRecorder.f7006c.isEmpty()) {
                            for (AbstractEvent valueToJSon : LocalEventRecorder.f7006c) {
                                LocalEventRecorder.f7004a.mo26039a(valueToJSon.valueToJSon().toString());
                                C4130h.m11173a("LER", "insert a reserved event into IStatService");
                            }
                        }
                        C4130h.m11173a("LER", "pending eventList size: " + LocalEventRecorder.f7006c.size());
                        LocalEventRecorder.f7006c.clear();
                    }
                }
            } catch (JSONException e) {
                C4130h.m11176a("", (Throwable) e);
                synchronized (LocalEventRecorder.f7007d) {
                    LocalEventRecorder.f7006c.clear();
                }
            } catch (RemoteException e2) {
                C4130h.m11176a("", (Throwable) e2);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C4130h.m11173a("LER", "IStatService has unexpectedly disconnected");
            C4955b unused = LocalEventRecorder.f7004a = null;
            boolean unused2 = LocalEventRecorder.f7005b = false;
        }
    };

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.LocalEventRecorder$a */
    private static class C4101a implements C4115d.C4118a {

        /* renamed from: a */
        private AbstractEvent f7011a;

        public C4101a(AbstractEvent abstractEvent) {
            this.f7011a = abstractEvent;
        }

        /* renamed from: a */
        public void mo22986a() {
            String str;
            StatEventPojo pojo = this.f7011a.toPojo();
            C4122f fVar = new C4122f();
            AbstractEvent abstractEvent = this.f7011a;
            if ((abstractEvent instanceof C4171g) || (abstractEvent instanceof C4172h)) {
                String str2 = pojo.key;
                String str3 = pojo.category;
                StatEventPojo a = fVar.mo23043a(str3, str2);
                if (a == null || !pojo.type.equals(a.type)) {
                    fVar.mo23046a(pojo);
                    str = "LocalEventRecordingJob insert event with new key";
                } else {
                    fVar.mo23047a(str2, str3, pojo.value);
                    str = "LocalEventRecordingJob update event by key and category";
                }
            } else {
                fVar.mo23046a(pojo);
                str = "LocalEventRecordingJob insert new event";
            }
            C4130h.m11177b(str);
        }
    }

    /* renamed from: a */
    private static void m11033a(Context context) {
        String str;
        if (!f7005b) {
            Intent intent = new Intent();
            intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.xmsf.push.service.StatService");
            context.bindService(intent, f7008e, 1);
            f7005b = true;
            str = "bind StatSystemService success";
        } else {
            str = "StatSystemService is already binded";
        }
        C4130h.m11173a("LER", str);
    }

    /* renamed from: a */
    private static boolean m11036a(String str) {
        return "mistat_basic".equals(str) || "mistat_session".equals(str);
    }

    /* renamed from: b */
    private static void m11039b(final Context context) {
        C4115d.m11118a().mo23038a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                String str;
                try {
                    if (LocalEventRecorder.f7005b) {
                        context.unbindService(LocalEventRecorder.f7008e);
                        boolean unused = LocalEventRecorder.f7005b = false;
                        C4955b unused2 = LocalEventRecorder.f7004a = null;
                        str = "unbind StatSystemService success";
                    } else {
                        str = "StatSystemService is already disconnected";
                    }
                    C4130h.m11173a("LER", str);
                } catch (Exception e) {
                    C4130h.m11176a("", (Throwable) e);
                }
            }
        }, 10000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11040b(AbstractEvent abstractEvent) {
        try {
            Context a = C4113c.m11105a();
            m11033a(a);
            if (f7004a != null) {
                f7004a.mo26039a(abstractEvent.valueToJSon().toString());
                C4130h.m11178b("LER", "sysservice insert a event");
            } else {
                C4130h.m11173a("LER", "StatSystemService is null, insert event into eventList");
                synchronized (f7007d) {
                    f7006c.add(abstractEvent);
                }
            }
            m11039b(a);
        } catch (Throwable th) {
            C4130h.m11174a("LER", "insertEventUseSystemService exception: ", th);
        }
    }

    public static void insertEvent(final AbstractEvent abstractEvent) {
        Context a = C4113c.m11105a();
        if (a == null) {
            C4130h.m11173a("LER", "mistats is not initialized properly.");
        } else if (BuildSetting.isCTABuild()) {
            C4130h.m11173a("LER", "disable local event upload for CTA build");
        } else if (CustomSettings.isUseSystemStatService()) {
            C4130h.m11178b("LER", "insert event use systemstatsvc");
            C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
                /* renamed from: a */
                public void mo22986a() {
                    LocalEventRecorder.m11040b(abstractEvent);
                }
            });
        } else if (!BuildSetting.isDisabled(a) || m11036a(abstractEvent.getCategory())) {
            C4115d.m11118a().mo23037a((C4115d.C4118a) new C4101a(abstractEvent));
            C4154p.m11271a().mo23099c();
        } else {
            C4130h.m11173a("LER", "disabled local event upload, event category:" + abstractEvent.getCategory());
        }
    }
}
