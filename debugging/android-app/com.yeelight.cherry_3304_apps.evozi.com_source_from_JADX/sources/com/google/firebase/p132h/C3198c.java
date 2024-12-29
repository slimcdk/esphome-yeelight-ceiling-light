package com.google.firebase.p132h;

import androidx.annotation.NonNull;

/* renamed from: com.google.firebase.h.c */
public interface C3198c {

    /* renamed from: com.google.firebase.h.c$a */
    public enum C3199a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a */
        private final int f6174a;

        private C3199a(int i) {
            this.f6174a = i;
        }

        /* renamed from: a */
        public int mo17782a() {
            return this.f6174a;
        }
    }

    @NonNull
    /* renamed from: a */
    C3199a mo17781a(@NonNull String str);
}
