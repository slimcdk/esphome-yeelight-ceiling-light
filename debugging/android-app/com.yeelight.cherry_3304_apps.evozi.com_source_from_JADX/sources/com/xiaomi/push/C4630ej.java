package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.ej */
public final class C4630ej {

    /* renamed from: com.xiaomi.push.ej$a */
    public static final class C4631a extends C4620e {

        /* renamed from: a */
        private int f8452a = 0;

        /* renamed from: a */
        private List<String> f8453a = Collections.emptyList();

        /* renamed from: a */
        private boolean f8454a;

        /* renamed from: b */
        private int f8455b = 0;

        /* renamed from: b */
        private boolean f8456b;

        /* renamed from: c */
        private int f8457c = -1;

        /* renamed from: c */
        private boolean f8458c = false;

        /* renamed from: d */
        private boolean f8459d;

        /* renamed from: e */
        private boolean f8460e;

        /* renamed from: f */
        private boolean f8461f = false;

        /* renamed from: a */
        public static C4631a m13831a(byte[] bArr) {
            return (C4631a) new C4631a().mo24932a(bArr);
        }

        /* renamed from: b */
        public static C4631a m13832b(C4524b bVar) {
            return new C4631a().mo24931a(bVar);
        }

        /* renamed from: a */
        public int mo24930a() {
            if (this.f8457c < 0) {
                mo24936b();
            }
            return this.f8457c;
        }

        /* renamed from: a */
        public C4631a mo24940a(int i) {
            this.f8454a = true;
            this.f8452a = i;
            return this;
        }

        /* renamed from: a */
        public C4631a m13836a(C4524b bVar) {
            while (true) {
                int a = bVar.mo24757a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo24940a(bVar.mo24762c());
                } else if (a == 16) {
                    mo24942a(bVar.mo24757a());
                } else if (a == 24) {
                    mo24943b(bVar.mo24760b());
                } else if (a == 32) {
                    mo24944b(bVar.mo24757a());
                } else if (a == 42) {
                    mo24941a(bVar.mo24757a());
                } else if (!mo24935a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4631a mo24941a(String str) {
            if (str != null) {
                if (this.f8453a.isEmpty()) {
                    this.f8453a = new ArrayList();
                }
                this.f8453a.add(str);
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4631a mo24942a(boolean z) {
            this.f8456b = true;
            this.f8458c = z;
            return this;
        }

        /* renamed from: a */
        public List<String> m13839a() {
            return this.f8453a;
        }

        /* renamed from: a */
        public void mo24934a(C4554c cVar) {
            if (mo24930a()) {
                cVar.mo24816b(1, mo24945c());
            }
            if (mo24945c()) {
                cVar.mo24806a(2, mo24936b());
            }
            if (mo24946d()) {
                cVar.mo24801a(3, mo24946d());
            }
            if (mo24948f()) {
                cVar.mo24806a(4, mo24947e());
            }
            for (String a : mo24930a()) {
                cVar.mo24805a(5, a);
            }
        }

        /* renamed from: a */
        public boolean m13841a() {
            return this.f8454a;
        }

        /* renamed from: b */
        public int mo24936b() {
            int i = 0;
            int b = mo24930a() ? C4554c.mo24816b(1, mo24945c()) + 0 : 0;
            if (mo24945c()) {
                b += C4554c.mo24806a(2, mo24936b());
            }
            if (mo24946d()) {
                b += C4554c.mo24801a(3, mo24946d());
            }
            if (mo24948f()) {
                b += C4554c.mo24806a(4, mo24947e());
            }
            for (String a : mo24930a()) {
                i += C4554c.mo24810a(a);
            }
            int size = b + i + (mo24930a().size() * 1);
            this.f8457c = size;
            return size;
        }

        /* renamed from: b */
        public C4631a mo24943b(int i) {
            this.f8459d = true;
            this.f8455b = i;
            return this;
        }

        /* renamed from: b */
        public C4631a mo24944b(boolean z) {
            this.f8460e = true;
            this.f8461f = z;
            return this;
        }

        /* renamed from: b */
        public boolean m13845b() {
            return this.f8458c;
        }

        /* renamed from: c */
        public int mo24945c() {
            return this.f8452a;
        }

        /* renamed from: c */
        public boolean m13847c() {
            return this.f8456b;
        }

        /* renamed from: d */
        public int mo24946d() {
            return this.f8455b;
        }

        /* renamed from: d */
        public boolean m13849d() {
            return this.f8459d;
        }

        /* renamed from: e */
        public int mo24947e() {
            return this.f8453a.size();
        }

        /* renamed from: e */
        public boolean m13851e() {
            return this.f8461f;
        }

        /* renamed from: f */
        public boolean mo24948f() {
            return this.f8460e;
        }
    }
}
