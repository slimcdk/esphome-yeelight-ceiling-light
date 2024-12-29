package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C0667g;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.l */
public abstract class C0677l {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.l$a */
    public static abstract class C0678a {
        @NonNull
        /* renamed from: a */
        public abstract C0677l mo11192a();

        @NonNull
        /* renamed from: b */
        public abstract C0678a mo11193b(@Nullable ClientInfo clientInfo);

        @NonNull
        /* renamed from: c */
        public abstract C0678a mo11194c(@Nullable List<C0675k> list);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: d */
        public abstract C0678a mo11195d(@Nullable Integer num);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: e */
        public abstract C0678a mo11196e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C0678a mo11197f(@Nullable QosTier qosTier);

        @NonNull
        /* renamed from: g */
        public abstract C0678a mo11198g(long j);

        @NonNull
        /* renamed from: h */
        public abstract C0678a mo11199h(long j);

        @NonNull
        /* renamed from: i */
        public C0678a mo11207i(int i) {
            return mo11195d(Integer.valueOf(i));
        }

        @NonNull
        /* renamed from: j */
        public C0678a mo11208j(@NonNull String str) {
            return mo11196e(str);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C0678a m482a() {
        return new C0667g.C0669b();
    }

    @Nullable
    /* renamed from: b */
    public abstract ClientInfo mo11182b();

    @Nullable
    @Encodable.Field(name = "logEvent")
    /* renamed from: c */
    public abstract List<C0675k> mo11183c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo11184d();

    @Nullable
    /* renamed from: e */
    public abstract String mo11185e();

    @Nullable
    /* renamed from: f */
    public abstract QosTier mo11187f();

    /* renamed from: g */
    public abstract long mo11188g();

    /* renamed from: h */
    public abstract long mo11189h();
}
