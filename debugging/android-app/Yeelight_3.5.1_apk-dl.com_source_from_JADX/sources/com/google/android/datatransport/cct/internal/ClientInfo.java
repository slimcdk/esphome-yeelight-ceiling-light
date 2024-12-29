package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C0661e;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private ClientType(int i) {
            this.value = i;
        }
    }

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.ClientInfo$a */
    public static abstract class C0646a {
        @NonNull
        /* renamed from: a */
        public abstract ClientInfo mo11110a();

        @NonNull
        /* renamed from: b */
        public abstract C0646a mo11111b(@Nullable C0648a aVar);

        @NonNull
        /* renamed from: c */
        public abstract C0646a mo11112c(@Nullable ClientType clientType);
    }

    @NonNull
    /* renamed from: a */
    public static C0646a m343a() {
        return new C0661e.C0663b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C0648a mo11108b();

    @Nullable
    /* renamed from: c */
    public abstract ClientType mo11109c();
}
