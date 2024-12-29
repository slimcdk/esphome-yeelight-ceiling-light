package com.xiaomi.push;

import java.util.LinkedList;

/* renamed from: com.xiaomi.push.bb */
public class C4527bb {

    /* renamed from: a */
    private LinkedList<C4528a> f8216a = new LinkedList<>();

    /* renamed from: com.xiaomi.push.bb$a */
    public static class C4528a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C4527bb f8217a = new C4527bb();

        /* renamed from: a */
        public int f8218a;

        /* renamed from: a */
        public Object f8219a;

        /* renamed from: a */
        public String f8220a;

        C4528a(int i, Object obj) {
            this.f8218a = i;
            this.f8219a = obj;
        }
    }

    /* renamed from: a */
    public static C4527bb mo24766a() {
        return C4528a.f8217a;
    }

    /* renamed from: a */
    private void m13413a() {
        if (this.f8216a.size() > 100) {
            this.f8216a.removeFirst();
        }
    }

    /* renamed from: a */
    public synchronized int m13414a() {
        return this.f8216a.size();
    }

    /* renamed from: a */
    public synchronized LinkedList<C4528a> m13415a() {
        LinkedList<C4528a> linkedList;
        linkedList = this.f8216a;
        this.f8216a = new LinkedList<>();
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo24767a(Object obj) {
        this.f8216a.add(new C4528a(0, obj));
        mo24766a();
    }
}
