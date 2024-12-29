package p011c.p012a.p053e.p073y.p074b;

import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.y.b.c */
enum C0947c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9308a(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo9308a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9309b(C0840b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo9308a(i2, i3)) {
                    bVar.mo9057c(i3, i2);
                }
            }
        }
    }
}
