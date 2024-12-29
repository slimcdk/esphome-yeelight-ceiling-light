package com.xiaomi.push;

import java.util.LinkedList;

/* renamed from: com.xiaomi.push.bl */
public class C4556bl {

    /* renamed from: a */
    private LinkedList<C4557a> f7657a = new LinkedList<>();

    /* renamed from: com.xiaomi.push.bl$a */
    public static class C4557a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C4556bl f7658a = new C4556bl();

        /* renamed from: a */
        public int f7659a;

        /* renamed from: a */
        public Object f7660a;

        /* renamed from: a */
        public String f7661a;

        C4557a(int i, Object obj) {
            this.f7659a = i;
            this.f7660a = obj;
        }
    }

    /* renamed from: a */
    public static C4556bl mo28780a() {
        return C4557a.f7658a;
    }

    /* renamed from: a */
    private void m13024a() {
        if (this.f7657a.size() > 100) {
            this.f7657a.removeFirst();
        }
    }

    /* renamed from: a */
    public synchronized int m13025a() {
        return this.f7657a.size();
    }

    /* renamed from: a */
    public synchronized LinkedList<C4557a> m13026a() {
        LinkedList<C4557a> linkedList;
        linkedList = this.f7657a;
        this.f7657a = new LinkedList<>();
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo28781a(Object obj) {
        this.f7657a.add(new C4557a(0, obj));
        mo28780a();
    }
}
