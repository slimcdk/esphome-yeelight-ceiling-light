package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.C3107b;
import com.google.firebase.crashlytics.internal.model.C3110c;
import com.google.firebase.crashlytics.internal.model.C3113d;
import com.google.firebase.crashlytics.internal.model.C3116e;
import com.google.firebase.crashlytics.internal.model.C3119f;
import com.google.firebase.crashlytics.internal.model.C3122g;
import com.google.firebase.crashlytics.internal.model.C3126i;
import com.google.firebase.crashlytics.internal.model.C3129j;
import com.google.firebase.crashlytics.internal.model.C3132k;
import com.google.firebase.crashlytics.internal.model.C3135l;
import com.google.firebase.crashlytics.internal.model.C3138m;
import com.google.firebase.crashlytics.internal.model.C3141n;
import com.google.firebase.crashlytics.internal.model.C3144o;
import com.google.firebase.crashlytics.internal.model.C3147p;
import com.google.firebase.crashlytics.internal.model.C3150q;
import com.google.firebase.crashlytics.internal.model.C3153r;
import com.google.firebase.crashlytics.internal.model.C3156s;
import com.google.firebase.crashlytics.internal.model.C3159t;
import com.google.firebase.crashlytics.internal.model.C3162u;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

@AutoValue
@Encodable
public abstract class CrashlyticsReport {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Charset f5934a = Charset.forName("UTF-8");

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a */
    public static abstract class C3047a {
        @NonNull
        /* renamed from: a */
        public abstract CrashlyticsReport mo17443a();

        @NonNull
        /* renamed from: b */
        public abstract C3047a mo17444b(@NonNull String str);

        @NonNull
        /* renamed from: c */
        public abstract C3047a mo17445c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C3047a mo17446d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C3047a mo17447e(@NonNull String str);

        @NonNull
        /* renamed from: f */
        public abstract C3047a mo17448f(C3050c cVar);

        @NonNull
        /* renamed from: g */
        public abstract C3047a mo17449g(int i);

        @NonNull
        /* renamed from: h */
        public abstract C3047a mo17450h(@NonNull String str);

        @NonNull
        /* renamed from: i */
        public abstract C3047a mo17451i(@NonNull C3054d dVar);
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b */
    public static abstract class C3048b {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b$a */
        public static abstract class C3049a {
            @NonNull
            /* renamed from: a */
            public abstract C3048b mo17454a();

            @NonNull
            /* renamed from: b */
            public abstract C3049a mo17455b(@NonNull String str);

            @NonNull
            /* renamed from: c */
            public abstract C3049a mo17456c(@NonNull String str);
        }

        @NonNull
        /* renamed from: a */
        public static C3049a m9433a() {
            return new C3110c.C3112b();
        }

        @NonNull
        /* renamed from: b */
        public abstract String mo17452b();

        @NonNull
        /* renamed from: c */
        public abstract String mo17453c();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c */
    public static abstract class C3050c {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$a */
        public static abstract class C3051a {
            /* renamed from: a */
            public abstract C3050c mo17459a();

            /* renamed from: b */
            public abstract C3051a mo17460b(C3165v<C3052b> vVar);

            /* renamed from: c */
            public abstract C3051a mo17461c(String str);
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$b */
        public static abstract class C3052b {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$b$a */
            public static abstract class C3053a {
                /* renamed from: a */
                public abstract C3052b mo17464a();

                /* renamed from: b */
                public abstract C3053a mo17465b(byte[] bArr);

                /* renamed from: c */
                public abstract C3053a mo17466c(String str);
            }

            @NonNull
            /* renamed from: a */
            public static C3053a m9445a() {
                return new C3116e.C3118b();
            }

            @NonNull
            /* renamed from: b */
            public abstract byte[] mo17462b();

            @NonNull
            /* renamed from: c */
            public abstract String mo17463c();
        }

        @NonNull
        /* renamed from: a */
        public static C3051a m9439a() {
            return new C3113d.C3115b();
        }

        @NonNull
        /* renamed from: b */
        public abstract C3165v<C3052b> mo17457b();

        @Nullable
        /* renamed from: c */
        public abstract String mo17458c();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d */
    public static abstract class C3054d {

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a */
        public static abstract class C3055a {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a$a */
            public static abstract class C3056a {
                @NonNull
                /* renamed from: a */
                public abstract C3055a mo17487a();

                @NonNull
                /* renamed from: b */
                public abstract C3056a mo17488b(@NonNull String str);

                @NonNull
                /* renamed from: c */
                public abstract C3056a mo17489c(@NonNull String str);

                @NonNull
                /* renamed from: d */
                public abstract C3056a mo17490d(@NonNull String str);

                @NonNull
                /* renamed from: e */
                public abstract C3056a mo17491e(@NonNull String str);
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a$b */
            public static abstract class C3057b {
                @NonNull
                /* renamed from: a */
                public abstract String mo17492a();
            }

            @NonNull
            /* renamed from: a */
            public static C3056a m9467a() {
                return new C3122g.C3124b();
            }

            @Nullable
            /* renamed from: b */
            public abstract String mo17482b();

            @NonNull
            /* renamed from: c */
            public abstract String mo17483c();

            @Nullable
            /* renamed from: d */
            public abstract String mo17484d();

            @Nullable
            /* renamed from: e */
            public abstract C3057b mo17485e();

            @NonNull
            /* renamed from: f */
            public abstract String mo17486f();
        }

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$b */
        public static abstract class C3058b {
            @NonNull
            /* renamed from: a */
            public abstract C3054d mo17493a();

            @NonNull
            /* renamed from: b */
            public abstract C3058b mo17494b(@NonNull C3055a aVar);

            @NonNull
            /* renamed from: c */
            public abstract C3058b mo17495c(boolean z);

            @NonNull
            /* renamed from: d */
            public abstract C3058b mo17496d(@NonNull C3059c cVar);

            @NonNull
            /* renamed from: e */
            public abstract C3058b mo17497e(@NonNull Long l);

            @NonNull
            /* renamed from: f */
            public abstract C3058b mo17498f(@NonNull C3165v<C3061d> vVar);

            @NonNull
            /* renamed from: g */
            public abstract C3058b mo17499g(@NonNull String str);

            @NonNull
            /* renamed from: h */
            public abstract C3058b mo17500h(int i);

            @NonNull
            /* renamed from: i */
            public abstract C3058b mo17501i(@NonNull String str);

            @NonNull
            /* renamed from: j */
            public C3058b mo17502j(@NonNull byte[] bArr) {
                mo17501i(new String(bArr, CrashlyticsReport.f5934a));
                return this;
            }

            @NonNull
            /* renamed from: k */
            public abstract C3058b mo17503k(@NonNull C3081e eVar);

            @NonNull
            /* renamed from: l */
            public abstract C3058b mo17504l(long j);

            @NonNull
            /* renamed from: m */
            public abstract C3058b mo17505m(@NonNull C3083f fVar);
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$c */
        public static abstract class C3059c {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$c$a */
            public static abstract class C3060a {
                @NonNull
                /* renamed from: a */
                public abstract C3059c mo17515a();

                @NonNull
                /* renamed from: b */
                public abstract C3060a mo17516b(int i);

                @NonNull
                /* renamed from: c */
                public abstract C3060a mo17517c(int i);

                @NonNull
                /* renamed from: d */
                public abstract C3060a mo17518d(long j);

                @NonNull
                /* renamed from: e */
                public abstract C3060a mo17519e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract C3060a mo17520f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract C3060a mo17521g(@NonNull String str);

                @NonNull
                /* renamed from: h */
                public abstract C3060a mo17522h(long j);

                @NonNull
                /* renamed from: i */
                public abstract C3060a mo17523i(boolean z);

                @NonNull
                /* renamed from: j */
                public abstract C3060a mo17524j(int i);
            }

            @NonNull
            /* renamed from: a */
            public static C3060a m9492a() {
                return new C3126i.C3128b();
            }

            @NonNull
            /* renamed from: b */
            public abstract int mo17506b();

            /* renamed from: c */
            public abstract int mo17507c();

            /* renamed from: d */
            public abstract long mo17508d();

            @NonNull
            /* renamed from: e */
            public abstract String mo17509e();

            @NonNull
            /* renamed from: f */
            public abstract String mo17510f();

            @NonNull
            /* renamed from: g */
            public abstract String mo17511g();

            /* renamed from: h */
            public abstract long mo17512h();

            /* renamed from: i */
            public abstract int mo17513i();

            /* renamed from: j */
            public abstract boolean mo17514j();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d */
        public static abstract class C3061d {

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a */
            public static abstract class C3062a {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$a */
                public static abstract class C3063a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C3062a mo17536a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C3063a mo17537b(@Nullable Boolean bool);

                    @NonNull
                    /* renamed from: c */
                    public abstract C3063a mo17538c(@NonNull C3165v<C3048b> vVar);

                    @NonNull
                    /* renamed from: d */
                    public abstract C3063a mo17539d(@NonNull C3064b bVar);

                    @NonNull
                    /* renamed from: e */
                    public abstract C3063a mo17540e(int i);
                }

                @AutoValue
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b */
                public static abstract class C3064b {

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$a */
                    public static abstract class C3065a {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$a$a */
                        public static abstract class C3066a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C3065a mo17550a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C3066a mo17551b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C3066a mo17552c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C3066a mo17553d(long j);

                            @NonNull
                            /* renamed from: e */
                            public abstract C3066a mo17554e(@Nullable String str);

                            @NonNull
                            /* renamed from: f */
                            public C3066a mo17555f(@NonNull byte[] bArr) {
                                mo17554e(new String(bArr, CrashlyticsReport.f5934a));
                                return this;
                            }
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C3066a m9535a() {
                            return new C3138m.C3140b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo17545b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo17546c();

                        /* renamed from: d */
                        public abstract long mo17547d();

                        @Encodable.Ignore
                        @Nullable
                        /* renamed from: e */
                        public abstract String mo17548e();

                        @Nullable
                        @Encodable.Field(name = "uuid")
                        /* renamed from: f */
                        public byte[] mo17549f() {
                            String e = mo17548e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.f5934a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$b */
                    public static abstract class C3067b {
                        @NonNull
                        /* renamed from: a */
                        public abstract C3064b mo17556a();

                        @NonNull
                        /* renamed from: b */
                        public abstract C3067b mo17557b(@NonNull C3165v<C3065a> vVar);

                        @NonNull
                        /* renamed from: c */
                        public abstract C3067b mo17558c(@NonNull C3068c cVar);

                        @NonNull
                        /* renamed from: d */
                        public abstract C3067b mo17559d(@NonNull C3070d dVar);

                        @NonNull
                        /* renamed from: e */
                        public abstract C3067b mo17560e(@NonNull C3165v<C3072e> vVar);
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c */
                    public static abstract class C3068c {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c$a */
                        public static abstract class C3069a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C3068c mo17566a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C3069a mo17567b(@NonNull C3068c cVar);

                            @NonNull
                            /* renamed from: c */
                            public abstract C3069a mo17568c(@NonNull C3165v<C3072e.C3074b> vVar);

                            @NonNull
                            /* renamed from: d */
                            public abstract C3069a mo17569d(int i);

                            @NonNull
                            /* renamed from: e */
                            public abstract C3069a mo17570e(@NonNull String str);

                            @NonNull
                            /* renamed from: f */
                            public abstract C3069a mo17571f(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C3069a m9552a() {
                            return new C3141n.C3143b();
                        }

                        @Nullable
                        /* renamed from: b */
                        public abstract C3068c mo17561b();

                        @NonNull
                        /* renamed from: c */
                        public abstract C3165v<C3072e.C3074b> mo17562c();

                        /* renamed from: d */
                        public abstract int mo17563d();

                        @Nullable
                        /* renamed from: e */
                        public abstract String mo17564e();

                        @NonNull
                        /* renamed from: f */
                        public abstract String mo17565f();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$d */
                    public static abstract class C3070d {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$d$a */
                        public static abstract class C3071a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C3070d mo17575a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C3071a mo17576b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C3071a mo17577c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C3071a mo17578d(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C3071a m9564a() {
                            return new C3144o.C3146b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo17572b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo17573c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo17574d();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e */
                    public static abstract class C3072e {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$a */
                        public static abstract class C3073a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C3072e mo17582a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C3073a mo17583b(@NonNull C3165v<C3074b> vVar);

                            @NonNull
                            /* renamed from: c */
                            public abstract C3073a mo17584c(int i);

                            @NonNull
                            /* renamed from: d */
                            public abstract C3073a mo17585d(@NonNull String str);
                        }

                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b */
                        public static abstract class C3074b {

                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b$a */
                            public static abstract class C3075a {
                                @NonNull
                                /* renamed from: a */
                                public abstract C3074b mo17591a();

                                @NonNull
                                /* renamed from: b */
                                public abstract C3075a mo17592b(@NonNull String str);

                                @NonNull
                                /* renamed from: c */
                                public abstract C3075a mo17593c(int i);

                                @NonNull
                                /* renamed from: d */
                                public abstract C3075a mo17594d(long j);

                                @NonNull
                                /* renamed from: e */
                                public abstract C3075a mo17595e(long j);

                                @NonNull
                                /* renamed from: f */
                                public abstract C3075a mo17596f(@NonNull String str);
                            }

                            @NonNull
                            /* renamed from: a */
                            public static C3075a m9580a() {
                                return new C3150q.C3152b();
                            }

                            @Nullable
                            /* renamed from: b */
                            public abstract String mo17586b();

                            /* renamed from: c */
                            public abstract int mo17587c();

                            /* renamed from: d */
                            public abstract long mo17588d();

                            /* renamed from: e */
                            public abstract long mo17589e();

                            @NonNull
                            /* renamed from: f */
                            public abstract String mo17590f();
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C3073a m9572a() {
                            return new C3147p.C3149b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract C3165v<C3074b> mo17579b();

                        /* renamed from: c */
                        public abstract int mo17580c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo17581d();
                    }

                    @NonNull
                    /* renamed from: a */
                    public static C3067b m9530a() {
                        return new C3135l.C3137b();
                    }

                    @NonNull
                    /* renamed from: b */
                    public abstract C3165v<C3065a> mo17541b();

                    @NonNull
                    /* renamed from: c */
                    public abstract C3068c mo17542c();

                    @NonNull
                    /* renamed from: d */
                    public abstract C3070d mo17543d();

                    @NonNull
                    /* renamed from: e */
                    public abstract C3165v<C3072e> mo17544e();
                }

                @NonNull
                /* renamed from: a */
                public static C3063a m9519a() {
                    return new C3132k.C3134b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Boolean mo17531b();

                @Nullable
                /* renamed from: c */
                public abstract C3165v<C3048b> mo17532c();

                @NonNull
                /* renamed from: d */
                public abstract C3064b mo17533d();

                /* renamed from: e */
                public abstract int mo17534e();

                @NonNull
                /* renamed from: f */
                public abstract C3063a mo17535f();
            }

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$b */
            public static abstract class C3076b {
                @NonNull
                /* renamed from: a */
                public abstract C3061d mo17597a();

                @NonNull
                /* renamed from: b */
                public abstract C3076b mo17598b(@NonNull C3062a aVar);

                @NonNull
                /* renamed from: c */
                public abstract C3076b mo17599c(@NonNull C3077c cVar);

                @NonNull
                /* renamed from: d */
                public abstract C3076b mo17600d(@NonNull C3079d dVar);

                @NonNull
                /* renamed from: e */
                public abstract C3076b mo17601e(long j);

                @NonNull
                /* renamed from: f */
                public abstract C3076b mo17602f(@NonNull String str);
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$c */
            public static abstract class C3077c {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$c$a */
                public static abstract class C3078a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C3077c mo17609a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C3078a mo17610b(Double d);

                    @NonNull
                    /* renamed from: c */
                    public abstract C3078a mo17611c(int i);

                    @NonNull
                    /* renamed from: d */
                    public abstract C3078a mo17612d(long j);

                    @NonNull
                    /* renamed from: e */
                    public abstract C3078a mo17613e(int i);

                    @NonNull
                    /* renamed from: f */
                    public abstract C3078a mo17614f(boolean z);

                    @NonNull
                    /* renamed from: g */
                    public abstract C3078a mo17615g(long j);
                }

                @NonNull
                /* renamed from: a */
                public static C3078a m9598a() {
                    return new C3153r.C3155b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Double mo17603b();

                /* renamed from: c */
                public abstract int mo17604c();

                /* renamed from: d */
                public abstract long mo17605d();

                /* renamed from: e */
                public abstract int mo17606e();

                /* renamed from: f */
                public abstract long mo17607f();

                /* renamed from: g */
                public abstract boolean mo17608g();
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$d */
            public static abstract class C3079d {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$d$a */
                public static abstract class C3080a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C3079d mo17617a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C3080a mo17618b(@NonNull String str);
                }

                @NonNull
                /* renamed from: a */
                public static C3080a m9612a() {
                    return new C3156s.C3158b();
                }

                @NonNull
                /* renamed from: b */
                public abstract String mo17616b();
            }

            @NonNull
            /* renamed from: a */
            public static C3076b m9512a() {
                return new C3129j.C3131b();
            }

            @NonNull
            /* renamed from: b */
            public abstract C3062a mo17525b();

            @NonNull
            /* renamed from: c */
            public abstract C3077c mo17526c();

            @Nullable
            /* renamed from: d */
            public abstract C3079d mo17527d();

            /* renamed from: e */
            public abstract long mo17528e();

            @NonNull
            /* renamed from: f */
            public abstract String mo17529f();

            @NonNull
            /* renamed from: g */
            public abstract C3076b mo17530g();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$e */
        public static abstract class C3081e {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$e$a */
            public static abstract class C3082a {
                @NonNull
                /* renamed from: a */
                public abstract C3081e mo17623a();

                @NonNull
                /* renamed from: b */
                public abstract C3082a mo17624b(@NonNull String str);

                @NonNull
                /* renamed from: c */
                public abstract C3082a mo17625c(boolean z);

                @NonNull
                /* renamed from: d */
                public abstract C3082a mo17626d(int i);

                @NonNull
                /* renamed from: e */
                public abstract C3082a mo17627e(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C3082a m9616a() {
                return new C3159t.C3161b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo17619b();

            /* renamed from: c */
            public abstract int mo17620c();

            @NonNull
            /* renamed from: d */
            public abstract String mo17621d();

            /* renamed from: e */
            public abstract boolean mo17622e();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$f */
        public static abstract class C3083f {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$f$a */
            public static abstract class C3084a {
                @NonNull
                /* renamed from: a */
                public abstract C3083f mo17629a();

                @NonNull
                /* renamed from: b */
                public abstract C3084a mo17630b(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C3084a m9626a() {
                return new C3162u.C3164b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo17628b();
        }

        @NonNull
        /* renamed from: a */
        public static C3058b m9451a() {
            C3119f.C3121b bVar = new C3119f.C3121b();
            bVar.mo17495c(false);
            return bVar;
        }

        @NonNull
        /* renamed from: b */
        public abstract C3055a mo17467b();

        @Nullable
        /* renamed from: c */
        public abstract C3059c mo17468c();

        @Nullable
        /* renamed from: d */
        public abstract Long mo17469d();

        @Nullable
        /* renamed from: e */
        public abstract C3165v<C3061d> mo17470e();

        @NonNull
        /* renamed from: f */
        public abstract String mo17471f();

        /* renamed from: g */
        public abstract int mo17472g();

        @NonNull
        @Encodable.Ignore
        /* renamed from: h */
        public abstract String mo17473h();

        @NonNull
        @Encodable.Field(name = "identifier")
        /* renamed from: i */
        public byte[] mo17474i() {
            return mo17473h().getBytes(CrashlyticsReport.f5934a);
        }

        @Nullable
        /* renamed from: j */
        public abstract C3081e mo17475j();

        /* renamed from: k */
        public abstract long mo17476k();

        @Nullable
        /* renamed from: l */
        public abstract C3083f mo17477l();

        /* renamed from: m */
        public abstract boolean mo17478m();

        @NonNull
        /* renamed from: n */
        public abstract C3058b mo17479n();

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: o */
        public C3054d mo17480o(@NonNull C3165v<C3061d> vVar) {
            C3058b n = mo17479n();
            n.mo17498f(vVar);
            return n.mo17493a();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: p */
        public C3054d mo17481p(long j, boolean z, @Nullable String str) {
            C3058b n = mo17479n();
            n.mo17497e(Long.valueOf(j));
            n.mo17495c(z);
            if (str != null) {
                C3083f.C3084a a = C3083f.m9626a();
                a.mo17630b(str);
                n.mo17505m(a.mo17629a());
                n.mo17493a();
            }
            return n.mo17493a();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e */
    public enum C3085e {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @NonNull
    /* renamed from: b */
    public static C3047a m9410b() {
        return new C3107b.C3109b();
    }

    @NonNull
    /* renamed from: c */
    public abstract String mo17430c();

    @NonNull
    /* renamed from: d */
    public abstract String mo17431d();

    @NonNull
    /* renamed from: e */
    public abstract String mo17432e();

    @NonNull
    /* renamed from: f */
    public abstract String mo17433f();

    @Nullable
    /* renamed from: g */
    public abstract C3050c mo17434g();

    /* renamed from: h */
    public abstract int mo17435h();

    @NonNull
    /* renamed from: i */
    public abstract String mo17436i();

    @Nullable
    /* renamed from: j */
    public abstract C3054d mo17437j();

    @Encodable.Ignore
    /* renamed from: k */
    public C3085e mo17438k() {
        return mo17437j() != null ? C3085e.JAVA : mo17434g() != null ? C3085e.NATIVE : C3085e.INCOMPLETE;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: l */
    public abstract C3047a mo17439l();

    @NonNull
    /* renamed from: m */
    public CrashlyticsReport mo17440m(@NonNull C3165v<C3054d.C3061d> vVar) {
        if (mo17437j() != null) {
            C3047a l = mo17439l();
            l.mo17451i(mo17437j().mo17480o(vVar));
            return l.mo17443a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    /* renamed from: n */
    public CrashlyticsReport mo17441n(@NonNull C3050c cVar) {
        C3047a l = mo17439l();
        l.mo17451i((C3054d) null);
        l.mo17448f(cVar);
        return l.mo17443a();
    }

    @NonNull
    /* renamed from: o */
    public CrashlyticsReport mo17442o(long j, boolean z, @Nullable String str) {
        C3047a l = mo17439l();
        if (mo17437j() != null) {
            l.mo17451i(mo17437j().mo17481p(j, z, str));
        }
        return l.mo17443a();
    }
}
