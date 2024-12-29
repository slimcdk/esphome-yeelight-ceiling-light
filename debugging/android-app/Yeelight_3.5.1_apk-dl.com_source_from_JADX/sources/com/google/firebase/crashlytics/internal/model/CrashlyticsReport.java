package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.C2327b;
import com.google.firebase.crashlytics.internal.model.C2330c;
import com.google.firebase.crashlytics.internal.model.C2333d;
import com.google.firebase.crashlytics.internal.model.C2336e;
import com.google.firebase.crashlytics.internal.model.C2339f;
import com.google.firebase.crashlytics.internal.model.C2342g;
import com.google.firebase.crashlytics.internal.model.C2345h;
import com.google.firebase.crashlytics.internal.model.C2349j;
import com.google.firebase.crashlytics.internal.model.C2352k;
import com.google.firebase.crashlytics.internal.model.C2355l;
import com.google.firebase.crashlytics.internal.model.C2358m;
import com.google.firebase.crashlytics.internal.model.C2361n;
import com.google.firebase.crashlytics.internal.model.C2364o;
import com.google.firebase.crashlytics.internal.model.C2367p;
import com.google.firebase.crashlytics.internal.model.C2370q;
import com.google.firebase.crashlytics.internal.model.C2373r;
import com.google.firebase.crashlytics.internal.model.C2376s;
import com.google.firebase.crashlytics.internal.model.C2379t;
import com.google.firebase.crashlytics.internal.model.C2382u;
import com.google.firebase.crashlytics.internal.model.C2385v;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import p015c1.C0628a;

@AutoValue
@Encodable
public abstract class CrashlyticsReport {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Charset f3659a = Charset.forName("UTF-8");

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a */
    public static abstract class C2261a {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a */
        public static abstract class C2262a {
            @NonNull
            /* renamed from: a */
            public abstract C2261a mo18642a();

            @NonNull
            /* renamed from: b */
            public abstract C2262a mo18643b(@NonNull int i);

            @NonNull
            /* renamed from: c */
            public abstract C2262a mo18644c(@NonNull int i);

            @NonNull
            /* renamed from: d */
            public abstract C2262a mo18645d(@NonNull String str);

            @NonNull
            /* renamed from: e */
            public abstract C2262a mo18646e(@NonNull long j);

            @NonNull
            /* renamed from: f */
            public abstract C2262a mo18647f(@NonNull int i);

            @NonNull
            /* renamed from: g */
            public abstract C2262a mo18648g(@NonNull long j);

            @NonNull
            /* renamed from: h */
            public abstract C2262a mo18649h(@NonNull long j);

            @NonNull
            /* renamed from: i */
            public abstract C2262a mo18650i(@Nullable String str);
        }

        @NonNull
        /* renamed from: a */
        public static C2262a m5806a() {
            return new C2330c.C2332b();
        }

        @NonNull
        /* renamed from: b */
        public abstract int mo18634b();

        @NonNull
        /* renamed from: c */
        public abstract int mo18635c();

        @NonNull
        /* renamed from: d */
        public abstract String mo18636d();

        @NonNull
        /* renamed from: e */
        public abstract long mo18637e();

        @NonNull
        /* renamed from: f */
        public abstract int mo18638f();

        @NonNull
        /* renamed from: g */
        public abstract long mo18639g();

        @NonNull
        /* renamed from: h */
        public abstract long mo18640h();

        @Nullable
        /* renamed from: i */
        public abstract String mo18641i();
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b */
    public static abstract class C2263b {
        @NonNull
        /* renamed from: a */
        public abstract CrashlyticsReport mo18651a();

        @NonNull
        /* renamed from: b */
        public abstract C2263b mo18652b(@NonNull String str);

        @NonNull
        /* renamed from: c */
        public abstract C2263b mo18653c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C2263b mo18654d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C2263b mo18655e(@NonNull String str);

        @NonNull
        /* renamed from: f */
        public abstract C2263b mo18656f(C2266d dVar);

        @NonNull
        /* renamed from: g */
        public abstract C2263b mo18657g(int i);

        @NonNull
        /* renamed from: h */
        public abstract C2263b mo18658h(@NonNull String str);

        @NonNull
        /* renamed from: i */
        public abstract C2263b mo18659i(@NonNull C2270e eVar);
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c */
    public static abstract class C2264c {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$a */
        public static abstract class C2265a {
            @NonNull
            /* renamed from: a */
            public abstract C2264c mo18662a();

            @NonNull
            /* renamed from: b */
            public abstract C2265a mo18663b(@NonNull String str);

            @NonNull
            /* renamed from: c */
            public abstract C2265a mo18664c(@NonNull String str);
        }

        @NonNull
        /* renamed from: a */
        public static C2265a m5833a() {
            return new C2333d.C2335b();
        }

        @NonNull
        /* renamed from: b */
        public abstract String mo18660b();

        @NonNull
        /* renamed from: c */
        public abstract String mo18661c();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d */
    public static abstract class C2266d {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a */
        public static abstract class C2267a {
            /* renamed from: a */
            public abstract C2266d mo18667a();

            /* renamed from: b */
            public abstract C2267a mo18668b(C0628a<C2268b> aVar);

            /* renamed from: c */
            public abstract C2267a mo18669c(String str);
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$b */
        public static abstract class C2268b {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$b$a */
            public static abstract class C2269a {
                /* renamed from: a */
                public abstract C2268b mo18672a();

                /* renamed from: b */
                public abstract C2269a mo18673b(byte[] bArr);

                /* renamed from: c */
                public abstract C2269a mo18674c(String str);
            }

            @NonNull
            /* renamed from: a */
            public static C2269a m5845a() {
                return new C2339f.C2341b();
            }

            @NonNull
            /* renamed from: b */
            public abstract byte[] mo18670b();

            @NonNull
            /* renamed from: c */
            public abstract String mo18671c();
        }

        @NonNull
        /* renamed from: a */
        public static C2267a m5839a() {
            return new C2336e.C2338b();
        }

        @NonNull
        /* renamed from: b */
        public abstract C0628a<C2268b> mo18665b();

        @Nullable
        /* renamed from: c */
        public abstract String mo18666c();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e */
    public static abstract class C2270e {

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a */
        public static abstract class C2271a {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a$a */
            public static abstract class C2272a {
                @NonNull
                /* renamed from: a */
                public abstract C2271a mo18697a();

                @NonNull
                /* renamed from: b */
                public abstract C2272a mo18698b(@Nullable String str);

                @NonNull
                /* renamed from: c */
                public abstract C2272a mo18699c(@Nullable String str);

                @NonNull
                /* renamed from: d */
                public abstract C2272a mo18700d(@NonNull String str);

                @NonNull
                /* renamed from: e */
                public abstract C2272a mo18701e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract C2272a mo18702f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract C2272a mo18703g(@NonNull String str);
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a$b */
            public static abstract class C2273b {
                @NonNull
                /* renamed from: a */
                public abstract String mo18704a();
            }

            @NonNull
            /* renamed from: a */
            public static C2272a m5867a() {
                return new C2345h.C2347b();
            }

            @Nullable
            /* renamed from: b */
            public abstract String mo18690b();

            @Nullable
            /* renamed from: c */
            public abstract String mo18691c();

            @Nullable
            /* renamed from: d */
            public abstract String mo18692d();

            @NonNull
            /* renamed from: e */
            public abstract String mo18693e();

            @Nullable
            /* renamed from: f */
            public abstract String mo18694f();

            @Nullable
            /* renamed from: g */
            public abstract C2273b mo18695g();

            @NonNull
            /* renamed from: h */
            public abstract String mo18696h();
        }

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$b */
        public static abstract class C2274b {
            @NonNull
            /* renamed from: a */
            public abstract C2270e mo18705a();

            @NonNull
            /* renamed from: b */
            public abstract C2274b mo18706b(@NonNull C2271a aVar);

            @NonNull
            /* renamed from: c */
            public abstract C2274b mo18707c(boolean z);

            @NonNull
            /* renamed from: d */
            public abstract C2274b mo18708d(@NonNull C2275c cVar);

            @NonNull
            /* renamed from: e */
            public abstract C2274b mo18709e(@NonNull Long l);

            @NonNull
            /* renamed from: f */
            public abstract C2274b mo18710f(@NonNull C0628a<C2277d> aVar);

            @NonNull
            /* renamed from: g */
            public abstract C2274b mo18711g(@NonNull String str);

            @NonNull
            /* renamed from: h */
            public abstract C2274b mo18712h(int i);

            @NonNull
            /* renamed from: i */
            public abstract C2274b mo18713i(@NonNull String str);

            @NonNull
            /* renamed from: j */
            public C2274b mo18714j(@NonNull byte[] bArr) {
                return mo18713i(new String(bArr, CrashlyticsReport.f3659a));
            }

            @NonNull
            /* renamed from: k */
            public abstract C2274b mo18715k(@NonNull C2297e eVar);

            @NonNull
            /* renamed from: l */
            public abstract C2274b mo18716l(long j);

            @NonNull
            /* renamed from: m */
            public abstract C2274b mo18717m(@NonNull C2299f fVar);
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c */
        public static abstract class C2275c {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c$a */
            public static abstract class C2276a {
                @NonNull
                /* renamed from: a */
                public abstract C2275c mo18727a();

                @NonNull
                /* renamed from: b */
                public abstract C2276a mo18728b(int i);

                @NonNull
                /* renamed from: c */
                public abstract C2276a mo18729c(int i);

                @NonNull
                /* renamed from: d */
                public abstract C2276a mo18730d(long j);

                @NonNull
                /* renamed from: e */
                public abstract C2276a mo18731e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract C2276a mo18732f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract C2276a mo18733g(@NonNull String str);

                @NonNull
                /* renamed from: h */
                public abstract C2276a mo18734h(long j);

                @NonNull
                /* renamed from: i */
                public abstract C2276a mo18735i(boolean z);

                @NonNull
                /* renamed from: j */
                public abstract C2276a mo18736j(int i);
            }

            @NonNull
            /* renamed from: a */
            public static C2276a m5896a() {
                return new C2349j.C2351b();
            }

            @NonNull
            /* renamed from: b */
            public abstract int mo18718b();

            /* renamed from: c */
            public abstract int mo18719c();

            /* renamed from: d */
            public abstract long mo18720d();

            @NonNull
            /* renamed from: e */
            public abstract String mo18721e();

            @NonNull
            /* renamed from: f */
            public abstract String mo18722f();

            @NonNull
            /* renamed from: g */
            public abstract String mo18723g();

            /* renamed from: h */
            public abstract long mo18724h();

            /* renamed from: i */
            public abstract int mo18725i();

            /* renamed from: j */
            public abstract boolean mo18726j();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d */
        public static abstract class C2277d {

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a */
            public static abstract class C2278a {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$a */
                public static abstract class C2279a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C2278a mo18749a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C2279a mo18750b(@Nullable Boolean bool);

                    @NonNull
                    /* renamed from: c */
                    public abstract C2279a mo18751c(@NonNull C0628a<C2264c> aVar);

                    @NonNull
                    /* renamed from: d */
                    public abstract C2279a mo18752d(@NonNull C2280b bVar);

                    @NonNull
                    /* renamed from: e */
                    public abstract C2279a mo18753e(@NonNull C0628a<C2264c> aVar);

                    @NonNull
                    /* renamed from: f */
                    public abstract C2279a mo18754f(int i);
                }

                @AutoValue
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b */
                public static abstract class C2280b {

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$a */
                    public static abstract class C2281a {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$a$a */
                        public static abstract class C2282a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C2281a mo18765a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C2282a mo18766b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C2282a mo18767c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C2282a mo18768d(long j);

                            @NonNull
                            /* renamed from: e */
                            public abstract C2282a mo18769e(@Nullable String str);

                            @NonNull
                            /* renamed from: f */
                            public C2282a mo18770f(@NonNull byte[] bArr) {
                                return mo18769e(new String(bArr, CrashlyticsReport.f3659a));
                            }
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C2282a m5942a() {
                            return new C2361n.C2363b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo18760b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo18761c();

                        /* renamed from: d */
                        public abstract long mo18762d();

                        @Encodable.Ignore
                        @Nullable
                        /* renamed from: e */
                        public abstract String mo18763e();

                        @Nullable
                        @Encodable.Field(name = "uuid")
                        /* renamed from: f */
                        public byte[] mo18764f() {
                            String e = mo18763e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.f3659a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$b */
                    public static abstract class C2283b {
                        @NonNull
                        /* renamed from: a */
                        public abstract C2280b mo18771a();

                        @NonNull
                        /* renamed from: b */
                        public abstract C2283b mo18772b(@NonNull C2261a aVar);

                        @NonNull
                        /* renamed from: c */
                        public abstract C2283b mo18773c(@NonNull C0628a<C2281a> aVar);

                        @NonNull
                        /* renamed from: d */
                        public abstract C2283b mo18774d(@NonNull C2284c cVar);

                        @NonNull
                        /* renamed from: e */
                        public abstract C2283b mo18775e(@NonNull C2286d dVar);

                        @NonNull
                        /* renamed from: f */
                        public abstract C2283b mo18776f(@NonNull C0628a<C2288e> aVar);
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c */
                    public static abstract class C2284c {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c$a */
                        public static abstract class C2285a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C2284c mo18782a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C2285a mo18783b(@NonNull C2284c cVar);

                            @NonNull
                            /* renamed from: c */
                            public abstract C2285a mo18784c(@NonNull C0628a<C2288e.C2290b> aVar);

                            @NonNull
                            /* renamed from: d */
                            public abstract C2285a mo18785d(int i);

                            @NonNull
                            /* renamed from: e */
                            public abstract C2285a mo18786e(@NonNull String str);

                            @NonNull
                            /* renamed from: f */
                            public abstract C2285a mo18787f(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C2285a m5960a() {
                            return new C2364o.C2366b();
                        }

                        @Nullable
                        /* renamed from: b */
                        public abstract C2284c mo18777b();

                        @NonNull
                        /* renamed from: c */
                        public abstract C0628a<C2288e.C2290b> mo18778c();

                        /* renamed from: d */
                        public abstract int mo18779d();

                        @Nullable
                        /* renamed from: e */
                        public abstract String mo18780e();

                        @NonNull
                        /* renamed from: f */
                        public abstract String mo18781f();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$d */
                    public static abstract class C2286d {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$d$a */
                        public static abstract class C2287a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C2286d mo18791a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C2287a mo18792b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C2287a mo18793c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C2287a mo18794d(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C2287a m5972a() {
                            return new C2367p.C2369b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo18788b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo18789c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo18790d();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e */
                    public static abstract class C2288e {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$a */
                        public static abstract class C2289a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C2288e mo18798a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C2289a mo18799b(@NonNull C0628a<C2290b> aVar);

                            @NonNull
                            /* renamed from: c */
                            public abstract C2289a mo18800c(int i);

                            @NonNull
                            /* renamed from: d */
                            public abstract C2289a mo18801d(@NonNull String str);
                        }

                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b */
                        public static abstract class C2290b {

                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b$a */
                            public static abstract class C2291a {
                                @NonNull
                                /* renamed from: a */
                                public abstract C2290b mo18807a();

                                @NonNull
                                /* renamed from: b */
                                public abstract C2291a mo18808b(@NonNull String str);

                                @NonNull
                                /* renamed from: c */
                                public abstract C2291a mo18809c(int i);

                                @NonNull
                                /* renamed from: d */
                                public abstract C2291a mo18810d(long j);

                                @NonNull
                                /* renamed from: e */
                                public abstract C2291a mo18811e(long j);

                                @NonNull
                                /* renamed from: f */
                                public abstract C2291a mo18812f(@NonNull String str);
                            }

                            @NonNull
                            /* renamed from: a */
                            public static C2291a m5988a() {
                                return new C2373r.C2375b();
                            }

                            @Nullable
                            /* renamed from: b */
                            public abstract String mo18802b();

                            /* renamed from: c */
                            public abstract int mo18803c();

                            /* renamed from: d */
                            public abstract long mo18804d();

                            /* renamed from: e */
                            public abstract long mo18805e();

                            @NonNull
                            /* renamed from: f */
                            public abstract String mo18806f();
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C2289a m5980a() {
                            return new C2370q.C2372b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract C0628a<C2290b> mo18795b();

                        /* renamed from: c */
                        public abstract int mo18796c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo18797d();
                    }

                    @NonNull
                    /* renamed from: a */
                    public static C2283b m5936a() {
                        return new C2358m.C2360b();
                    }

                    @Nullable
                    /* renamed from: b */
                    public abstract C2261a mo18755b();

                    @NonNull
                    /* renamed from: c */
                    public abstract C0628a<C2281a> mo18756c();

                    @Nullable
                    /* renamed from: d */
                    public abstract C2284c mo18757d();

                    @NonNull
                    /* renamed from: e */
                    public abstract C2286d mo18758e();

                    @Nullable
                    /* renamed from: f */
                    public abstract C0628a<C2288e> mo18759f();
                }

                @NonNull
                /* renamed from: a */
                public static C2279a m5923a() {
                    return new C2355l.C2357b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Boolean mo18743b();

                @Nullable
                /* renamed from: c */
                public abstract C0628a<C2264c> mo18744c();

                @NonNull
                /* renamed from: d */
                public abstract C2280b mo18745d();

                @Nullable
                /* renamed from: e */
                public abstract C0628a<C2264c> mo18746e();

                /* renamed from: f */
                public abstract int mo18747f();

                @NonNull
                /* renamed from: g */
                public abstract C2279a mo18748g();
            }

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$b */
            public static abstract class C2292b {
                @NonNull
                /* renamed from: a */
                public abstract C2277d mo18813a();

                @NonNull
                /* renamed from: b */
                public abstract C2292b mo18814b(@NonNull C2278a aVar);

                @NonNull
                /* renamed from: c */
                public abstract C2292b mo18815c(@NonNull C2293c cVar);

                @NonNull
                /* renamed from: d */
                public abstract C2292b mo18816d(@NonNull C2295d dVar);

                @NonNull
                /* renamed from: e */
                public abstract C2292b mo18817e(long j);

                @NonNull
                /* renamed from: f */
                public abstract C2292b mo18818f(@NonNull String str);
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$c */
            public static abstract class C2293c {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$c$a */
                public static abstract class C2294a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C2293c mo18825a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C2294a mo18826b(Double d);

                    @NonNull
                    /* renamed from: c */
                    public abstract C2294a mo18827c(int i);

                    @NonNull
                    /* renamed from: d */
                    public abstract C2294a mo18828d(long j);

                    @NonNull
                    /* renamed from: e */
                    public abstract C2294a mo18829e(int i);

                    @NonNull
                    /* renamed from: f */
                    public abstract C2294a mo18830f(boolean z);

                    @NonNull
                    /* renamed from: g */
                    public abstract C2294a mo18831g(long j);
                }

                @NonNull
                /* renamed from: a */
                public static C2294a m6006a() {
                    return new C2376s.C2378b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Double mo18819b();

                /* renamed from: c */
                public abstract int mo18820c();

                /* renamed from: d */
                public abstract long mo18821d();

                /* renamed from: e */
                public abstract int mo18822e();

                /* renamed from: f */
                public abstract long mo18823f();

                /* renamed from: g */
                public abstract boolean mo18824g();
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$d */
            public static abstract class C2295d {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$d$a */
                public static abstract class C2296a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C2295d mo18833a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C2296a mo18834b(@NonNull String str);
                }

                @NonNull
                /* renamed from: a */
                public static C2296a m6020a() {
                    return new C2379t.C2381b();
                }

                @NonNull
                /* renamed from: b */
                public abstract String mo18832b();
            }

            @NonNull
            /* renamed from: a */
            public static C2292b m5916a() {
                return new C2352k.C2354b();
            }

            @NonNull
            /* renamed from: b */
            public abstract C2278a mo18737b();

            @NonNull
            /* renamed from: c */
            public abstract C2293c mo18738c();

            @Nullable
            /* renamed from: d */
            public abstract C2295d mo18739d();

            /* renamed from: e */
            public abstract long mo18740e();

            @NonNull
            /* renamed from: f */
            public abstract String mo18741f();

            @NonNull
            /* renamed from: g */
            public abstract C2292b mo18742g();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e */
        public static abstract class C2297e {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e$a */
            public static abstract class C2298a {
                @NonNull
                /* renamed from: a */
                public abstract C2297e mo18839a();

                @NonNull
                /* renamed from: b */
                public abstract C2298a mo18840b(@NonNull String str);

                @NonNull
                /* renamed from: c */
                public abstract C2298a mo18841c(boolean z);

                @NonNull
                /* renamed from: d */
                public abstract C2298a mo18842d(int i);

                @NonNull
                /* renamed from: e */
                public abstract C2298a mo18843e(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C2298a m6024a() {
                return new C2382u.C2384b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo18835b();

            /* renamed from: c */
            public abstract int mo18836c();

            @NonNull
            /* renamed from: d */
            public abstract String mo18837d();

            /* renamed from: e */
            public abstract boolean mo18838e();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f */
        public static abstract class C2299f {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f$a */
            public static abstract class C2300a {
                @NonNull
                /* renamed from: a */
                public abstract C2299f mo18845a();

                @NonNull
                /* renamed from: b */
                public abstract C2300a mo18846b(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C2300a m6034a() {
                return new C2385v.C2387b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo18844b();
        }

        @NonNull
        /* renamed from: a */
        public static C2274b m5851a() {
            return new C2342g.C2344b().mo18707c(false);
        }

        @NonNull
        /* renamed from: b */
        public abstract C2271a mo18675b();

        @Nullable
        /* renamed from: c */
        public abstract C2275c mo18676c();

        @Nullable
        /* renamed from: d */
        public abstract Long mo18677d();

        @Nullable
        /* renamed from: e */
        public abstract C0628a<C2277d> mo18678e();

        @NonNull
        /* renamed from: f */
        public abstract String mo18679f();

        /* renamed from: g */
        public abstract int mo18680g();

        @NonNull
        @Encodable.Ignore
        /* renamed from: h */
        public abstract String mo18681h();

        @NonNull
        @Encodable.Field(name = "identifier")
        /* renamed from: i */
        public byte[] mo18682i() {
            return mo18681h().getBytes(CrashlyticsReport.f3659a);
        }

        @Nullable
        /* renamed from: j */
        public abstract C2297e mo18683j();

        /* renamed from: k */
        public abstract long mo18684k();

        @Nullable
        /* renamed from: l */
        public abstract C2299f mo18685l();

        /* renamed from: m */
        public abstract boolean mo18686m();

        @NonNull
        /* renamed from: n */
        public abstract C2274b mo18687n();

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: o */
        public C2270e mo18688o(@NonNull C0628a<C2277d> aVar) {
            return mo18687n().mo18710f(aVar).mo18705a();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: p */
        public C2270e mo18689p(long j, boolean z, @Nullable String str) {
            C2274b n = mo18687n();
            n.mo18709e(Long.valueOf(j));
            n.mo18707c(z);
            if (str != null) {
                n.mo18717m(C2299f.m6034a().mo18846b(str).mo18845a());
            }
            return n.mo18705a();
        }
    }

    @NonNull
    /* renamed from: b */
    public static C2263b m5793b() {
        return new C2327b.C2329b();
    }

    @NonNull
    /* renamed from: c */
    public abstract String mo18622c();

    @NonNull
    /* renamed from: d */
    public abstract String mo18623d();

    @NonNull
    /* renamed from: e */
    public abstract String mo18624e();

    @NonNull
    /* renamed from: f */
    public abstract String mo18625f();

    @Nullable
    /* renamed from: g */
    public abstract C2266d mo18626g();

    /* renamed from: h */
    public abstract int mo18627h();

    @NonNull
    /* renamed from: i */
    public abstract String mo18628i();

    @Nullable
    /* renamed from: j */
    public abstract C2270e mo18629j();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k */
    public abstract C2263b mo18630k();

    @NonNull
    /* renamed from: l */
    public CrashlyticsReport mo18631l(@NonNull C0628a<C2270e.C2277d> aVar) {
        if (mo18629j() != null) {
            return mo18630k().mo18659i(mo18629j().mo18688o(aVar)).mo18651a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    /* renamed from: m */
    public CrashlyticsReport mo18632m(@NonNull C2266d dVar) {
        return mo18630k().mo18659i((C2270e) null).mo18656f(dVar).mo18651a();
    }

    @NonNull
    /* renamed from: n */
    public CrashlyticsReport mo18633n(long j, boolean z, @Nullable String str) {
        C2263b k = mo18630k();
        if (mo18629j() != null) {
            k.mo18659i(mo18629j().mo18689p(j, z, str));
        }
        return k.mo18651a();
    }
}
