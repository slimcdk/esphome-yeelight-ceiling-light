package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.xiaomi.push.dw */
public final class C4635dw {

    /* renamed from: com.xiaomi.push.dw$a */
    public static final class C4636a extends C4651e {

        /* renamed from: a */
        private int f7840a = 0;

        /* renamed from: a */
        private List<String> f7841a = Collections.emptyList();

        /* renamed from: a */
        private boolean f7842a;

        /* renamed from: b */
        private int f7843b = 0;

        /* renamed from: b */
        private boolean f7844b;

        /* renamed from: c */
        private int f7845c = -1;

        /* renamed from: c */
        private boolean f7846c = false;

        /* renamed from: d */
        private boolean f7847d;

        /* renamed from: e */
        private boolean f7848e;

        /* renamed from: f */
        private boolean f7849f = false;

        /* renamed from: a */
        public static C4636a m13363a(byte[] bArr) {
            return (C4636a) new C4636a().mo29024a(bArr);
        }

        /* renamed from: b */
        public static C4636a m13364b(C4538b bVar) {
            return new C4636a().m13370a(bVar);
        }

        /* renamed from: a */
        public int mo28924a() {
            if (this.f7845c < 0) {
                mo28930b();
            }
            return this.f7845c;
        }

        /* renamed from: a */
        public C4636a mo28925a(int i) {
            this.f7842a = true;
            this.f7840a = i;
            return this;
        }

        /* renamed from: a */
        public C4636a m13370a(C4538b bVar) {
            while (true) {
                int a = bVar.mo28758a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo28925a(bVar.mo28763c());
                } else if (a == 16) {
                    mo28928a(bVar.mo28758a());
                } else if (a == 24) {
                    mo28931b(bVar.mo28761b());
                } else if (a == 32) {
                    mo28932b(bVar.mo28758a());
                } else if (a == 42) {
                    mo28927a(bVar.mo28758a());
                } else if (!mo29026a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4636a mo28927a(String str) {
            Objects.requireNonNull(str);
            if (this.f7841a.isEmpty()) {
                this.f7841a = new ArrayList();
            }
            this.f7841a.add(str);
            return this;
        }

        /* renamed from: a */
        public C4636a mo28928a(boolean z) {
            this.f7844b = true;
            this.f7846c = z;
            return this;
        }

        /* renamed from: a */
        public List<String> m13371a() {
            return this.f7841a;
        }

        /* renamed from: a */
        public void mo28929a(C4572c cVar) {
            if (mo28924a()) {
                cVar.mo28817b(1, mo28933c());
            }
            if (mo28933c()) {
                cVar.mo28807a(2, mo28930b());
            }
            if (mo28934d()) {
                cVar.mo28802a(3, mo28934d());
            }
            if (mo28936f()) {
                cVar.mo28807a(4, mo28935e());
            }
            for (String a : mo28924a()) {
                cVar.mo28806a(5, a);
            }
        }

        /* renamed from: a */
        public boolean m13373a() {
            return this.f7842a;
        }

        /* renamed from: b */
        public int mo28930b() {
            int i = 0;
            int b = mo28924a() ? C4572c.mo28817b(1, mo28933c()) + 0 : 0;
            if (mo28933c()) {
                b += C4572c.mo28807a(2, mo28930b());
            }
            if (mo28934d()) {
                b += C4572c.mo28802a(3, mo28934d());
            }
            if (mo28936f()) {
                b += C4572c.mo28807a(4, mo28935e());
            }
            for (String a : mo28924a()) {
                i += C4572c.mo28811a(a);
            }
            int size = b + i + (mo28924a().size() * 1);
            this.f7845c = size;
            return size;
        }

        /* renamed from: b */
        public C4636a mo28931b(int i) {
            this.f7847d = true;
            this.f7843b = i;
            return this;
        }

        /* renamed from: b */
        public C4636a mo28932b(boolean z) {
            this.f7848e = true;
            this.f7849f = z;
            return this;
        }

        /* renamed from: b */
        public boolean m13377b() {
            return this.f7846c;
        }

        /* renamed from: c */
        public int mo28933c() {
            return this.f7840a;
        }

        /* renamed from: c */
        public boolean m13379c() {
            return this.f7844b;
        }

        /* renamed from: d */
        public int mo28934d() {
            return this.f7843b;
        }

        /* renamed from: d */
        public boolean m13381d() {
            return this.f7847d;
        }

        /* renamed from: e */
        public int mo28935e() {
            return this.f7841a.size();
        }

        /* renamed from: e */
        public boolean m13383e() {
            return this.f7849f;
        }

        /* renamed from: f */
        public boolean mo28936f() {
            return this.f7848e;
        }
    }
}
