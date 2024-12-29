package com.google.firebase.crashlytics.p110c.p112g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.crashlytics.p110c.C2856a;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.C2861d;
import com.google.firebase.crashlytics.p110c.p111f.C2868b;
import com.google.firebase.crashlytics.p110c.p112g.C2944o;
import com.google.firebase.crashlytics.p110c.p113h.C2962b;
import com.google.firebase.crashlytics.p110c.p114i.C2976b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p116k.C2991h;
import com.google.firebase.crashlytics.p110c.p117l.C2994b;
import com.google.firebase.crashlytics.p110c.p117l.C2996c;
import com.google.firebase.crashlytics.p110c.p117l.C2998d;
import com.google.firebase.crashlytics.p110c.p118m.C3000a;
import com.google.firebase.crashlytics.p110c.p118m.C3001b;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3010d;
import com.google.firebase.crashlytics.p110c.p118m.p120d.C3011a;
import com.google.firebase.crashlytics.p110c.p118m.p120d.C3013b;
import com.google.firebase.crashlytics.p110c.p118m.p120d.C3014c;
import com.google.firebase.crashlytics.p110c.p118m.p120d.C3015d;
import com.google.firebase.crashlytics.p110c.p122o.C3024e;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3032e;
import com.google.firebase.crashlytics.p110c.p125p.C3040a;
import com.google.firebase.crashlytics.p110c.p125p.C3042c;
import com.google.firebase.crashlytics.p110c.p125p.C3043d;
import com.google.firebase.crashlytics.p110c.p125p.C3044e;
import com.google.firebase.crashlytics.p110c.p126q.C3046b;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p011c.p012a.p019b.p028b.p038e.C0618g;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.crashlytics.c.g.j */
class C2898j {

    /* renamed from: A */
    static final FilenameFilter f5586A = new C2921p();

    /* renamed from: B */
    static final Comparator<File> f5587B = new C2922q();

    /* renamed from: C */
    static final Comparator<File> f5588C = new C2923r();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final Pattern f5589D = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: E */
    private static final Map<String, String> f5590E = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", TimerCodec.ENABLE);

    /* renamed from: F */
    private static final String[] f5591F = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: z */
    static final FilenameFilter f5592z = new C2916k("BeginSession");

    /* renamed from: a */
    private final AtomicInteger f5593a = new AtomicInteger(0);

    /* renamed from: b */
    private final Context f5594b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2947q f5595c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2941l f5596d;

    /* renamed from: e */
    private final C2883g0 f5597e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2893i f5598f;

    /* renamed from: g */
    private final C2982c f5599g;

    /* renamed from: h */
    private final C2955v f5600h;

    /* renamed from: i */
    private final C2991h f5601i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2872b f5602j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3001b.C3003b f5603k;

    /* renamed from: l */
    private final C2904c0 f5604l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C2962b f5605m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3000a f5606n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C3001b.C3002a f5607o;

    /* renamed from: p */
    private final C2856a f5608p;

    /* renamed from: q */
    private final C3043d f5609q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final String f5610r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C2868b f5611s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C2801a f5612t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C2879e0 f5613u;

    /* renamed from: v */
    private C2944o f5614v;

    /* renamed from: w */
    C0620i<Boolean> f5615w = new C0620i<>();

    /* renamed from: x */
    C0620i<Boolean> f5616x = new C0620i<>();

    /* renamed from: y */
    C0620i<Void> f5617y = new C0620i<>();

    /* renamed from: com.google.firebase.crashlytics.c.g.j$a */
    class C2899a implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f5618a;

        /* renamed from: b */
        final /* synthetic */ String f5619b;

        C2899a(long j, String str) {
            this.f5618a = j;
            this.f5619b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C2898j.this.mo17216g0()) {
                return null;
            }
            C2898j.this.f5605m.mo17317i(this.f5618a, this.f5619b);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$a0 */
    static class C2900a0 implements FilenameFilter {

        /* renamed from: a */
        private final String f5621a;

        public C2900a0(String str) {
            this.f5621a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f5621a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$b */
    class C2901b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Date f5622a;

        /* renamed from: b */
        final /* synthetic */ Throwable f5623b;

        /* renamed from: c */
        final /* synthetic */ Thread f5624c;

        C2901b(Date date, Throwable th, Thread thread) {
            this.f5622a = date;
            this.f5623b = th;
            this.f5624c = thread;
        }

        public void run() {
            if (!C2898j.this.mo17216g0()) {
                long r = C2898j.m8892c0(this.f5622a);
                C2898j.this.f5613u.mo17174l(this.f5623b, this.f5624c, r);
                C2898j.this.m8876M(this.f5624c, this.f5623b, r);
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$b0 */
    static class C2902b0 implements FilenameFilter {
        C2902b0() {
        }

        public boolean accept(File file, String str) {
            return C2994b.f5824d.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$c */
    class C2903c implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C2883g0 f5626a;

        C2903c(C2883g0 g0Var) {
            this.f5626a = g0Var;
        }

        /* renamed from: a */
        public Void call() {
            C2898j.this.f5613u.mo17175m();
            new C2958y(C2898j.this.mo17212X()).mo17305i(C2898j.this.m8885U(), this.f5626a);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$c0 */
    private static final class C2904c0 implements C2962b.C2964b {

        /* renamed from: a */
        private final C2991h f5628a;

        public C2904c0(C2991h hVar) {
            this.f5628a = hVar;
        }

        /* renamed from: a */
        public File mo17232a() {
            File file = new File(this.f5628a.mo17358b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$d */
    class C2905d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f5629a;

        C2905d(Map map) {
            this.f5629a = map;
        }

        /* renamed from: a */
        public Void call() {
            new C2958y(C2898j.this.mo17212X()).mo17304h(C2898j.this.m8885U(), this.f5629a);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$d0 */
    private final class C2906d0 implements C3001b.C3004c {
        private C2906d0() {
        }

        /* synthetic */ C2906d0(C2898j jVar, C2916k kVar) {
            this();
        }

        /* renamed from: a */
        public File[] mo17235a() {
            return C2898j.this.mo17218k0();
        }

        /* renamed from: b */
        public File[] mo17236b() {
            return C2898j.this.mo17217h0();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$e */
    class C2907e implements Callable<Void> {
        C2907e() {
        }

        /* renamed from: a */
        public Void call() {
            C2898j.this.m8874L();
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$e0 */
    private final class C2908e0 implements C3001b.C3002a {
        private C2908e0() {
        }

        /* synthetic */ C2908e0(C2898j jVar, C2916k kVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo17239a() {
            return C2898j.this.mo17216g0();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$f */
    class C2909f implements Runnable {
        C2909f() {
        }

        public void run() {
            C2898j jVar = C2898j.this;
            jVar.mo17206I(jVar.m8903j0(new C2902b0()));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$f0 */
    private static final class C2910f0 implements Runnable {

        /* renamed from: a */
        private final Context f5635a;

        /* renamed from: b */
        private final C3008c f5636b;

        /* renamed from: c */
        private final C3001b f5637c;

        /* renamed from: d */
        private final boolean f5638d;

        public C2910f0(Context context, C3008c cVar, C3001b bVar, boolean z) {
            this.f5635a = context;
            this.f5636b = cVar;
            this.f5637c = bVar;
            this.f5638d = z;
        }

        public void run() {
            if (C2884h.m8806c(this.f5635a)) {
                C2857b.m8687f().mo17130b("Attempting to send crash report at time of crash...");
                this.f5637c.mo17398d(this.f5636b, this.f5638d);
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$g */
    class C2911g implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Set f5639a;

        C2911g(C2898j jVar, Set set) {
            this.f5639a = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.f5639a.contains(str.substring(0, 35));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$g0 */
    static class C2912g0 implements FilenameFilter {

        /* renamed from: a */
        private final String f5640a;

        public C2912g0(String str) {
            this.f5640a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5640a);
            sb.append(".cls");
            return !str.equals(sb.toString()) && str.contains(this.f5640a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$h */
    class C2913h implements C2934z {

        /* renamed from: a */
        final /* synthetic */ String f5641a;

        /* renamed from: b */
        final /* synthetic */ String f5642b;

        /* renamed from: c */
        final /* synthetic */ long f5643c;

        C2913h(C2898j jVar, String str, String str2, long j) {
            this.f5641a = str;
            this.f5642b = str2;
            this.f5643c = j;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9286p(cVar, this.f5641a, this.f5642b, this.f5643c);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$i */
    class C2914i implements C2934z {

        /* renamed from: a */
        final /* synthetic */ String f5644a;

        /* renamed from: b */
        final /* synthetic */ String f5645b;

        /* renamed from: c */
        final /* synthetic */ String f5646c;

        /* renamed from: d */
        final /* synthetic */ String f5647d;

        /* renamed from: e */
        final /* synthetic */ int f5648e;

        C2914i(String str, String str2, String str3, String str4, int i) {
            this.f5644a = str;
            this.f5645b = str2;
            this.f5646c = str3;
            this.f5647d = str4;
            this.f5648e = i;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9288r(cVar, this.f5644a, this.f5645b, this.f5646c, this.f5647d, this.f5648e, C2898j.this.f5610r);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$j */
    class C2915j implements C2934z {

        /* renamed from: a */
        final /* synthetic */ String f5650a;

        /* renamed from: b */
        final /* synthetic */ String f5651b;

        /* renamed from: c */
        final /* synthetic */ boolean f5652c;

        C2915j(C2898j jVar, String str, String str2, boolean z) {
            this.f5650a = str;
            this.f5651b = str2;
            this.f5652c = z;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9268B(cVar, this.f5650a, this.f5651b, this.f5652c);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$k */
    class C2916k extends C2900a0 {
        C2916k(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$l */
    class C2917l implements C2934z {

        /* renamed from: a */
        final /* synthetic */ int f5653a;

        /* renamed from: b */
        final /* synthetic */ String f5654b;

        /* renamed from: c */
        final /* synthetic */ int f5655c;

        /* renamed from: d */
        final /* synthetic */ long f5656d;

        /* renamed from: e */
        final /* synthetic */ long f5657e;

        /* renamed from: f */
        final /* synthetic */ boolean f5658f;

        /* renamed from: g */
        final /* synthetic */ int f5659g;

        /* renamed from: h */
        final /* synthetic */ String f5660h;

        /* renamed from: i */
        final /* synthetic */ String f5661i;

        C2917l(C2898j jVar, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            this.f5653a = i;
            this.f5654b = str;
            this.f5655c = i2;
            this.f5656d = j;
            this.f5657e = j2;
            this.f5658f = z;
            this.f5659g = i3;
            this.f5660h = str2;
            this.f5661i = str3;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9290t(cVar, this.f5653a, this.f5654b, this.f5655c, this.f5656d, this.f5657e, this.f5658f, this.f5659g, this.f5660h, this.f5661i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$m */
    class C2918m implements C2934z {

        /* renamed from: a */
        final /* synthetic */ C2883g0 f5662a;

        C2918m(C2898j jVar, C2883g0 g0Var) {
            this.f5662a = g0Var;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9269C(cVar, this.f5662a.mo17184b(), (String) null, (String) null);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$n */
    class C2919n implements C2934z {

        /* renamed from: a */
        final /* synthetic */ String f5663a;

        C2919n(String str) {
            this.f5663a = str;
        }

        /* renamed from: a */
        public void mo17244a(C2996c cVar) {
            C2998d.m9289s(cVar, this.f5663a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$o */
    class C2920o implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f5664a;

        C2920o(long j) {
            this.f5664a = j;
        }

        /* renamed from: a */
        public Void call() {
            if (C2898j.this.m8882R()) {
                C2857b.m8687f().mo17130b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                return null;
            } else if (C2898j.this.f5612t == null) {
                C2857b.m8687f().mo17130b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
                return null;
            } else {
                C2933y yVar = new C2933y((C2916k) null);
                C2898j.this.f5611s.mo17152a(yVar);
                C2857b.m8687f().mo17130b("Logging Crashlytics event to Firebase");
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", this.f5664a);
                C2898j.this.f5612t.mo17051a("clx", "_ae", bundle);
                yVar.mo17263b();
                C2898j.this.f5611s.mo17152a((C2868b.C2869a) null);
                return null;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$p */
    class C2921p implements FilenameFilter {
        C2921p() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$q */
    class C2922q implements Comparator<File> {
        C2922q() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$r */
    class C2923r implements Comparator<File> {
        C2923r() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$s */
    class C2924s implements C2944o.C2945a {
        C2924s() {
        }

        /* renamed from: a */
        public void mo17252a(@NonNull C3024e eVar, @NonNull Thread thread, @NonNull Throwable th) {
            C2898j.this.mo17215f0(eVar, thread, th);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$t */
    class C2925t implements Callable<C0619h<Void>> {

        /* renamed from: a */
        final /* synthetic */ Date f5667a;

        /* renamed from: b */
        final /* synthetic */ Throwable f5668b;

        /* renamed from: c */
        final /* synthetic */ Thread f5669c;

        /* renamed from: d */
        final /* synthetic */ C3024e f5670d;

        /* renamed from: e */
        final /* synthetic */ C0619h f5671e;

        /* renamed from: com.google.firebase.crashlytics.c.g.j$t$a */
        class C2926a implements C0618g<C3029b, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f5673a;

            C2926a(Executor executor) {
                this.f5673a = executor;
            }

            @NonNull
            /* renamed from: b */
            public C0619h<Void> mo8665a(@Nullable C3029b bVar) {
                if (bVar == null) {
                    C2857b.m8687f().mo17136i("Received null app settings, cannot send reports at crash time.");
                    return C0623k.m538e(null);
                }
                C2898j.this.m8919t0(bVar, true);
                C2898j.this.f5613u.mo17177o(this.f5673a, C2948r.m9040a(bVar));
                return C2925t.this.f5671e;
            }
        }

        C2925t(Date date, Throwable th, Thread thread, C3024e eVar, C0619h hVar) {
            this.f5667a = date;
            this.f5668b = th;
            this.f5669c = thread;
            this.f5670d = eVar;
            this.f5671e = hVar;
        }

        /* renamed from: a */
        public C0619h<Void> call() {
            C2898j.this.f5596d.mo17280a();
            long r = C2898j.m8892c0(this.f5667a);
            C2898j.this.f5613u.mo17173k(this.f5668b, this.f5669c, r);
            C2898j.this.m8863D0(this.f5669c, this.f5668b, r);
            C3032e b = this.f5670d.mo17413b();
            int i = b.mo17420b().f5905a;
            int i2 = b.mo17420b().f5906b;
            C2898j.this.mo17207J(i);
            C2898j.this.m8874L();
            C2898j.this.mo17202A0(i2);
            if (!C2898j.this.f5595c.mo17288b()) {
                return C0623k.m538e(null);
            }
            Executor c = C2898j.this.f5598f.mo17194c();
            return this.f5670d.mo17412a().mo8656q(c, new C2926a(c));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$u */
    class C2927u implements C0618g<Void, Boolean> {
        C2927u(C2898j jVar) {
        }

        @NonNull
        /* renamed from: b */
        public C0619h<Boolean> mo8665a(@Nullable Void voidR) {
            return C0623k.m538e(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$v */
    class C2928v implements C0618g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C0619h f5675a;

        /* renamed from: b */
        final /* synthetic */ float f5676b;

        /* renamed from: com.google.firebase.crashlytics.c.g.j$v$a */
        class C2929a implements Callable<C0619h<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f5678a;

            /* renamed from: com.google.firebase.crashlytics.c.g.j$v$a$a */
            class C2930a implements C0618g<C3029b, Void> {

                /* renamed from: a */
                final /* synthetic */ List f5680a;

                /* renamed from: b */
                final /* synthetic */ boolean f5681b;

                /* renamed from: c */
                final /* synthetic */ Executor f5682c;

                C2930a(List list, boolean z, Executor executor) {
                    this.f5680a = list;
                    this.f5681b = z;
                    this.f5682c = executor;
                }

                @NonNull
                /* renamed from: b */
                public C0619h<Void> mo8665a(@Nullable C3029b bVar) {
                    if (bVar == null) {
                        C2857b.m8687f().mo17136i("Received null app settings, cannot send reports during app startup.");
                    } else {
                        for (C3008c cVar : this.f5680a) {
                            if (cVar.getType() == C3008c.C3009a.JAVA) {
                                C2898j.m8923x(bVar.f5900e, cVar.mo17402c());
                            }
                        }
                        C2898j.this.f5603k.mo17261a(bVar).mo17399e(this.f5680a, this.f5681b, C2928v.this.f5676b);
                        C2898j.this.f5613u.mo17177o(this.f5682c, C2948r.m9040a(bVar));
                        C2898j.this.f5617y.mo8670e(null);
                    }
                    return C0623k.m538e(null);
                }
            }

            C2929a(Boolean bool) {
                this.f5678a = bool;
            }

            /* renamed from: a */
            public C0619h<Void> call() {
                List<C3008c> d = C2898j.this.f5606n.mo17397d();
                if (!this.f5678a.booleanValue()) {
                    C2857b.m8687f().mo17130b("Reports are being deleted.");
                    C2898j.this.f5606n.mo17396c(d);
                    C2898j.this.f5613u.mo17176n();
                    C2898j.this.f5617y.mo8670e(null);
                    return C0623k.m538e(null);
                }
                C2857b.m8687f().mo17130b("Reports are being sent.");
                boolean booleanValue = this.f5678a.booleanValue();
                C2898j.this.f5595c.mo17287a(booleanValue);
                Executor c = C2898j.this.f5598f.mo17194c();
                return C2928v.this.f5675a.mo8656q(c, new C2930a(d, booleanValue, c));
            }
        }

        C2928v(C0619h hVar, float f) {
            this.f5675a = hVar;
            this.f5676b = f;
        }

        @NonNull
        /* renamed from: b */
        public C0619h<Void> mo8665a(@Nullable Boolean bool) {
            return C2898j.this.f5598f.mo17197i(new C2929a(bool));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$w */
    class C2931w implements C3001b.C3003b {
        C2931w() {
        }

        /* renamed from: a */
        public C3001b mo17261a(@NonNull C3029b bVar) {
            String str = bVar.f5898c;
            String str2 = bVar.f5899d;
            return new C3001b(bVar.f5900e, C2898j.this.f5602j.f5532a, C2948r.m9040a(bVar), C2898j.this.f5606n, C2898j.this.m8884T(str, str2), C2898j.this.f5607o);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$x */
    private static class C2932x implements FilenameFilter {
        private C2932x() {
        }

        /* synthetic */ C2932x(C2916k kVar) {
            this();
        }

        public boolean accept(File file, String str) {
            return !C2898j.f5586A.accept(file, str) && C2898j.f5589D.matcher(str).matches();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$y */
    private static class C2933y implements C2868b.C2869a {

        /* renamed from: a */
        private final CountDownLatch f5685a;

        private C2933y() {
            this.f5685a = new CountDownLatch(1);
        }

        /* synthetic */ C2933y(C2916k kVar) {
            this();
        }

        /* renamed from: a */
        public void mo17155a(int i, Bundle bundle) {
            if ("_ae".equals(bundle.getString("name"))) {
                this.f5685a.countDown();
            }
        }

        /* renamed from: b */
        public void mo17263b() {
            String str;
            C2857b bVar;
            C2857b.m8687f().mo17130b("Background thread awaiting app exception callback from FA...");
            if (this.f5685a.await(2000, TimeUnit.MILLISECONDS)) {
                bVar = C2857b.m8687f();
                str = "App exception callback received from FA listener.";
            } else {
                bVar = C2857b.m8687f();
                str = "Timeout exceeded while awaiting app exception callback from FA listener.";
            }
            bVar.mo17130b(str);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.j$z */
    private interface C2934z {
        /* renamed from: a */
        void mo17244a(C2996c cVar);
    }

    C2898j(Context context, C2893i iVar, C2982c cVar, C2955v vVar, C2947q qVar, C2991h hVar, C2941l lVar, C2872b bVar, C3000a aVar, C3001b.C3003b bVar2, C2856a aVar2, C3046b bVar3, C2868b bVar4, C2801a aVar3, C3024e eVar) {
        C2991h hVar2 = hVar;
        C3001b.C3003b bVar5 = bVar2;
        new AtomicBoolean(false);
        this.f5594b = context;
        this.f5598f = iVar;
        this.f5599g = cVar;
        this.f5600h = vVar;
        this.f5595c = qVar;
        this.f5601i = hVar2;
        this.f5596d = lVar;
        this.f5602j = bVar;
        this.f5603k = bVar5 == null ? m8866F() : bVar5;
        this.f5608p = aVar2;
        this.f5610r = bVar3.mo17429a();
        this.f5611s = bVar4;
        this.f5612t = aVar3;
        this.f5597e = new C2883g0();
        this.f5604l = new C2904c0(hVar2);
        this.f5605m = new C2962b(context, this.f5604l);
        this.f5606n = aVar == null ? new C3000a(new C2906d0(this, (C2916k) null)) : aVar;
        this.f5607o = new C2908e0(this, (C2916k) null);
        C3040a aVar4 = new C3040a(1024, new C3042c(10));
        this.f5609q = aVar4;
        this.f5613u = C2879e0.m8763b(context, vVar, hVar, bVar, this.f5605m, this.f5597e, aVar4, eVar);
    }

    /* renamed from: A */
    private void m8858A(C2883g0 g0Var) {
        this.f5598f.mo17196h(new C2903c(g0Var));
    }

    /* renamed from: B0 */
    private C0619h<Boolean> m8859B0() {
        if (this.f5595c.mo17288b()) {
            C2857b.m8687f().mo17130b("Automatic data collection is enabled. Allowing upload.");
            this.f5615w.mo8670e(Boolean.FALSE);
            return C0623k.m538e(Boolean.TRUE);
        }
        C2857b.m8687f().mo17130b("Automatic data collection is disabled.");
        C2857b.m8687f().mo17130b("Notifying that unsent reports are available.");
        this.f5615w.mo8670e(Boolean.TRUE);
        C0619h<TContinuationResult> p = this.f5595c.mo17289c().mo8655p(new C2927u(this));
        C2857b.m8687f().mo17130b("Waiting for send/deleteUnsentReports to be called.");
        return C2887h0.m8838g(p, this.f5616x.mo8666a());
    }

    /* renamed from: C */
    private void m8860C(File[] fileArr, int i, int i2) {
        C2857b.m8687f().mo17130b("Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String b0 = m8890b0(file);
            C2857b f = C2857b.m8687f();
            f.mo17130b("Closing session: " + b0);
            m8877M0(file, b0, i2);
            i++;
        }
    }

    /* renamed from: C0 */
    private void m8861C0(String str, long j) {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C2935k.m8990i()});
        m8875L0(str, "BeginSession", new C2913h(this, str, format, j));
        this.f5608p.mo17125d(str, format, j);
    }

    /* renamed from: D */
    private void m8862D(C2994b bVar) {
        if (bVar != null) {
            try {
                bVar.mo17365a();
            } catch (IOException e) {
                C2857b.m8687f().mo17133e("Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m8863D0(Thread thread, Throwable th, long j) {
        C2994b bVar;
        C2996c cVar = null;
        try {
            String U = m8885U();
            if (U == null) {
                C2857b.m8687f().mo17132d("Tried to write a fatal exception while no session was open.");
                C2884h.m8813j((Flushable) null, "Failed to flush to session begin file.");
                C2884h.m8808e((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            bVar = new C2994b(mo17212X(), U + "SessionCrash");
            try {
                cVar = C2996c.m9239u(bVar);
                m8871J0(cVar, thread, th, j, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            C2884h.m8813j(cVar, "Failed to flush to session begin file.");
            C2884h.m8808e(bVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            try {
                C2857b.m8687f().mo17133e("An error occurred in the fatal exception logger", e);
                C2884h.m8813j(cVar, "Failed to flush to session begin file.");
                C2884h.m8808e(bVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                C2884h.m8813j(cVar, "Failed to flush to session begin file.");
                C2884h.m8808e(bVar, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
            C2884h.m8813j(cVar, "Failed to flush to session begin file.");
            C2884h.m8808e(bVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* renamed from: E */
    private static void m8864E(InputStream inputStream, C2996c cVar, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        cVar.mo17378L(bArr);
    }

    /* renamed from: E0 */
    private void m8865E0(C2996c cVar, String str) {
        for (String str2 : f5591F) {
            File[] j0 = m8903j0(new C2900a0(str + str2 + ".cls"));
            if (j0.length == 0) {
                C2857b.m8687f().mo17130b("Can't find " + str2 + " data for session ID " + str);
            } else {
                C2857b.m8687f().mo17130b("Collecting " + str2 + " data for session ID " + str);
                m8880O0(cVar, j0[0]);
            }
        }
    }

    /* renamed from: F */
    private C3001b.C3003b m8866F() {
        return new C2931w();
    }

    /* renamed from: F0 */
    private static void m8867F0(C2996c cVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, C2884h.f5559c);
        for (File file : fileArr) {
            try {
                C2857b.m8687f().mo17130b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                m8880O0(cVar, file);
            } catch (Exception e) {
                C2857b.m8687f().mo17133e("Error writting non-fatal to session.", e);
            }
        }
    }

    /* renamed from: G */
    private void m8868G(String str) {
        for (File delete : m8907m0(str)) {
            delete.delete();
        }
    }

    /* renamed from: H0 */
    private void m8869H0(String str) {
        String d = this.f5600h.mo17295d();
        C2872b bVar = this.f5602j;
        String str2 = bVar.f5536e;
        String str3 = bVar.f5537f;
        String str4 = d;
        String str5 = str2;
        String str6 = str3;
        String a = this.f5600h.mo17294a();
        int b = C2949s.m9042a(this.f5602j.f5534c).mo17291b();
        m8875L0(str, "SessionApp", new C2914i(str4, str5, str6, a, b));
        this.f5608p.mo17127f(str, str4, str5, str6, a, b, this.f5610r);
    }

    /* renamed from: I0 */
    private void m8870I0(String str) {
        Context S = m8883S();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m = C2884h.m8816m();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = C2884h.m8825v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean C = C2884h.m8796C(S);
        int n = C2884h.m8817n(S);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        m8875L0(str, "SessionDevice", new C2917l(this, m, str2, availableProcessors, v, blockCount, C, n, str3, str4));
        this.f5608p.mo17124c(str, m, str2, availableProcessors, v, blockCount, C, n, str3, str4);
    }

    /* renamed from: J0 */
    private void m8871J0(C2996c cVar, Thread thread, Throwable th, long j, String str, boolean z) {
        Thread[] threadArr;
        TreeMap treeMap;
        Map map;
        C3044e eVar = new C3044e(th, this.f5609q);
        Context S = m8883S();
        C2878e a = C2878e.m8757a(S);
        Float b = a.mo17167b();
        int c = a.mo17168c();
        boolean q = C2884h.m8820q(S);
        int i = S.getResources().getConfiguration().orientation;
        long v = C2884h.m8825v() - C2884h.m8804a(S);
        long b2 = C2884h.m8805b(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo k = C2884h.m8814k(S.getPackageName(), S);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = eVar.f5929c;
        String str2 = this.f5602j.f5533b;
        String d = this.f5600h.mo17295d();
        int i2 = 0;
        if (z) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry next : allStackTraces.entrySet()) {
                threadArr2[i2] = (Thread) next.getKey();
                linkedList.add(this.f5609q.mo17428a((StackTraceElement[]) next.getValue()));
                i2++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!C2884h.m8815l(S, "com.crashlytics.CollectCustomKeys", true)) {
            map = new TreeMap();
        } else {
            map = this.f5597e.mo17183a();
            if (map != null && map.size() > 1) {
                treeMap = new TreeMap(map);
                C2998d.m9291u(cVar, j, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.f5605m.mo17313c(), k, i, d, str2, b, c, q, v, b2);
                this.f5605m.mo17311a();
            }
        }
        treeMap = map;
        C2998d.m9291u(cVar, j, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.f5605m.mo17313c(), k, i, d, str2, b, c, q, v, b2);
        this.f5605m.mo17311a();
    }

    /* renamed from: K */
    private void m8872K(int i, boolean z) {
        int i2 = !z;
        m8926y0(i2 + 8);
        File[] n0 = m8909n0();
        if (n0.length <= i2) {
            C2857b.m8687f().mo17130b("No open sessions to be closed.");
            return;
        }
        String b0 = m8890b0(n0[i2]);
        m8878N0(b0);
        if (z) {
            this.f5613u.mo17172h();
        } else if (this.f5608p.mo17126e(b0)) {
            m8881P(b0);
            if (!this.f5608p.mo17122a(b0)) {
                C2857b.m8687f().mo17130b("Could not finalize native session: " + b0);
            }
        }
        m8860C(n0, i2, i);
        this.f5613u.mo17170d(m8886V());
    }

    /* renamed from: K0 */
    private void m8873K0(String str) {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean E = C2884h.m8798E(m8883S());
        m8875L0(str, "SessionOS", new C2915j(this, str2, str3, E));
        this.f5608p.mo17128g(str, str2, str3, E);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m8874L() {
        long V = m8886V();
        String gVar = new C2882g(this.f5600h).toString();
        C2857b f = C2857b.m8687f();
        f.mo17130b("Opening a new session with ID " + gVar);
        this.f5608p.mo17129h(gVar);
        m8861C0(gVar, V);
        m8869H0(gVar);
        m8873K0(gVar);
        m8870I0(gVar);
        this.f5605m.mo17315g(gVar);
        this.f5613u.mo17171g(m8911o0(gVar), V);
    }

    /* renamed from: L0 */
    private void m8875L0(String str, String str2, C2934z zVar) {
        C2994b bVar;
        C2996c cVar = null;
        try {
            bVar = new C2994b(mo17212X(), str + str2);
            try {
                cVar = C2996c.m9239u(bVar);
                zVar.mo17244a(cVar);
                C2884h.m8813j(cVar, "Failed to flush to session " + str2 + " file.");
                C2884h.m8808e(bVar, "Failed to close session " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                C2884h.m8813j(cVar, "Failed to flush to session " + str2 + " file.");
                C2884h.m8808e(bVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            C2884h.m8813j(cVar, "Failed to flush to session " + str2 + " file.");
            C2884h.m8808e(bVar, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m8876M(@NonNull Thread thread, @NonNull Throwable th, long j) {
        C2994b bVar;
        C2996c u;
        String U = m8885U();
        if (U == null) {
            C2857b.m8687f().mo17130b("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        C2996c cVar = null;
        try {
            C2857b.m8687f().mo17130b("Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            bVar = new C2994b(mo17212X(), U + "SessionEvent" + C2884h.m8799F(this.f5593a.getAndIncrement()));
            try {
                u = C2996c.m9239u(bVar);
            } catch (Exception e) {
                e = e;
                try {
                    C2857b.m8687f().mo17133e("An error occurred in the non-fatal exception logger", e);
                    C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
                    C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
                    m8928z0(U, 64);
                } catch (Throwable th2) {
                    th = th2;
                    C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
                    C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
                    throw th;
                }
            }
            try {
                m8871J0(u, thread, th, j, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, false);
                C2884h.m8813j(u, "Failed to flush to non-fatal file.");
            } catch (Exception e2) {
                e = e2;
                cVar = u;
                C2857b.m8687f().mo17133e("An error occurred in the non-fatal exception logger", e);
                C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
                C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
                m8928z0(U, 64);
            } catch (Throwable th3) {
                th = th3;
                cVar = u;
                C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
                C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            C2857b.m8687f().mo17133e("An error occurred in the non-fatal exception logger", e);
            C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
            C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
            m8928z0(U, 64);
        } catch (Throwable th4) {
            th = th4;
            bVar = null;
            C2884h.m8813j(cVar, "Failed to flush to non-fatal file.");
            C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
            throw th;
        }
        C2884h.m8808e(bVar, "Failed to close non-fatal file output stream.");
        try {
            m8928z0(U, 64);
        } catch (Exception e4) {
            C2857b.m8687f().mo17133e("An error occurred when trimming non-fatal files.", e4);
        }
    }

    /* renamed from: M0 */
    private void m8877M0(File file, String str, int i) {
        C2857b f = C2857b.m8687f();
        f.mo17130b("Collecting session parts for ID " + str);
        File[] j0 = m8903j0(new C2900a0(str + "SessionCrash"));
        boolean z = j0 != null && j0.length > 0;
        C2857b.m8687f().mo17130b(String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        File[] j02 = m8903j0(new C2900a0(str + "SessionEvent"));
        boolean z2 = j02 != null && j02.length > 0;
        C2857b.m8687f().mo17130b(String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            m8924x0(file, str, m8894d0(str, j02, i), z ? j0[0] : null);
        } else {
            C2857b f2 = C2857b.m8687f();
            f2.mo17130b("No events present for session ID " + str);
        }
        C2857b f3 = C2857b.m8687f();
        f3.mo17130b("Removing session part files for ID " + str);
        m8868G(str);
    }

    /* renamed from: N0 */
    private void m8878N0(String str) {
        m8875L0(str, "SessionUser", new C2918m(this, m8896e0(str)));
    }

    /* renamed from: O */
    private File[] m8879O(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: O0 */
    private static void m8880O0(C2996c cVar, File file) {
        if (!file.exists()) {
            C2857b f = C2857b.m8687f();
            f.mo17132d("Tried to include a file that doesn't exist: " + file.getName());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m8864E(fileInputStream2, cVar, (int) file.length());
                C2884h.m8808e(fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C2884h.m8808e(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2884h.m8808e(fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    /* renamed from: P */
    private void m8881P(String str) {
        C2857b f = C2857b.m8687f();
        f.mo17130b("Finalizing native report for session " + str);
        C2861d b = this.f5608p.mo17123b(str);
        File e = b.mo17142e();
        if (e == null || !e.exists()) {
            C2857b f2 = C2857b.m8687f();
            f2.mo17136i("No minidump data found for session " + str);
            return;
        }
        C2962b bVar = new C2962b(this.f5594b, this.f5604l, str);
        File file = new File(mo17213Z(), str);
        if (!file.mkdirs()) {
            C2857b.m8687f().mo17130b("Couldn't create native sessions directory");
            return;
        }
        List<C2960z> Y = m8887Y(b, str, m8883S(), mo17212X(), bVar.mo17313c());
        C2871a0.m8748b(file, Y);
        this.f5613u.mo17169c(m8911o0(str), Y);
        bVar.mo17311a();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public boolean m8882R() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: S */
    private Context m8883S() {
        return this.f5594b;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public C3013b m8884T(String str, String str2) {
        String u = C2884h.m8824u(m8883S(), "com.crashlytics.ApiEndpoint");
        return new C3011a(new C3014c(u, str, this.f5599g, C2935k.m8990i()), new C3015d(u, str2, this.f5599g, C2935k.m8990i()));
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public String m8885U() {
        File[] n0 = m8909n0();
        if (n0.length > 0) {
            return m8890b0(n0[0]);
        }
        return null;
    }

    /* renamed from: V */
    private static long m8886V() {
        return m8892c0(new Date());
    }

    @NonNull
    /* renamed from: Y */
    static List<C2960z> m8887Y(C2861d dVar, String str, Context context, File file, byte[] bArr) {
        byte[] bArr2;
        C2958y yVar = new C2958y(file);
        File b = yVar.mo17302b(str);
        File a = yVar.mo17301a(str);
        try {
            bArr2 = C2976b.m9146a(dVar.mo17141d(), context);
        } catch (Exception unused) {
            bArr2 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2880f("logs_file", "logs", bArr));
        arrayList.add(new C2880f("binary_images_file", "binaryImages", bArr2));
        arrayList.add(new C2954u("crash_meta_file", "metadata", dVar.mo17144g()));
        arrayList.add(new C2954u("session_meta_file", "session", dVar.mo17143f()));
        arrayList.add(new C2954u("app_meta_file", "app", dVar.mo17138a()));
        arrayList.add(new C2954u("device_meta_file", DddTag.DEVICE, dVar.mo17140c()));
        arrayList.add(new C2954u("os_meta_file", "os", dVar.mo17139b()));
        arrayList.add(new C2954u("minidump_file", "minidump", dVar.mo17142e()));
        arrayList.add(new C2954u("user_meta_file", "user", b));
        arrayList.add(new C2954u("keys_file", "keys", a));
        return arrayList;
    }

    /* renamed from: b0 */
    static String m8890b0(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static long m8892c0(Date date) {
        return date.getTime() / 1000;
    }

    /* renamed from: d0 */
    private File[] m8894d0(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C2857b.m8687f().mo17130b(String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m8928z0(str, i);
        return m8903j0(new C2900a0(str + "SessionEvent"));
    }

    /* renamed from: e0 */
    private C2883g0 m8896e0(String str) {
        return mo17216g0() ? this.f5597e : new C2958y(mo17212X()).mo17303e(str);
    }

    /* renamed from: i0 */
    private File[] m8901i0(File file, FilenameFilter filenameFilter) {
        return m8879O(file.listFiles(filenameFilter));
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public File[] m8903j0(FilenameFilter filenameFilter) {
        return m8901i0(mo17212X(), filenameFilter);
    }

    /* renamed from: m0 */
    private File[] m8907m0(String str) {
        return m8903j0(new C2912g0(str));
    }

    /* renamed from: n0 */
    private File[] m8909n0() {
        File[] l0 = mo17219l0();
        Arrays.sort(l0, f5587B);
        return l0;
    }

    @NonNull
    /* renamed from: o0 */
    private static String m8911o0(@NonNull String str) {
        return str.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    /* renamed from: q0 */
    private C0619h<Void> m8914q0(long j) {
        return C0623k.m536c(new ScheduledThreadPoolExecutor(1), new C2920o(j));
    }

    /* renamed from: s0 */
    private void m8917s0(File[] fileArr, Set<String> set) {
        C2857b f;
        StringBuilder sb;
        String str;
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f5589D.matcher(name);
            if (!matcher.matches()) {
                f = C2857b.m8687f();
                sb = new StringBuilder();
                str = "Deleting unknown file: ";
            } else if (!set.contains(matcher.group(1))) {
                f = C2857b.m8687f();
                sb = new StringBuilder();
                str = "Trimming session file: ";
            }
            sb.append(str);
            sb.append(name);
            f.mo17130b(sb.toString());
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m8919t0(@NonNull C3029b bVar, boolean z) {
        Context S = m8883S();
        C3001b a = this.f5603k.mo17261a(bVar);
        for (File file : mo17217h0()) {
            m8923x(bVar.f5900e, file);
            this.f5598f.mo17195g(new C2910f0(S, new C3010d(file, f5590E), a, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static void m8923x(@Nullable String str, @NonNull File file) {
        if (str != null) {
            m8925y(file, new C2919n(str));
        }
    }

    /* renamed from: x0 */
    private void m8924x0(File file, String str, File[] fileArr, File file2) {
        C2994b bVar;
        boolean z = file2 != null;
        File W = z ? mo17211W() : mo17214a0();
        if (!W.exists()) {
            W.mkdirs();
        }
        try {
            bVar = new C2994b(W, str);
            try {
                C2996c u = C2996c.m9239u(bVar);
                C2857b.m8687f().mo17130b("Collecting SessionStart data for session ID " + str);
                m8880O0(u, file);
                u.mo17388a0(4, m8886V());
                u.mo17391x(5, z);
                u.mo17386X(11, 1);
                u.mo17369B(12, 3);
                m8865E0(u, str);
                m8867F0(u, fileArr, str);
                if (z) {
                    m8880O0(u, file2);
                }
                C2884h.m8813j(u, "Error flushing session file stream");
                C2884h.m8808e(bVar, "Failed to close CLS file");
            } catch (Exception e) {
                e = e;
                try {
                    C2857b.m8687f().mo17133e("Failed to write session file for session ID: " + str, e);
                    C2884h.m8813j((Flushable) null, "Error flushing session file stream");
                    m8862D(bVar);
                } catch (Throwable th) {
                    th = th;
                    C2884h.m8813j((Flushable) null, "Error flushing session file stream");
                    C2884h.m8808e(bVar, "Failed to close CLS file");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C2857b.m8687f().mo17133e("Failed to write session file for session ID: " + str, e);
            C2884h.m8813j((Flushable) null, "Error flushing session file stream");
            m8862D(bVar);
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            C2884h.m8813j((Flushable) null, "Error flushing session file stream");
            C2884h.m8808e(bVar, "Failed to close CLS file");
            throw th;
        }
    }

    /* renamed from: y */
    private static void m8925y(@NonNull File file, @NonNull C2934z zVar) {
        FileOutputStream fileOutputStream;
        C2996c cVar = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                cVar = C2996c.m9239u(fileOutputStream);
                zVar.mo17244a(cVar);
                C2884h.m8813j(cVar, "Failed to flush to append to " + file.getPath());
                C2884h.m8808e(fileOutputStream, "Failed to close " + file.getPath());
            } catch (Throwable th) {
                th = th;
                C2884h.m8813j(cVar, "Failed to flush to append to " + file.getPath());
                C2884h.m8808e(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            C2884h.m8813j(cVar, "Failed to flush to append to " + file.getPath());
            C2884h.m8808e(fileOutputStream, "Failed to close " + file.getPath());
            throw th;
        }
    }

    /* renamed from: y0 */
    private void m8926y0(int i) {
        HashSet hashSet = new HashSet();
        File[] n0 = m8909n0();
        int min = Math.min(i, n0.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(m8890b0(n0[i2]));
        }
        this.f5605m.mo17312b(hashSet);
        m8917s0(m8903j0(new C2932x((C2916k) null)), hashSet);
    }

    /* renamed from: z */
    private void m8927z(Map<String, String> map) {
        this.f5598f.mo17196h(new C2905d(map));
    }

    /* renamed from: z0 */
    private void m8928z0(String str, int i) {
        File X = mo17212X();
        C2887h0.m8835d(X, new C2900a0(str + "SessionEvent"), i, f5588C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo17202A0(int i) {
        int f = i - C2887h0.m8837f(mo17213Z(), mo17211W(), i, f5588C);
        C2887h0.m8835d(mo17212X(), f5586A, f - C2887h0.m8834c(mo17214a0(), f, f5588C), f5588C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo17203B() {
        this.f5598f.mo17195g(new C2909f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo17204G0(@NonNull Thread thread, @NonNull Throwable th) {
        this.f5598f.mo17195g(new C2901b(new Date(), th, thread));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo17205H() {
        if (!this.f5596d.mo17281c()) {
            String U = m8885U();
            return U != null && this.f5608p.mo17126e(U);
        }
        C2857b.m8687f().mo17130b("Found previous crash marker.");
        this.f5596d.mo17282d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo17206I(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            C2857b.m8687f().mo17130b("Found invalid session part file: " + file);
            hashSet.add(m8890b0(file));
        }
        if (!hashSet.isEmpty()) {
            for (File file2 : m8903j0(new C2911g(this, hashSet))) {
                C2857b.m8687f().mo17130b("Deleting invalid session file: " + file2);
                file2.delete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo17207J(int i) {
        m8872K(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo17208N(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3024e eVar) {
        mo17220p0();
        C2944o oVar = new C2944o(new C2924s(), eVar, uncaughtExceptionHandler);
        this.f5614v = oVar;
        Thread.setDefaultUncaughtExceptionHandler(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo17209P0(long j, String str) {
        this.f5598f.mo17196h(new C2899a(j, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo17210Q(int i) {
        this.f5598f.mo17193b();
        if (mo17216g0()) {
            C2857b.m8687f().mo17130b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C2857b.m8687f().mo17130b("Finalizing previously open sessions.");
        try {
            m8872K(i, false);
            C2857b.m8687f().mo17130b("Closed all previously open sessions");
            return true;
        } catch (Exception e) {
            C2857b.m8687f().mo17133e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public File mo17211W() {
        return new File(mo17212X(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public File mo17212X() {
        return this.f5601i.mo17358b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public File mo17213Z() {
        return new File(mo17212X(), "native-sessions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public File mo17214a0() {
        return new File(mo17212X(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public synchronized void mo17215f0(@NonNull C3024e eVar, @NonNull Thread thread, @NonNull Throwable th) {
        C2857b f = C2857b.m8687f();
        f.mo17130b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        Date date = new Date();
        try {
            C2887h0.m8832a(this.f5598f.mo17197i(new C2925t(date, th, thread, eVar, m8914q0(date.getTime()))));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public boolean mo17216g0() {
        C2944o oVar = this.f5614v;
        return oVar != null && oVar.mo17285a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public File[] mo17217h0() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, m8901i0(mo17211W(), f5586A));
        Collections.addAll(linkedList, m8901i0(mo17214a0(), f5586A));
        Collections.addAll(linkedList, m8901i0(mo17212X(), f5586A));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public File[] mo17218k0() {
        return m8879O(mo17213Z().listFiles());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public File[] mo17219l0() {
        return m8903j0(f5592z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo17220p0() {
        this.f5598f.mo17196h(new C2907e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo17221r0() {
        boolean register = this.f5611s.register();
        C2857b f = C2857b.m8687f();
        f.mo17130b("Registered Firebase Analytics event listener for breadcrumbs: " + register);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo17222u0(String str, String str2) {
        try {
            this.f5597e.mo17185d(str, str2);
            m8927z(this.f5597e.mo17183a());
        } catch (IllegalArgumentException e) {
            Context context = this.f5594b;
            if (context == null || !C2884h.m8794A(context)) {
                C2857b.m8687f().mo17132d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo17223v0(String str) {
        this.f5597e.mo17186e(str);
        m8858A(this.f5597e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public C0619h<Void> mo17224w0(float f, C0619h<C3029b> hVar) {
        if (!this.f5606n.mo17394a()) {
            C2857b.m8687f().mo17130b("No reports are available.");
            this.f5615w.mo8670e(Boolean.FALSE);
            return C0623k.m538e(null);
        }
        C2857b.m8687f().mo17130b("Unsent reports are available.");
        return m8859B0().mo8655p(new C2928v(hVar, f));
    }
}
